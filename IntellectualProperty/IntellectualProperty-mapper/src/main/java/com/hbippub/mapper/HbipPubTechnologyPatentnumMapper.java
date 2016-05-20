package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTechnologyPatentnum;
import com.hbippub.pojo.HbipPubTechnologyPatentnumExample;
import com.hbippub.pojo.HbipPubTechnologyPatentnumKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTechnologyPatentnumMapper {
    int countByExample(HbipPubTechnologyPatentnumExample example);

    int deleteByExample(HbipPubTechnologyPatentnumExample example);

    int deleteByPrimaryKey(HbipPubTechnologyPatentnumKey key);

    int insert(HbipPubTechnologyPatentnum record);

    int insertSelective(HbipPubTechnologyPatentnum record);

    List<HbipPubTechnologyPatentnum> selectByExample(HbipPubTechnologyPatentnumExample example);

    HbipPubTechnologyPatentnum selectByPrimaryKey(HbipPubTechnologyPatentnumKey key);

    int updateByExampleSelective(@Param("record") HbipPubTechnologyPatentnum record, @Param("example") HbipPubTechnologyPatentnumExample example);

    int updateByExample(@Param("record") HbipPubTechnologyPatentnum record, @Param("example") HbipPubTechnologyPatentnumExample example);

    int updateByPrimaryKeySelective(HbipPubTechnologyPatentnum record);

    int updateByPrimaryKey(HbipPubTechnologyPatentnum record);
}