package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubApplyLeague;
import com.hbippub.pojo.HbipPubApplyLeagueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubApplyLeagueMapper {
    int countByExample(HbipPubApplyLeagueExample example);

    int deleteByExample(HbipPubApplyLeagueExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubApplyLeague record);

    int insertSelective(HbipPubApplyLeague record);

    List<HbipPubApplyLeague> selectByExampleWithBLOBs(HbipPubApplyLeagueExample example);

    List<HbipPubApplyLeague> selectByExample(HbipPubApplyLeagueExample example);

    HbipPubApplyLeague selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubApplyLeague record, @Param("example") HbipPubApplyLeagueExample example);

    int updateByExampleWithBLOBs(@Param("record") HbipPubApplyLeague record, @Param("example") HbipPubApplyLeagueExample example);

    int updateByExample(@Param("record") HbipPubApplyLeague record, @Param("example") HbipPubApplyLeagueExample example);

    int updateByPrimaryKeySelective(HbipPubApplyLeague record);

    int updateByPrimaryKeyWithBLOBs(HbipPubApplyLeague record);

    int updateByPrimaryKey(HbipPubApplyLeague record);
}