package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubProjectAudit;
import com.hbippub.pojo.HbipPubProjectAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubProjectAuditMapper {
    int countByExample(HbipPubProjectAuditExample example);

    int deleteByExample(HbipPubProjectAuditExample example);

    int deleteByPrimaryKey(Integer shenheid);

    int insert(HbipPubProjectAudit record);

    int insertSelective(HbipPubProjectAudit record);

    List<HbipPubProjectAudit> selectByExample(HbipPubProjectAuditExample example);

    HbipPubProjectAudit selectByPrimaryKey(Integer shenheid);

    int updateByExampleSelective(@Param("record") HbipPubProjectAudit record, @Param("example") HbipPubProjectAuditExample example);

    int updateByExample(@Param("record") HbipPubProjectAudit record, @Param("example") HbipPubProjectAuditExample example);

    int updateByPrimaryKeySelective(HbipPubProjectAudit record);

    int updateByPrimaryKey(HbipPubProjectAudit record);
}