package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubBusinessType;
import com.hbippub.pojo.HbipPubBusinessTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubBusinessTypeMapper {
    int countByExample(HbipPubBusinessTypeExample example);

    int deleteByExample(HbipPubBusinessTypeExample example);

    int deleteByPrimaryKey(Integer yewuleixingid);

    int insert(HbipPubBusinessType record);

    int insertSelective(HbipPubBusinessType record);

    List<HbipPubBusinessType> selectByExample(HbipPubBusinessTypeExample example);

    HbipPubBusinessType selectByPrimaryKey(Integer yewuleixingid);

    int updateByExampleSelective(@Param("record") HbipPubBusinessType record, @Param("example") HbipPubBusinessTypeExample example);

    int updateByExample(@Param("record") HbipPubBusinessType record, @Param("example") HbipPubBusinessTypeExample example);

    int updateByPrimaryKeySelective(HbipPubBusinessType record);

    int updateByPrimaryKey(HbipPubBusinessType record);
}