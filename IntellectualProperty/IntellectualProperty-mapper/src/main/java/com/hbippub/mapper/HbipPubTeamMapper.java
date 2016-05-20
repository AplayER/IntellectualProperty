package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTeam;
import com.hbippub.pojo.HbipPubTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTeamMapper {
    int countByExample(HbipPubTeamExample example);

    int deleteByExample(HbipPubTeamExample example);

    int deleteByPrimaryKey(Integer tuanduiid);

    int insert(HbipPubTeam record);

    int insertSelective(HbipPubTeam record);

    List<HbipPubTeam> selectByExample(HbipPubTeamExample example);

    HbipPubTeam selectByPrimaryKey(Integer tuanduiid);

    int updateByExampleSelective(@Param("record") HbipPubTeam record, @Param("example") HbipPubTeamExample example);

    int updateByExample(@Param("record") HbipPubTeam record, @Param("example") HbipPubTeamExample example);

    int updateByPrimaryKeySelective(HbipPubTeam record);

    int updateByPrimaryKey(HbipPubTeam record);
}