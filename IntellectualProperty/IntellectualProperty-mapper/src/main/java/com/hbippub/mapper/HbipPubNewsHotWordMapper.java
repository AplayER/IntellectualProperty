package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsHotWord;
import com.hbippub.pojo.HbipPubNewsHotWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsHotWordMapper {
    int countByExample(HbipPubNewsHotWordExample example);

    int deleteByExample(HbipPubNewsHotWordExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubNewsHotWord record);

    int insertSelective(HbipPubNewsHotWord record);

    List<HbipPubNewsHotWord> selectByExample(HbipPubNewsHotWordExample example);

    HbipPubNewsHotWord selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubNewsHotWord record, @Param("example") HbipPubNewsHotWordExample example);

    int updateByExample(@Param("record") HbipPubNewsHotWord record, @Param("example") HbipPubNewsHotWordExample example);

    int updateByPrimaryKeySelective(HbipPubNewsHotWord record);

    int updateByPrimaryKey(HbipPubNewsHotWord record);
}