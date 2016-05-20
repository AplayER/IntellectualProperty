package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubNewsCapture;
import com.hbippub.pojo.HbipPubNewsCaptureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubNewsCaptureMapper {
    int countByExample(HbipPubNewsCaptureExample example);

    int deleteByExample(HbipPubNewsCaptureExample example);

    int deleteByPrimaryKey(Integer xinwenid);

    int insert(HbipPubNewsCapture record);

    int insertSelective(HbipPubNewsCapture record);

    List<HbipPubNewsCapture> selectByExample(HbipPubNewsCaptureExample example);

    HbipPubNewsCapture selectByPrimaryKey(Integer xinwenid);

    int updateByExampleSelective(@Param("record") HbipPubNewsCapture record, @Param("example") HbipPubNewsCaptureExample example);

    int updateByExample(@Param("record") HbipPubNewsCapture record, @Param("example") HbipPubNewsCaptureExample example);

    int updateByPrimaryKeySelective(HbipPubNewsCapture record);

    int updateByPrimaryKey(HbipPubNewsCapture record);
}