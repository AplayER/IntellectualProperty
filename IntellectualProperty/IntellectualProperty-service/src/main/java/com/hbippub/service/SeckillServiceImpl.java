/**
 * 
 */
package com.hbippub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hbippub.mapper.SeckillMapper;
import com.hbippub.mapper.SuccessKilledMapper;
import com.hbippub.pojo.Exposer;
import com.hbippub.pojo.Seckill;
import com.hbippub.pojo.SeckillExecution;

/**
 * @author 梁lab 806
 *
 */
public class SeckillServiceImpl implements SeckillService{
	@Autowired
	private SeckillMapper seckillMapper;
	@Autowired
	private SuccessKilledMapper successKilledMapper;

	@Override
	public List<Seckill> getSeckillList() {
		return seckillMapper.queryAll(0, 3);
	}

	@Override
	public Seckill getSeckillByID(int seckillId) {
		return seckillMapper.queryById(seckillId);
	}

	@Override
	public Exposer exportSeckillUrl(int seckillId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeckillExecution executeSeckill(int seckillId, long userPhone,
			String md5) {
		// TODO Auto-generated method stub
		return null;
	}

}
