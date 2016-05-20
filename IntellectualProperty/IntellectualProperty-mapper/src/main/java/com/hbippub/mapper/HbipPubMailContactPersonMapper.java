package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubMailContactPerson;
import com.hbippub.pojo.HbipPubMailContactPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubMailContactPersonMapper {
    int countByExample(HbipPubMailContactPersonExample example);

    int deleteByExample(HbipPubMailContactPersonExample example);

    int deleteByPrimaryKey(Integer bianhaoid);

    int insert(HbipPubMailContactPerson record);

    int insertSelective(HbipPubMailContactPerson record);

    List<HbipPubMailContactPerson> selectByExample(HbipPubMailContactPersonExample example);

    HbipPubMailContactPerson selectByPrimaryKey(Integer bianhaoid);

    int updateByExampleSelective(@Param("record") HbipPubMailContactPerson record, @Param("example") HbipPubMailContactPersonExample example);

    int updateByExample(@Param("record") HbipPubMailContactPerson record, @Param("example") HbipPubMailContactPersonExample example);

    int updateByPrimaryKeySelective(HbipPubMailContactPerson record);

    int updateByPrimaryKey(HbipPubMailContactPerson record);
}