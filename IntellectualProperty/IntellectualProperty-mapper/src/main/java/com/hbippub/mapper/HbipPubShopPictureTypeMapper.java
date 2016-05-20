package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubShopPictureType;
import com.hbippub.pojo.HbipPubShopPictureTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubShopPictureTypeMapper {
    int countByExample(HbipPubShopPictureTypeExample example);

    int deleteByExample(HbipPubShopPictureTypeExample example);

    int deleteByPrimaryKey(Integer leixingid);

    int insert(HbipPubShopPictureType record);

    int insertSelective(HbipPubShopPictureType record);

    List<HbipPubShopPictureType> selectByExample(HbipPubShopPictureTypeExample example);

    HbipPubShopPictureType selectByPrimaryKey(Integer leixingid);

    int updateByExampleSelective(@Param("record") HbipPubShopPictureType record, @Param("example") HbipPubShopPictureTypeExample example);

    int updateByExample(@Param("record") HbipPubShopPictureType record, @Param("example") HbipPubShopPictureTypeExample example);

    int updateByPrimaryKeySelective(HbipPubShopPictureType record);

    int updateByPrimaryKey(HbipPubShopPictureType record);
}