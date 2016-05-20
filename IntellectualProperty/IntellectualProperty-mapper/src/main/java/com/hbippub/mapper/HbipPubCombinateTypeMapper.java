package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCombinateType;
import com.hbippub.pojo.HbipPubCombinateTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCombinateTypeMapper {
    int countByExample(HbipPubCombinateTypeExample example);

    int deleteByExample(HbipPubCombinateTypeExample example);

    int deleteByPrimaryKey(Integer zuheleixingid);

    int insert(HbipPubCombinateType record);

    int insertSelective(HbipPubCombinateType record);

    List<HbipPubCombinateType> selectByExample(HbipPubCombinateTypeExample example);

    HbipPubCombinateType selectByPrimaryKey(Integer zuheleixingid);

    int updateByExampleSelective(@Param("record") HbipPubCombinateType record, @Param("example") HbipPubCombinateTypeExample example);

    int updateByExample(@Param("record") HbipPubCombinateType record, @Param("example") HbipPubCombinateTypeExample example);

    int updateByPrimaryKeySelective(HbipPubCombinateType record);

    int updateByPrimaryKey(HbipPubCombinateType record);
}