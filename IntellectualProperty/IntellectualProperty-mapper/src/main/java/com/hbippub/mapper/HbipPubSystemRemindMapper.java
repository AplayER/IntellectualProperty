package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubSystemRemind;
import com.hbippub.pojo.HbipPubSystemRemindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubSystemRemindMapper {
    int countByExample(HbipPubSystemRemindExample example);

    int deleteByExample(HbipPubSystemRemindExample example);

    int deleteByPrimaryKey(Integer tixingid);

    int insert(HbipPubSystemRemind record);

    int insertSelective(HbipPubSystemRemind record);

    List<HbipPubSystemRemind> selectByExample(HbipPubSystemRemindExample example);

    HbipPubSystemRemind selectByPrimaryKey(Integer tixingid);

    int updateByExampleSelective(@Param("record") HbipPubSystemRemind record, @Param("example") HbipPubSystemRemindExample example);

    int updateByExample(@Param("record") HbipPubSystemRemind record, @Param("example") HbipPubSystemRemindExample example);

    int updateByPrimaryKeySelective(HbipPubSystemRemind record);

    int updateByPrimaryKey(HbipPubSystemRemind record);
}