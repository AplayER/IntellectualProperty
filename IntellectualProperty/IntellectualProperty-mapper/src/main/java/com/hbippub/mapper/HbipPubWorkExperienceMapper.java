package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubWorkExperience;
import com.hbippub.pojo.HbipPubWorkExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubWorkExperienceMapper {
    int countByExample(HbipPubWorkExperienceExample example);

    int deleteByExample(HbipPubWorkExperienceExample example);

    int deleteByPrimaryKey(Integer jingyanid);

    int insert(HbipPubWorkExperience record);

    int insertSelective(HbipPubWorkExperience record);

    List<HbipPubWorkExperience> selectByExample(HbipPubWorkExperienceExample example);

    HbipPubWorkExperience selectByPrimaryKey(Integer jingyanid);

    int updateByExampleSelective(@Param("record") HbipPubWorkExperience record, @Param("example") HbipPubWorkExperienceExample example);

    int updateByExample(@Param("record") HbipPubWorkExperience record, @Param("example") HbipPubWorkExperienceExample example);

    int updateByPrimaryKeySelective(HbipPubWorkExperience record);

    int updateByPrimaryKey(HbipPubWorkExperience record);
}