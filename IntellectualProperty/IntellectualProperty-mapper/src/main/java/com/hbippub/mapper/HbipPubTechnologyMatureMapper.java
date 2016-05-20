package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubTechnologyMature;
import com.hbippub.pojo.HbipPubTechnologyMatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubTechnologyMatureMapper {
    int countByExample(HbipPubTechnologyMatureExample example);

    int deleteByExample(HbipPubTechnologyMatureExample example);

    int deleteByPrimaryKey(Integer chengshuduid);

    int insert(HbipPubTechnologyMature record);

    int insertSelective(HbipPubTechnologyMature record);

    List<HbipPubTechnologyMature> selectByExample(HbipPubTechnologyMatureExample example);

    HbipPubTechnologyMature selectByPrimaryKey(Integer chengshuduid);

    int updateByExampleSelective(@Param("record") HbipPubTechnologyMature record, @Param("example") HbipPubTechnologyMatureExample example);

    int updateByExample(@Param("record") HbipPubTechnologyMature record, @Param("example") HbipPubTechnologyMatureExample example);

    int updateByPrimaryKeySelective(HbipPubTechnologyMature record);

    int updateByPrimaryKey(HbipPubTechnologyMature record);
}