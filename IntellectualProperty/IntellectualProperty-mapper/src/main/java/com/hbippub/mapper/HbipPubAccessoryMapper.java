package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubAccessory;
import com.hbippub.pojo.HbipPubAccessoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubAccessoryMapper {
    int countByExample(HbipPubAccessoryExample example);

    int deleteByExample(HbipPubAccessoryExample example);

    int deleteByPrimaryKey(Integer fujianid);

    int insert(HbipPubAccessory record);

    int insertSelective(HbipPubAccessory record);

    List<HbipPubAccessory> selectByExample(HbipPubAccessoryExample example);

    HbipPubAccessory selectByPrimaryKey(Integer fujianid);

    int updateByExampleSelective(@Param("record") HbipPubAccessory record, @Param("example") HbipPubAccessoryExample example);

    int updateByExample(@Param("record") HbipPubAccessory record, @Param("example") HbipPubAccessoryExample example);

    int updateByPrimaryKeySelective(HbipPubAccessory record);

    int updateByPrimaryKey(HbipPubAccessory record);
}