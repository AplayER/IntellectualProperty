package com.hbippub.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubBrandExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andShangpinidIsNull() {
            addCriterion("ShangPinID is null");
            return (Criteria) this;
        }

        public Criteria andShangpinidIsNotNull() {
            addCriterion("ShangPinID is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinidEqualTo(Integer value) {
            addCriterion("ShangPinID =", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotEqualTo(Integer value) {
            addCriterion("ShangPinID <>", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidGreaterThan(Integer value) {
            addCriterion("ShangPinID >", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShangPinID >=", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidLessThan(Integer value) {
            addCriterion("ShangPinID <", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidLessThanOrEqualTo(Integer value) {
            addCriterion("ShangPinID <=", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidIn(List<Integer> values) {
            addCriterion("ShangPinID in", values, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotIn(List<Integer> values) {
            addCriterion("ShangPinID not in", values, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinID between", value1, value2, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinID not between", value1, value2, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andDianpuidIsNull() {
            addCriterion("DianPuID is null");
            return (Criteria) this;
        }

        public Criteria andDianpuidIsNotNull() {
            addCriterion("DianPuID is not null");
            return (Criteria) this;
        }

        public Criteria andDianpuidEqualTo(Integer value) {
            addCriterion("DianPuID =", value, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidNotEqualTo(Integer value) {
            addCriterion("DianPuID <>", value, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidGreaterThan(Integer value) {
            addCriterion("DianPuID >", value, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DianPuID >=", value, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidLessThan(Integer value) {
            addCriterion("DianPuID <", value, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidLessThanOrEqualTo(Integer value) {
            addCriterion("DianPuID <=", value, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidIn(List<Integer> values) {
            addCriterion("DianPuID in", values, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidNotIn(List<Integer> values) {
            addCriterion("DianPuID not in", values, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidBetween(Integer value1, Integer value2) {
            addCriterion("DianPuID between", value1, value2, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpuidNotBetween(Integer value1, Integer value2) {
            addCriterion("DianPuID not between", value1, value2, "dianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpunameIsNull() {
            addCriterion("DianPuName is null");
            return (Criteria) this;
        }

        public Criteria andDianpunameIsNotNull() {
            addCriterion("DianPuName is not null");
            return (Criteria) this;
        }

        public Criteria andDianpunameEqualTo(String value) {
            addCriterion("DianPuName =", value, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameNotEqualTo(String value) {
            addCriterion("DianPuName <>", value, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameGreaterThan(String value) {
            addCriterion("DianPuName >", value, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameGreaterThanOrEqualTo(String value) {
            addCriterion("DianPuName >=", value, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameLessThan(String value) {
            addCriterion("DianPuName <", value, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameLessThanOrEqualTo(String value) {
            addCriterion("DianPuName <=", value, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameLike(String value) {
            addCriterion("DianPuName like", value, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameNotLike(String value) {
            addCriterion("DianPuName not like", value, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameIn(List<String> values) {
            addCriterion("DianPuName in", values, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameNotIn(List<String> values) {
            addCriterion("DianPuName not in", values, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameBetween(String value1, String value2) {
            addCriterion("DianPuName between", value1, value2, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andDianpunameNotBetween(String value1, String value2) {
            addCriterion("DianPuName not between", value1, value2, "dianpuname");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiIsNull() {
            addCriterion("WeiTuoZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiIsNotNull() {
            addCriterion("WeiTuoZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiEqualTo(Integer value) {
            addCriterion("WeiTuoZhuangTai =", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiNotEqualTo(Integer value) {
            addCriterion("WeiTuoZhuangTai <>", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiGreaterThan(Integer value) {
            addCriterion("WeiTuoZhuangTai >", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("WeiTuoZhuangTai >=", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiLessThan(Integer value) {
            addCriterion("WeiTuoZhuangTai <", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("WeiTuoZhuangTai <=", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiIn(List<Integer> values) {
            addCriterion("WeiTuoZhuangTai in", values, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiNotIn(List<Integer> values) {
            addCriterion("WeiTuoZhuangTai not in", values, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("WeiTuoZhuangTai between", value1, value2, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("WeiTuoZhuangTai not between", value1, value2, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianIsNull() {
            addCriterion("JieShouWeiTuoShiJian is null");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianIsNotNull() {
            addCriterion("JieShouWeiTuoShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianEqualTo(Date value) {
            addCriterion("JieShouWeiTuoShiJian =", value, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianNotEqualTo(Date value) {
            addCriterion("JieShouWeiTuoShiJian <>", value, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianGreaterThan(Date value) {
            addCriterion("JieShouWeiTuoShiJian >", value, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("JieShouWeiTuoShiJian >=", value, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianLessThan(Date value) {
            addCriterion("JieShouWeiTuoShiJian <", value, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianLessThanOrEqualTo(Date value) {
            addCriterion("JieShouWeiTuoShiJian <=", value, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianIn(List<Date> values) {
            addCriterion("JieShouWeiTuoShiJian in", values, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianNotIn(List<Date> values) {
            addCriterion("JieShouWeiTuoShiJian not in", values, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianBetween(Date value1, Date value2) {
            addCriterion("JieShouWeiTuoShiJian between", value1, value2, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andJieshouweituoshijianNotBetween(Date value1, Date value2) {
            addCriterion("JieShouWeiTuoShiJian not between", value1, value2, "jieshouweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidIsNull() {
            addCriterion("ShangBiaoLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidIsNotNull() {
            addCriterion("ShangBiaoLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidEqualTo(Integer value) {
            addCriterion("ShangBiaoLeiXingID =", value, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidNotEqualTo(Integer value) {
            addCriterion("ShangBiaoLeiXingID <>", value, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidGreaterThan(Integer value) {
            addCriterion("ShangBiaoLeiXingID >", value, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShangBiaoLeiXingID >=", value, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidLessThan(Integer value) {
            addCriterion("ShangBiaoLeiXingID <", value, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidLessThanOrEqualTo(Integer value) {
            addCriterion("ShangBiaoLeiXingID <=", value, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidIn(List<Integer> values) {
            addCriterion("ShangBiaoLeiXingID in", values, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidNotIn(List<Integer> values) {
            addCriterion("ShangBiaoLeiXingID not in", values, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidBetween(Integer value1, Integer value2) {
            addCriterion("ShangBiaoLeiXingID between", value1, value2, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShangBiaoLeiXingID not between", value1, value2, "shangbiaoleixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsIsNull() {
            addCriterion("JiaoYiLeiXingIDs is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsIsNotNull() {
            addCriterion("JiaoYiLeiXingIDs is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsEqualTo(Integer value) {
            addCriterion("JiaoYiLeiXingIDs =", value, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsNotEqualTo(Integer value) {
            addCriterion("JiaoYiLeiXingIDs <>", value, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsGreaterThan(Integer value) {
            addCriterion("JiaoYiLeiXingIDs >", value, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiaoYiLeiXingIDs >=", value, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsLessThan(Integer value) {
            addCriterion("JiaoYiLeiXingIDs <", value, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsLessThanOrEqualTo(Integer value) {
            addCriterion("JiaoYiLeiXingIDs <=", value, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsIn(List<Integer> values) {
            addCriterion("JiaoYiLeiXingIDs in", values, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsNotIn(List<Integer> values) {
            addCriterion("JiaoYiLeiXingIDs not in", values, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsBetween(Integer value1, Integer value2) {
            addCriterion("JiaoYiLeiXingIDs between", value1, value2, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidsNotBetween(Integer value1, Integer value2) {
            addCriterion("JiaoYiLeiXingIDs not between", value1, value2, "jiaoyileixingids");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidIsNull() {
            addCriterion("ZuHeLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidIsNotNull() {
            addCriterion("ZuHeLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidEqualTo(Integer value) {
            addCriterion("ZuHeLeiXingID =", value, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidNotEqualTo(Integer value) {
            addCriterion("ZuHeLeiXingID <>", value, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidGreaterThan(Integer value) {
            addCriterion("ZuHeLeiXingID >", value, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZuHeLeiXingID >=", value, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidLessThan(Integer value) {
            addCriterion("ZuHeLeiXingID <", value, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidLessThanOrEqualTo(Integer value) {
            addCriterion("ZuHeLeiXingID <=", value, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidIn(List<Integer> values) {
            addCriterion("ZuHeLeiXingID in", values, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidNotIn(List<Integer> values) {
            addCriterion("ZuHeLeiXingID not in", values, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidBetween(Integer value1, Integer value2) {
            addCriterion("ZuHeLeiXingID between", value1, value2, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andZuheleixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZuHeLeiXingID not between", value1, value2, "zuheleixingid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidIsNull() {
            addCriterion("PaiMaiMoShiID is null");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidIsNotNull() {
            addCriterion("PaiMaiMoShiID is not null");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidEqualTo(Integer value) {
            addCriterion("PaiMaiMoShiID =", value, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidNotEqualTo(Integer value) {
            addCriterion("PaiMaiMoShiID <>", value, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidGreaterThan(Integer value) {
            addCriterion("PaiMaiMoShiID >", value, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaiMaiMoShiID >=", value, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidLessThan(Integer value) {
            addCriterion("PaiMaiMoShiID <", value, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidLessThanOrEqualTo(Integer value) {
            addCriterion("PaiMaiMoShiID <=", value, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidIn(List<Integer> values) {
            addCriterion("PaiMaiMoShiID in", values, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidNotIn(List<Integer> values) {
            addCriterion("PaiMaiMoShiID not in", values, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidBetween(Integer value1, Integer value2) {
            addCriterion("PaiMaiMoShiID between", value1, value2, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaimoshiidNotBetween(Integer value1, Integer value2) {
            addCriterion("PaiMaiMoShiID not between", value1, value2, "paimaimoshiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidIsNull() {
            addCriterion("PaiMaiZhuangTaiID is null");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidIsNotNull() {
            addCriterion("PaiMaiZhuangTaiID is not null");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidEqualTo(Integer value) {
            addCriterion("PaiMaiZhuangTaiID =", value, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidNotEqualTo(Integer value) {
            addCriterion("PaiMaiZhuangTaiID <>", value, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidGreaterThan(Integer value) {
            addCriterion("PaiMaiZhuangTaiID >", value, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaiMaiZhuangTaiID >=", value, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidLessThan(Integer value) {
            addCriterion("PaiMaiZhuangTaiID <", value, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidLessThanOrEqualTo(Integer value) {
            addCriterion("PaiMaiZhuangTaiID <=", value, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidIn(List<Integer> values) {
            addCriterion("PaiMaiZhuangTaiID in", values, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidNotIn(List<Integer> values) {
            addCriterion("PaiMaiZhuangTaiID not in", values, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidBetween(Integer value1, Integer value2) {
            addCriterion("PaiMaiZhuangTaiID between", value1, value2, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andPaimaizhuangtaiidNotBetween(Integer value1, Integer value2) {
            addCriterion("PaiMaiZhuangTaiID not between", value1, value2, "paimaizhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiIsNull() {
            addCriterion("ShiFouPaiMai is null");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiIsNotNull() {
            addCriterion("ShiFouPaiMai is not null");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiEqualTo(Integer value) {
            addCriterion("ShiFouPaiMai =", value, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiNotEqualTo(Integer value) {
            addCriterion("ShiFouPaiMai <>", value, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiGreaterThan(Integer value) {
            addCriterion("ShiFouPaiMai >", value, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouPaiMai >=", value, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiLessThan(Integer value) {
            addCriterion("ShiFouPaiMai <", value, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouPaiMai <=", value, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiIn(List<Integer> values) {
            addCriterion("ShiFouPaiMai in", values, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiNotIn(List<Integer> values) {
            addCriterion("ShiFouPaiMai not in", values, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouPaiMai between", value1, value2, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShifoupaimaiNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouPaiMai not between", value1, value2, "shifoupaimai");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIsNull() {
            addCriterion("ShangPinMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIsNotNull() {
            addCriterion("ShangPinMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengEqualTo(String value) {
            addCriterion("ShangPinMingCheng =", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotEqualTo(String value) {
            addCriterion("ShangPinMingCheng <>", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengGreaterThan(String value) {
            addCriterion("ShangPinMingCheng >", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ShangPinMingCheng >=", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLessThan(String value) {
            addCriterion("ShangPinMingCheng <", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLessThanOrEqualTo(String value) {
            addCriterion("ShangPinMingCheng <=", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLike(String value) {
            addCriterion("ShangPinMingCheng like", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotLike(String value) {
            addCriterion("ShangPinMingCheng not like", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIn(List<String> values) {
            addCriterion("ShangPinMingCheng in", values, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotIn(List<String> values) {
            addCriterion("ShangPinMingCheng not in", values, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengBetween(String value1, String value2) {
            addCriterion("ShangPinMingCheng between", value1, value2, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotBetween(String value1, String value2) {
            addCriterion("ShangPinMingCheng not between", value1, value2, "shangpinmingcheng");
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

        public Criteria andYonghumingchengIsNull() {
            addCriterion("YongHuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengIsNotNull() {
            addCriterion("YongHuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengEqualTo(String value) {
            addCriterion("YongHuMingCheng =", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotEqualTo(String value) {
            addCriterion("YongHuMingCheng <>", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengGreaterThan(String value) {
            addCriterion("YongHuMingCheng >", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("YongHuMingCheng >=", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLessThan(String value) {
            addCriterion("YongHuMingCheng <", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLessThanOrEqualTo(String value) {
            addCriterion("YongHuMingCheng <=", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLike(String value) {
            addCriterion("YongHuMingCheng like", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotLike(String value) {
            addCriterion("YongHuMingCheng not like", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengIn(List<String> values) {
            addCriterion("YongHuMingCheng in", values, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotIn(List<String> values) {
            addCriterion("YongHuMingCheng not in", values, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengBetween(String value1, String value2) {
            addCriterion("YongHuMingCheng between", value1, value2, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotBetween(String value1, String value2) {
            addCriterion("YongHuMingCheng not between", value1, value2, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengIsNull() {
            addCriterion("ShangBiaoLeiXingMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengIsNotNull() {
            addCriterion("ShangBiaoLeiXingMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengEqualTo(String value) {
            addCriterion("ShangBiaoLeiXingMingCheng =", value, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengNotEqualTo(String value) {
            addCriterion("ShangBiaoLeiXingMingCheng <>", value, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengGreaterThan(String value) {
            addCriterion("ShangBiaoLeiXingMingCheng >", value, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ShangBiaoLeiXingMingCheng >=", value, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengLessThan(String value) {
            addCriterion("ShangBiaoLeiXingMingCheng <", value, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengLessThanOrEqualTo(String value) {
            addCriterion("ShangBiaoLeiXingMingCheng <=", value, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengLike(String value) {
            addCriterion("ShangBiaoLeiXingMingCheng like", value, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengNotLike(String value) {
            addCriterion("ShangBiaoLeiXingMingCheng not like", value, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengIn(List<String> values) {
            addCriterion("ShangBiaoLeiXingMingCheng in", values, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengNotIn(List<String> values) {
            addCriterion("ShangBiaoLeiXingMingCheng not in", values, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengBetween(String value1, String value2) {
            addCriterion("ShangBiaoLeiXingMingCheng between", value1, value2, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangbiaoleixingmingchengNotBetween(String value1, String value2) {
            addCriterion("ShangBiaoLeiXingMingCheng not between", value1, value2, "shangbiaoleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIsNull() {
            addCriterion("ShouCangShu is null");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIsNotNull() {
            addCriterion("ShouCangShu is not null");
            return (Criteria) this;
        }

        public Criteria andShoucangshuEqualTo(Integer value) {
            addCriterion("ShouCangShu =", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotEqualTo(Integer value) {
            addCriterion("ShouCangShu <>", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuGreaterThan(Integer value) {
            addCriterion("ShouCangShu >", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShouCangShu >=", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuLessThan(Integer value) {
            addCriterion("ShouCangShu <", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuLessThanOrEqualTo(Integer value) {
            addCriterion("ShouCangShu <=", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIn(List<Integer> values) {
            addCriterion("ShouCangShu in", values, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotIn(List<Integer> values) {
            addCriterion("ShouCangShu not in", values, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuBetween(Integer value1, Integer value2) {
            addCriterion("ShouCangShu between", value1, value2, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ShouCangShu not between", value1, value2, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andCankaojiaIsNull() {
            addCriterion("CanKaoJia is null");
            return (Criteria) this;
        }

        public Criteria andCankaojiaIsNotNull() {
            addCriterion("CanKaoJia is not null");
            return (Criteria) this;
        }

        public Criteria andCankaojiaEqualTo(BigDecimal value) {
            addCriterion("CanKaoJia =", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaNotEqualTo(BigDecimal value) {
            addCriterion("CanKaoJia <>", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaGreaterThan(BigDecimal value) {
            addCriterion("CanKaoJia >", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CanKaoJia >=", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaLessThan(BigDecimal value) {
            addCriterion("CanKaoJia <", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CanKaoJia <=", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaIn(List<BigDecimal> values) {
            addCriterion("CanKaoJia in", values, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaNotIn(List<BigDecimal> values) {
            addCriterion("CanKaoJia not in", values, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CanKaoJia between", value1, value2, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CanKaoJia not between", value1, value2, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andBaojiashuIsNull() {
            addCriterion("BaojiaShu is null");
            return (Criteria) this;
        }

        public Criteria andBaojiashuIsNotNull() {
            addCriterion("BaojiaShu is not null");
            return (Criteria) this;
        }

        public Criteria andBaojiashuEqualTo(Integer value) {
            addCriterion("BaojiaShu =", value, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuNotEqualTo(Integer value) {
            addCriterion("BaojiaShu <>", value, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuGreaterThan(Integer value) {
            addCriterion("BaojiaShu >", value, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BaojiaShu >=", value, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuLessThan(Integer value) {
            addCriterion("BaojiaShu <", value, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuLessThanOrEqualTo(Integer value) {
            addCriterion("BaojiaShu <=", value, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuIn(List<Integer> values) {
            addCriterion("BaojiaShu in", values, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuNotIn(List<Integer> values) {
            addCriterion("BaojiaShu not in", values, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuBetween(Integer value1, Integer value2) {
            addCriterion("BaojiaShu between", value1, value2, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andBaojiashuNotBetween(Integer value1, Integer value2) {
            addCriterion("BaojiaShu not between", value1, value2, "baojiashu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuIsNull() {
            addCriterion("XiaDanShu is null");
            return (Criteria) this;
        }

        public Criteria andXiadanshuIsNotNull() {
            addCriterion("XiaDanShu is not null");
            return (Criteria) this;
        }

        public Criteria andXiadanshuEqualTo(Integer value) {
            addCriterion("XiaDanShu =", value, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuNotEqualTo(Integer value) {
            addCriterion("XiaDanShu <>", value, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuGreaterThan(Integer value) {
            addCriterion("XiaDanShu >", value, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XiaDanShu >=", value, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuLessThan(Integer value) {
            addCriterion("XiaDanShu <", value, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuLessThanOrEqualTo(Integer value) {
            addCriterion("XiaDanShu <=", value, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuIn(List<Integer> values) {
            addCriterion("XiaDanShu in", values, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuNotIn(List<Integer> values) {
            addCriterion("XiaDanShu not in", values, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuBetween(Integer value1, Integer value2) {
            addCriterion("XiaDanShu between", value1, value2, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andXiadanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("XiaDanShu not between", value1, value2, "xiadanshu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuIsNull() {
            addCriterion("PaiMaiChuJiaShu is null");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuIsNotNull() {
            addCriterion("PaiMaiChuJiaShu is not null");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuEqualTo(Integer value) {
            addCriterion("PaiMaiChuJiaShu =", value, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuNotEqualTo(Integer value) {
            addCriterion("PaiMaiChuJiaShu <>", value, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuGreaterThan(Integer value) {
            addCriterion("PaiMaiChuJiaShu >", value, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaiMaiChuJiaShu >=", value, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuLessThan(Integer value) {
            addCriterion("PaiMaiChuJiaShu <", value, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuLessThanOrEqualTo(Integer value) {
            addCriterion("PaiMaiChuJiaShu <=", value, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuIn(List<Integer> values) {
            addCriterion("PaiMaiChuJiaShu in", values, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuNotIn(List<Integer> values) {
            addCriterion("PaiMaiChuJiaShu not in", values, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuBetween(Integer value1, Integer value2) {
            addCriterion("PaiMaiChuJiaShu between", value1, value2, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andPaimaichujiashuNotBetween(Integer value1, Integer value2) {
            addCriterion("PaiMaiChuJiaShu not between", value1, value2, "paimaichujiashu");
            return (Criteria) this;
        }

        public Criteria andQipaijiageIsNull() {
            addCriterion("QiPaiJiaGe is null");
            return (Criteria) this;
        }

        public Criteria andQipaijiageIsNotNull() {
            addCriterion("QiPaiJiaGe is not null");
            return (Criteria) this;
        }

        public Criteria andQipaijiageEqualTo(BigDecimal value) {
            addCriterion("QiPaiJiaGe =", value, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageNotEqualTo(BigDecimal value) {
            addCriterion("QiPaiJiaGe <>", value, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageGreaterThan(BigDecimal value) {
            addCriterion("QiPaiJiaGe >", value, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QiPaiJiaGe >=", value, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageLessThan(BigDecimal value) {
            addCriterion("QiPaiJiaGe <", value, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QiPaiJiaGe <=", value, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageIn(List<BigDecimal> values) {
            addCriterion("QiPaiJiaGe in", values, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageNotIn(List<BigDecimal> values) {
            addCriterion("QiPaiJiaGe not in", values, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QiPaiJiaGe between", value1, value2, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andQipaijiageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QiPaiJiaGe not between", value1, value2, "qipaijiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageIsNull() {
            addCriterion("DangQianJiaGe is null");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageIsNotNull() {
            addCriterion("DangQianJiaGe is not null");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageEqualTo(BigDecimal value) {
            addCriterion("DangQianJiaGe =", value, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageNotEqualTo(BigDecimal value) {
            addCriterion("DangQianJiaGe <>", value, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageGreaterThan(BigDecimal value) {
            addCriterion("DangQianJiaGe >", value, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DangQianJiaGe >=", value, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageLessThan(BigDecimal value) {
            addCriterion("DangQianJiaGe <", value, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DangQianJiaGe <=", value, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageIn(List<BigDecimal> values) {
            addCriterion("DangQianJiaGe in", values, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageNotIn(List<BigDecimal> values) {
            addCriterion("DangQianJiaGe not in", values, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DangQianJiaGe between", value1, value2, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andDangqianjiageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DangQianJiaGe not between", value1, value2, "dangqianjiage");
            return (Criteria) this;
        }

        public Criteria andQipaishijianIsNull() {
            addCriterion("QiPaiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andQipaishijianIsNotNull() {
            addCriterion("QiPaiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andQipaishijianEqualTo(Date value) {
            addCriterion("QiPaiShiJian =", value, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianNotEqualTo(Date value) {
            addCriterion("QiPaiShiJian <>", value, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianGreaterThan(Date value) {
            addCriterion("QiPaiShiJian >", value, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("QiPaiShiJian >=", value, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianLessThan(Date value) {
            addCriterion("QiPaiShiJian <", value, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianLessThanOrEqualTo(Date value) {
            addCriterion("QiPaiShiJian <=", value, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianIn(List<Date> values) {
            addCriterion("QiPaiShiJian in", values, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianNotIn(List<Date> values) {
            addCriterion("QiPaiShiJian not in", values, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianBetween(Date value1, Date value2) {
            addCriterion("QiPaiShiJian between", value1, value2, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andQipaishijianNotBetween(Date value1, Date value2) {
            addCriterion("QiPaiShiJian not between", value1, value2, "qipaishijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIsNull() {
            addCriterion("JieShuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIsNotNull() {
            addCriterion("JieShuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andJieshushijianEqualTo(Date value) {
            addCriterion("JieShuShiJian =", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotEqualTo(Date value) {
            addCriterion("JieShuShiJian <>", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianGreaterThan(Date value) {
            addCriterion("JieShuShiJian >", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("JieShuShiJian >=", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianLessThan(Date value) {
            addCriterion("JieShuShiJian <", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianLessThanOrEqualTo(Date value) {
            addCriterion("JieShuShiJian <=", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIn(List<Date> values) {
            addCriterion("JieShuShiJian in", values, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotIn(List<Date> values) {
            addCriterion("JieShuShiJian not in", values, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianBetween(Date value1, Date value2) {
            addCriterion("JieShuShiJian between", value1, value2, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotBetween(Date value1, Date value2) {
            addCriterion("JieShuShiJian not between", value1, value2, "jieshushijian");
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

        public Criteria andShifouxiajiaIsNull() {
            addCriterion("ShiFouXiaJia is null");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaIsNotNull() {
            addCriterion("ShiFouXiaJia is not null");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaEqualTo(Integer value) {
            addCriterion("ShiFouXiaJia =", value, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaNotEqualTo(Integer value) {
            addCriterion("ShiFouXiaJia <>", value, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaGreaterThan(Integer value) {
            addCriterion("ShiFouXiaJia >", value, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouXiaJia >=", value, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaLessThan(Integer value) {
            addCriterion("ShiFouXiaJia <", value, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouXiaJia <=", value, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaIn(List<Integer> values) {
            addCriterion("ShiFouXiaJia in", values, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaNotIn(List<Integer> values) {
            addCriterion("ShiFouXiaJia not in", values, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouXiaJia between", value1, value2, "shifouxiajia");
            return (Criteria) this;
        }

        public Criteria andShifouxiajiaNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouXiaJia not between", value1, value2, "shifouxiajia");
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

        public Criteria andFengmianurlIsNull() {
            addCriterion("FengMianURL is null");
            return (Criteria) this;
        }

        public Criteria andFengmianurlIsNotNull() {
            addCriterion("FengMianURL is not null");
            return (Criteria) this;
        }

        public Criteria andFengmianurlEqualTo(String value) {
            addCriterion("FengMianURL =", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotEqualTo(String value) {
            addCriterion("FengMianURL <>", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlGreaterThan(String value) {
            addCriterion("FengMianURL >", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlGreaterThanOrEqualTo(String value) {
            addCriterion("FengMianURL >=", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLessThan(String value) {
            addCriterion("FengMianURL <", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLessThanOrEqualTo(String value) {
            addCriterion("FengMianURL <=", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLike(String value) {
            addCriterion("FengMianURL like", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotLike(String value) {
            addCriterion("FengMianURL not like", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlIn(List<String> values) {
            addCriterion("FengMianURL in", values, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotIn(List<String> values) {
            addCriterion("FengMianURL not in", values, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlBetween(String value1, String value2) {
            addCriterion("FengMianURL between", value1, value2, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotBetween(String value1, String value2) {
            addCriterion("FengMianURL not between", value1, value2, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoIsNull() {
            addCriterion("ShangBiaoZhuCeHao is null");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoIsNotNull() {
            addCriterion("ShangBiaoZhuCeHao is not null");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoEqualTo(String value) {
            addCriterion("ShangBiaoZhuCeHao =", value, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoNotEqualTo(String value) {
            addCriterion("ShangBiaoZhuCeHao <>", value, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoGreaterThan(String value) {
            addCriterion("ShangBiaoZhuCeHao >", value, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoGreaterThanOrEqualTo(String value) {
            addCriterion("ShangBiaoZhuCeHao >=", value, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoLessThan(String value) {
            addCriterion("ShangBiaoZhuCeHao <", value, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoLessThanOrEqualTo(String value) {
            addCriterion("ShangBiaoZhuCeHao <=", value, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoLike(String value) {
            addCriterion("ShangBiaoZhuCeHao like", value, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoNotLike(String value) {
            addCriterion("ShangBiaoZhuCeHao not like", value, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoIn(List<String> values) {
            addCriterion("ShangBiaoZhuCeHao in", values, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoNotIn(List<String> values) {
            addCriterion("ShangBiaoZhuCeHao not in", values, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoBetween(String value1, String value2) {
            addCriterion("ShangBiaoZhuCeHao between", value1, value2, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andShangbiaozhucehaoNotBetween(String value1, String value2) {
            addCriterion("ShangBiaoZhuCeHao not between", value1, value2, "shangbiaozhucehao");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingIsNull() {
            addCriterion("ZhuCeRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingIsNotNull() {
            addCriterion("ZhuCeRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingEqualTo(String value) {
            addCriterion("ZhuCeRenXingMing =", value, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingNotEqualTo(String value) {
            addCriterion("ZhuCeRenXingMing <>", value, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingGreaterThan(String value) {
            addCriterion("ZhuCeRenXingMing >", value, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuCeRenXingMing >=", value, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingLessThan(String value) {
            addCriterion("ZhuCeRenXingMing <", value, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ZhuCeRenXingMing <=", value, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingLike(String value) {
            addCriterion("ZhuCeRenXingMing like", value, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingNotLike(String value) {
            addCriterion("ZhuCeRenXingMing not like", value, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingIn(List<String> values) {
            addCriterion("ZhuCeRenXingMing in", values, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingNotIn(List<String> values) {
            addCriterion("ZhuCeRenXingMing not in", values, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingBetween(String value1, String value2) {
            addCriterion("ZhuCeRenXingMing between", value1, value2, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andZhucerenxingmingNotBetween(String value1, String value2) {
            addCriterion("ZhuCeRenXingMing not between", value1, value2, "zhucerenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiIsNull() {
            addCriterion("ShenQingRiQi is null");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiIsNotNull() {
            addCriterion("ShenQingRiQi is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiEqualTo(Date value) {
            addCriterion("ShenQingRiQi =", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiNotEqualTo(Date value) {
            addCriterion("ShenQingRiQi <>", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiGreaterThan(Date value) {
            addCriterion("ShenQingRiQi >", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiGreaterThanOrEqualTo(Date value) {
            addCriterion("ShenQingRiQi >=", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiLessThan(Date value) {
            addCriterion("ShenQingRiQi <", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiLessThanOrEqualTo(Date value) {
            addCriterion("ShenQingRiQi <=", value, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiIn(List<Date> values) {
            addCriterion("ShenQingRiQi in", values, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiNotIn(List<Date> values) {
            addCriterion("ShenQingRiQi not in", values, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiBetween(Date value1, Date value2) {
            addCriterion("ShenQingRiQi between", value1, value2, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andShenqingriqiNotBetween(Date value1, Date value2) {
            addCriterion("ShenQingRiQi not between", value1, value2, "shenqingriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiIsNull() {
            addCriterion("ZhuCeGongGaoRiQi is null");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiIsNotNull() {
            addCriterion("ZhuCeGongGaoRiQi is not null");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiEqualTo(Date value) {
            addCriterion("ZhuCeGongGaoRiQi =", value, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiNotEqualTo(Date value) {
            addCriterion("ZhuCeGongGaoRiQi <>", value, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiGreaterThan(Date value) {
            addCriterion("ZhuCeGongGaoRiQi >", value, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiGreaterThanOrEqualTo(Date value) {
            addCriterion("ZhuCeGongGaoRiQi >=", value, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiLessThan(Date value) {
            addCriterion("ZhuCeGongGaoRiQi <", value, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiLessThanOrEqualTo(Date value) {
            addCriterion("ZhuCeGongGaoRiQi <=", value, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiIn(List<Date> values) {
            addCriterion("ZhuCeGongGaoRiQi in", values, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiNotIn(List<Date> values) {
            addCriterion("ZhuCeGongGaoRiQi not in", values, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiBetween(Date value1, Date value2) {
            addCriterion("ZhuCeGongGaoRiQi between", value1, value2, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhucegonggaoriqiNotBetween(Date value1, Date value2) {
            addCriterion("ZhuCeGongGaoRiQi not between", value1, value2, "zhucegonggaoriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiIsNull() {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi is null");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiIsNotNull() {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi is not null");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiEqualTo(Date value) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi =", value, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiNotEqualTo(Date value) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi <>", value, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiGreaterThan(Date value) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi >", value, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiGreaterThanOrEqualTo(Date value) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi >=", value, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiLessThan(Date value) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi <", value, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiLessThanOrEqualTo(Date value) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi <=", value, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiIn(List<Date> values) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi in", values, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiNotIn(List<Date> values) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi not in", values, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiBetween(Date value1, Date value2) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi between", value1, value2, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaoqizhiriqiNotBetween(Date value1, Date value2) {
            addCriterion("ZhuCeYouXiaoQiZhiRiQi not between", value1, value2, "zhuceyouxiaoqizhiriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiIsNull() {
            addCriterion("ZhuCeYouXiaoJieShuRiQi is null");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiIsNotNull() {
            addCriterion("ZhuCeYouXiaoJieShuRiQi is not null");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiEqualTo(Date value) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi =", value, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiNotEqualTo(Date value) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi <>", value, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiGreaterThan(Date value) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi >", value, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiGreaterThanOrEqualTo(Date value) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi >=", value, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiLessThan(Date value) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi <", value, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiLessThanOrEqualTo(Date value) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi <=", value, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiIn(List<Date> values) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi in", values, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiNotIn(List<Date> values) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi not in", values, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiBetween(Date value1, Date value2) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi between", value1, value2, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andZhuceyouxiaojieshuriqiNotBetween(Date value1, Date value2) {
            addCriterion("ZhuCeYouXiaoJieShuRiQi not between", value1, value2, "zhuceyouxiaojieshuriqi");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquIsNull() {
            addCriterion("SuoZaiDiQu is null");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquIsNotNull() {
            addCriterion("SuoZaiDiQu is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquEqualTo(String value) {
            addCriterion("SuoZaiDiQu =", value, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquNotEqualTo(String value) {
            addCriterion("SuoZaiDiQu <>", value, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquGreaterThan(String value) {
            addCriterion("SuoZaiDiQu >", value, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquGreaterThanOrEqualTo(String value) {
            addCriterion("SuoZaiDiQu >=", value, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquLessThan(String value) {
            addCriterion("SuoZaiDiQu <", value, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquLessThanOrEqualTo(String value) {
            addCriterion("SuoZaiDiQu <=", value, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquLike(String value) {
            addCriterion("SuoZaiDiQu like", value, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquNotLike(String value) {
            addCriterion("SuoZaiDiQu not like", value, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquIn(List<String> values) {
            addCriterion("SuoZaiDiQu in", values, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquNotIn(List<String> values) {
            addCriterion("SuoZaiDiQu not in", values, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquBetween(String value1, String value2) {
            addCriterion("SuoZaiDiQu between", value1, value2, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andSuozaidiquNotBetween(String value1, String value2) {
            addCriterion("SuoZaiDiQu not between", value1, value2, "suozaidiqu");
            return (Criteria) this;
        }

        public Criteria andFabushijianIsNull() {
            addCriterion("FaBuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andFabushijianIsNotNull() {
            addCriterion("FaBuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andFabushijianEqualTo(Date value) {
            addCriterion("FaBuShiJian =", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotEqualTo(Date value) {
            addCriterion("FaBuShiJian <>", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianGreaterThan(Date value) {
            addCriterion("FaBuShiJian >", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("FaBuShiJian >=", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianLessThan(Date value) {
            addCriterion("FaBuShiJian <", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianLessThanOrEqualTo(Date value) {
            addCriterion("FaBuShiJian <=", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianIn(List<Date> values) {
            addCriterion("FaBuShiJian in", values, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotIn(List<Date> values) {
            addCriterion("FaBuShiJian not in", values, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianBetween(Date value1, Date value2) {
            addCriterion("FaBuShiJian between", value1, value2, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotBetween(Date value1, Date value2) {
            addCriterion("FaBuShiJian not between", value1, value2, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianIsNull() {
            addCriterion("BaoJiaJieShuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianIsNotNull() {
            addCriterion("BaoJiaJieShuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianEqualTo(Date value) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian =", value, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian <>", value, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianGreaterThan(Date value) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian >", value, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian >=", value, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianLessThan(Date value) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian <", value, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian <=", value, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianIn(List<Date> values) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian in", values, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian not in", values, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian between", value1, value2, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andBaojiajieshushijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BaoJiaJieShuShiJian not between", value1, value2, "baojiajieshushijian");
            return (Criteria) this;
        }

        public Criteria andDiquidIsNull() {
            addCriterion("DiQuID is null");
            return (Criteria) this;
        }

        public Criteria andDiquidIsNotNull() {
            addCriterion("DiQuID is not null");
            return (Criteria) this;
        }

        public Criteria andDiquidEqualTo(String value) {
            addCriterion("DiQuID =", value, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidNotEqualTo(String value) {
            addCriterion("DiQuID <>", value, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidGreaterThan(String value) {
            addCriterion("DiQuID >", value, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidGreaterThanOrEqualTo(String value) {
            addCriterion("DiQuID >=", value, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidLessThan(String value) {
            addCriterion("DiQuID <", value, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidLessThanOrEqualTo(String value) {
            addCriterion("DiQuID <=", value, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidLike(String value) {
            addCriterion("DiQuID like", value, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidNotLike(String value) {
            addCriterion("DiQuID not like", value, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidIn(List<String> values) {
            addCriterion("DiQuID in", values, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidNotIn(List<String> values) {
            addCriterion("DiQuID not in", values, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidBetween(String value1, String value2) {
            addCriterion("DiQuID between", value1, value2, "diquid");
            return (Criteria) this;
        }

        public Criteria andDiquidNotBetween(String value1, String value2) {
            addCriterion("DiQuID not between", value1, value2, "diquid");
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