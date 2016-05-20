package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubIdType;
import com.hbippub.pojo.HbipPubIdTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubIdTypeMapper {
    int countByExample(HbipPubIdTypeExample example);

    int deleteByExample(HbipPubIdTypeExample example);

    int deleteByPrimaryKey(Integer leixingid);

    int insert(HbipPubIdType record);

    int insertSelective(HbipPubIdType record);

    List<HbipPubIdType> selectByExample(HbipPubIdTypeExample example);

    HbipPubIdType selectByPrimaryKey(Integer leixingid);

    int updateByExampleSelective(@Param("record") HbipPubIdType record, @Param("example") HbipPubIdTypeExample example);

    int updateByExample(@Param("record") HbipPubIdType record, @Param("example") HbipPubIdTypeExample example);

    int updateByPrimaryKeySelective(HbipPubIdType record);

    int updateByPrimaryKey(HbipPubIdType record);
}