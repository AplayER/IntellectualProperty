package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubShopTemplatePicture;
import com.hbippub.pojo.HbipPubShopTemplatePictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubShopTemplatePictureMapper {
    int countByExample(HbipPubShopTemplatePictureExample example);

    int deleteByExample(HbipPubShopTemplatePictureExample example);

    int deleteByPrimaryKey(Integer tupianid);

    int insert(HbipPubShopTemplatePicture record);

    int insertSelective(HbipPubShopTemplatePicture record);

    List<HbipPubShopTemplatePicture> selectByExample(HbipPubShopTemplatePictureExample example);

    HbipPubShopTemplatePicture selectByPrimaryKey(Integer tupianid);

    int updateByExampleSelective(@Param("record") HbipPubShopTemplatePicture record, @Param("example") HbipPubShopTemplatePictureExample example);

    int updateByExample(@Param("record") HbipPubShopTemplatePicture record, @Param("example") HbipPubShopTemplatePictureExample example);

    int updateByPrimaryKeySelective(HbipPubShopTemplatePicture record);

    int updateByPrimaryKey(HbipPubShopTemplatePicture record);
}