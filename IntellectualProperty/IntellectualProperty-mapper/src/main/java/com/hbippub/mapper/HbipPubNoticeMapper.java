package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNotice;
import com.hbippub.pojo.HbipPubNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNoticeMapper {
    int countByExample(HbipPubNoticeExample example);

    int deleteByExample(HbipPubNoticeExample example);

    int deleteByPrimaryKey(Integer tongzhiid);

    int insert(HbipPubNotice record);

    int insertSelective(HbipPubNotice record);

    List<HbipPubNotice> selectByExample(HbipPubNoticeExample example);

    HbipPubNotice selectByPrimaryKey(Integer tongzhiid);

    int updateByExampleSelective(@Param("record") HbipPubNotice record, @Param("example") HbipPubNoticeExample example);

    int updateByExample(@Param("record") HbipPubNotice record, @Param("example") HbipPubNoticeExample example);

    int updateByPrimaryKeySelective(HbipPubNotice record);

    int updateByPrimaryKey(HbipPubNotice record);
}