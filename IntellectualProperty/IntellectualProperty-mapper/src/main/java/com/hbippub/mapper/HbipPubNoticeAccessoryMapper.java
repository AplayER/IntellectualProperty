package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNoticeAccessory;
import com.hbippub.pojo.HbipPubNoticeAccessoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNoticeAccessoryMapper {
    int countByExample(HbipPubNoticeAccessoryExample example);

    int deleteByExample(HbipPubNoticeAccessoryExample example);

    int deleteByPrimaryKey(Integer fujianid);

    int insert(HbipPubNoticeAccessory record);

    int insertSelective(HbipPubNoticeAccessory record);

    List<HbipPubNoticeAccessory> selectByExample(HbipPubNoticeAccessoryExample example);

    HbipPubNoticeAccessory selectByPrimaryKey(Integer fujianid);

    int updateByExampleSelective(@Param("record") HbipPubNoticeAccessory record, @Param("example") HbipPubNoticeAccessoryExample example);

    int updateByExample(@Param("record") HbipPubNoticeAccessory record, @Param("example") HbipPubNoticeAccessoryExample example);

    int updateByPrimaryKeySelective(HbipPubNoticeAccessory record);

    int updateByPrimaryKey(HbipPubNoticeAccessory record);
}