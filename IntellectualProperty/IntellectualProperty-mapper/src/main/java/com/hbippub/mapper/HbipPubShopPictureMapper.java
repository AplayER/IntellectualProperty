package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubShopPicture;
import com.hbippub.pojo.HbipPubShopPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubShopPictureMapper {
    int countByExample(HbipPubShopPictureExample example);

    int deleteByExample(HbipPubShopPictureExample example);

    int deleteByPrimaryKey(Integer tupianid);

    int insert(HbipPubShopPicture record);

    int insertSelective(HbipPubShopPicture record);

    List<HbipPubShopPicture> selectByExample(HbipPubShopPictureExample example);

    HbipPubShopPicture selectByPrimaryKey(Integer tupianid);

    int updateByExampleSelective(@Param("record") HbipPubShopPicture record, @Param("example") HbipPubShopPictureExample example);

    int updateByExample(@Param("record") HbipPubShopPicture record, @Param("example") HbipPubShopPictureExample example);

    int updateByPrimaryKeySelective(HbipPubShopPicture record);

    int updateByPrimaryKey(HbipPubShopPicture record);
}