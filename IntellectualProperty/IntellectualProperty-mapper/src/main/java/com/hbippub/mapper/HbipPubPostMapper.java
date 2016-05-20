package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubPost;
import com.hbippub.pojo.HbipPubPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubPostMapper {
    int countByExample(HbipPubPostExample example);

    int deleteByExample(HbipPubPostExample example);

    int deleteByPrimaryKey(Integer tieziid);

    int insert(HbipPubPost record);

    int insertSelective(HbipPubPost record);

    List<HbipPubPost> selectByExample(HbipPubPostExample example);

    HbipPubPost selectByPrimaryKey(Integer tieziid);

    int updateByExampleSelective(@Param("record") HbipPubPost record, @Param("example") HbipPubPostExample example);

    int updateByExample(@Param("record") HbipPubPost record, @Param("example") HbipPubPostExample example);

    int updateByPrimaryKeySelective(HbipPubPost record);

    int updateByPrimaryKey(HbipPubPost record);
}