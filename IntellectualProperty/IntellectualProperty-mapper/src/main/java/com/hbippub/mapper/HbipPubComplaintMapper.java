package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubComplaint;
import com.hbippub.pojo.HbipPubComplaintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubComplaintMapper {
    int countByExample(HbipPubComplaintExample example);

    int deleteByExample(HbipPubComplaintExample example);

    int deleteByPrimaryKey(Integer tousuid);

    int insert(HbipPubComplaint record);

    int insertSelective(HbipPubComplaint record);

    List<HbipPubComplaint> selectByExample(HbipPubComplaintExample example);

    HbipPubComplaint selectByPrimaryKey(Integer tousuid);

    int updateByExampleSelective(@Param("record") HbipPubComplaint record, @Param("example") HbipPubComplaintExample example);

    int updateByExample(@Param("record") HbipPubComplaint record, @Param("example") HbipPubComplaintExample example);

    int updateByPrimaryKeySelective(HbipPubComplaint record);

    int updateByPrimaryKey(HbipPubComplaint record);
}