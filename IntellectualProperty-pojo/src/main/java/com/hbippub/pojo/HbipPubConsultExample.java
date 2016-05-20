package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubConsultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubConsultExample() {
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

        public Criteria andZixunidIsNull() {
            addCriterion("ZiXunID is null");
            return (Criteria) this;
        }

        public Criteria andZixunidIsNotNull() {
            addCriterion("ZiXunID is not null");
            return (Criteria) this;
        }

        public Criteria andZixunidEqualTo(Integer value) {
            addCriterion("ZiXunID =", value, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidNotEqualTo(Integer value) {
            addCriterion("ZiXunID <>", value, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidGreaterThan(Integer value) {
            addCriterion("ZiXunID >", value, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZiXunID >=", value, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidLessThan(Integer value) {
            addCriterion("ZiXunID <", value, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidLessThanOrEqualTo(Integer value) {
            addCriterion("ZiXunID <=", value, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidIn(List<Integer> values) {
            addCriterion("ZiXunID in", values, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidNotIn(List<Integer> values) {
            addCriterion("ZiXunID not in", values, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidBetween(Integer value1, Integer value2) {
            addCriterion("ZiXunID between", value1, value2, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZiXunID not between", value1, value2, "zixunid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidIsNull() {
            addCriterion("ZiXunZheID is null");
            return (Criteria) this;
        }

        public Criteria andZixunzheidIsNotNull() {
            addCriterion("ZiXunZheID is not null");
            return (Criteria) this;
        }

        public Criteria andZixunzheidEqualTo(Integer value) {
            addCriterion("ZiXunZheID =", value, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidNotEqualTo(Integer value) {
            addCriterion("ZiXunZheID <>", value, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidGreaterThan(Integer value) {
            addCriterion("ZiXunZheID >", value, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZiXunZheID >=", value, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidLessThan(Integer value) {
            addCriterion("ZiXunZheID <", value, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidLessThanOrEqualTo(Integer value) {
            addCriterion("ZiXunZheID <=", value, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidIn(List<Integer> values) {
            addCriterion("ZiXunZheID in", values, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidNotIn(List<Integer> values) {
            addCriterion("ZiXunZheID not in", values, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidBetween(Integer value1, Integer value2) {
            addCriterion("ZiXunZheID between", value1, value2, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzheidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZiXunZheID not between", value1, value2, "zixunzheid");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingIsNull() {
            addCriterion("ZiXunZheXingMing is null");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingIsNotNull() {
            addCriterion("ZiXunZheXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingEqualTo(String value) {
            addCriterion("ZiXunZheXingMing =", value, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingNotEqualTo(String value) {
            addCriterion("ZiXunZheXingMing <>", value, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingGreaterThan(String value) {
            addCriterion("ZiXunZheXingMing >", value, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ZiXunZheXingMing >=", value, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingLessThan(String value) {
            addCriterion("ZiXunZheXingMing <", value, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingLessThanOrEqualTo(String value) {
            addCriterion("ZiXunZheXingMing <=", value, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingLike(String value) {
            addCriterion("ZiXunZheXingMing like", value, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingNotLike(String value) {
            addCriterion("ZiXunZheXingMing not like", value, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingIn(List<String> values) {
            addCriterion("ZiXunZheXingMing in", values, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingNotIn(List<String> values) {
            addCriterion("ZiXunZheXingMing not in", values, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingBetween(String value1, String value2) {
            addCriterion("ZiXunZheXingMing between", value1, value2, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunzhexingmingNotBetween(String value1, String value2) {
            addCriterion("ZiXunZheXingMing not between", value1, value2, "zixunzhexingming");
            return (Criteria) this;
        }

        public Criteria andZixunshijianIsNull() {
            addCriterion("ZiXunShiJian is null");
            return (Criteria) this;
        }

        public Criteria andZixunshijianIsNotNull() {
            addCriterion("ZiXunShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andZixunshijianEqualTo(Date value) {
            addCriterion("ZiXunShiJian =", value, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianNotEqualTo(Date value) {
            addCriterion("ZiXunShiJian <>", value, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianGreaterThan(Date value) {
            addCriterion("ZiXunShiJian >", value, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZiXunShiJian >=", value, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianLessThan(Date value) {
            addCriterion("ZiXunShiJian <", value, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianLessThanOrEqualTo(Date value) {
            addCriterion("ZiXunShiJian <=", value, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianIn(List<Date> values) {
            addCriterion("ZiXunShiJian in", values, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianNotIn(List<Date> values) {
            addCriterion("ZiXunShiJian not in", values, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianBetween(Date value1, Date value2) {
            addCriterion("ZiXunShiJian between", value1, value2, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andZixunshijianNotBetween(Date value1, Date value2) {
            addCriterion("ZiXunShiJian not between", value1, value2, "zixunshijian");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidIsNull() {
            addCriterion("HuiFuZheID is null");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidIsNotNull() {
            addCriterion("HuiFuZheID is not null");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidEqualTo(Integer value) {
            addCriterion("HuiFuZheID =", value, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidNotEqualTo(Integer value) {
            addCriterion("HuiFuZheID <>", value, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidGreaterThan(Integer value) {
            addCriterion("HuiFuZheID >", value, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HuiFuZheID >=", value, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidLessThan(Integer value) {
            addCriterion("HuiFuZheID <", value, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidLessThanOrEqualTo(Integer value) {
            addCriterion("HuiFuZheID <=", value, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidIn(List<Integer> values) {
            addCriterion("HuiFuZheID in", values, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidNotIn(List<Integer> values) {
            addCriterion("HuiFuZheID not in", values, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidBetween(Integer value1, Integer value2) {
            addCriterion("HuiFuZheID between", value1, value2, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzheidNotBetween(Integer value1, Integer value2) {
            addCriterion("HuiFuZheID not between", value1, value2, "huifuzheid");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingIsNull() {
            addCriterion("HuiFuZheXingMing is null");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingIsNotNull() {
            addCriterion("HuiFuZheXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingEqualTo(String value) {
            addCriterion("HuiFuZheXingMing =", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingNotEqualTo(String value) {
            addCriterion("HuiFuZheXingMing <>", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingGreaterThan(String value) {
            addCriterion("HuiFuZheXingMing >", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingGreaterThanOrEqualTo(String value) {
            addCriterion("HuiFuZheXingMing >=", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingLessThan(String value) {
            addCriterion("HuiFuZheXingMing <", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingLessThanOrEqualTo(String value) {
            addCriterion("HuiFuZheXingMing <=", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingLike(String value) {
            addCriterion("HuiFuZheXingMing like", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingNotLike(String value) {
            addCriterion("HuiFuZheXingMing not like", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingIn(List<String> values) {
            addCriterion("HuiFuZheXingMing in", values, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingNotIn(List<String> values) {
            addCriterion("HuiFuZheXingMing not in", values, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingBetween(String value1, String value2) {
            addCriterion("HuiFuZheXingMing between", value1, value2, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingNotBetween(String value1, String value2) {
            addCriterion("HuiFuZheXingMing not between", value1, value2, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifushijianIsNull() {
            addCriterion("HuiFuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andHuifushijianIsNotNull() {
            addCriterion("HuiFuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andHuifushijianEqualTo(Date value) {
            addCriterion("HuiFuShiJian =", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianNotEqualTo(Date value) {
            addCriterion("HuiFuShiJian <>", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianGreaterThan(Date value) {
            addCriterion("HuiFuShiJian >", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("HuiFuShiJian >=", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianLessThan(Date value) {
            addCriterion("HuiFuShiJian <", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianLessThanOrEqualTo(Date value) {
            addCriterion("HuiFuShiJian <=", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianIn(List<Date> values) {
            addCriterion("HuiFuShiJian in", values, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianNotIn(List<Date> values) {
            addCriterion("HuiFuShiJian not in", values, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianBetween(Date value1, Date value2) {
            addCriterion("HuiFuShiJian between", value1, value2, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianNotBetween(Date value1, Date value2) {
            addCriterion("HuiFuShiJian not between", value1, value2, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andShifouyiduIsNull() {
            addCriterion("ShiFouYiDu is null");
            return (Criteria) this;
        }

        public Criteria andShifouyiduIsNotNull() {
            addCriterion("ShiFouYiDu is not null");
            return (Criteria) this;
        }

        public Criteria andShifouyiduEqualTo(Integer value) {
            addCriterion("ShiFouYiDu =", value, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduNotEqualTo(Integer value) {
            addCriterion("ShiFouYiDu <>", value, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduGreaterThan(Integer value) {
            addCriterion("ShiFouYiDu >", value, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYiDu >=", value, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduLessThan(Integer value) {
            addCriterion("ShiFouYiDu <", value, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYiDu <=", value, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduIn(List<Integer> values) {
            addCriterion("ShiFouYiDu in", values, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduNotIn(List<Integer> values) {
            addCriterion("ShiFouYiDu not in", values, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYiDu between", value1, value2, "shifouyidu");
            return (Criteria) this;
        }

        public Criteria andShifouyiduNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYiDu not between", value1, value2, "shifouyidu");
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