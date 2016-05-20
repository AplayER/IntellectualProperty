package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCommodityPicture;
import com.hbippub.pojo.HbipPubCommodityPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCommodityPictureMapper {
    int countByExample(HbipPubCommodityPictureExample example);

    int deleteByExample(HbipPubCommodityPictureExample example);

    int deleteByPrimaryKey(Integer tupianid);

    int insert(HbipPubCommodityPicture record);

    int insertSelective(HbipPubCommodityPicture record);

    List<HbipPubCommodityPicture> selectByExample(HbipPubCommodityPictureExample example);

    HbipPubCommodityPicture selectByPrimaryKey(Integer tupianid);

    int updateByExampleSelective(@Param("record") HbipPubCommodityPicture record, @Param("example") HbipPubCommodityPictureExample example);

    int updateByExample(@Param("record") HbipPubCommodityPicture record, @Param("example") HbipPubCommodityPictureExample example);

    int updateByPrimaryKeySelective(HbipPubCommodityPicture record);

    int updateByPrimaryKey(HbipPubCommodityPicture record);
}