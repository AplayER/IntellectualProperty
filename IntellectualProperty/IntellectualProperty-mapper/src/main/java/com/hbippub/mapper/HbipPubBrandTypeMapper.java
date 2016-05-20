package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubBrandType;
import com.hbippub.pojo.HbipPubBrandTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubBrandTypeMapper {
    int countByExample(HbipPubBrandTypeExample example);

    int deleteByExample(HbipPubBrandTypeExample example);

    int deleteByPrimaryKey(Integer shangbiaoleixingid);

    int insert(HbipPubBrandType record);

    int insertSelective(HbipPubBrandType record);

    List<HbipPubBrandType> selectByExample(HbipPubBrandTypeExample example);

    HbipPubBrandType selectByPrimaryKey(Integer shangbiaoleixingid);

    int updateByExampleSelective(@Param("record") HbipPubBrandType record, @Param("example") HbipPubBrandTypeExample example);

    int updateByExample(@Param("record") HbipPubBrandType record, @Param("example") HbipPubBrandTypeExample example);

    int updateByPrimaryKeySelective(HbipPubBrandType record);

    int updateByPrimaryKey(HbipPubBrandType record);
}