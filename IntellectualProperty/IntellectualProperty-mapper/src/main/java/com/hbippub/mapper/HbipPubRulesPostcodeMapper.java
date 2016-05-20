package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubRulesPostcode;
import com.hbippub.pojo.HbipPubRulesPostcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubRulesPostcodeMapper {
    int countByExample(HbipPubRulesPostcodeExample example);

    int deleteByExample(HbipPubRulesPostcodeExample example);

    int deleteByPrimaryKey(Integer guizeid);

    int insert(HbipPubRulesPostcode record);

    int insertSelective(HbipPubRulesPostcode record);

    List<HbipPubRulesPostcode> selectByExample(HbipPubRulesPostcodeExample example);

    HbipPubRulesPostcode selectByPrimaryKey(Integer guizeid);

    int updateByExampleSelective(@Param("record") HbipPubRulesPostcode record, @Param("example") HbipPubRulesPostcodeExample example);

    int updateByExample(@Param("record") HbipPubRulesPostcode record, @Param("example") HbipPubRulesPostcodeExample example);

    int updateByPrimaryKeySelective(HbipPubRulesPostcode record);

    int updateByPrimaryKey(HbipPubRulesPostcode record);
}