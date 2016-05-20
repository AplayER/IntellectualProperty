package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubContactList;
import com.hbippub.pojo.HbipPubContactListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubContactListMapper {
    int countByExample(HbipPubContactListExample example);

    int deleteByExample(HbipPubContactListExample example);

    int deleteByPrimaryKey(Integer tongxunluid);

    int insert(HbipPubContactList record);

    int insertSelective(HbipPubContactList record);

    List<HbipPubContactList> selectByExample(HbipPubContactListExample example);

    HbipPubContactList selectByPrimaryKey(Integer tongxunluid);

    int updateByExampleSelective(@Param("record") HbipPubContactList record, @Param("example") HbipPubContactListExample example);

    int updateByExample(@Param("record") HbipPubContactList record, @Param("example") HbipPubContactListExample example);

    int updateByPrimaryKeySelective(HbipPubContactList record);

    int updateByPrimaryKey(HbipPubContactList record);
}