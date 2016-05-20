package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubReptileKeyword;
import com.hbippub.pojo.HbipPubReptileKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubReptileKeywordMapper {
    int countByExample(HbipPubReptileKeywordExample example);

    int deleteByExample(HbipPubReptileKeywordExample example);

    int deleteByPrimaryKey(Integer guanjianciid);

    int insert(HbipPubReptileKeyword record);

    int insertSelective(HbipPubReptileKeyword record);

    List<HbipPubReptileKeyword> selectByExample(HbipPubReptileKeywordExample example);

    HbipPubReptileKeyword selectByPrimaryKey(Integer guanjianciid);

    int updateByExampleSelective(@Param("record") HbipPubReptileKeyword record, @Param("example") HbipPubReptileKeywordExample example);

    int updateByExample(@Param("record") HbipPubReptileKeyword record, @Param("example") HbipPubReptileKeywordExample example);

    int updateByPrimaryKeySelective(HbipPubReptileKeyword record);

    int updateByPrimaryKey(HbipPubReptileKeyword record);
}