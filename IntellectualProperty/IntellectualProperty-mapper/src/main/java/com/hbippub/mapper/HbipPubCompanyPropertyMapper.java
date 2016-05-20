package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCompanyProperty;
import com.hbippub.pojo.HbipPubCompanyPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCompanyPropertyMapper {
    int countByExample(HbipPubCompanyPropertyExample example);

    int deleteByExample(HbipPubCompanyPropertyExample example);

    int deleteByPrimaryKey(Integer danweixingzhiid);

    int insert(HbipPubCompanyProperty record);

    int insertSelective(HbipPubCompanyProperty record);

    List<HbipPubCompanyProperty> selectByExample(HbipPubCompanyPropertyExample example);

    HbipPubCompanyProperty selectByPrimaryKey(Integer danweixingzhiid);

    int updateByExampleSelective(@Param("record") HbipPubCompanyProperty record, @Param("example") HbipPubCompanyPropertyExample example);

    int updateByExample(@Param("record") HbipPubCompanyProperty record, @Param("example") HbipPubCompanyPropertyExample example);

    int updateByPrimaryKeySelective(HbipPubCompanyProperty record);

    int updateByPrimaryKey(HbipPubCompanyProperty record);
}