package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubProjectForm;
import com.hbippub.pojo.HbipPubProjectFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubProjectFormMapper {
    int countByExample(HbipPubProjectFormExample example);

    int deleteByExample(HbipPubProjectFormExample example);

    int deleteByPrimaryKey(Integer shenqingbiaoid);

    int insert(HbipPubProjectForm record);

    int insertSelective(HbipPubProjectForm record);

    List<HbipPubProjectForm> selectByExample(HbipPubProjectFormExample example);

    HbipPubProjectForm selectByPrimaryKey(Integer shenqingbiaoid);

    int updateByExampleSelective(@Param("record") HbipPubProjectForm record, @Param("example") HbipPubProjectFormExample example);

    int updateByExample(@Param("record") HbipPubProjectForm record, @Param("example") HbipPubProjectFormExample example);

    int updateByPrimaryKeySelective(HbipPubProjectForm record);

    int updateByPrimaryKey(HbipPubProjectForm record);
}