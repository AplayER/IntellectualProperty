package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubMailbox;
import com.hbippub.pojo.HbipPubMailboxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubMailboxMapper {
    int countByExample(HbipPubMailboxExample example);

    int deleteByExample(HbipPubMailboxExample example);

    int deleteByPrimaryKey(Integer youxiangid);

    int insert(HbipPubMailbox record);

    int insertSelective(HbipPubMailbox record);

    List<HbipPubMailbox> selectByExample(HbipPubMailboxExample example);

    HbipPubMailbox selectByPrimaryKey(Integer youxiangid);

    int updateByExampleSelective(@Param("record") HbipPubMailbox record, @Param("example") HbipPubMailboxExample example);

    int updateByExample(@Param("record") HbipPubMailbox record, @Param("example") HbipPubMailboxExample example);

    int updateByPrimaryKeySelective(HbipPubMailbox record);

    int updateByPrimaryKey(HbipPubMailbox record);
}