package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubMarketIndexPic;
import com.hbippub.pojo.HbipPubMarketIndexPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubMarketIndexPicMapper {
    int countByExample(HbipPubMarketIndexPicExample example);

    int deleteByExample(HbipPubMarketIndexPicExample example);

    int deleteByPrimaryKey(Integer tupianid);

    int insert(HbipPubMarketIndexPic record);

    int insertSelective(HbipPubMarketIndexPic record);

    List<HbipPubMarketIndexPic> selectByExample(HbipPubMarketIndexPicExample example);

    HbipPubMarketIndexPic selectByPrimaryKey(Integer tupianid);

    int updateByExampleSelective(@Param("record") HbipPubMarketIndexPic record, @Param("example") HbipPubMarketIndexPicExample example);

    int updateByExample(@Param("record") HbipPubMarketIndexPic record, @Param("example") HbipPubMarketIndexPicExample example);

    int updateByPrimaryKeySelective(HbipPubMarketIndexPic record);

    int updateByPrimaryKey(HbipPubMarketIndexPic record);
}