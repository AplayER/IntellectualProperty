package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsSnatch;
import com.hbippub.pojo.HbipPubNewsSnatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsSnatchMapper {
    int countByExample(HbipPubNewsSnatchExample example);

    int deleteByExample(HbipPubNewsSnatchExample example);

    int deleteByPrimaryKey(Integer xinwenid);

    int insert(HbipPubNewsSnatch record);

    int insertSelective(HbipPubNewsSnatch record);

    List<HbipPubNewsSnatch> selectByExample(HbipPubNewsSnatchExample example);

    HbipPubNewsSnatch selectByPrimaryKey(Integer xinwenid);

    int updateByExampleSelective(@Param("record") HbipPubNewsSnatch record, @Param("example") HbipPubNewsSnatchExample example);

    int updateByExample(@Param("record") HbipPubNewsSnatch record, @Param("example") HbipPubNewsSnatchExample example);

    int updateByPrimaryKeySelective(HbipPubNewsSnatch record);

    int updateByPrimaryKey(HbipPubNewsSnatch record);
}