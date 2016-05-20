package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubAuctionMode;
import com.hbippub.pojo.HbipPubAuctionModeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubAuctionModeMapper {
    int countByExample(HbipPubAuctionModeExample example);

    int deleteByExample(HbipPubAuctionModeExample example);

    int deleteByPrimaryKey(Integer paimaimoshiid);

    int insert(HbipPubAuctionMode record);

    int insertSelective(HbipPubAuctionMode record);

    List<HbipPubAuctionMode> selectByExample(HbipPubAuctionModeExample example);

    HbipPubAuctionMode selectByPrimaryKey(Integer paimaimoshiid);

    int updateByExampleSelective(@Param("record") HbipPubAuctionMode record, @Param("example") HbipPubAuctionModeExample example);

    int updateByExample(@Param("record") HbipPubAuctionMode record, @Param("example") HbipPubAuctionModeExample example);

    int updateByPrimaryKeySelective(HbipPubAuctionMode record);

    int updateByPrimaryKey(HbipPubAuctionMode record);
}