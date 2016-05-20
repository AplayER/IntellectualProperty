package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubDiscussionPost;
import com.hbippub.pojo.HbipPubDiscussionPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubDiscussionPostMapper {
    int countByExample(HbipPubDiscussionPostExample example);

    int deleteByExample(HbipPubDiscussionPostExample example);

    int deleteByPrimaryKey(Integer tieziid);

    int insert(HbipPubDiscussionPost record);

    int insertSelective(HbipPubDiscussionPost record);

    List<HbipPubDiscussionPost> selectByExample(HbipPubDiscussionPostExample example);

    HbipPubDiscussionPost selectByPrimaryKey(Integer tieziid);

    int updateByExampleSelective(@Param("record") HbipPubDiscussionPost record, @Param("example") HbipPubDiscussionPostExample example);

    int updateByExample(@Param("record") HbipPubDiscussionPost record, @Param("example") HbipPubDiscussionPostExample example);

    int updateByPrimaryKeySelective(HbipPubDiscussionPost record);

    int updateByPrimaryKey(HbipPubDiscussionPost record);
}