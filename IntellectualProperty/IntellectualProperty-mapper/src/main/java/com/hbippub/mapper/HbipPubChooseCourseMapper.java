package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubChooseCourse;
import com.hbippub.pojo.HbipPubChooseCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubChooseCourseMapper {
    int countByExample(HbipPubChooseCourseExample example);

    int deleteByExample(HbipPubChooseCourseExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubChooseCourse record);

    int insertSelective(HbipPubChooseCourse record);

    List<HbipPubChooseCourse> selectByExample(HbipPubChooseCourseExample example);

    HbipPubChooseCourse selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubChooseCourse record, @Param("example") HbipPubChooseCourseExample example);

    int updateByExample(@Param("record") HbipPubChooseCourse record, @Param("example") HbipPubChooseCourseExample example);

    int updateByPrimaryKeySelective(HbipPubChooseCourse record);

    int updateByPrimaryKey(HbipPubChooseCourse record);
}