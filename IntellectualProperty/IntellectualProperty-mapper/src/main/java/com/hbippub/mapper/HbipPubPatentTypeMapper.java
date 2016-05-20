package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubPatentType;
import com.hbippub.pojo.HbipPubPatentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubPatentTypeMapper {
    int countByExample(HbipPubPatentTypeExample example);

    int deleteByExample(HbipPubPatentTypeExample example);

    int deleteByPrimaryKey(Integer zhuanlileixingid);

    int insert(HbipPubPatentType record);

    int insertSelective(HbipPubPatentType record);

    List<HbipPubPatentType> selectByExample(HbipPubPatentTypeExample example);

    HbipPubPatentType selectByPrimaryKey(Integer zhuanlileixingid);

    int updateByExampleSelective(@Param("record") HbipPubPatentType record, @Param("example") HbipPubPatentTypeExample example);

    int updateByExample(@Param("record") HbipPubPatentType record, @Param("example") HbipPubPatentTypeExample example);

    int updateByPrimaryKeySelective(HbipPubPatentType record);

    int updateByPrimaryKey(HbipPubPatentType record);
}