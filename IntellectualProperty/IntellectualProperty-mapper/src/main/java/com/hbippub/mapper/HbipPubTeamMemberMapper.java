package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTeamMember;
import com.hbippub.pojo.HbipPubTeamMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTeamMemberMapper {
    int countByExample(HbipPubTeamMemberExample example);

    int deleteByExample(HbipPubTeamMemberExample example);

    int deleteByPrimaryKey(Integer chengyuanid);

    int insert(HbipPubTeamMember record);

    int insertSelective(HbipPubTeamMember record);

    List<HbipPubTeamMember> selectByExample(HbipPubTeamMemberExample example);

    HbipPubTeamMember selectByPrimaryKey(Integer chengyuanid);

    int updateByExampleSelective(@Param("record") HbipPubTeamMember record, @Param("example") HbipPubTeamMemberExample example);

    int updateByExample(@Param("record") HbipPubTeamMember record, @Param("example") HbipPubTeamMemberExample example);

    int updateByPrimaryKeySelective(HbipPubTeamMember record);

    int updateByPrimaryKey(HbipPubTeamMember record);
}