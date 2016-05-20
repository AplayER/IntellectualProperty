package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCourse;
import com.hbippub.pojo.HbipPubCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCourseMapper {
    int countByExample(HbipPubCourseExample example);

    int deleteByExample(HbipPubCourseExample example);

    int deleteByPrimaryKey(Integer kechengid);

    int insert(HbipPubCourse record);

    int insertSelective(HbipPubCourse record);

    List<HbipPubCourse> selectByExample(HbipPubCourseExample example);

    HbipPubCourse selectByPrimaryKey(Integer kechengid);

    int updateByExampleSelective(@Param("record") HbipPubCourse record, @Param("example") HbipPubCourseExample example);

    int updateByExample(@Param("record") HbipPubCourse record, @Param("example") HbipPubCourseExample example);

    int updateByPrimaryKeySelective(HbipPubCourse record);

    int updateByPrimaryKey(HbipPubCourse record);
}