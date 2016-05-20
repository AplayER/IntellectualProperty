package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubMarketRecommendShop;
import com.hbippub.pojo.HbipPubMarketRecommendShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubMarketRecommendShopMapper {
    int countByExample(HbipPubMarketRecommendShopExample example);

    int deleteByExample(HbipPubMarketRecommendShopExample example);

    int deleteByPrimaryKey(Integer yonghuid);

    int insert(HbipPubMarketRecommendShop record);

    int insertSelective(HbipPubMarketRecommendShop record);

    List<HbipPubMarketRecommendShop> selectByExample(HbipPubMarketRecommendShopExample example);

    HbipPubMarketRecommendShop selectByPrimaryKey(Integer yonghuid);

    int updateByExampleSelective(@Param("record") HbipPubMarketRecommendShop record, @Param("example") HbipPubMarketRecommendShopExample example);

    int updateByExample(@Param("record") HbipPubMarketRecommendShop record, @Param("example") HbipPubMarketRecommendShopExample example);

    int updateByPrimaryKeySelective(HbipPubMarketRecommendShop record);

    int updateByPrimaryKey(HbipPubMarketRecommendShop record);
}