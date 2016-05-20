package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubUser;
import com.hbippub.pojo.HbipPubUserExample;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HbipPubUserMapper {
    int countByExample(HbipPubUserExample example);

    int deleteByExample(HbipPubUserExample example);

    int deleteByPrimaryKey(Integer yonghuid);

    int addUser(HbipPubUser record);

    int insertSelective(HbipPubUser record);

    List<HbipPubUser> selectByExample(HbipPubUserExample example);
    
    List<HbipPubUser> getLoginInfoByExample(HbipPubUserExample example);
    
    HbipPubUser getLoginInfoByLogNameAndPwd(HashMap<String, String> userInfo);
    
    HbipPubUser getUserInfo(Integer userId);
    
    HbipPubUser getUserDetailInfo(Integer userId);

    HbipPubUser selectByPrimaryKey(Integer yonghuid);

    int updateUserInfoByExampleSelective(@Param("record") HbipPubUser record, @Param("example") HbipPubUserExample example);

    int updateUserInfoByExample(@Param("record") HbipPubUser record, @Param("example") HbipPubUserExample example);

    int updateUserInfoByPrimaryKeySelective(HbipPubUser record);

    int updateUserInfoByPrimaryKey(HbipPubUser record);
    
    int updateUserPassword(HbipPubUser record);
}