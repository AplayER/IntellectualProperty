package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubExpertIndustryType;
import com.hbippub.pojo.HbipPubExpertIndustryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubExpertIndustryTypeMapper {
    int countByExample(HbipPubExpertIndustryTypeExample example);

    int deleteByExample(HbipPubExpertIndustryTypeExample example);

    int deleteByPrimaryKey(Integer hangyeleixingid);

    int insert(HbipPubExpertIndustryType record);

    int insertSelective(HbipPubExpertIndustryType record);

    List<HbipPubExpertIndustryType> selectByExample(HbipPubExpertIndustryTypeExample example);

    HbipPubExpertIndustryType selectByPrimaryKey(Integer hangyeleixingid);

    int updateByExampleSelective(@Param("record") HbipPubExpertIndustryType record, @Param("example") HbipPubExpertIndustryTypeExample example);

    int updateByExample(@Param("record") HbipPubExpertIndustryType record, @Param("example") HbipPubExpertIndustryTypeExample example);

    int updateByPrimaryKeySelective(HbipPubExpertIndustryType record);

    int updateByPrimaryKey(HbipPubExpertIndustryType record);
}