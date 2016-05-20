package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCommodityDisplay;
import com.hbippub.pojo.HbipPubCommodityDisplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCommodityDisplayMapper {
    int countByExample(HbipPubCommodityDisplayExample example);

    int deleteByExample(HbipPubCommodityDisplayExample example);

    int deleteByPrimaryKey(Integer shangpinid);

    int insert(HbipPubCommodityDisplay record);

    int insertSelective(HbipPubCommodityDisplay record);

    List<HbipPubCommodityDisplay> selectByExample(HbipPubCommodityDisplayExample example);

    HbipPubCommodityDisplay selectByPrimaryKey(Integer shangpinid);

    int updateByExampleSelective(@Param("record") HbipPubCommodityDisplay record, @Param("example") HbipPubCommodityDisplayExample example);

    int updateByExample(@Param("record") HbipPubCommodityDisplay record, @Param("example") HbipPubCommodityDisplayExample example);

    int updateByPrimaryKeySelective(HbipPubCommodityDisplay record);

    int updateByPrimaryKey(HbipPubCommodityDisplay record);
}