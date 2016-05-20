package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubFollowing;
import com.hbippub.pojo.HbipPubFollowingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubFollowingMapper {
    int countByExample(HbipPubFollowingExample example);

    int deleteByExample(HbipPubFollowingExample example);

    int deleteByPrimaryKey(Integer guanzhuid);

    int insert(HbipPubFollowing record);

    int insertSelective(HbipPubFollowing record);

    List<HbipPubFollowing> selectByExample(HbipPubFollowingExample example);

    HbipPubFollowing selectByPrimaryKey(Integer guanzhuid);

    int updateByExampleSelective(@Param("record") HbipPubFollowing record, @Param("example") HbipPubFollowingExample example);

    int updateByExample(@Param("record") HbipPubFollowing record, @Param("example") HbipPubFollowingExample example);

    int updateByPrimaryKeySelective(HbipPubFollowing record);

    int updateByPrimaryKey(HbipPubFollowing record);
}