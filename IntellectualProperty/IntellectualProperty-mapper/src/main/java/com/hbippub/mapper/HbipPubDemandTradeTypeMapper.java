package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubDemandTradeType;
import com.hbippub.pojo.HbipPubDemandTradeTypeExample;
import com.hbippub.pojo.HbipPubDemandTradeTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubDemandTradeTypeMapper {
    int countByExample(HbipPubDemandTradeTypeExample example);

    int deleteByExample(HbipPubDemandTradeTypeExample example);

    int deleteByPrimaryKey(HbipPubDemandTradeTypeKey key);

    int insert(HbipPubDemandTradeType record);

    int insertSelective(HbipPubDemandTradeType record);

    List<HbipPubDemandTradeType> selectByExample(HbipPubDemandTradeTypeExample example);

    HbipPubDemandTradeType selectByPrimaryKey(HbipPubDemandTradeTypeKey key);

    int updateByExampleSelective(@Param("record") HbipPubDemandTradeType record, @Param("example") HbipPubDemandTradeTypeExample example);

    int updateByExample(@Param("record") HbipPubDemandTradeType record, @Param("example") HbipPubDemandTradeTypeExample example);

    int updateByPrimaryKeySelective(HbipPubDemandTradeType record);

    int updateByPrimaryKey(HbipPubDemandTradeType record);
}