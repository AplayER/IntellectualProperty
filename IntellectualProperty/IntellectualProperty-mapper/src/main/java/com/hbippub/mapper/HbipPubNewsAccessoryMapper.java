package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsAccessory;
import com.hbippub.pojo.HbipPubNewsAccessoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsAccessoryMapper {
    int countByExample(HbipPubNewsAccessoryExample example);

    int deleteByExample(HbipPubNewsAccessoryExample example);

    int deleteByPrimaryKey(Integer fujianid);

    int insert(HbipPubNewsAccessory record);

    int insertSelective(HbipPubNewsAccessory record);

    List<HbipPubNewsAccessory> selectByExample(HbipPubNewsAccessoryExample example);

    HbipPubNewsAccessory selectByPrimaryKey(Integer fujianid);

    int updateByExampleSelective(@Param("record") HbipPubNewsAccessory record, @Param("example") HbipPubNewsAccessoryExample example);

    int updateByExample(@Param("record") HbipPubNewsAccessory record, @Param("example") HbipPubNewsAccessoryExample example);

    int updateByPrimaryKeySelective(HbipPubNewsAccessory record);

    int updateByPrimaryKey(HbipPubNewsAccessory record);
}