package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsHotActivity;
import com.hbippub.pojo.HbipPubNewsHotActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsHotActivityMapper {
    int countByExample(HbipPubNewsHotActivityExample example);

    int deleteByExample(HbipPubNewsHotActivityExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubNewsHotActivity record);

    int insertSelective(HbipPubNewsHotActivity record);

    List<HbipPubNewsHotActivity> selectByExampleWithBLOBs(HbipPubNewsHotActivityExample example);

    List<HbipPubNewsHotActivity> selectByExample(HbipPubNewsHotActivityExample example);

    HbipPubNewsHotActivity selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubNewsHotActivity record, @Param("example") HbipPubNewsHotActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubNewsHotActivity record, @Param("example") HbipPubNewsHotActivityExample example);

    int updateByExample(@Param("record") HbipPubNewsHotActivity record, @Param("example") HbipPubNewsHotActivityExample example);

    int updateByPrimaryKeySelective(HbipPubNewsHotActivity record);

    int updateByPrimaryKeyWithBLOBs(HbipPubNewsHotActivity record);

    int updateByPrimaryKey(HbipPubNewsHotActivity record);
}