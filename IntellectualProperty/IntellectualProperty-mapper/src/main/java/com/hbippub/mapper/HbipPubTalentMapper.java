package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTalent;
import com.hbippub.pojo.HbipPubTalentExample;
import com.hbippub.pojo.HbipPubTalentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTalentMapper {
    int countByExample(HbipPubTalentExample example);

    int deleteByExample(HbipPubTalentExample example);

    int deleteByPrimaryKey(Integer rencaiid);

    int insert(HbipPubTalentWithBLOBs record);

    int insertSelective(HbipPubTalentWithBLOBs record);

    List<HbipPubTalentWithBLOBs> selectByExampleWithBLOBs(HbipPubTalentExample example);

    List<HbipPubTalent> selectByExample(HbipPubTalentExample example);

    HbipPubTalentWithBLOBs selectByPrimaryKey(Integer rencaiid);

    int updateByExampleSelective(@Param("record") HbipPubTalentWithBLOBs record, @Param("example") HbipPubTalentExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubTalentWithBLOBs record, @Param("example") HbipPubTalentExample example);

    int updateByExample(@Param("record") HbipPubTalent record, @Param("example") HbipPubTalentExample example);

    int updateByPrimaryKeySelective(HbipPubTalentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HbipPubTalentWithBLOBs record);

    int updateByPrimaryKey(HbipPubTalent record);
}