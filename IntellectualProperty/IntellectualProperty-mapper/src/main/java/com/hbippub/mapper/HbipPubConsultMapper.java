package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubConsult;
import com.hbippub.pojo.HbipPubConsultExample;
import com.hbippub.pojo.HbipPubConsultWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubConsultMapper {
    int countByExample(HbipPubConsultExample example);

    int deleteByExample(HbipPubConsultExample example);

    int deleteByPrimaryKey(Integer zixunid);

    int insert(HbipPubConsultWithBLOBs record);

    int insertSelective(HbipPubConsultWithBLOBs record);

    List<HbipPubConsultWithBLOBs> selectByExampleWithBLOBs(HbipPubConsultExample example);

    List<HbipPubConsult> selectByExample(HbipPubConsultExample example);

    HbipPubConsultWithBLOBs selectByPrimaryKey(Integer zixunid);

    int updateByExampleSelective(@Param("record") HbipPubConsultWithBLOBs record, @Param("example") HbipPubConsultExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubConsultWithBLOBs record, @Param("example") HbipPubConsultExample example);

    int updateByExample(@Param("record") HbipPubConsult record, @Param("example") HbipPubConsultExample example);

    int updateByPrimaryKeySelective(HbipPubConsultWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HbipPubConsultWithBLOBs record);

    int updateByPrimaryKey(HbipPubConsult record);
}