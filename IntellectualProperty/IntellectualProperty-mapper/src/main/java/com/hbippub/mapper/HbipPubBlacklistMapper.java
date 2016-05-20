package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubBlacklist;
import com.hbippub.pojo.HbipPubBlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubBlacklistMapper {
    int countByExample(HbipPubBlacklistExample example);

    int deleteByExample(HbipPubBlacklistExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubBlacklist record);

    int insertSelective(HbipPubBlacklist record);

    List<HbipPubBlacklist> selectByExample(HbipPubBlacklistExample example);

    HbipPubBlacklist selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubBlacklist record, @Param("example") HbipPubBlacklistExample example);

    int updateByExample(@Param("record") HbipPubBlacklist record, @Param("example") HbipPubBlacklistExample example);

    int updateByPrimaryKeySelective(HbipPubBlacklist record);

    int updateByPrimaryKey(HbipPubBlacklist record);
}