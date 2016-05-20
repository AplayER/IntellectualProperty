package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubFormTransmit;
import com.hbippub.pojo.HbipPubFormTransmitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubFormTransmitMapper {
    int countByExample(HbipPubFormTransmitExample example);

    int deleteByExample(HbipPubFormTransmitExample example);

    int deleteByPrimaryKey(Integer bianhaoid);

    int insert(HbipPubFormTransmit record);

    int insertSelective(HbipPubFormTransmit record);

    List<HbipPubFormTransmit> selectByExample(HbipPubFormTransmitExample example);

    HbipPubFormTransmit selectByPrimaryKey(Integer bianhaoid);

    int updateByExampleSelective(@Param("record") HbipPubFormTransmit record, @Param("example") HbipPubFormTransmitExample example);

    int updateByExample(@Param("record") HbipPubFormTransmit record, @Param("example") HbipPubFormTransmitExample example);

    int updateByPrimaryKeySelective(HbipPubFormTransmit record);

    int updateByPrimaryKey(HbipPubFormTransmit record);
}