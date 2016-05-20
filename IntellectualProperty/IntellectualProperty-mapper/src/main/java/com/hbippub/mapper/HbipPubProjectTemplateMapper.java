package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubProjectTemplate;
import com.hbippub.pojo.HbipPubProjectTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubProjectTemplateMapper {
    int countByExample(HbipPubProjectTemplateExample example);

    int deleteByExample(HbipPubProjectTemplateExample example);

    int deleteByPrimaryKey(Integer mobanid);

    int insert(HbipPubProjectTemplate record);

    int insertSelective(HbipPubProjectTemplate record);

    List<HbipPubProjectTemplate> selectByExample(HbipPubProjectTemplateExample example);

    HbipPubProjectTemplate selectByPrimaryKey(Integer mobanid);

    int updateByExampleSelective(@Param("record") HbipPubProjectTemplate record, @Param("example") HbipPubProjectTemplateExample example);

    int updateByExample(@Param("record") HbipPubProjectTemplate record, @Param("example") HbipPubProjectTemplateExample example);

    int updateByPrimaryKeySelective(HbipPubProjectTemplate record);

    int updateByPrimaryKey(HbipPubProjectTemplate record);
}