package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubIndexPicture;
import com.hbippub.pojo.HbipPubIndexPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubIndexPictureMapper {
    int countByExample(HbipPubIndexPictureExample example);

    int deleteByExample(HbipPubIndexPictureExample example);

    int deleteByPrimaryKey(Integer tupianid);

    int insert(HbipPubIndexPicture record);

    int insertSelective(HbipPubIndexPicture record);

    List<HbipPubIndexPicture> selectByExample(HbipPubIndexPictureExample example);

    HbipPubIndexPicture selectByPrimaryKey(Integer tupianid);

    int updateByExampleSelective(@Param("record") HbipPubIndexPicture record, @Param("example") HbipPubIndexPictureExample example);

    int updateByExample(@Param("record") HbipPubIndexPicture record, @Param("example") HbipPubIndexPictureExample example);

    int updateByPrimaryKeySelective(HbipPubIndexPicture record);

    int updateByPrimaryKey(HbipPubIndexPicture record);
}