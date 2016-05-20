package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubRole;
import com.hbippub.pojo.HbipPubRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubRoleMapper {
    int countByExample(HbipPubRoleExample example);

    int deleteByExample(HbipPubRoleExample example);

    int deleteByPrimaryKey(Integer jueseid);

    int insert(HbipPubRole record);

    int insertSelective(HbipPubRole record);

    List<HbipPubRole> selectByExample(HbipPubRoleExample example);

    HbipPubRole selectByPrimaryKey(Integer jueseid);

    int updateByExampleSelective(@Param("record") HbipPubRole record, @Param("example") HbipPubRoleExample example);

    int updateByExample(@Param("record") HbipPubRole record, @Param("example") HbipPubRoleExample example);

    int updateByPrimaryKeySelective(HbipPubRole record);

    int updateByPrimaryKey(HbipPubRole record);
}