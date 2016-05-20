package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubCity;
import com.hbippub.pojo.HbipPubCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubCityMapper {
    int countByExample(HbipPubCityExample example);

    int deleteByExample(HbipPubCityExample example);

    int deleteByPrimaryKey(Integer chengshiid);

    int insert(HbipPubCity record);

    int insertSelective(HbipPubCity record);

    List<HbipPubCity> selectByExample(HbipPubCityExample example);

    HbipPubCity selectByPrimaryKey(Integer chengshiid);

    int updateByExampleSelective(@Param("record") HbipPubCity record, @Param("example") HbipPubCityExample example);

    int updateByExample(@Param("record") HbipPubCity record, @Param("example") HbipPubCityExample example);

    int updateByPrimaryKeySelective(HbipPubCity record);

    int updateByPrimaryKey(HbipPubCity record);
}