package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubAuctionState;
import com.hbippub.pojo.HbipPubAuctionStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubAuctionStateMapper {
    int countByExample(HbipPubAuctionStateExample example);

    int deleteByExample(HbipPubAuctionStateExample example);

    int deleteByPrimaryKey(Integer paimaizhuangtaiid);

    int insert(HbipPubAuctionState record);

    int insertSelective(HbipPubAuctionState record);

    List<HbipPubAuctionState> selectByExample(HbipPubAuctionStateExample example);

    HbipPubAuctionState selectByPrimaryKey(Integer paimaizhuangtaiid);

    int updateByExampleSelective(@Param("record") HbipPubAuctionState record, @Param("example") HbipPubAuctionStateExample example);

    int updateByExample(@Param("record") HbipPubAuctionState record, @Param("example") HbipPubAuctionStateExample example);

    int updateByPrimaryKeySelective(HbipPubAuctionState record);

    int updateByPrimaryKey(HbipPubAuctionState record);
}