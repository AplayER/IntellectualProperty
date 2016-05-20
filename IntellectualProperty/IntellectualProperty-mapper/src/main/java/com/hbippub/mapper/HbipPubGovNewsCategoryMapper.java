package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubGovNewsCategory;
import com.hbippub.pojo.HbipPubGovNewsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubGovNewsCategoryMapper {
    int countByExample(HbipPubGovNewsCategoryExample example);

    int deleteByExample(HbipPubGovNewsCategoryExample example);

    int deleteByPrimaryKey(Integer fenleiid);

    int insert(HbipPubGovNewsCategory record);

    int insertSelective(HbipPubGovNewsCategory record);

    List<HbipPubGovNewsCategory> selectByExample(HbipPubGovNewsCategoryExample example);

    HbipPubGovNewsCategory selectByPrimaryKey(Integer fenleiid);

    int updateByExampleSelective(@Param("record") HbipPubGovNewsCategory record, @Param("example") HbipPubGovNewsCategoryExample example);

    int updateByExample(@Param("record") HbipPubGovNewsCategory record, @Param("example") HbipPubGovNewsCategoryExample example);

    int updateByPrimaryKeySelective(HbipPubGovNewsCategory record);

    int updateByPrimaryKey(HbipPubGovNewsCategory record);
}