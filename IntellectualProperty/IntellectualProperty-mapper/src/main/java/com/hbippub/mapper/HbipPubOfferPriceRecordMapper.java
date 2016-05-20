package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubOfferPriceRecord;
import com.hbippub.pojo.HbipPubOfferPriceRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubOfferPriceRecordMapper {
    int countByExample(HbipPubOfferPriceRecordExample example);

    int deleteByExample(HbipPubOfferPriceRecordExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubOfferPriceRecord record);

    int insertSelective(HbipPubOfferPriceRecord record);

    List<HbipPubOfferPriceRecord> selectByExample(HbipPubOfferPriceRecordExample example);

    HbipPubOfferPriceRecord selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubOfferPriceRecord record, @Param("example") HbipPubOfferPriceRecordExample example);

    int updateByExample(@Param("record") HbipPubOfferPriceRecord record, @Param("example") HbipPubOfferPriceRecordExample example);

    int updateByPrimaryKeySelective(HbipPubOfferPriceRecord record);

    int updateByPrimaryKey(HbipPubOfferPriceRecord record);
}