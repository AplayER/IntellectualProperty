package com.hbippub.mapper;

import com.hbippub.pojo.Seckill;
import com.hbippub.pojo.SeckillExample;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SeckillMapper {
    int countByExample(SeckillExample example);

    int deleteByExample(SeckillExample example);

    int deleteByPrimaryKey(Integer seckillId);

    int insert(Seckill record);

    int insertSelective(Seckill record);

    List<Seckill> selectByExample(SeckillExample example);

    Seckill selectByPrimaryKey(Integer seckillId);

    int updateByExampleSelective(@Param("record") Seckill record, @Param("example") SeckillExample example);

    int updateByExample(@Param("record") Seckill record, @Param("example") SeckillExample example);

    int updateByPrimaryKeySelective(Seckill record);

    int updateByPrimaryKey(Seckill record);
    /**
	 * @param seckillId
	 * @param killTime
	 * @return
	 */
	int reduceNumber(@Param("seckillId") int seckillId,@Param("killTime") Date killTime);
	/**
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(int seckillId);
	/**
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}