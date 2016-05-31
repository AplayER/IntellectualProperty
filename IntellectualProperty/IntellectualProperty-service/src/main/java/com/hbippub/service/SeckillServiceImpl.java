/**
 * 
 */
package com.hbippub.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import com.hbippub.cache.JedisSeckill;
import com.hbippub.dto.Exposer;
import com.hbippub.dto.SeckillExecution;
import com.hbippub.exception.RepeatKillException;
import com.hbippub.exception.SeckillCloseException;
import com.hbippub.exception.SeckillException;
import com.hbippub.mapper.SeckillMapper;
import com.hbippub.mapper.SuccessKilledMapper;
import com.hbippub.pojo.Seckill;
import com.hbippub.pojo.SuccessKilled;

/**
 * @author 梁lab 806
 *
 */
@Service
public class SeckillServiceImpl implements SeckillService{
	@Autowired
	private SeckillMapper seckillMapper;
	@Autowired
	private SuccessKilledMapper successKilledMapper;
	@Autowired
	private JedisSeckill jedisSeckill;
	
	private final String slat = "asdfsgwegasdbcb3y54fgfg";

	@Override
	public List<Seckill> getSeckillList() {
		return seckillMapper.queryAll(0, 4);
	}

	@Override
	public Seckill getSeckillByID(int seckillId) {
		try {
			Seckill seckill = jedisSeckill.getSeckill(seckillId);
			if (seckill!=null) {
				return seckill;
			}else{
				seckill = seckillMapper.queryById(seckillId);
				jedisSeckill.putSeckill(seckill);
				return seckill;
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
		return null;
	}

	@Override
	public Exposer exportSeckillUrl(int seckillId) {
		Seckill seckill = seckillMapper.queryById(seckillId);
//		Seckill seckill = getSeckillByID(seckillId);
		if (seckill==null) {
			return new Exposer(seckillId, false);
		}
		Date startTime = seckill.getStartTime();
		Date endTime = seckill.getEndTime();
		Date nowTime = new Date();
		if (nowTime.getTime()<startTime.getTime()||nowTime.getTime()>endTime.getTime()) {
			return new Exposer(false, seckillId, nowTime.getTime(), startTime.getTime(), endTime.getTime());
			
		}
		String md5 = getMD5(seckillId);
		return new Exposer(seckillId, true, md5);
	}
	
	private String getMD5(int seckillId){
		String base = seckillId+"/"+slat;
		String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
		return md5;
	}

	@Override
	@Transactional
	public SeckillExecution executeSeckill(int seckillId, String userPhone,
			String md5) throws SeckillException,RepeatKillException,SeckillCloseException{
		try {
			if (md5==null||!md5.equals(getMD5(seckillId))) {
				throw new SeckillException("Seckill Data rewrite");
			}
			Date nowTime = new Date();
			int updateCount = seckillMapper.reduceNumber(seckillId, nowTime);
			if (updateCount<=0) {
				throw new SeckillCloseException("Seckill is closed");
			}else {
				int insertCount = successKilledMapper.insertSuccessKilled(seckillId, userPhone);
				if (insertCount<=0) {
					throw new RepeatKillException("Seckill repeat.");
				}
				else {
					SuccessKilled successKilled = successKilledMapper.queryByIdWithSeckill(seckillId, userPhone);
					return new SeckillExecution(seckillId, 1, "秒杀成功",successKilled);
				}
			}
		} 
		catch(SeckillCloseException e1)
		{
			throw e1;
			}
		catch(RepeatKillException e2)
		{
			throw e2;
			}
		catch (Exception e) {
			throw new SeckillException("seckill inner error"+e.getMessage());
			}
		}
		
	


}
