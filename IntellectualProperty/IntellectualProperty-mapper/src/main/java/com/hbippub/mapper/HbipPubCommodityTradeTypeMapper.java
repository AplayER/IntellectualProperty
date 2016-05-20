package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCommodityTradeType;
import com.hbippub.pojo.HbipPubCommodityTradeTypeExample;
import com.hbippub.pojo.HbipPubCommodityTradeTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCommodityTradeTypeMapper {
    int countByExample(HbipPubCommodityTradeTypeExample example);

    int deleteByExample(HbipPubCommodityTradeTypeExample example);

    int deleteByPrimaryKey(HbipPubCommodityTradeTypeKey key);

    int insert(HbipPubCommodityTradeType record);

    int insertSelective(HbipPubCommodityTradeType record);

    List<HbipPubCommodityTradeType> selectByExample(HbipPubCommodityTradeTypeExample example);

    HbipPubCommodityTradeType selectByPrimaryKey(HbipPubCommodityTradeTypeKey key);

    int updateByExampleSelective(@Param("record") HbipPubCommodityTradeType record, @Param("example") HbipPubCommodityTradeTypeExample example);

    int updateByExample(@Param("record") HbipPubCommodityTradeType record, @Param("example") HbipPubCommodityTradeTypeExample example);

    int updateByPrimaryKeySelective(HbipPubCommodityTradeType record);

    int updateByPrimaryKey(HbipPubCommodityTradeType record);
}