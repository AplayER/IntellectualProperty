package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCollectRecord;
import com.hbippub.pojo.HbipPubCollectRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCollectRecordMapper {
    int countByExample(HbipPubCollectRecordExample example);

    int deleteByExample(HbipPubCollectRecordExample example);

    int deleteByPrimaryKey(Integer shoucangjiluid);

    int insert(HbipPubCollectRecord record);

    int insertSelective(HbipPubCollectRecord record);

    List<HbipPubCollectRecord> selectByExample(HbipPubCollectRecordExample example);

    HbipPubCollectRecord selectByPrimaryKey(Integer shoucangjiluid);

    int updateByExampleSelective(@Param("record") HbipPubCollectRecord record, @Param("example") HbipPubCollectRecordExample example);

    int updateByExample(@Param("record") HbipPubCollectRecord record, @Param("example") HbipPubCollectRecordExample example);

    int updateByPrimaryKeySelective(HbipPubCollectRecord record);

    int updateByPrimaryKey(HbipPubCollectRecord record);
}