package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsHotDynamic;
import com.hbippub.pojo.HbipPubNewsHotDynamicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsHotDynamicMapper {
    int countByExample(HbipPubNewsHotDynamicExample example);

    int deleteByExample(HbipPubNewsHotDynamicExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubNewsHotDynamic record);

    int insertSelective(HbipPubNewsHotDynamic record);

    List<HbipPubNewsHotDynamic> selectByExampleWithBLOBs(HbipPubNewsHotDynamicExample example);

    List<HbipPubNewsHotDynamic> selectByExample(HbipPubNewsHotDynamicExample example);

    HbipPubNewsHotDynamic selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubNewsHotDynamic record, @Param("example") HbipPubNewsHotDynamicExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubNewsHotDynamic record, @Param("example") HbipPubNewsHotDynamicExample example);

    int updateByExample(@Param("record") HbipPubNewsHotDynamic record, @Param("example") HbipPubNewsHotDynamicExample example);

    int updateByPrimaryKeySelective(HbipPubNewsHotDynamic record);

    int updateByPrimaryKeyWithBLOBs(HbipPubNewsHotDynamic record);

    int updateByPrimaryKey(HbipPubNewsHotDynamic record);
}