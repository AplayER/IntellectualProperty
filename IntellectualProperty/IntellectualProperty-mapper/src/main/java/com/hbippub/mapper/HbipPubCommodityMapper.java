package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCommodity;
import com.hbippub.pojo.HbipPubCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCommodityMapper {
    int countByExample(HbipPubCommodityExample example);

    int deleteByExample(HbipPubCommodityExample example);

    int deleteByPrimaryKey(Integer shangpinid);

    int insert(HbipPubCommodity record);

    int insertSelective(HbipPubCommodity record);

    List<HbipPubCommodity> selectByExample(HbipPubCommodityExample example);

    HbipPubCommodity selectByPrimaryKey(Integer shangpinid);

    int updateByExampleSelective(@Param("record") HbipPubCommodity record, @Param("example") HbipPubCommodityExample example);

    int updateByExample(@Param("record") HbipPubCommodity record, @Param("example") HbipPubCommodityExample example);

    int updateByPrimaryKeySelective(HbipPubCommodity record);

    int updateByPrimaryKey(HbipPubCommodity record);
}