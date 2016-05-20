package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubFormField;
import com.hbippub.pojo.HbipPubFormFieldExample;
import com.hbippub.pojo.HbipPubFormFieldKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubFormFieldMapper {
    int countByExample(HbipPubFormFieldExample example);

    int deleteByExample(HbipPubFormFieldExample example);

    int deleteByPrimaryKey(HbipPubFormFieldKey key);

    int insert(HbipPubFormField record);

    int insertSelective(HbipPubFormField record);

    List<HbipPubFormField> selectByExample(HbipPubFormFieldExample example);

    HbipPubFormField selectByPrimaryKey(HbipPubFormFieldKey key);

    int updateByExampleSelective(@Param("record") HbipPubFormField record, @Param("example") HbipPubFormFieldExample example);

    int updateByExample(@Param("record") HbipPubFormField record, @Param("example") HbipPubFormFieldExample example);

    int updateByPrimaryKeySelective(HbipPubFormField record);

    int updateByPrimaryKey(HbipPubFormField record);
}