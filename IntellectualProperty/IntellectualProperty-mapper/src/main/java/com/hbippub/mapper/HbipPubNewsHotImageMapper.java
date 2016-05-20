package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsHotImage;
import com.hbippub.pojo.HbipPubNewsHotImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsHotImageMapper {
    int countByExample(HbipPubNewsHotImageExample example);

    int deleteByExample(HbipPubNewsHotImageExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubNewsHotImage record);

    int insertSelective(HbipPubNewsHotImage record);

    List<HbipPubNewsHotImage> selectByExample(HbipPubNewsHotImageExample example);

    HbipPubNewsHotImage selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubNewsHotImage record, @Param("example") HbipPubNewsHotImageExample example);

    int updateByExample(@Param("record") HbipPubNewsHotImage record, @Param("example") HbipPubNewsHotImageExample example);

    int updateByPrimaryKeySelective(HbipPubNewsHotImage record);

    int updateByPrimaryKey(HbipPubNewsHotImage record);
}