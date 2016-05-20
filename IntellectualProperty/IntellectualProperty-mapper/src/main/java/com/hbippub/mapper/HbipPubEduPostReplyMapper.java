package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubEduPostReply;
import com.hbippub.pojo.HbipPubEduPostReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubEduPostReplyMapper {
    int countByExample(HbipPubEduPostReplyExample example);

    int deleteByExample(HbipPubEduPostReplyExample example);

    int deleteByPrimaryKey(Integer huifuid);

    int insert(HbipPubEduPostReply record);

    int insertSelective(HbipPubEduPostReply record);

    List<HbipPubEduPostReply> selectByExampleWithBLOBs(HbipPubEduPostReplyExample example);

    List<HbipPubEduPostReply> selectByExample(HbipPubEduPostReplyExample example);

    HbipPubEduPostReply selectByPrimaryKey(Integer huifuid);

    int updateByExampleSelective(@Param("record") HbipPubEduPostReply record, @Param("example") HbipPubEduPostReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubEduPostReply record, @Param("example") HbipPubEduPostReplyExample example);

    int updateByExample(@Param("record") HbipPubEduPostReply record, @Param("example") HbipPubEduPostReplyExample example);

    int updateByPrimaryKeySelective(HbipPubEduPostReply record);

    int updateByPrimaryKeyWithBLOBs(HbipPubEduPostReply record);

    int updateByPrimaryKey(HbipPubEduPostReply record);
}