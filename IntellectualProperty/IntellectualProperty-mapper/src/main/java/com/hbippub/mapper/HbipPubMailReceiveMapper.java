package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubMailReceive;
import com.hbippub.pojo.HbipPubMailReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubMailReceiveMapper {
    int countByExample(HbipPubMailReceiveExample example);

    int deleteByExample(HbipPubMailReceiveExample example);

    int deleteByPrimaryKey(Integer bianhaoid);

    int insert(HbipPubMailReceive record);

    int insertSelective(HbipPubMailReceive record);

    List<HbipPubMailReceive> selectByExample(HbipPubMailReceiveExample example);

    HbipPubMailReceive selectByPrimaryKey(Integer bianhaoid);

    int updateByExampleSelective(@Param("record") HbipPubMailReceive record, @Param("example") HbipPubMailReceiveExample example);

    int updateByExample(@Param("record") HbipPubMailReceive record, @Param("example") HbipPubMailReceiveExample example);

    int updateByPrimaryKeySelective(HbipPubMailReceive record);

    int updateByPrimaryKey(HbipPubMailReceive record);
}