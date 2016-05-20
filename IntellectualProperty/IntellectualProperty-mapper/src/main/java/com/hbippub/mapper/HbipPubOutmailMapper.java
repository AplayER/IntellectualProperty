package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubOutmail;
import com.hbippub.pojo.HbipPubOutmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubOutmailMapper {
    int countByExample(HbipPubOutmailExample example);

    int deleteByExample(HbipPubOutmailExample example);

    int deleteByPrimaryKey(Integer youjianid);

    int insert(HbipPubOutmail record);

    int insertSelective(HbipPubOutmail record);

    List<HbipPubOutmail> selectByExample(HbipPubOutmailExample example);

    HbipPubOutmail selectByPrimaryKey(Integer youjianid);

    int updateByExampleSelective(@Param("record") HbipPubOutmail record, @Param("example") HbipPubOutmailExample example);

    int updateByExample(@Param("record") HbipPubOutmail record, @Param("example") HbipPubOutmailExample example);

    int updateByPrimaryKeySelective(HbipPubOutmail record);

    int updateByPrimaryKey(HbipPubOutmail record);
}