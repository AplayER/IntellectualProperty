package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTalentIndexPicture;
import com.hbippub.pojo.HbipPubTalentIndexPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTalentIndexPictureMapper {
    int countByExample(HbipPubTalentIndexPictureExample example);

    int deleteByExample(HbipPubTalentIndexPictureExample example);

    int deleteByPrimaryKey(Integer tupianid);

    int insert(HbipPubTalentIndexPicture record);

    int insertSelective(HbipPubTalentIndexPicture record);

    List<HbipPubTalentIndexPicture> selectByExample(HbipPubTalentIndexPictureExample example);

    HbipPubTalentIndexPicture selectByPrimaryKey(Integer tupianid);

    int updateByExampleSelective(@Param("record") HbipPubTalentIndexPicture record, @Param("example") HbipPubTalentIndexPictureExample example);

    int updateByExample(@Param("record") HbipPubTalentIndexPicture record, @Param("example") HbipPubTalentIndexPictureExample example);

    int updateByPrimaryKeySelective(HbipPubTalentIndexPicture record);

    int updateByPrimaryKey(HbipPubTalentIndexPicture record);
}