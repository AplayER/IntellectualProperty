package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTemplateField;
import com.hbippub.pojo.HbipPubTemplateFieldExample;
import com.hbippub.pojo.HbipPubTemplateFieldKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTemplateFieldMapper {
    int countByExample(HbipPubTemplateFieldExample example);

    int deleteByExample(HbipPubTemplateFieldExample example);

    int deleteByPrimaryKey(HbipPubTemplateFieldKey key);

    int insert(HbipPubTemplateField record);

    int insertSelective(HbipPubTemplateField record);

    List<HbipPubTemplateField> selectByExample(HbipPubTemplateFieldExample example);

    HbipPubTemplateField selectByPrimaryKey(HbipPubTemplateFieldKey key);

    int updateByExampleSelective(@Param("record") HbipPubTemplateField record, @Param("example") HbipPubTemplateFieldExample example);

    int updateByExample(@Param("record") HbipPubTemplateField record, @Param("example") HbipPubTemplateFieldExample example);

    int updateByPrimaryKeySelective(HbipPubTemplateField record);

    int updateByPrimaryKey(HbipPubTemplateField record);
}