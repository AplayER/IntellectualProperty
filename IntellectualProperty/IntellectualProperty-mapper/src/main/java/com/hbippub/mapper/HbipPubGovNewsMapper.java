package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubGovNews;
import com.hbippub.pojo.HbipPubGovNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubGovNewsMapper {
    int countByExample(HbipPubGovNewsExample example);

    int deleteByExample(HbipPubGovNewsExample example);

    int deleteByPrimaryKey(Integer xinwenid);

    int insert(HbipPubGovNews record);

    int insertSelective(HbipPubGovNews record);

    List<HbipPubGovNews> selectByExampleWithBLOBs(HbipPubGovNewsExample example);

    List<HbipPubGovNews> selectByExample(HbipPubGovNewsExample example);

    HbipPubGovNews selectByPrimaryKey(Integer xinwenid);

    int updateByExampleSelective(@Param("record") HbipPubGovNews record, @Param("example") HbipPubGovNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubGovNews record, @Param("example") HbipPubGovNewsExample example);

    int updateByExample(@Param("record") HbipPubGovNews record, @Param("example") HbipPubGovNewsExample example);

    int updateByPrimaryKeySelective(HbipPubGovNews record);

    int updateByPrimaryKeyWithBLOBs(HbipPubGovNews record);

    int updateByPrimaryKey(HbipPubGovNews record);
}