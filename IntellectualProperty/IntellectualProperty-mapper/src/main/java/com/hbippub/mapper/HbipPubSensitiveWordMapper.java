package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubSensitiveWord;
import com.hbippub.pojo.HbipPubSensitiveWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubSensitiveWordMapper {
    int countByExample(HbipPubSensitiveWordExample example);

    int deleteByExample(HbipPubSensitiveWordExample example);

    int deleteByPrimaryKey(Integer minganciid);

    int insert(HbipPubSensitiveWord record);

    int insertSelective(HbipPubSensitiveWord record);

    List<HbipPubSensitiveWord> selectByExample(HbipPubSensitiveWordExample example);

    HbipPubSensitiveWord selectByPrimaryKey(Integer minganciid);

    int updateByExampleSelective(@Param("record") HbipPubSensitiveWord record, @Param("example") HbipPubSensitiveWordExample example);

    int updateByExample(@Param("record") HbipPubSensitiveWord record, @Param("example") HbipPubSensitiveWordExample example);

    int updateByPrimaryKeySelective(HbipPubSensitiveWord record);

    int updateByPrimaryKey(HbipPubSensitiveWord record);
}