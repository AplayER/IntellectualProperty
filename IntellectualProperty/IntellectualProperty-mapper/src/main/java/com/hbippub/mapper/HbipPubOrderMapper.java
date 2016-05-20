package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubOrder;
import com.hbippub.pojo.HbipPubOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubOrderMapper {
    int countByExample(HbipPubOrderExample example);

    int deleteByExample(HbipPubOrderExample example);

    int deleteByPrimaryKey(Integer dingdanid);

    int insert(HbipPubOrder record);

    int insertSelective(HbipPubOrder record);

    List<HbipPubOrder> selectByExample(HbipPubOrderExample example);

    HbipPubOrder selectByPrimaryKey(Integer dingdanid);

    int updateByExampleSelective(@Param("record") HbipPubOrder record, @Param("example") HbipPubOrderExample example);

    int updateByExample(@Param("record") HbipPubOrder record, @Param("example") HbipPubOrderExample example);

    int updateByPrimaryKeySelective(HbipPubOrder record);

    int updateByPrimaryKey(HbipPubOrder record);
}