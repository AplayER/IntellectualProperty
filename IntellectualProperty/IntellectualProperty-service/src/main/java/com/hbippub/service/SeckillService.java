/**
 * 
 */
package com.hbippub.service;

import java.util.List;

import com.hbippub.dto.Exposer;
import com.hbippub.dto.SeckillExecution;
import com.hbippub.pojo.Seckill;

/**
 * @author 梁lab 806
 *
 */
public interface SeckillService {
	
	/**
	 * @return
	 */
	List<Seckill> getSeckillList();
	/**
	 * @param seckillId
	 * @return
	 */
	Seckill getSeckillByID(int seckillId);
	/**
	 * @param seckillId
	 */
	Exposer exportSeckillUrl(int seckillId);
	
	SeckillExecution executeSeckill(int seckillId,long userPhone,String md5);

}
