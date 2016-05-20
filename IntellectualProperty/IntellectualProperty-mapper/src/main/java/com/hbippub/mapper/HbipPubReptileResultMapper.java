package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubReptileResult;
import com.hbippub.pojo.HbipPubReptileResultExample;
import com.hbippub.pojo.HbipPubReptileResultKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubReptileResultMapper {
    int countByExample(HbipPubReptileResultExample example);

    int deleteByExample(HbipPubReptileResultExample example);

    int deleteByPrimaryKey(HbipPubReptileResultKey key);

    int insert(HbipPubReptileResult record);

    int insertSelective(HbipPubReptileResult record);

    List<HbipPubReptileResult> selectByExampleWithBLOBs(HbipPubReptileResultExample example);

    List<HbipPubReptileResult> selectByExample(HbipPubReptileResultExample example);

    HbipPubReptileResult selectByPrimaryKey(HbipPubReptileResultKey key);

    int updateByExampleSelective(@Param("record") HbipPubReptileResult record, @Param("example") HbipPubReptileResultExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubReptileResult record, @Param("example") HbipPubReptileResultExample example);

    int updateByExample(@Param("record") HbipPubReptileResult record, @Param("example") HbipPubReptileResultExample example);

    int updateByPrimaryKeySelective(HbipPubReptileResult record);

    int updateByPrimaryKeyWithBLOBs(HbipPubReptileResult record);

    int updateByPrimaryKey(HbipPubReptileResult record);
}