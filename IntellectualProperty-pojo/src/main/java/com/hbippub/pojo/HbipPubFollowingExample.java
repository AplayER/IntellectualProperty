package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubFollowingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubFollowingExample() {
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

        public Criteria andGuanzhuidIsNull() {
            addCriterion("GuanZhuID is null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidIsNotNull() {
            addCriterion("GuanZhuID is not null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidEqualTo(Integer value) {
            addCriterion("GuanZhuID =", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidNotEqualTo(Integer value) {
            addCriterion("GuanZhuID <>", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidGreaterThan(Integer value) {
            addCriterion("GuanZhuID >", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GuanZhuID >=", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidLessThan(Integer value) {
            addCriterion("GuanZhuID <", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidLessThanOrEqualTo(Integer value) {
            addCriterion("GuanZhuID <=", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidIn(List<Integer> values) {
            addCriterion("GuanZhuID in", values, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidNotIn(List<Integer> values) {
            addCriterion("GuanZhuID not in", values, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidBetween(Integer value1, Integer value2) {
            addCriterion("GuanZhuID between", value1, value2, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidNotBetween(Integer value1, Integer value2) {
            addCriterion("GuanZhuID not between", value1, value2, "guanzhuid");
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

        public Criteria andYonghuxingmingIsNull() {
            addCriterion("YongHuXingMing is null");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingIsNotNull() {
            addCriterion("YongHuXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingEqualTo(String value) {
            addCriterion("YongHuXingMing =", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingNotEqualTo(String value) {
            addCriterion("YongHuXingMing <>", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingGreaterThan(String value) {
            addCriterion("YongHuXingMing >", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("YongHuXingMing >=", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingLessThan(String value) {
            addCriterion("YongHuXingMing <", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingLessThanOrEqualTo(String value) {
            addCriterion("YongHuXingMing <=", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingLike(String value) {
            addCriterion("YongHuXingMing like", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingNotLike(String value) {
            addCriterion("YongHuXingMing not like", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingIn(List<String> values) {
            addCriterion("YongHuXingMing in", values, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingNotIn(List<String> values) {
            addCriterion("YongHuXingMing not in", values, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingBetween(String value1, String value2) {
            addCriterion("YongHuXingMing between", value1, value2, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingNotBetween(String value1, String value2) {
            addCriterion("YongHuXingMing not between", value1, value2, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidIsNull() {
            addCriterion("BeiGuanZhuYongHuID is null");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidIsNotNull() {
            addCriterion("BeiGuanZhuYongHuID is not null");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidEqualTo(Integer value) {
            addCriterion("BeiGuanZhuYongHuID =", value, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidNotEqualTo(Integer value) {
            addCriterion("BeiGuanZhuYongHuID <>", value, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidGreaterThan(Integer value) {
            addCriterion("BeiGuanZhuYongHuID >", value, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BeiGuanZhuYongHuID >=", value, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidLessThan(Integer value) {
            addCriterion("BeiGuanZhuYongHuID <", value, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidLessThanOrEqualTo(Integer value) {
            addCriterion("BeiGuanZhuYongHuID <=", value, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidIn(List<Integer> values) {
            addCriterion("BeiGuanZhuYongHuID in", values, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidNotIn(List<Integer> values) {
            addCriterion("BeiGuanZhuYongHuID not in", values, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidBetween(Integer value1, Integer value2) {
            addCriterion("BeiGuanZhuYongHuID between", value1, value2, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuidNotBetween(Integer value1, Integer value2) {
            addCriterion("BeiGuanZhuYongHuID not between", value1, value2, "beiguanzhuyonghuid");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingIsNull() {
            addCriterion("BeiGuanZhuYongHuXingMing is null");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingIsNotNull() {
            addCriterion("BeiGuanZhuYongHuXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingEqualTo(String value) {
            addCriterion("BeiGuanZhuYongHuXingMing =", value, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingNotEqualTo(String value) {
            addCriterion("BeiGuanZhuYongHuXingMing <>", value, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingGreaterThan(String value) {
            addCriterion("BeiGuanZhuYongHuXingMing >", value, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("BeiGuanZhuYongHuXingMing >=", value, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingLessThan(String value) {
            addCriterion("BeiGuanZhuYongHuXingMing <", value, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingLessThanOrEqualTo(String value) {
            addCriterion("BeiGuanZhuYongHuXingMing <=", value, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingLike(String value) {
            addCriterion("BeiGuanZhuYongHuXingMing like", value, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingNotLike(String value) {
            addCriterion("BeiGuanZhuYongHuXingMing not like", value, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingIn(List<String> values) {
            addCriterion("BeiGuanZhuYongHuXingMing in", values, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingNotIn(List<String> values) {
            addCriterion("BeiGuanZhuYongHuXingMing not in", values, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingBetween(String value1, String value2) {
            addCriterion("BeiGuanZhuYongHuXingMing between", value1, value2, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andBeiguanzhuyonghuxingmingNotBetween(String value1, String value2) {
            addCriterion("BeiGuanZhuYongHuXingMing not between", value1, value2, "beiguanzhuyonghuxingming");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianIsNull() {
            addCriterion("GuanZhuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianIsNotNull() {
            addCriterion("GuanZhuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianEqualTo(Date value) {
            addCriterion("GuanZhuShiJian =", value, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianNotEqualTo(Date value) {
            addCriterion("GuanZhuShiJian <>", value, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianGreaterThan(Date value) {
            addCriterion("GuanZhuShiJian >", value, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("GuanZhuShiJian >=", value, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianLessThan(Date value) {
            addCriterion("GuanZhuShiJian <", value, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianLessThanOrEqualTo(Date value) {
            addCriterion("GuanZhuShiJian <=", value, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianIn(List<Date> values) {
            addCriterion("GuanZhuShiJian in", values, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianNotIn(List<Date> values) {
            addCriterion("GuanZhuShiJian not in", values, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianBetween(Date value1, Date value2) {
            addCriterion("GuanZhuShiJian between", value1, value2, "guanzhushijian");
            return (Criteria) this;
        }

        public Criteria andGuanzhushijianNotBetween(Date value1, Date value2) {
            addCriterion("GuanZhuShiJian not between", value1, value2, "guanzhushijian");
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