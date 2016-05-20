package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTalentPool;
import com.hbippub.pojo.HbipPubTalentPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTalentPoolMapper {
    int countByExample(HbipPubTalentPoolExample example);

    int deleteByExample(HbipPubTalentPoolExample example);

    int deleteByPrimaryKey(Integer rencaikuid);

    int insert(HbipPubTalentPool record);

    int insertSelective(HbipPubTalentPool record);

    List<HbipPubTalentPool> selectByExample(HbipPubTalentPoolExample example);

    HbipPubTalentPool selectByPrimaryKey(Integer rencaikuid);

    int updateByExampleSelective(@Param("record") HbipPubTalentPool record, @Param("example") HbipPubTalentPoolExample example);

    int updateByExample(@Param("record") HbipPubTalentPool record, @Param("example") HbipPubTalentPoolExample example);

    int updateByPrimaryKeySelective(HbipPubTalentPool record);

    int updateByPrimaryKey(HbipPubTalentPool record);
}