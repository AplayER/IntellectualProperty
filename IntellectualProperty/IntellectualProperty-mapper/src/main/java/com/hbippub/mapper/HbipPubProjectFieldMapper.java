package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubProjectField;
import com.hbippub.pojo.HbipPubProjectFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubProjectFieldMapper {
    int countByExample(HbipPubProjectFieldExample example);

    int deleteByExample(HbipPubProjectFieldExample example);

    int deleteByPrimaryKey(Integer ziduanid);

    int insert(HbipPubProjectField record);

    int insertSelective(HbipPubProjectField record);

    List<HbipPubProjectField> selectByExample(HbipPubProjectFieldExample example);

    HbipPubProjectField selectByPrimaryKey(Integer ziduanid);

    int updateByExampleSelective(@Param("record") HbipPubProjectField record, @Param("example") HbipPubProjectFieldExample example);

    int updateByExample(@Param("record") HbipPubProjectField record, @Param("example") HbipPubProjectFieldExample example);

    int updateByPrimaryKeySelective(HbipPubProjectField record);

    int updateByPrimaryKey(HbipPubProjectField record);
}