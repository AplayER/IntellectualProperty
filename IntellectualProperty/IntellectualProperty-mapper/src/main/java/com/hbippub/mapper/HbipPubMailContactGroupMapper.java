package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubMailContactGroup;
import com.hbippub.pojo.HbipPubMailContactGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubMailContactGroupMapper {
    int countByExample(HbipPubMailContactGroupExample example);

    int deleteByExample(HbipPubMailContactGroupExample example);

    int deleteByPrimaryKey(Integer fenzuid);

    int insert(HbipPubMailContactGroup record);

    int insertSelective(HbipPubMailContactGroup record);

    List<HbipPubMailContactGroup> selectByExample(HbipPubMailContactGroupExample example);

    HbipPubMailContactGroup selectByPrimaryKey(Integer fenzuid);

    int updateByExampleSelective(@Param("record") HbipPubMailContactGroup record, @Param("example") HbipPubMailContactGroupExample example);

    int updateByExample(@Param("record") HbipPubMailContactGroup record, @Param("example") HbipPubMailContactGroupExample example);

    int updateByPrimaryKeySelective(HbipPubMailContactGroup record);

    int updateByPrimaryKey(HbipPubMailContactGroup record);
}