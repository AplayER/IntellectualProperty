package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubDemand;
import com.hbippub.pojo.HbipPubDemandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubDemandMapper {
    int countByExample(HbipPubDemandExample example);

    int deleteByExample(HbipPubDemandExample example);

    int deleteByPrimaryKey(Integer xuqiuid);

    int insert(HbipPubDemand record);

    int insertSelective(HbipPubDemand record);

    List<HbipPubDemand> selectByExampleWithBLOBs(HbipPubDemandExample example);

    List<HbipPubDemand> selectByExample(HbipPubDemandExample example);

    HbipPubDemand selectByPrimaryKey(Integer xuqiuid);

    int updateByExampleSelective(@Param("record") HbipPubDemand record, @Param("example") HbipPubDemandExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubDemand record, @Param("example") HbipPubDemandExample example);

    int updateByExample(@Param("record") HbipPubDemand record, @Param("example") HbipPubDemandExample example);

    int updateByPrimaryKeySelective(HbipPubDemand record);

    int updateByPrimaryKeyWithBLOBs(HbipPubDemand record);

    int updateByPrimaryKey(HbipPubDemand record);
}