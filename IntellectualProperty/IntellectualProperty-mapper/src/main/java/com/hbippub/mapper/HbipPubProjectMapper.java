package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubProject;
import com.hbippub.pojo.HbipPubProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubProjectMapper {
    int countByExample(HbipPubProjectExample example);

    int deleteByExample(HbipPubProjectExample example);

    int deleteByPrimaryKey(Integer xiangmuid);

    int insert(HbipPubProject record);

    int insertSelective(HbipPubProject record);

    List<HbipPubProject> selectByExample(HbipPubProjectExample example);

    HbipPubProject selectByPrimaryKey(Integer xiangmuid);

    int updateByExampleSelective(@Param("record") HbipPubProject record, @Param("example") HbipPubProjectExample example);

    int updateByExample(@Param("record") HbipPubProject record, @Param("example") HbipPubProjectExample example);

    int updateByPrimaryKeySelective(HbipPubProject record);

    int updateByPrimaryKey(HbipPubProject record);
}