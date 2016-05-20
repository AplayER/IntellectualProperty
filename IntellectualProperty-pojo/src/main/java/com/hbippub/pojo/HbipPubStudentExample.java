package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubStudentExample() {
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

        public Criteria andXueshengidIsNull() {
            addCriterion("XueShengID is null");
            return (Criteria) this;
        }

        public Criteria andXueshengidIsNotNull() {
            addCriterion("XueShengID is not null");
            return (Criteria) this;
        }

        public Criteria andXueshengidEqualTo(Integer value) {
            addCriterion("XueShengID =", value, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidNotEqualTo(Integer value) {
            addCriterion("XueShengID <>", value, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidGreaterThan(Integer value) {
            addCriterion("XueShengID >", value, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XueShengID >=", value, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidLessThan(Integer value) {
            addCriterion("XueShengID <", value, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidLessThanOrEqualTo(Integer value) {
            addCriterion("XueShengID <=", value, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidIn(List<Integer> values) {
            addCriterion("XueShengID in", values, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidNotIn(List<Integer> values) {
            addCriterion("XueShengID not in", values, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidBetween(Integer value1, Integer value2) {
            addCriterion("XueShengID between", value1, value2, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengidNotBetween(Integer value1, Integer value2) {
            addCriterion("XueShengID not between", value1, value2, "xueshengid");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingIsNull() {
            addCriterion("XueShengXingMing is null");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingIsNotNull() {
            addCriterion("XueShengXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingEqualTo(String value) {
            addCriterion("XueShengXingMing =", value, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingNotEqualTo(String value) {
            addCriterion("XueShengXingMing <>", value, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingGreaterThan(String value) {
            addCriterion("XueShengXingMing >", value, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("XueShengXingMing >=", value, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingLessThan(String value) {
            addCriterion("XueShengXingMing <", value, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingLessThanOrEqualTo(String value) {
            addCriterion("XueShengXingMing <=", value, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingLike(String value) {
            addCriterion("XueShengXingMing like", value, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingNotLike(String value) {
            addCriterion("XueShengXingMing not like", value, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingIn(List<String> values) {
            addCriterion("XueShengXingMing in", values, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingNotIn(List<String> values) {
            addCriterion("XueShengXingMing not in", values, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingBetween(String value1, String value2) {
            addCriterion("XueShengXingMing between", value1, value2, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengxingmingNotBetween(String value1, String value2) {
            addCriterion("XueShengXingMing not between", value1, value2, "xueshengxingming");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingIsNull() {
            addCriterion("XueShengNianLing is null");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingIsNotNull() {
            addCriterion("XueShengNianLing is not null");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingEqualTo(Integer value) {
            addCriterion("XueShengNianLing =", value, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingNotEqualTo(Integer value) {
            addCriterion("XueShengNianLing <>", value, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingGreaterThan(Integer value) {
            addCriterion("XueShengNianLing >", value, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingGreaterThanOrEqualTo(Integer value) {
            addCriterion("XueShengNianLing >=", value, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingLessThan(Integer value) {
            addCriterion("XueShengNianLing <", value, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingLessThanOrEqualTo(Integer value) {
            addCriterion("XueShengNianLing <=", value, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingIn(List<Integer> values) {
            addCriterion("XueShengNianLing in", values, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingNotIn(List<Integer> values) {
            addCriterion("XueShengNianLing not in", values, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingBetween(Integer value1, Integer value2) {
            addCriterion("XueShengNianLing between", value1, value2, "xueshengnianling");
            return (Criteria) this;
        }

        public Criteria andXueshengnianlingNotBetween(Integer value1, Integer value2) {
            addCriterion("XueShengNianLing not between", value1, value2, "xueshengnianling");
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