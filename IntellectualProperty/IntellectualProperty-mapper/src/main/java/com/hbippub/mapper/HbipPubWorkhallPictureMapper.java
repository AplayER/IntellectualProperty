package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubWorkhallPicture;
import com.hbippub.pojo.HbipPubWorkhallPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubWorkhallPictureMapper {
    int countByExample(HbipPubWorkhallPictureExample example);

    int deleteByExample(HbipPubWorkhallPictureExample example);

    int deleteByPrimaryKey(Integer tupianid);

    int insert(HbipPubWorkhallPicture record);

    int insertSelective(HbipPubWorkhallPicture record);

    List<HbipPubWorkhallPicture> selectByExample(HbipPubWorkhallPictureExample example);

    HbipPubWorkhallPicture selectByPrimaryKey(Integer tupianid);

    int updateByExampleSelective(@Param("record") HbipPubWorkhallPicture record, @Param("example") HbipPubWorkhallPictureExample example);

    int updateByExample(@Param("record") HbipPubWorkhallPicture record, @Param("example") HbipPubWorkhallPictureExample example);

    int updateByPrimaryKeySelective(HbipPubWorkhallPicture record);

    int updateByPrimaryKey(HbipPubWorkhallPicture record);
}