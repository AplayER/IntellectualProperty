package com.hbippub.mapper;

import com.hbippub.pojo.SuccessKilled;
import com.hbippub.pojo.SuccessKilledExample;
import com.hbippub.pojo.SuccessKilledKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author 梁lab 806
 *
 */
public interface SuccessKilledMapper {
    int countByExample(SuccessKilledExample example);

    int deleteByExample(SuccessKilledExample example);

    int deleteByPrimaryKey(SuccessKilledKey key);

    int insert(SuccessKilled record);

    int insertSelective(SuccessKilled record);

    List<SuccessKilled> selectByExample(SuccessKilledExample example);

    SuccessKilled selectByPrimaryKey(SuccessKilledKey key);

    int updateByExampleSelective(@Param("record") SuccessKilled record, @Param("example") SuccessKilledExample example);

    int updateByExample(@Param("record") SuccessKilled record, @Param("example") SuccessKilledExample example);

    int updateByPrimaryKeySelective(SuccessKilled record);

    int updateByPrimaryKey(SuccessKilled record);
    
    /**
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") int seckillId,@Param("userPhone") String userPhone);
    
	/**
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(@Param("seckillId") int seckillId,@Param("userPhone")String userPhone);
}