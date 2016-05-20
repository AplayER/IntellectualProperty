package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubMailAccessory;
import com.hbippub.pojo.HbipPubMailAccessoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubMailAccessoryMapper {
    int countByExample(HbipPubMailAccessoryExample example);

    int deleteByExample(HbipPubMailAccessoryExample example);

    int deleteByPrimaryKey(Integer fujianid);

    int insert(HbipPubMailAccessory record);

    int insertSelective(HbipPubMailAccessory record);

    List<HbipPubMailAccessory> selectByExample(HbipPubMailAccessoryExample example);

    HbipPubMailAccessory selectByPrimaryKey(Integer fujianid);

    int updateByExampleSelective(@Param("record") HbipPubMailAccessory record, @Param("example") HbipPubMailAccessoryExample example);

    int updateByExample(@Param("record") HbipPubMailAccessory record, @Param("example") HbipPubMailAccessoryExample example);

    int updateByPrimaryKeySelective(HbipPubMailAccessory record);

    int updateByPrimaryKey(HbipPubMailAccessory record);
}