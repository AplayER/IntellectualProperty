package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubPatent;
import com.hbippub.pojo.HbipPubPatentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubPatentMapper {
    int countByExample(HbipPubPatentExample example);

    int deleteByExample(HbipPubPatentExample example);

    int deleteByPrimaryKey(Integer shangpinid);

    int insert(HbipPubPatent record);

    int insertSelective(HbipPubPatent record);

    List<HbipPubPatent> selectByExampleWithBLOBs(HbipPubPatentExample example);

    List<HbipPubPatent> selectByExample(HbipPubPatentExample example);

    HbipPubPatent selectByPrimaryKey(Integer shangpinid);

    int updateByExampleSelective(@Param("record") HbipPubPatent record, @Param("example") HbipPubPatentExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubPatent record, @Param("example") HbipPubPatentExample example);

    int updateByExample(@Param("record") HbipPubPatent record, @Param("example") HbipPubPatentExample example);

    int updateByPrimaryKeySelective(HbipPubPatent record);

    int updateByPrimaryKeyWithBLOBs(HbipPubPatent record);

    int updateByPrimaryKey(HbipPubPatent record);
}