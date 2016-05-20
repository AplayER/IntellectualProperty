package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubStoreProxy;
import com.hbippub.pojo.HbipPubStoreProxyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubStoreProxyMapper {
    int countByExample(HbipPubStoreProxyExample example);

    int deleteByExample(HbipPubStoreProxyExample example);

    int deleteByPrimaryKey(Integer jiluid);

    int insert(HbipPubStoreProxy record);

    int insertSelective(HbipPubStoreProxy record);

    List<HbipPubStoreProxy> selectByExample(HbipPubStoreProxyExample example);

    HbipPubStoreProxy selectByPrimaryKey(Integer jiluid);

    int updateByExampleSelective(@Param("record") HbipPubStoreProxy record, @Param("example") HbipPubStoreProxyExample example);

    int updateByExample(@Param("record") HbipPubStoreProxy record, @Param("example") HbipPubStoreProxyExample example);

    int updateByPrimaryKeySelective(HbipPubStoreProxy record);

    int updateByPrimaryKey(HbipPubStoreProxy record);
}