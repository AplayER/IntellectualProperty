package com.hbippub.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubProductExample() {
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

        public Criteria andHangyeleixingidIsNull() {
            addCriterion("HangYeLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidIsNotNull() {
            addCriterion("HangYeLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidEqualTo(Integer value) {
            addCriterion("HangYeLeiXingID =", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidNotEqualTo(Integer value) {
            addCriterion("HangYeLeiXingID <>", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidGreaterThan(Integer value) {
            addCriterion("HangYeLeiXingID >", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HangYeLeiXingID >=", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidLessThan(Integer value) {
            addCriterion("HangYeLeiXingID <", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidLessThanOrEqualTo(Integer value) {
            addCriterion("HangYeLeiXingID <=", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidIn(List<Integer> values) {
            addCriterion("HangYeLeiXingID in", values, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidNotIn(List<Integer> values) {
            addCriterion("HangYeLeiXingID not in", values, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidBetween(Integer value1, Integer value2) {
            addCriterion("HangYeLeiXingID between", value1, value2, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("HangYeLeiXingID not between", value1, value2, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengIsNull() {
            addCriterion("HangYeLeiXingMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengIsNotNull() {
            addCriterion("HangYeLeiXingMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengEqualTo(String value) {
            addCriterion("HangYeLeiXingMingCheng =", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengNotEqualTo(String value) {
            addCriterion("HangYeLeiXingMingCheng <>", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengGreaterThan(String value) {
            addCriterion("HangYeLeiXingMingCheng >", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("HangYeLeiXingMingCheng >=", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengLessThan(String value) {
            addCriterion("HangYeLeiXingMingCheng <", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengLessThanOrEqualTo(String value) {
            addCriterion("HangYeLeiXingMingCheng <=", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengLike(String value) {
            addCriterion("HangYeLeiXingMingCheng like", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengNotLike(String value) {
            addCriterion("HangYeLeiXingMingCheng not like", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengIn(List<String> values) {
            addCriterion("HangYeLeiXingMingCheng in", values, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengNotIn(List<String> values) {
            addCriterion("HangYeLeiXingMingCheng not in", values, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengBetween(String value1, String value2) {
            addCriterion("HangYeLeiXingMingCheng between", value1, value2, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengNotBetween(String value1, String value2) {
            addCriterion("HangYeLeiXingMingCheng not between", value1, value2, "hangyeleixingmingcheng");
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

        public Criteria andChanpinfenleiidIsNull() {
            addCriterion("ChanPinFenLeiID is null");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidIsNotNull() {
            addCriterion("ChanPinFenLeiID is not null");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidEqualTo(Integer value) {
            addCriterion("ChanPinFenLeiID =", value, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidNotEqualTo(Integer value) {
            addCriterion("ChanPinFenLeiID <>", value, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidGreaterThan(Integer value) {
            addCriterion("ChanPinFenLeiID >", value, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChanPinFenLeiID >=", value, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidLessThan(Integer value) {
            addCriterion("ChanPinFenLeiID <", value, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidLessThanOrEqualTo(Integer value) {
            addCriterion("ChanPinFenLeiID <=", value, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidIn(List<Integer> values) {
            addCriterion("ChanPinFenLeiID in", values, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidNotIn(List<Integer> values) {
            addCriterion("ChanPinFenLeiID not in", values, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidBetween(Integer value1, Integer value2) {
            addCriterion("ChanPinFenLeiID between", value1, value2, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleiidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChanPinFenLeiID not between", value1, value2, "chanpinfenleiid");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengIsNull() {
            addCriterion("ChanPinFenLeiMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengIsNotNull() {
            addCriterion("ChanPinFenLeiMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengEqualTo(String value) {
            addCriterion("ChanPinFenLeiMingCheng =", value, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengNotEqualTo(String value) {
            addCriterion("ChanPinFenLeiMingCheng <>", value, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengGreaterThan(String value) {
            addCriterion("ChanPinFenLeiMingCheng >", value, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ChanPinFenLeiMingCheng >=", value, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengLessThan(String value) {
            addCriterion("ChanPinFenLeiMingCheng <", value, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengLessThanOrEqualTo(String value) {
            addCriterion("ChanPinFenLeiMingCheng <=", value, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengLike(String value) {
            addCriterion("ChanPinFenLeiMingCheng like", value, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengNotLike(String value) {
            addCriterion("ChanPinFenLeiMingCheng not like", value, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengIn(List<String> values) {
            addCriterion("ChanPinFenLeiMingCheng in", values, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengNotIn(List<String> values) {
            addCriterion("ChanPinFenLeiMingCheng not in", values, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengBetween(String value1, String value2) {
            addCriterion("ChanPinFenLeiMingCheng between", value1, value2, "chanpinfenleimingcheng");
            return (Criteria) this;
        }

        public Criteria andChanpinfenleimingchengNotBetween(String value1, String value2) {
            addCriterion("ChanPinFenLeiMingCheng not between", value1, value2, "chanpinfenleimingcheng");
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

        public Criteria andChanpinpinpaiIsNull() {
            addCriterion("ChanPinPinPai is null");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiIsNotNull() {
            addCriterion("ChanPinPinPai is not null");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiEqualTo(String value) {
            addCriterion("ChanPinPinPai =", value, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiNotEqualTo(String value) {
            addCriterion("ChanPinPinPai <>", value, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiGreaterThan(String value) {
            addCriterion("ChanPinPinPai >", value, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiGreaterThanOrEqualTo(String value) {
            addCriterion("ChanPinPinPai >=", value, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiLessThan(String value) {
            addCriterion("ChanPinPinPai <", value, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiLessThanOrEqualTo(String value) {
            addCriterion("ChanPinPinPai <=", value, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiLike(String value) {
            addCriterion("ChanPinPinPai like", value, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiNotLike(String value) {
            addCriterion("ChanPinPinPai not like", value, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiIn(List<String> values) {
            addCriterion("ChanPinPinPai in", values, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiNotIn(List<String> values) {
            addCriterion("ChanPinPinPai not in", values, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiBetween(String value1, String value2) {
            addCriterion("ChanPinPinPai between", value1, value2, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinpinpaiNotBetween(String value1, String value2) {
            addCriterion("ChanPinPinPai not between", value1, value2, "chanpinpinpai");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoIsNull() {
            addCriterion("ChanPinXingHao is null");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoIsNotNull() {
            addCriterion("ChanPinXingHao is not null");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoEqualTo(String value) {
            addCriterion("ChanPinXingHao =", value, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoNotEqualTo(String value) {
            addCriterion("ChanPinXingHao <>", value, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoGreaterThan(String value) {
            addCriterion("ChanPinXingHao >", value, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoGreaterThanOrEqualTo(String value) {
            addCriterion("ChanPinXingHao >=", value, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoLessThan(String value) {
            addCriterion("ChanPinXingHao <", value, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoLessThanOrEqualTo(String value) {
            addCriterion("ChanPinXingHao <=", value, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoLike(String value) {
            addCriterion("ChanPinXingHao like", value, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoNotLike(String value) {
            addCriterion("ChanPinXingHao not like", value, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoIn(List<String> values) {
            addCriterion("ChanPinXingHao in", values, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoNotIn(List<String> values) {
            addCriterion("ChanPinXingHao not in", values, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoBetween(String value1, String value2) {
            addCriterion("ChanPinXingHao between", value1, value2, "chanpinxinghao");
            return (Criteria) this;
        }

        public Criteria andChanpinxinghaoNotBetween(String value1, String value2) {
            addCriterion("ChanPinXingHao not between", value1, value2, "chanpinxinghao");
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