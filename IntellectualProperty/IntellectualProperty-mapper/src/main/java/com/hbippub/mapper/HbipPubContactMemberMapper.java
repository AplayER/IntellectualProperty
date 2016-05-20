package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubContactMember;
import com.hbippub.pojo.HbipPubContactMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubContactMemberMapper {
    int countByExample(HbipPubContactMemberExample example);

    int deleteByExample(HbipPubContactMemberExample example);

    int deleteByPrimaryKey(Integer chengyuanid);

    int insert(HbipPubContactMember record);

    int insertSelective(HbipPubContactMember record);

    List<HbipPubContactMember> selectByExample(HbipPubContactMemberExample example);

    HbipPubContactMember selectByPrimaryKey(Integer chengyuanid);

    int updateByExampleSelective(@Param("record") HbipPubContactMember record, @Param("example") HbipPubContactMemberExample example);

    int updateByExample(@Param("record") HbipPubContactMember record, @Param("example") HbipPubContactMemberExample example);

    int updateByPrimaryKeySelective(HbipPubContactMember record);

    int updateByPrimaryKey(HbipPubContactMember record);
}