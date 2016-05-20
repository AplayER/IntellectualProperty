package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubOperationLog;
import com.hbippub.pojo.HbipPubOperationLogExample;
import com.hbippub.pojo.HbipPubOperationLogKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubOperationLogMapper {
    int countByExample(HbipPubOperationLogExample example);

    int deleteByExample(HbipPubOperationLogExample example);

    int deleteByPrimaryKey(HbipPubOperationLogKey key);

    int insert(HbipPubOperationLog record);

    int insertSelective(HbipPubOperationLog record);

    List<HbipPubOperationLog> selectByExample(HbipPubOperationLogExample example);

    HbipPubOperationLog selectByPrimaryKey(HbipPubOperationLogKey key);

    int updateByExampleSelective(@Param("record") HbipPubOperationLog record, @Param("example") HbipPubOperationLogExample example);

    int updateByExample(@Param("record") HbipPubOperationLog record, @Param("example") HbipPubOperationLogExample example);

    int updateByPrimaryKeySelective(HbipPubOperationLog record);

    int updateByPrimaryKey(HbipPubOperationLog record);
}