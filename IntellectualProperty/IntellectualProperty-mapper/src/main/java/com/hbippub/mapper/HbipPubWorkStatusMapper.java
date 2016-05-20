package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubWorkStatus;
import com.hbippub.pojo.HbipPubWorkStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubWorkStatusMapper {
    int countByExample(HbipPubWorkStatusExample example);

    int deleteByExample(HbipPubWorkStatusExample example);

    int deleteByPrimaryKey(Integer zhuangtaiid);

    int insert(HbipPubWorkStatus record);

    int insertSelective(HbipPubWorkStatus record);

    List<HbipPubWorkStatus> selectByExample(HbipPubWorkStatusExample example);

    HbipPubWorkStatus selectByPrimaryKey(Integer zhuangtaiid);

    int updateByExampleSelective(@Param("record") HbipPubWorkStatus record, @Param("example") HbipPubWorkStatusExample example);

    int updateByExample(@Param("record") HbipPubWorkStatus record, @Param("example") HbipPubWorkStatusExample example);

    int updateByPrimaryKeySelective(HbipPubWorkStatus record);

    int updateByPrimaryKey(HbipPubWorkStatus record);
}