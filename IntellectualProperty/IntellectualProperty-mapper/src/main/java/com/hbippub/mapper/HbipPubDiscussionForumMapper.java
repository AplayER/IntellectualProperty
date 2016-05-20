package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubDiscussionForum;
import com.hbippub.pojo.HbipPubDiscussionForumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubDiscussionForumMapper {
    int countByExample(HbipPubDiscussionForumExample example);

    int deleteByExample(HbipPubDiscussionForumExample example);

    int deleteByPrimaryKey(Integer taolunquid);

    int insert(HbipPubDiscussionForum record);

    int insertSelective(HbipPubDiscussionForum record);

    List<HbipPubDiscussionForum> selectByExample(HbipPubDiscussionForumExample example);

    HbipPubDiscussionForum selectByPrimaryKey(Integer taolunquid);

    int updateByExampleSelective(@Param("record") HbipPubDiscussionForum record, @Param("example") HbipPubDiscussionForumExample example);

    int updateByExample(@Param("record") HbipPubDiscussionForum record, @Param("example") HbipPubDiscussionForumExample example);

    int updateByPrimaryKeySelective(HbipPubDiscussionForum record);

    int updateByPrimaryKey(HbipPubDiscussionForum record);
}