package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubIndustryType;
import com.hbippub.pojo.HbipPubIndustryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubIndustryTypeMapper {
    int countByExample(HbipPubIndustryTypeExample example);

    int deleteByExample(HbipPubIndustryTypeExample example);

    int deleteByPrimaryKey(Integer hangyeleixingid);

    int insert(HbipPubIndustryType record);

    int insertSelective(HbipPubIndustryType record);

    List<HbipPubIndustryType> selectByExample(HbipPubIndustryTypeExample example);

    HbipPubIndustryType selectByPrimaryKey(Integer hangyeleixingid);

    int updateByExampleSelective(@Param("record") HbipPubIndustryType record, @Param("example") HbipPubIndustryTypeExample example);

    int updateByExample(@Param("record") HbipPubIndustryType record, @Param("example") HbipPubIndustryTypeExample example);

    int updateByPrimaryKeySelective(HbipPubIndustryType record);

    int updateByPrimaryKey(HbipPubIndustryType record);
}