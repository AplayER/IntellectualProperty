package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCopyright;
import com.hbippub.pojo.HbipPubCopyrightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCopyrightMapper {
    int countByExample(HbipPubCopyrightExample example);

    int deleteByExample(HbipPubCopyrightExample example);

    int deleteByPrimaryKey(Integer shangpinid);

    int insert(HbipPubCopyright record);

    int insertSelective(HbipPubCopyright record);

    List<HbipPubCopyright> selectByExampleWithBLOBs(HbipPubCopyrightExample example);

    List<HbipPubCopyright> selectByExample(HbipPubCopyrightExample example);

    HbipPubCopyright selectByPrimaryKey(Integer shangpinid);

    int updateByExampleSelective(@Param("record") HbipPubCopyright record, @Param("example") HbipPubCopyrightExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubCopyright record, @Param("example") HbipPubCopyrightExample example);

    int updateByExample(@Param("record") HbipPubCopyright record, @Param("example") HbipPubCopyrightExample example);

    int updateByPrimaryKeySelective(HbipPubCopyright record);

    int updateByPrimaryKeyWithBLOBs(HbipPubCopyright record);

    int updateByPrimaryKey(HbipPubCopyright record);
}