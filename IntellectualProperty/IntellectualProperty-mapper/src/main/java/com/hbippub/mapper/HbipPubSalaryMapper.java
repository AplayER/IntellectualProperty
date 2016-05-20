package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubSalary;
import com.hbippub.pojo.HbipPubSalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubSalaryMapper {
    int countByExample(HbipPubSalaryExample example);

    int deleteByExample(HbipPubSalaryExample example);

    int deleteByPrimaryKey(Integer yuexinid);

    int insert(HbipPubSalary record);

    int insertSelective(HbipPubSalary record);

    List<HbipPubSalary> selectByExample(HbipPubSalaryExample example);

    HbipPubSalary selectByPrimaryKey(Integer yuexinid);

    int updateByExampleSelective(@Param("record") HbipPubSalary record, @Param("example") HbipPubSalaryExample example);

    int updateByExample(@Param("record") HbipPubSalary record, @Param("example") HbipPubSalaryExample example);

    int updateByPrimaryKeySelective(HbipPubSalary record);

    int updateByPrimaryKey(HbipPubSalary record);
}