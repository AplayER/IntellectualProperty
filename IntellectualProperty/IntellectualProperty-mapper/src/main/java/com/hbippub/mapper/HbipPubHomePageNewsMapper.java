package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubHomePageNews;
import com.hbippub.pojo.HbipPubHomePageNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubHomePageNewsMapper {
    int countByExample(HbipPubHomePageNewsExample example);

    int deleteByExample(HbipPubHomePageNewsExample example);

    int deleteByPrimaryKey(Integer xinwenid);

    int insert(HbipPubHomePageNews record);

    int insertSelective(HbipPubHomePageNews record);

    List<HbipPubHomePageNews> selectByExampleWithBLOBs(HbipPubHomePageNewsExample example);

    List<HbipPubHomePageNews> selectByExample(HbipPubHomePageNewsExample example);

    HbipPubHomePageNews selectByPrimaryKey(Integer xinwenid);

    int updateByExampleSelective(@Param("record") HbipPubHomePageNews record, @Param("example") HbipPubHomePageNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubHomePageNews record, @Param("example") HbipPubHomePageNewsExample example);

    int updateByExample(@Param("record") HbipPubHomePageNews record, @Param("example") HbipPubHomePageNewsExample example);

    int updateByPrimaryKeySelective(HbipPubHomePageNews record);

    int updateByPrimaryKeyWithBLOBs(HbipPubHomePageNews record);

    int updateByPrimaryKey(HbipPubHomePageNews record);
}