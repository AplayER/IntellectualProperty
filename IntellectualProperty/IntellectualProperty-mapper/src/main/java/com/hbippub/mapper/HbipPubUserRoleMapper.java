package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubUserRoleExample;
import com.hbippub.pojo.HbipPubUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubUserRoleMapper {
    int countByExample(HbipPubUserRoleExample example);

    int deleteByExample(HbipPubUserRoleExample example);

    int deleteByPrimaryKey(HbipPubUserRoleKey key);

    int insert(HbipPubUserRoleKey record);

    int insertSelective(HbipPubUserRoleKey record);

    List<HbipPubUserRoleKey> selectByExample(HbipPubUserRoleExample example);

    int updateByExampleSelective(@Param("record") HbipPubUserRoleKey record, @Param("example") HbipPubUserRoleExample example);

    int updateByExample(@Param("record") HbipPubUserRoleKey record, @Param("example") HbipPubUserRoleExample example);
}