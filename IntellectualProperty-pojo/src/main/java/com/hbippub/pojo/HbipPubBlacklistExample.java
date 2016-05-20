package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubBlacklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubBlacklistExample() {
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

        public Criteria andJiluidIsNull() {
            addCriterion("JiLuID is null");
            return (Criteria) this;
        }

        public Criteria andJiluidIsNotNull() {
            addCriterion("JiLuID is not null");
            return (Criteria) this;
        }

        public Criteria andJiluidEqualTo(Integer value) {
            addCriterion("JiLuID =", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotEqualTo(Integer value) {
            addCriterion("JiLuID <>", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidGreaterThan(Integer value) {
            addCriterion("JiLuID >", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiLuID >=", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidLessThan(Integer value) {
            addCriterion("JiLuID <", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidLessThanOrEqualTo(Integer value) {
            addCriterion("JiLuID <=", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidIn(List<Integer> values) {
            addCriterion("JiLuID in", values, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotIn(List<Integer> values) {
            addCriterion("JiLuID not in", values, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidBetween(Integer value1, Integer value2) {
            addCriterion("JiLuID between", value1, value2, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotBetween(Integer value1, Integer value2) {
            addCriterion("JiLuID not between", value1, value2, "jiluid");
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

        public Criteria andXingmingIsNull() {
            addCriterion("XingMing is null");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNotNull() {
            addCriterion("XingMing is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingEqualTo(String value) {
            addCriterion("XingMing =", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotEqualTo(String value) {
            addCriterion("XingMing <>", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThan(String value) {
            addCriterion("XingMing >", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThanOrEqualTo(String value) {
            addCriterion("XingMing >=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThan(String value) {
            addCriterion("XingMing <", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThanOrEqualTo(String value) {
            addCriterion("XingMing <=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLike(String value) {
            addCriterion("XingMing like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotLike(String value) {
            addCriterion("XingMing not like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingIn(List<String> values) {
            addCriterion("XingMing in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotIn(List<String> values) {
            addCriterion("XingMing not in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingBetween(String value1, String value2) {
            addCriterion("XingMing between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotBetween(String value1, String value2) {
            addCriterion("XingMing not between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andBiaojiIsNull() {
            addCriterion("BiaoJi is null");
            return (Criteria) this;
        }

        public Criteria andBiaojiIsNotNull() {
            addCriterion("BiaoJi is not null");
            return (Criteria) this;
        }

        public Criteria andBiaojiEqualTo(Integer value) {
            addCriterion("BiaoJi =", value, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiNotEqualTo(Integer value) {
            addCriterion("BiaoJi <>", value, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiGreaterThan(Integer value) {
            addCriterion("BiaoJi >", value, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiGreaterThanOrEqualTo(Integer value) {
            addCriterion("BiaoJi >=", value, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiLessThan(Integer value) {
            addCriterion("BiaoJi <", value, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiLessThanOrEqualTo(Integer value) {
            addCriterion("BiaoJi <=", value, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiIn(List<Integer> values) {
            addCriterion("BiaoJi in", values, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiNotIn(List<Integer> values) {
            addCriterion("BiaoJi not in", values, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiBetween(Integer value1, Integer value2) {
            addCriterion("BiaoJi between", value1, value2, "biaoji");
            return (Criteria) this;
        }

        public Criteria andBiaojiNotBetween(Integer value1, Integer value2) {
            addCriterion("BiaoJi not between", value1, value2, "biaoji");
            return (Criteria) this;
        }

        public Criteria andChulirenidIsNull() {
            addCriterion("ChuLiRenID is null");
            return (Criteria) this;
        }

        public Criteria andChulirenidIsNotNull() {
            addCriterion("ChuLiRenID is not null");
            return (Criteria) this;
        }

        public Criteria andChulirenidEqualTo(Integer value) {
            addCriterion("ChuLiRenID =", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidNotEqualTo(Integer value) {
            addCriterion("ChuLiRenID <>", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidGreaterThan(Integer value) {
            addCriterion("ChuLiRenID >", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChuLiRenID >=", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidLessThan(Integer value) {
            addCriterion("ChuLiRenID <", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidLessThanOrEqualTo(Integer value) {
            addCriterion("ChuLiRenID <=", value, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidIn(List<Integer> values) {
            addCriterion("ChuLiRenID in", values, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidNotIn(List<Integer> values) {
            addCriterion("ChuLiRenID not in", values, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidBetween(Integer value1, Integer value2) {
            addCriterion("ChuLiRenID between", value1, value2, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andChulirenidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChuLiRenID not between", value1, value2, "chulirenid");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouIsNull() {
            addCriterion("JiaRuLiYou is null");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouIsNotNull() {
            addCriterion("JiaRuLiYou is not null");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouEqualTo(String value) {
            addCriterion("JiaRuLiYou =", value, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouNotEqualTo(String value) {
            addCriterion("JiaRuLiYou <>", value, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouGreaterThan(String value) {
            addCriterion("JiaRuLiYou >", value, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouGreaterThanOrEqualTo(String value) {
            addCriterion("JiaRuLiYou >=", value, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouLessThan(String value) {
            addCriterion("JiaRuLiYou <", value, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouLessThanOrEqualTo(String value) {
            addCriterion("JiaRuLiYou <=", value, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouLike(String value) {
            addCriterion("JiaRuLiYou like", value, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouNotLike(String value) {
            addCriterion("JiaRuLiYou not like", value, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouIn(List<String> values) {
            addCriterion("JiaRuLiYou in", values, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouNotIn(List<String> values) {
            addCriterion("JiaRuLiYou not in", values, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouBetween(String value1, String value2) {
            addCriterion("JiaRuLiYou between", value1, value2, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiaruliyouNotBetween(String value1, String value2) {
            addCriterion("JiaRuLiYou not between", value1, value2, "jiaruliyou");
            return (Criteria) this;
        }

        public Criteria andJiarushijianIsNull() {
            addCriterion("JiaRuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andJiarushijianIsNotNull() {
            addCriterion("JiaRuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andJiarushijianEqualTo(Date value) {
            addCriterion("JiaRuShiJian =", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianNotEqualTo(Date value) {
            addCriterion("JiaRuShiJian <>", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianGreaterThan(Date value) {
            addCriterion("JiaRuShiJian >", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("JiaRuShiJian >=", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianLessThan(Date value) {
            addCriterion("JiaRuShiJian <", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianLessThanOrEqualTo(Date value) {
            addCriterion("JiaRuShiJian <=", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianIn(List<Date> values) {
            addCriterion("JiaRuShiJian in", values, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianNotIn(List<Date> values) {
            addCriterion("JiaRuShiJian not in", values, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianBetween(Date value1, Date value2) {
            addCriterion("JiaRuShiJian between", value1, value2, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianNotBetween(Date value1, Date value2) {
            addCriterion("JiaRuShiJian not between", value1, value2, "jiarushijian");
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