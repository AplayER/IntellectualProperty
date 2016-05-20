package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubDiscussionReply;
import com.hbippub.pojo.HbipPubDiscussionReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubDiscussionReplyMapper {
    int countByExample(HbipPubDiscussionReplyExample example);

    int deleteByExample(HbipPubDiscussionReplyExample example);

    int deleteByPrimaryKey(Integer huifuid);

    int insert(HbipPubDiscussionReply record);

    int insertSelective(HbipPubDiscussionReply record);

    List<HbipPubDiscussionReply> selectByExample(HbipPubDiscussionReplyExample example);

    HbipPubDiscussionReply selectByPrimaryKey(Integer huifuid);

    int updateByExampleSelective(@Param("record") HbipPubDiscussionReply record, @Param("example") HbipPubDiscussionReplyExample example);

    int updateByExample(@Param("record") HbipPubDiscussionReply record, @Param("example") HbipPubDiscussionReplyExample example);

    int updateByPrimaryKeySelective(HbipPubDiscussionReply record);

    int updateByPrimaryKey(HbipPubDiscussionReply record);
}