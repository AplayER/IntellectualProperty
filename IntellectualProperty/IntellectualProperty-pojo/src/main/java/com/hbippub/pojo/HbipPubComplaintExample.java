package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubComplaintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubComplaintExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTousuidIsNull() {
            addCriterion("TouSuID is null");
            return (Criteria) this;
        }

        public Criteria andTousuidIsNotNull() {
            addCriterion("TouSuID is not null");
            return (Criteria) this;
        }

        public Criteria andTousuidEqualTo(Integer value) {
            addCriterion("TouSuID =", value, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidNotEqualTo(Integer value) {
            addCriterion("TouSuID <>", value, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidGreaterThan(Integer value) {
            addCriterion("TouSuID >", value, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TouSuID >=", value, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidLessThan(Integer value) {
            addCriterion("TouSuID <", value, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidLessThanOrEqualTo(Integer value) {
            addCriterion("TouSuID <=", value, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidIn(List<Integer> values) {
            addCriterion("TouSuID in", values, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidNotIn(List<Integer> values) {
            addCriterion("TouSuID not in", values, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidBetween(Integer value1, Integer value2) {
            addCriterion("TouSuID between", value1, value2, "tousuid");
            return (Criteria) this;
        }

        public Criteria andTousuidNotBetween(Integer value1, Integer value2) {
            addCriterion("TouSuID not between", value1, value2, "tousuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidIsNull() {
            addCriterion("YongHuID is null");
            return (Criteria) this;
        }

        public Criteria andYonghuidIsNotNull() {
            addCriterion("YongHuID is not null");
            return (Criteria) this;
        }

        public Criteria andYonghuidEqualTo(Integer value) {
            addCriterion("YongHuID =", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotEqualTo(Integer value) {
            addCriterion("YongHuID <>", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidGreaterThan(Integer value) {
            addCriterion("YongHuID >", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YongHuID >=", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidLessThan(Integer value) {
            addCriterion("YongHuID <", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidLessThanOrEqualTo(Integer value) {
            addCriterion("YongHuID <=", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidIn(List<Integer> values) {
            addCriterion("YongHuID in", values, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotIn(List<Integer> values) {
            addCriterion("YongHuID not in", values, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidBetween(Integer value1, Integer value2) {
            addCriterion("YongHuID between", value1, value2, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotBetween(Integer value1, Integer value2) {
            addCriterion("YongHuID not between", value1, value2, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidIsNull() {
            addCriterion("BeiTouSuDuiXiangID is null");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidIsNotNull() {
            addCriterion("BeiTouSuDuiXiangID is not null");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidEqualTo(Integer value) {
            addCriterion("BeiTouSuDuiXiangID =", value, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidNotEqualTo(Integer value) {
            addCriterion("BeiTouSuDuiXiangID <>", value, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidGreaterThan(Integer value) {
            addCriterion("BeiTouSuDuiXiangID >", value, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BeiTouSuDuiXiangID >=", value, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidLessThan(Integer value) {
            addCriterion("BeiTouSuDuiXiangID <", value, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidLessThanOrEqualTo(Integer value) {
            addCriterion("BeiTouSuDuiXiangID <=", value, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidIn(List<Integer> values) {
            addCriterion("BeiTouSuDuiXiangID in", values, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidNotIn(List<Integer> values) {
            addCriterion("BeiTouSuDuiXiangID not in", values, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidBetween(Integer value1, Integer value2) {
            addCriterion("BeiTouSuDuiXiangID between", value1, value2, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangidNotBetween(Integer value1, Integer value2) {
            addCriterion("BeiTouSuDuiXiangID not between", value1, value2, "beitousuduixiangid");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingIsNull() {
            addCriterion("BeiTouSuDuiXiangMing is null");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingIsNotNull() {
            addCriterion("BeiTouSuDuiXiangMing is not null");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingEqualTo(String value) {
            addCriterion("BeiTouSuDuiXiangMing =", value, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingNotEqualTo(String value) {
            addCriterion("BeiTouSuDuiXiangMing <>", value, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingGreaterThan(String value) {
            addCriterion("BeiTouSuDuiXiangMing >", value, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingGreaterThanOrEqualTo(String value) {
            addCriterion("BeiTouSuDuiXiangMing >=", value, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingLessThan(String value) {
            addCriterion("BeiTouSuDuiXiangMing <", value, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingLessThanOrEqualTo(String value) {
            addCriterion("BeiTouSuDuiXiangMing <=", value, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingLike(String value) {
            addCriterion("BeiTouSuDuiXiangMing like", value, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingNotLike(String value) {
            addCriterion("BeiTouSuDuiXiangMing not like", value, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingIn(List<String> values) {
            addCriterion("BeiTouSuDuiXiangMing in", values, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingNotIn(List<String> values) {
            addCriterion("BeiTouSuDuiXiangMing not in", values, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingBetween(String value1, String value2) {
            addCriterion("BeiTouSuDuiXiangMing between", value1, value2, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangmingNotBetween(String value1, String value2) {
            addCriterion("BeiTouSuDuiXiangMing not between", value1, value2, "beitousuduixiangming");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingIsNull() {
            addCriterion("BeiTouSuDuiXiangLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingIsNotNull() {
            addCriterion("BeiTouSuDuiXiangLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingEqualTo(Integer value) {
            addCriterion("BeiTouSuDuiXiangLeiXing =", value, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingNotEqualTo(Integer value) {
            addCriterion("BeiTouSuDuiXiangLeiXing <>", value, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingGreaterThan(Integer value) {
            addCriterion("BeiTouSuDuiXiangLeiXing >", value, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("BeiTouSuDuiXiangLeiXing >=", value, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingLessThan(Integer value) {
            addCriterion("BeiTouSuDuiXiangLeiXing <", value, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingLessThanOrEqualTo(Integer value) {
            addCriterion("BeiTouSuDuiXiangLeiXing <=", value, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingIn(List<Integer> values) {
            addCriterion("BeiTouSuDuiXiangLeiXing in", values, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingNotIn(List<Integer> values) {
            addCriterion("BeiTouSuDuiXiangLeiXing not in", values, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingBetween(Integer value1, Integer value2) {
            addCriterion("BeiTouSuDuiXiangLeiXing between", value1, value2, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andBeitousuduixiangleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("BeiTouSuDuiXiangLeiXing not between", value1, value2, "beitousuduixiangleixing");
            return (Criteria) this;
        }

        public Criteria andTousuliyouIsNull() {
            addCriterion("TouSuLiYou is null");
            return (Criteria) this;
        }

        public Criteria andTousuliyouIsNotNull() {
            addCriterion("TouSuLiYou is not null");
            return (Criteria) this;
        }

        public Criteria andTousuliyouEqualTo(String value) {
            addCriterion("TouSuLiYou =", value, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouNotEqualTo(String value) {
            addCriterion("TouSuLiYou <>", value, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouGreaterThan(String value) {
            addCriterion("TouSuLiYou >", value, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouGreaterThanOrEqualTo(String value) {
            addCriterion("TouSuLiYou >=", value, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouLessThan(String value) {
            addCriterion("TouSuLiYou <", value, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouLessThanOrEqualTo(String value) {
            addCriterion("TouSuLiYou <=", value, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouLike(String value) {
            addCriterion("TouSuLiYou like", value, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouNotLike(String value) {
            addCriterion("TouSuLiYou not like", value, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouIn(List<String> values) {
            addCriterion("TouSuLiYou in", values, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouNotIn(List<String> values) {
            addCriterion("TouSuLiYou not in", values, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouBetween(String value1, String value2) {
            addCriterion("TouSuLiYou between", value1, value2, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andTousuliyouNotBetween(String value1, String value2) {
            addCriterion("TouSuLiYou not between", value1, value2, "tousuliyou");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlIsNull() {
            addCriterion("ShiLiTuPianURL is null");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlIsNotNull() {
            addCriterion("ShiLiTuPianURL is not null");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlEqualTo(String value) {
            addCriterion("ShiLiTuPianURL =", value, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlNotEqualTo(String value) {
            addCriterion("ShiLiTuPianURL <>", value, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlGreaterThan(String value) {
            addCriterion("ShiLiTuPianURL >", value, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlGreaterThanOrEqualTo(String value) {
            addCriterion("ShiLiTuPianURL >=", value, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlLessThan(String value) {
            addCriterion("ShiLiTuPianURL <", value, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlLessThanOrEqualTo(String value) {
            addCriterion("ShiLiTuPianURL <=", value, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlLike(String value) {
            addCriterion("ShiLiTuPianURL like", value, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlNotLike(String value) {
            addCriterion("ShiLiTuPianURL not like", value, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlIn(List<String> values) {
            addCriterion("ShiLiTuPianURL in", values, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlNotIn(List<String> values) {
            addCriterion("ShiLiTuPianURL not in", values, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlBetween(String value1, String value2) {
            addCriterion("ShiLiTuPianURL between", value1, value2, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andShilitupianurlNotBetween(String value1, String value2) {
            addCriterion("ShiLiTuPianURL not between", value1, value2, "shilitupianurl");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieIsNull() {
            addCriterion("DiZhiLianJie is null");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieIsNotNull() {
            addCriterion("DiZhiLianJie is not null");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieEqualTo(String value) {
            addCriterion("DiZhiLianJie =", value, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieNotEqualTo(String value) {
            addCriterion("DiZhiLianJie <>", value, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieGreaterThan(String value) {
            addCriterion("DiZhiLianJie >", value, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieGreaterThanOrEqualTo(String value) {
            addCriterion("DiZhiLianJie >=", value, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieLessThan(String value) {
            addCriterion("DiZhiLianJie <", value, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieLessThanOrEqualTo(String value) {
            addCriterion("DiZhiLianJie <=", value, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieLike(String value) {
            addCriterion("DiZhiLianJie like", value, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieNotLike(String value) {
            addCriterion("DiZhiLianJie not like", value, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieIn(List<String> values) {
            addCriterion("DiZhiLianJie in", values, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieNotIn(List<String> values) {
            addCriterion("DiZhiLianJie not in", values, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieBetween(String value1, String value2) {
            addCriterion("DiZhiLianJie between", value1, value2, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andDizhilianjieNotBetween(String value1, String value2) {
            addCriterion("DiZhiLianJie not between", value1, value2, "dizhilianjie");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingIsNull() {
            addCriterion("TouSuRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingIsNotNull() {
            addCriterion("TouSuRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingEqualTo(String value) {
            addCriterion("TouSuRenXingMing =", value, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingNotEqualTo(String value) {
            addCriterion("TouSuRenXingMing <>", value, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingGreaterThan(String value) {
            addCriterion("TouSuRenXingMing >", value, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("TouSuRenXingMing >=", value, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingLessThan(String value) {
            addCriterion("TouSuRenXingMing <", value, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingLessThanOrEqualTo(String value) {
            addCriterion("TouSuRenXingMing <=", value, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingLike(String value) {
            addCriterion("TouSuRenXingMing like", value, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingNotLike(String value) {
            addCriterion("TouSuRenXingMing not like", value, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingIn(List<String> values) {
            addCriterion("TouSuRenXingMing in", values, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingNotIn(List<String> values) {
            addCriterion("TouSuRenXingMing not in", values, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingBetween(String value1, String value2) {
            addCriterion("TouSuRenXingMing between", value1, value2, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurenxingmingNotBetween(String value1, String value2) {
            addCriterion("TouSuRenXingMing not between", value1, value2, "tousurenxingming");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaIsNull() {
            addCriterion("TouSURenDianHua is null");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaIsNotNull() {
            addCriterion("TouSURenDianHua is not null");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaEqualTo(String value) {
            addCriterion("TouSURenDianHua =", value, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaNotEqualTo(String value) {
            addCriterion("TouSURenDianHua <>", value, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaGreaterThan(String value) {
            addCriterion("TouSURenDianHua >", value, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("TouSURenDianHua >=", value, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaLessThan(String value) {
            addCriterion("TouSURenDianHua <", value, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaLessThanOrEqualTo(String value) {
            addCriterion("TouSURenDianHua <=", value, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaLike(String value) {
            addCriterion("TouSURenDianHua like", value, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaNotLike(String value) {
            addCriterion("TouSURenDianHua not like", value, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaIn(List<String> values) {
            addCriterion("TouSURenDianHua in", values, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaNotIn(List<String> values) {
            addCriterion("TouSURenDianHua not in", values, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaBetween(String value1, String value2) {
            addCriterion("TouSURenDianHua between", value1, value2, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurendianhuaNotBetween(String value1, String value2) {
            addCriterion("TouSURenDianHua not between", value1, value2, "tousurendianhua");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangIsNull() {
            addCriterion("TouSuRenYouXiang is null");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangIsNotNull() {
            addCriterion("TouSuRenYouXiang is not null");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangEqualTo(String value) {
            addCriterion("TouSuRenYouXiang =", value, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangNotEqualTo(String value) {
            addCriterion("TouSuRenYouXiang <>", value, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangGreaterThan(String value) {
            addCriterion("TouSuRenYouXiang >", value, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("TouSuRenYouXiang >=", value, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangLessThan(String value) {
            addCriterion("TouSuRenYouXiang <", value, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangLessThanOrEqualTo(String value) {
            addCriterion("TouSuRenYouXiang <=", value, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangLike(String value) {
            addCriterion("TouSuRenYouXiang like", value, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangNotLike(String value) {
            addCriterion("TouSuRenYouXiang not like", value, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangIn(List<String> values) {
            addCriterion("TouSuRenYouXiang in", values, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangNotIn(List<String> values) {
            addCriterion("TouSuRenYouXiang not in", values, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangBetween(String value1, String value2) {
            addCriterion("TouSuRenYouXiang between", value1, value2, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousurenyouxiangNotBetween(String value1, String value2) {
            addCriterion("TouSuRenYouXiang not between", value1, value2, "tousurenyouxiang");
            return (Criteria) this;
        }

        public Criteria andTousushijianIsNull() {
            addCriterion("TouSuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andTousushijianIsNotNull() {
            addCriterion("TouSuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andTousushijianEqualTo(Date value) {
            addCriterion("TouSuShiJian =", value, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianNotEqualTo(Date value) {
            addCriterion("TouSuShiJian <>", value, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianGreaterThan(Date value) {
            addCriterion("TouSuShiJian >", value, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("TouSuShiJian >=", value, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianLessThan(Date value) {
            addCriterion("TouSuShiJian <", value, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianLessThanOrEqualTo(Date value) {
            addCriterion("TouSuShiJian <=", value, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianIn(List<Date> values) {
            addCriterion("TouSuShiJian in", values, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianNotIn(List<Date> values) {
            addCriterion("TouSuShiJian not in", values, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianBetween(Date value1, Date value2) {
            addCriterion("TouSuShiJian between", value1, value2, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andTousushijianNotBetween(Date value1, Date value2) {
            addCriterion("TouSuShiJian not between", value1, value2, "tousushijian");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiIsNull() {
            addCriterion("ChuLiZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiIsNotNull() {
            addCriterion("ChuLiZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiEqualTo(Integer value) {
            addCriterion("ChuLiZhuangTai =", value, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiNotEqualTo(Integer value) {
            addCriterion("ChuLiZhuangTai <>", value, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiGreaterThan(Integer value) {
            addCriterion("ChuLiZhuangTai >", value, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChuLiZhuangTai >=", value, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiLessThan(Integer value) {
            addCriterion("ChuLiZhuangTai <", value, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("ChuLiZhuangTai <=", value, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiIn(List<Integer> values) {
            addCriterion("ChuLiZhuangTai in", values, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiNotIn(List<Integer> values) {
            addCriterion("ChuLiZhuangTai not in", values, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("ChuLiZhuangTai between", value1, value2, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulizhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("ChuLiZhuangTai not between", value1, value2, "chulizhuangtai");
            return (Criteria) this;
        }

        public Criteria andChulirenidIsNull() {
            addCriterion("ChuliRenID is null");
            return (Criteria) this;
        }

        public Criteria andChulirenidIsNotNull() {
            addCriterion("ChuliRenID is not null");
            return (Criteria) this;
        }

        public Criteria andChulirenidEqualTo(Integer value) {
            addCriterion("ChuliRenID =", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidNotEqualTo(Integer value) {
            addCriterion("ChuliRenID <>", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidGreaterThan(Integer value) {
            addCriterion("ChuliRenID >", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChuliRenID >=", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidLessThan(Integer value) {
            addCriterion("ChuliRenID <", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidLessThanOrEqualTo(Integer value) {
            addCriterion("ChuliRenID <=", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidIn(List<Integer> values) {
            addCriterion("ChuliRenID in", values, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidNotIn(List<Integer> values) {
            addCriterion("ChuliRenID not in", values, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidBetween(Integer value1, Integer value2) {
            addCriterion("ChuliRenID between", value1, value2, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChuliRenID not between", value1, value2, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingIsNull() {
            addCriterion("ChuLiRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingIsNotNull() {
            addCriterion("ChuLiRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingEqualTo(String value) {
            addCriterion("ChuLiRenXingMing =", value, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingNotEqualTo(String value) {
            addCriterion("ChuLiRenXingMing <>", value, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingGreaterThan(String value) {
            addCriterion("ChuLiRenXingMing >", value, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ChuLiRenXingMing >=", value, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingLessThan(String value) {
            addCriterion("ChuLiRenXingMing <", value, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ChuLiRenXingMing <=", value, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingLike(String value) {
            addCriterion("ChuLiRenXingMing like", value, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingNotLike(String value) {
            addCriterion("ChuLiRenXingMing not like", value, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingIn(List<String> values) {
            addCriterion("ChuLiRenXingMing in", values, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingNotIn(List<String> values) {
            addCriterion("ChuLiRenXingMing not in", values, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingBetween(String value1, String value2) {
            addCriterion("ChuLiRenXingMing between", value1, value2, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulirenxingmingNotBetween(String value1, String value2) {
            addCriterion("ChuLiRenXingMing not between", value1, value2, "chulirenxingming");
            return (Criteria) this;
        }

        public Criteria andChulishijianIsNull() {
            addCriterion("ChuLiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andChulishijianIsNotNull() {
            addCriterion("ChuLiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andChulishijianEqualTo(Date value) {
            addCriterion("ChuLiShiJian =", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianNotEqualTo(Date value) {
            addCriterion("ChuLiShiJian <>", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianGreaterThan(Date value) {
            addCriterion("ChuLiShiJian >", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ChuLiShiJian >=", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianLessThan(Date value) {
            addCriterion("ChuLiShiJian <", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianLessThanOrEqualTo(Date value) {
            addCriterion("ChuLiShiJian <=", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianIn(List<Date> values) {
            addCriterion("ChuLiShiJian in", values, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianNotIn(List<Date> values) {
            addCriterion("ChuLiShiJian not in", values, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianBetween(Date value1, Date value2) {
            addCriterion("ChuLiShiJian between", value1, value2, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianNotBetween(Date value1, Date value2) {
            addCriterion("ChuLiShiJian not between", value1, value2, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulijieguoIsNull() {
            addCriterion("ChuLiJieGuo is null");
            return (Criteria) this;
        }

        public Criteria andChulijieguoIsNotNull() {
            addCriterion("ChuLiJieGuo is not null");
            return (Criteria) this;
        }

        public Criteria andChulijieguoEqualTo(Integer value) {
            addCriterion("ChuLiJieGuo =", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoNotEqualTo(Integer value) {
            addCriterion("ChuLiJieGuo <>", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoGreaterThan(Integer value) {
            addCriterion("ChuLiJieGuo >", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChuLiJieGuo >=", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoLessThan(Integer value) {
            addCriterion("ChuLiJieGuo <", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoLessThanOrEqualTo(Integer value) {
            addCriterion("ChuLiJieGuo <=", value, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoIn(List<Integer> values) {
            addCriterion("ChuLiJieGuo in", values, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoNotIn(List<Integer> values) {
            addCriterion("ChuLiJieGuo not in", values, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoBetween(Integer value1, Integer value2) {
            addCriterion("ChuLiJieGuo between", value1, value2, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andChulijieguoNotBetween(Integer value1, Integer value2) {
            addCriterion("ChuLiJieGuo not between", value1, value2, "chulijieguo");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingIsNull() {
            addCriterion("JieGuoShuoMing is null");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingIsNotNull() {
            addCriterion("JieGuoShuoMing is not null");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingEqualTo(String value) {
            addCriterion("JieGuoShuoMing =", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingNotEqualTo(String value) {
            addCriterion("JieGuoShuoMing <>", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingGreaterThan(String value) {
            addCriterion("JieGuoShuoMing >", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingGreaterThanOrEqualTo(String value) {
            addCriterion("JieGuoShuoMing >=", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingLessThan(String value) {
            addCriterion("JieGuoShuoMing <", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingLessThanOrEqualTo(String value) {
            addCriterion("JieGuoShuoMing <=", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingLike(String value) {
            addCriterion("JieGuoShuoMing like", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingNotLike(String value) {
            addCriterion("JieGuoShuoMing not like", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingIn(List<String> values) {
            addCriterion("JieGuoShuoMing in", values, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingNotIn(List<String> values) {
            addCriterion("JieGuoShuoMing not in", values, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingBetween(String value1, String value2) {
            addCriterion("JieGuoShuoMing between", value1, value2, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingNotBetween(String value1, String value2) {
            addCriterion("JieGuoShuoMing not between", value1, value2, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuIsNull() {
            addCriterion("ShiFouYiShanChu is null");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuIsNotNull() {
            addCriterion("ShiFouYiShanChu is not null");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuEqualTo(Integer value) {
            addCriterion("ShiFouYiShanChu =", value, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuNotEqualTo(Integer value) {
            addCriterion("ShiFouYiShanChu <>", value, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuGreaterThan(Integer value) {
            addCriterion("ShiFouYiShanChu >", value, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYiShanChu >=", value, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuLessThan(Integer value) {
            addCriterion("ShiFouYiShanChu <", value, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYiShanChu <=", value, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuIn(List<Integer> values) {
            addCriterion("ShiFouYiShanChu in", values, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuNotIn(List<Integer> values) {
            addCriterion("ShiFouYiShanChu not in", values, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYiShanChu between", value1, value2, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andShifouyishanchuNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYiShanChu not between", value1, value2, "shifouyishanchu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("BeiZhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("BeiZhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("BeiZhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("BeiZhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("BeiZhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("BeiZhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("BeiZhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("BeiZhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("BeiZhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("BeiZhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("BeiZhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("BeiZhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("BeiZhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("BeiZhu not between", value1, value2, "beizhu");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}