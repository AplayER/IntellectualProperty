package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTagObjectMapping;
import com.hbippub.pojo.HbipPubTagObjectMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTagObjectMappingMapper {
    int countByExample(HbipPubTagObjectMappingExample example);

    int deleteByExample(HbipPubTagObjectMappingExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubTagObjectMapping record);

    int insertSelective(HbipPubTagObjectMapping record);

    List<HbipPubTagObjectMapping> selectByExample(HbipPubTagObjectMappingExample example);

    HbipPubTagObjectMapping selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubTagObjectMapping record, @Param("example") HbipPubTagObjectMappingExample example);

    int updateByExample(@Param("record") HbipPubTagObjectMapping record, @Param("example") HbipPubTagObjectMappingExample example);

    int updateByPrimaryKeySelective(HbipPubTagObjectMapping record);

    int updateByPrimaryKey(HbipPubTagObjectMapping record);
}