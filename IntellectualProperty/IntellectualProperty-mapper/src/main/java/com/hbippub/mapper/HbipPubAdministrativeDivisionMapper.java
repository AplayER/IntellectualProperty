package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubAdministrativeDivision;
import com.hbippub.pojo.HbipPubAdministrativeDivisionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubAdministrativeDivisionMapper {
    int countByExample(HbipPubAdministrativeDivisionExample example);

    int deleteByExample(HbipPubAdministrativeDivisionExample example);

    int deleteByPrimaryKey(Integer xingzhengquhuaid);

    int insert(HbipPubAdministrativeDivision record);

    int insertSelective(HbipPubAdministrativeDivision record);

    List<HbipPubAdministrativeDivision> selectByExample(HbipPubAdministrativeDivisionExample example);

    HbipPubAdministrativeDivision selectByPrimaryKey(Integer xingzhengquhuaid);

    int updateByExampleSelective(@Param("record") HbipPubAdministrativeDivision record, @Param("example") HbipPubAdministrativeDivisionExample example);

    int updateByExample(@Param("record") HbipPubAdministrativeDivision record, @Param("example") HbipPubAdministrativeDivisionExample example);

    int updateByPrimaryKeySelective(HbipPubAdministrativeDivision record);

    int updateByPrimaryKey(HbipPubAdministrativeDivision record);
}