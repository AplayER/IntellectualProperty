package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubRecruit;
import com.hbippub.pojo.HbipPubRecruitExample;
import com.hbippub.pojo.HbipPubRecruitWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubRecruitMapper {
    int countByExample(HbipPubRecruitExample example);

    int deleteByExample(HbipPubRecruitExample example);

    int deleteByPrimaryKey(Integer zhaopinid);

    int insert(HbipPubRecruitWithBLOBs record);

    int insertSelective(HbipPubRecruitWithBLOBs record);

    List<HbipPubRecruitWithBLOBs> selectByExampleWithBLOBs(HbipPubRecruitExample example);

    List<HbipPubRecruit> selectByExample(HbipPubRecruitExample example);

    HbipPubRecruitWithBLOBs selectByPrimaryKey(Integer zhaopinid);

    int updateByExampleSelective(@Param("record") HbipPubRecruitWithBLOBs record, @Param("example") HbipPubRecruitExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubRecruitWithBLOBs record, @Param("example") HbipPubRecruitExample example);

    int updateByExample(@Param("record") HbipPubRecruit record, @Param("example") HbipPubRecruitExample example);

    int updateByPrimaryKeySelective(HbipPubRecruitWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HbipPubRecruitWithBLOBs record);

    int updateByPrimaryKey(HbipPubRecruit record);
}