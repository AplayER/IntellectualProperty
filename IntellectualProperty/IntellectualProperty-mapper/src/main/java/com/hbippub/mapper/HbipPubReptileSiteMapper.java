package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubReptileSite;
import com.hbippub.pojo.HbipPubReptileSiteExample;
import com.hbippub.pojo.HbipPubReptileSiteKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubReptileSiteMapper {
    int countByExample(HbipPubReptileSiteExample example);

    int deleteByExample(HbipPubReptileSiteExample example);

    int deleteByPrimaryKey(HbipPubReptileSiteKey key);

    int insert(HbipPubReptileSite record);

    int insertSelective(HbipPubReptileSite record);

    List<HbipPubReptileSite> selectByExample(HbipPubReptileSiteExample example);

    HbipPubReptileSite selectByPrimaryKey(HbipPubReptileSiteKey key);

    int updateByExampleSelective(@Param("record") HbipPubReptileSite record, @Param("example") HbipPubReptileSiteExample example);

    int updateByExample(@Param("record") HbipPubReptileSite record, @Param("example") HbipPubReptileSiteExample example);

    int updateByPrimaryKeySelective(HbipPubReptileSite record);

    int updateByPrimaryKey(HbipPubReptileSite record);
}