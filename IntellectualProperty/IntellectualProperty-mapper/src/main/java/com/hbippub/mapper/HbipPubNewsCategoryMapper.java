package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsCategory;
import com.hbippub.pojo.HbipPubNewsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsCategoryMapper {
    int countByExample(HbipPubNewsCategoryExample example);

    int deleteByExample(HbipPubNewsCategoryExample example);

    int deleteByPrimaryKey(Integer fenleiid);

    int insert(HbipPubNewsCategory record);

    int insertSelective(HbipPubNewsCategory record);

    List<HbipPubNewsCategory> selectByExample(HbipPubNewsCategoryExample example);

    HbipPubNewsCategory selectByPrimaryKey(Integer fenleiid);

    int updateByExampleSelective(@Param("record") HbipPubNewsCategory record, @Param("example") HbipPubNewsCategoryExample example);

    int updateByExample(@Param("record") HbipPubNewsCategory record, @Param("example") HbipPubNewsCategoryExample example);

    int updateByPrimaryKeySelective(HbipPubNewsCategory record);

    int updateByPrimaryKey(HbipPubNewsCategory record);
}