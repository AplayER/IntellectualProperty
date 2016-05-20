package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubLocation;
import com.hbippub.pojo.HbipPubLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubLocationMapper {
    int countByExample(HbipPubLocationExample example);

    int deleteByExample(HbipPubLocationExample example);

    int deleteByPrimaryKey(Integer diquid);

    int insert(HbipPubLocation record);

    int insertSelective(HbipPubLocation record);

    List<HbipPubLocation> selectByExample(HbipPubLocationExample example);

    HbipPubLocation selectByPrimaryKey(Integer diquid);

    int updateByExampleSelective(@Param("record") HbipPubLocation record, @Param("example") HbipPubLocationExample example);

    int updateByExample(@Param("record") HbipPubLocation record, @Param("example") HbipPubLocationExample example);

    int updateByPrimaryKeySelective(HbipPubLocation record);

    int updateByPrimaryKey(HbipPubLocation record);
}