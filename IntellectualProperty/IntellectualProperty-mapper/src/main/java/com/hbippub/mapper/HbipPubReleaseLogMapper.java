package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubReleaseLog;
import com.hbippub.pojo.HbipPubReleaseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubReleaseLogMapper {
    int countByExample(HbipPubReleaseLogExample example);

    int deleteByExample(HbipPubReleaseLogExample example);

    int deleteByPrimaryKey(Integer rizhiid);

    int insert(HbipPubReleaseLog record);

    int insertSelective(HbipPubReleaseLog record);

    List<HbipPubReleaseLog> selectByExample(HbipPubReleaseLogExample example);

    HbipPubReleaseLog selectByPrimaryKey(Integer rizhiid);

    int updateByExampleSelective(@Param("record") HbipPubReleaseLog record, @Param("example") HbipPubReleaseLogExample example);

    int updateByExample(@Param("record") HbipPubReleaseLog record, @Param("example") HbipPubReleaseLogExample example);

    int updateByPrimaryKeySelective(HbipPubReleaseLog record);

    int updateByPrimaryKey(HbipPubReleaseLog record);
}