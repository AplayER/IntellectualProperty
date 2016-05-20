package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTechnologyType;
import com.hbippub.pojo.HbipPubTechnologyTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTechnologyTypeMapper {
    int countByExample(HbipPubTechnologyTypeExample example);

    int deleteByExample(HbipPubTechnologyTypeExample example);

    int deleteByPrimaryKey(Integer jishuleixingid);

    int insert(HbipPubTechnologyType record);

    int insertSelective(HbipPubTechnologyType record);

    List<HbipPubTechnologyType> selectByExample(HbipPubTechnologyTypeExample example);

    HbipPubTechnologyType selectByPrimaryKey(Integer jishuleixingid);

    int updateByExampleSelective(@Param("record") HbipPubTechnologyType record, @Param("example") HbipPubTechnologyTypeExample example);

    int updateByExample(@Param("record") HbipPubTechnologyType record, @Param("example") HbipPubTechnologyTypeExample example);

    int updateByPrimaryKeySelective(HbipPubTechnologyType record);

    int updateByPrimaryKey(HbipPubTechnologyType record);
}