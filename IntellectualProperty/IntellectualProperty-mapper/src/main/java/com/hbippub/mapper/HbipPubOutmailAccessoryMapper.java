package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubOutmailAccessory;
import com.hbippub.pojo.HbipPubOutmailAccessoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubOutmailAccessoryMapper {
    int countByExample(HbipPubOutmailAccessoryExample example);

    int deleteByExample(HbipPubOutmailAccessoryExample example);

    int deleteByPrimaryKey(Integer fujianid);

    int insert(HbipPubOutmailAccessory record);

    int insertSelective(HbipPubOutmailAccessory record);

    List<HbipPubOutmailAccessory> selectByExample(HbipPubOutmailAccessoryExample example);

    HbipPubOutmailAccessory selectByPrimaryKey(Integer fujianid);

    int updateByExampleSelective(@Param("record") HbipPubOutmailAccessory record, @Param("example") HbipPubOutmailAccessoryExample example);

    int updateByExample(@Param("record") HbipPubOutmailAccessory record, @Param("example") HbipPubOutmailAccessoryExample example);

    int updateByPrimaryKeySelective(HbipPubOutmailAccessory record);

    int updateByPrimaryKey(HbipPubOutmailAccessory record);
}