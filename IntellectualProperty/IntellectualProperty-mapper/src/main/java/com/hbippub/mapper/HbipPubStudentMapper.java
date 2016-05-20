package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubStudent;
import com.hbippub.pojo.HbipPubStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubStudentMapper {
    int countByExample(HbipPubStudentExample example);

    int deleteByExample(HbipPubStudentExample example);

    int deleteByPrimaryKey(Integer xueshengid);

    int insert(HbipPubStudent record);

    int insertSelective(HbipPubStudent record);

    List<HbipPubStudent> selectByExample(HbipPubStudentExample example);

    HbipPubStudent selectByPrimaryKey(Integer xueshengid);

    int updateByExampleSelective(@Param("record") HbipPubStudent record, @Param("example") HbipPubStudentExample example);

    int updateByExample(@Param("record") HbipPubStudent record, @Param("example") HbipPubStudentExample example);

    int updateByPrimaryKeySelective(HbipPubStudent record);

    int updateByPrimaryKey(HbipPubStudent record);
}