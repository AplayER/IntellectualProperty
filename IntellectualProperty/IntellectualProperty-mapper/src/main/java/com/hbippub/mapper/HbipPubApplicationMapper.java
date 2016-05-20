package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubApplication;
import com.hbippub.pojo.HbipPubApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubApplicationMapper {
    int countByExample(HbipPubApplicationExample example);

    int deleteByExample(HbipPubApplicationExample example);

    int deleteByPrimaryKey(Integer qiuzhiid);

    int insert(HbipPubApplication record);

    int insertSelective(HbipPubApplication record);

    List<HbipPubApplication> selectByExample(HbipPubApplicationExample example);

    HbipPubApplication selectByPrimaryKey(Integer qiuzhiid);

    int updateByExampleSelective(@Param("record") HbipPubApplication record, @Param("example") HbipPubApplicationExample example);

    int updateByExample(@Param("record") HbipPubApplication record, @Param("example") HbipPubApplicationExample example);

    int updateByPrimaryKeySelective(HbipPubApplication record);

    int updateByPrimaryKey(HbipPubApplication record);
}