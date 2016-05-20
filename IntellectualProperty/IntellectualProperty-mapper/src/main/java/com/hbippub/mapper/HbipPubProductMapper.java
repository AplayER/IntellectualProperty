package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubProduct;
import com.hbippub.pojo.HbipPubProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubProductMapper {
    int countByExample(HbipPubProductExample example);

    int deleteByExample(HbipPubProductExample example);

    int deleteByPrimaryKey(Integer shangpinid);

    int insert(HbipPubProduct record);

    int insertSelective(HbipPubProduct record);

    List<HbipPubProduct> selectByExampleWithBLOBs(HbipPubProductExample example);

    List<HbipPubProduct> selectByExample(HbipPubProductExample example);

    HbipPubProduct selectByPrimaryKey(Integer shangpinid);

    int updateByExampleSelective(@Param("record") HbipPubProduct record, @Param("example") HbipPubProductExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubProduct record, @Param("example") HbipPubProductExample example);

    int updateByExample(@Param("record") HbipPubProduct record, @Param("example") HbipPubProductExample example);

    int updateByPrimaryKeySelective(HbipPubProduct record);

    int updateByPrimaryKeyWithBLOBs(HbipPubProduct record);

    int updateByPrimaryKey(HbipPubProduct record);
}