package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubRoleRightsExample;
import com.hbippub.pojo.HbipPubRoleRightsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubRoleRightsMapper {
    int countByExample(HbipPubRoleRightsExample example);

    int deleteByExample(HbipPubRoleRightsExample example);

    int deleteByPrimaryKey(HbipPubRoleRightsKey key);

    int insert(HbipPubRoleRightsKey record);

    int insertSelective(HbipPubRoleRightsKey record);

    List<HbipPubRoleRightsKey> selectByExample(HbipPubRoleRightsExample example);

    int updateByExampleSelective(@Param("record") HbipPubRoleRightsKey record, @Param("example") HbipPubRoleRightsExample example);

    int updateByExample(@Param("record") HbipPubRoleRightsKey record, @Param("example") HbipPubRoleRightsExample example);
}