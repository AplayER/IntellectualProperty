package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTradeType;
import com.hbippub.pojo.HbipPubTradeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTradeTypeMapper {
    int countByExample(HbipPubTradeTypeExample example);

    int deleteByExample(HbipPubTradeTypeExample example);

    int deleteByPrimaryKey(Integer jiaoyileixingid);

    int insert(HbipPubTradeType record);

    int insertSelective(HbipPubTradeType record);

    List<HbipPubTradeType> selectByExample(HbipPubTradeTypeExample example);

    HbipPubTradeType selectByPrimaryKey(Integer jiaoyileixingid);

    int updateByExampleSelective(@Param("record") HbipPubTradeType record, @Param("example") HbipPubTradeTypeExample example);

    int updateByExample(@Param("record") HbipPubTradeType record, @Param("example") HbipPubTradeTypeExample example);

    int updateByPrimaryKeySelective(HbipPubTradeType record);

    int updateByPrimaryKey(HbipPubTradeType record);
}