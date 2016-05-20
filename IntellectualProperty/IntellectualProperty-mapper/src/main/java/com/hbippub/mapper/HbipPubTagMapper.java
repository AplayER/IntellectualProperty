package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTag;
import com.hbippub.pojo.HbipPubTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTagMapper {
    int countByExample(HbipPubTagExample example);

    int deleteByExample(HbipPubTagExample example);

    int deleteByPrimaryKey(Integer biaoqianid);

    int insert(HbipPubTag record);

    int insertSelective(HbipPubTag record);

    List<HbipPubTag> selectByExample(HbipPubTagExample example);

    HbipPubTag selectByPrimaryKey(Integer biaoqianid);

    int updateByExampleSelective(@Param("record") HbipPubTag record, @Param("example") HbipPubTagExample example);

    int updateByExample(@Param("record") HbipPubTag record, @Param("example") HbipPubTagExample example);

    int updateByPrimaryKeySelective(HbipPubTag record);

    int updateByPrimaryKey(HbipPubTag record);
}