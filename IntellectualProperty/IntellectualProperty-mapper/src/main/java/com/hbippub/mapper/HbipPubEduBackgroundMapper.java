package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubEduBackground;
import com.hbippub.pojo.HbipPubEduBackgroundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubEduBackgroundMapper {
    int countByExample(HbipPubEduBackgroundExample example);

    int deleteByExample(HbipPubEduBackgroundExample example);

    int deleteByPrimaryKey(Integer xueliid);

    int insert(HbipPubEduBackground record);

    int insertSelective(HbipPubEduBackground record);

    List<HbipPubEduBackground> selectByExample(HbipPubEduBackgroundExample example);

    HbipPubEduBackground selectByPrimaryKey(Integer xueliid);

    int updateByExampleSelective(@Param("record") HbipPubEduBackground record, @Param("example") HbipPubEduBackgroundExample example);

    int updateByExample(@Param("record") HbipPubEduBackground record, @Param("example") HbipPubEduBackgroundExample example);

    int updateByPrimaryKeySelective(HbipPubEduBackground record);

    int updateByPrimaryKey(HbipPubEduBackground record);
}