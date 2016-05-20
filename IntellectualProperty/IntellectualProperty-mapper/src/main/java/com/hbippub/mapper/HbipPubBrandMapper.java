package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubBrand;
import com.hbippub.pojo.HbipPubBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubBrandMapper {
    int countByExample(HbipPubBrandExample example);

    int deleteByExample(HbipPubBrandExample example);

    int deleteByPrimaryKey(Integer shangpinid);

    int insert(HbipPubBrand record);

    int insertSelective(HbipPubBrand record);

    List<HbipPubBrand> selectByExampleWithBLOBs(HbipPubBrandExample example);

    List<HbipPubBrand> selectByExample(HbipPubBrandExample example);

    HbipPubBrand selectByPrimaryKey(Integer shangpinid);

    int updateByExampleSelective(@Param("record") HbipPubBrand record, @Param("example") HbipPubBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubBrand record, @Param("example") HbipPubBrandExample example);

    int updateByExample(@Param("record") HbipPubBrand record, @Param("example") HbipPubBrandExample example);

    int updateByPrimaryKeySelective(HbipPubBrand record);

    int updateByPrimaryKeyWithBLOBs(HbipPubBrand record);

    int updateByPrimaryKey(HbipPubBrand record);
}