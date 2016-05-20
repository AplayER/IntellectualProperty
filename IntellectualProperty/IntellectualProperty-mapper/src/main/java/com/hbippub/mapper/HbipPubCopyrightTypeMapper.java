package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCopyrightType;
import com.hbippub.pojo.HbipPubCopyrightTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCopyrightTypeMapper {
    int countByExample(HbipPubCopyrightTypeExample example);

    int deleteByExample(HbipPubCopyrightTypeExample example);

    int deleteByPrimaryKey(Integer banquanleixingid);

    int insert(HbipPubCopyrightType record);

    int insertSelective(HbipPubCopyrightType record);

    List<HbipPubCopyrightType> selectByExample(HbipPubCopyrightTypeExample example);

    HbipPubCopyrightType selectByPrimaryKey(Integer banquanleixingid);

    int updateByExampleSelective(@Param("record") HbipPubCopyrightType record, @Param("example") HbipPubCopyrightTypeExample example);

    int updateByExample(@Param("record") HbipPubCopyrightType record, @Param("example") HbipPubCopyrightTypeExample example);

    int updateByPrimaryKeySelective(HbipPubCopyrightType record);

    int updateByPrimaryKey(HbipPubCopyrightType record);
}