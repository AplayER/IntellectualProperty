package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubMailCopy;
import com.hbippub.pojo.HbipPubMailCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubMailCopyMapper {
    int countByExample(HbipPubMailCopyExample example);

    int deleteByExample(HbipPubMailCopyExample example);

    int deleteByPrimaryKey(Integer bianhaoid);

    int insert(HbipPubMailCopy record);

    int insertSelective(HbipPubMailCopy record);

    List<HbipPubMailCopy> selectByExample(HbipPubMailCopyExample example);

    HbipPubMailCopy selectByPrimaryKey(Integer bianhaoid);

    int updateByExampleSelective(@Param("record") HbipPubMailCopy record, @Param("example") HbipPubMailCopyExample example);

    int updateByExample(@Param("record") HbipPubMailCopy record, @Param("example") HbipPubMailCopyExample example);

    int updateByPrimaryKeySelective(HbipPubMailCopy record);

    int updateByPrimaryKey(HbipPubMailCopy record);
}