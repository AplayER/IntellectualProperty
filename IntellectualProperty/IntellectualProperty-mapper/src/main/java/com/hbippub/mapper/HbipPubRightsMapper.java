package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubRights;
import com.hbippub.pojo.HbipPubRightsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubRightsMapper {
    int countByExample(HbipPubRightsExample example);

    int deleteByExample(HbipPubRightsExample example);

    int deleteByPrimaryKey(Integer quanxianid);

    int insert(HbipPubRights record);

    int insertSelective(HbipPubRights record);

    List<HbipPubRights> selectByExample(HbipPubRightsExample example);

    HbipPubRights selectByPrimaryKey(Integer quanxianid);

    int updateByExampleSelective(@Param("record") HbipPubRights record, @Param("example") HbipPubRightsExample example);

    int updateByExample(@Param("record") HbipPubRights record, @Param("example") HbipPubRightsExample example);

    int updateByPrimaryKeySelective(HbipPubRights record);

    int updateByPrimaryKey(HbipPubRights record);
}