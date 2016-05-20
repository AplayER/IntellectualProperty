package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubService;
import com.hbippub.pojo.HbipPubServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubServiceMapper {
    int countByExample(HbipPubServiceExample example);

    int deleteByExample(HbipPubServiceExample example);

    int deleteByPrimaryKey(Integer shangpinid);

    int insert(HbipPubService record);

    int insertSelective(HbipPubService record);

    List<HbipPubService> selectByExampleWithBLOBs(HbipPubServiceExample example);

    List<HbipPubService> selectByExample(HbipPubServiceExample example);

    HbipPubService selectByPrimaryKey(Integer shangpinid);

    int updateByExampleSelective(@Param("record") HbipPubService record, @Param("example") HbipPubServiceExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubService record, @Param("example") HbipPubServiceExample example);

    int updateByExample(@Param("record") HbipPubService record, @Param("example") HbipPubServiceExample example);

    int updateByPrimaryKeySelective(HbipPubService record);

    int updateByPrimaryKeyWithBLOBs(HbipPubService record);

    int updateByPrimaryKey(HbipPubService record);
}