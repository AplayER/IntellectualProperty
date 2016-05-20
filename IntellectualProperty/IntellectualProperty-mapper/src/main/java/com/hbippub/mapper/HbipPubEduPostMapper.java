package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubEduPost;
import com.hbippub.pojo.HbipPubEduPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubEduPostMapper {
    int countByExample(HbipPubEduPostExample example);

    int deleteByExample(HbipPubEduPostExample example);

    int deleteByPrimaryKey(Integer tieziid);

    int insert(HbipPubEduPost record);

    int insertSelective(HbipPubEduPost record);

    List<HbipPubEduPost> selectByExampleWithBLOBs(HbipPubEduPostExample example);

    List<HbipPubEduPost> selectByExample(HbipPubEduPostExample example);

    HbipPubEduPost selectByPrimaryKey(Integer tieziid);

    int updateByExampleSelective(@Param("record") HbipPubEduPost record, @Param("example") HbipPubEduPostExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubEduPost record, @Param("example") HbipPubEduPostExample example);

    int updateByExample(@Param("record") HbipPubEduPost record, @Param("example") HbipPubEduPostExample example);

    int updateByPrimaryKeySelective(HbipPubEduPost record);

    int updateByPrimaryKeyWithBLOBs(HbipPubEduPost record);

    int updateByPrimaryKey(HbipPubEduPost record);
}