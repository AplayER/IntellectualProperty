package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubGovNewsDisplay;
import com.hbippub.pojo.HbipPubGovNewsDisplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubGovNewsDisplayMapper {
    int countByExample(HbipPubGovNewsDisplayExample example);

    int deleteByExample(HbipPubGovNewsDisplayExample example);

    int deleteByPrimaryKey(Integer erjifenleiid);

    int insert(HbipPubGovNewsDisplay record);

    int insertSelective(HbipPubGovNewsDisplay record);

    List<HbipPubGovNewsDisplay> selectByExample(HbipPubGovNewsDisplayExample example);

    HbipPubGovNewsDisplay selectByPrimaryKey(Integer erjifenleiid);

    int updateByExampleSelective(@Param("record") HbipPubGovNewsDisplay record, @Param("example") HbipPubGovNewsDisplayExample example);

    int updateByExample(@Param("record") HbipPubGovNewsDisplay record, @Param("example") HbipPubGovNewsDisplayExample example);

    int updateByPrimaryKeySelective(HbipPubGovNewsDisplay record);

    int updateByPrimaryKey(HbipPubGovNewsDisplay record);
}