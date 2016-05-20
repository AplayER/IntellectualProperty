package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubSurveyQuestion;
import com.hbippub.pojo.HbipPubSurveyQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubSurveyQuestionMapper {
    int countByExample(HbipPubSurveyQuestionExample example);

    int deleteByExample(HbipPubSurveyQuestionExample example);

    int deleteByPrimaryKey(Integer timuid);

    int insert(HbipPubSurveyQuestion record);

    int insertSelective(HbipPubSurveyQuestion record);

    List<HbipPubSurveyQuestion> selectByExample(HbipPubSurveyQuestionExample example);

    HbipPubSurveyQuestion selectByPrimaryKey(Integer timuid);

    int updateByExampleSelective(@Param("record") HbipPubSurveyQuestion record, @Param("example") HbipPubSurveyQuestionExample example);

    int updateByExample(@Param("record") HbipPubSurveyQuestion record, @Param("example") HbipPubSurveyQuestionExample example);

    int updateByPrimaryKeySelective(HbipPubSurveyQuestion record);

    int updateByPrimaryKey(HbipPubSurveyQuestion record);
}