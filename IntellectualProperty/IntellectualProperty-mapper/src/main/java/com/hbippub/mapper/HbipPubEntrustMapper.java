package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubEntrust;
import com.hbippub.pojo.HbipPubEntrustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubEntrustMapper {
    int countByExample(HbipPubEntrustExample example);

    int deleteByExample(HbipPubEntrustExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubEntrust record);

    int insertSelective(HbipPubEntrust record);

    List<HbipPubEntrust> selectByExample(HbipPubEntrustExample example);

    HbipPubEntrust selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubEntrust record, @Param("example") HbipPubEntrustExample example);

    int updateByExample(@Param("record") HbipPubEntrust record, @Param("example") HbipPubEntrustExample example);

    int updateByPrimaryKeySelective(HbipPubEntrust record);

    int updateByPrimaryKey(HbipPubEntrust record);
}