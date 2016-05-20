package com.hbippub.mapper;

import com.hbippub.pojo.HbipPubQuestionnaireSurvey;
import com.hbippub.pojo.HbipPubQuestionnaireSurveyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbipPubQuestionnaireSurveyMapper {
    int countByExample(HbipPubQuestionnaireSurveyExample example);

    int deleteByExample(HbipPubQuestionnaireSurveyExample example);

    int deleteByPrimaryKey(Integer wenjuanid);

    int insert(HbipPubQuestionnaireSurvey record);

    int insertSelective(HbipPubQuestionnaireSurvey record);

    List<HbipPubQuestionnaireSurvey> selectByExample(HbipPubQuestionnaireSurveyExample example);

    HbipPubQuestionnaireSurvey selectByPrimaryKey(Integer wenjuanid);

    int updateByExampleSelective(@Param("record") HbipPubQuestionnaireSurvey record, @Param("example") HbipPubQuestionnaireSurveyExample example);

    int updateByExample(@Param("record") HbipPubQuestionnaireSurvey record, @Param("example") HbipPubQuestionnaireSurveyExample example);

    int updateByPrimaryKeySelective(HbipPubQuestionnaireSurvey record);

    int updateByPrimaryKey(HbipPubQuestionnaireSurvey record);
}