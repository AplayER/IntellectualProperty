package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubGovNewsSubcategory;
import com.hbippub.pojo.HbipPubGovNewsSubcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubGovNewsSubcategoryMapper {
    int countByExample(HbipPubGovNewsSubcategoryExample example);

    int deleteByExample(HbipPubGovNewsSubcategoryExample example);

    int deleteByPrimaryKey(Integer erjifenleiid);

    int insert(HbipPubGovNewsSubcategory record);

    int insertSelective(HbipPubGovNewsSubcategory record);

    List<HbipPubGovNewsSubcategory> selectByExample(HbipPubGovNewsSubcategoryExample example);

    HbipPubGovNewsSubcategory selectByPrimaryKey(Integer erjifenleiid);

    int updateByExampleSelective(@Param("record") HbipPubGovNewsSubcategory record, @Param("example") HbipPubGovNewsSubcategoryExample example);

    int updateByExample(@Param("record") HbipPubGovNewsSubcategory record, @Param("example") HbipPubGovNewsSubcategoryExample example);

    int updateByPrimaryKeySelective(HbipPubGovNewsSubcategory record);

    int updateByPrimaryKey(HbipPubGovNewsSubcategory record);
}