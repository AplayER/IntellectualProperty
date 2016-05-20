package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCooperateType;
import com.hbippub.pojo.HbipPubCooperateTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCooperateTypeMapper {
    int countByExample(HbipPubCooperateTypeExample example);

    int deleteByExample(HbipPubCooperateTypeExample example);

    int deleteByPrimaryKey(String hezuoleixingid);

    int insert(HbipPubCooperateType record);

    int insertSelective(HbipPubCooperateType record);

    List<HbipPubCooperateType> selectByExample(HbipPubCooperateTypeExample example);

    HbipPubCooperateType selectByPrimaryKey(String hezuoleixingid);

    int updateByExampleSelective(@Param("record") HbipPubCooperateType record, @Param("example") HbipPubCooperateTypeExample example);

    int updateByExample(@Param("record") HbipPubCooperateType record, @Param("example") HbipPubCooperateTypeExample example);

    int updateByPrimaryKeySelective(HbipPubCooperateType record);

    int updateByPrimaryKey(HbipPubCooperateType record);
}