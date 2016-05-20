package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNews;
import com.hbippub.pojo.HbipPubNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsMapper {
    int countByExample(HbipPubNewsExample example);

    int deleteByExample(HbipPubNewsExample example);

    int deleteByPrimaryKey(Integer xinwenid);

    int insert(HbipPubNews record);

    int insertSelective(HbipPubNews record);

    List<HbipPubNews> selectByExampleWithBLOBs(HbipPubNewsExample example);

    List<HbipPubNews> selectByExample(HbipPubNewsExample example);

    HbipPubNews selectByPrimaryKey(Integer xinwenid);

    int updateByExampleSelective(@Param("record") HbipPubNews record, @Param("example") HbipPubNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubNews record, @Param("example") HbipPubNewsExample example);

    int updateByExample(@Param("record") HbipPubNews record, @Param("example") HbipPubNewsExample example);

    int updateByPrimaryKeySelective(HbipPubNews record);

    int updateByPrimaryKeyWithBLOBs(HbipPubNews record);

    int updateByPrimaryKey(HbipPubNews record);
}