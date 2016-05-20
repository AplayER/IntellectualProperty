package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsIndexPicture;
import com.hbippub.pojo.HbipPubNewsIndexPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsIndexPictureMapper {
    int countByExample(HbipPubNewsIndexPictureExample example);

    int deleteByExample(HbipPubNewsIndexPictureExample example);

    int deleteByPrimaryKey(Integer tupianid);

    int insert(HbipPubNewsIndexPicture record);

    int insertSelective(HbipPubNewsIndexPicture record);

    List<HbipPubNewsIndexPicture> selectByExample(HbipPubNewsIndexPictureExample example);

    HbipPubNewsIndexPicture selectByPrimaryKey(Integer tupianid);

    int updateByExampleSelective(@Param("record") HbipPubNewsIndexPicture record, @Param("example") HbipPubNewsIndexPictureExample example);

    int updateByExample(@Param("record") HbipPubNewsIndexPicture record, @Param("example") HbipPubNewsIndexPictureExample example);

    int updateByPrimaryKeySelective(HbipPubNewsIndexPicture record);

    int updateByPrimaryKey(HbipPubNewsIndexPicture record);
}