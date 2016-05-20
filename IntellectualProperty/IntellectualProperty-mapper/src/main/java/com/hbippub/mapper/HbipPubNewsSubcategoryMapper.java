package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsSubcategory;
import com.hbippub.pojo.HbipPubNewsSubcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsSubcategoryMapper {
    int countByExample(HbipPubNewsSubcategoryExample example);

    int deleteByExample(HbipPubNewsSubcategoryExample example);

    int deleteByPrimaryKey(Integer erjifenleiid);

    int insert(HbipPubNewsSubcategory record);

    int insertSelective(HbipPubNewsSubcategory record);

    List<HbipPubNewsSubcategory> selectByExample(HbipPubNewsSubcategoryExample example);

    HbipPubNewsSubcategory selectByPrimaryKey(Integer erjifenleiid);

    int updateByExampleSelective(@Param("record") HbipPubNewsSubcategory record, @Param("example") HbipPubNewsSubcategoryExample example);

    int updateByExample(@Param("record") HbipPubNewsSubcategory record, @Param("example") HbipPubNewsSubcategoryExample example);

    int updateByPrimaryKeySelective(HbipPubNewsSubcategory record);

    int updateByPrimaryKey(HbipPubNewsSubcategory record);
}