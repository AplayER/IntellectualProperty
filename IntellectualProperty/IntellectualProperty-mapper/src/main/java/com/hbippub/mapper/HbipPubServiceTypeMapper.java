package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubServiceType;
import com.hbippub.pojo.HbipPubServiceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubServiceTypeMapper {
    int countByExample(HbipPubServiceTypeExample example);

    int deleteByExample(HbipPubServiceTypeExample example);

    int deleteByPrimaryKey(Integer fuwuleixingid);

    int insert(HbipPubServiceType record);

    int insertSelective(HbipPubServiceType record);

    List<HbipPubServiceType> selectByExample(HbipPubServiceTypeExample example);

    HbipPubServiceType selectByPrimaryKey(Integer fuwuleixingid);

    int updateByExampleSelective(@Param("record") HbipPubServiceType record, @Param("example") HbipPubServiceTypeExample example);

    int updateByExample(@Param("record") HbipPubServiceType record, @Param("example") HbipPubServiceTypeExample example);

    int updateByPrimaryKeySelective(HbipPubServiceType record);

    int updateByPrimaryKey(HbipPubServiceType record);
}