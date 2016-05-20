package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubSalaryExample() {
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

        public Criteria andYuexinidIsNull() {
            addCriterion("YueXinID is null");
            return (Criteria) this;
        }

        public Criteria andYuexinidIsNotNull() {
            addCriterion("YueXinID is not null");
            return (Criteria) this;
        }

        public Criteria andYuexinidEqualTo(Integer value) {
            addCriterion("YueXinID =", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidNotEqualTo(Integer value) {
            addCriterion("YueXinID <>", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidGreaterThan(Integer value) {
            addCriterion("YueXinID >", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YueXinID >=", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidLessThan(Integer value) {
            addCriterion("YueXinID <", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidLessThanOrEqualTo(Integer value) {
            addCriterion("YueXinID <=", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidIn(List<Integer> values) {
            addCriterion("YueXinID in", values, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidNotIn(List<Integer> values) {
            addCriterion("YueXinID not in", values, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidBetween(Integer value1, Integer value2) {
            addCriterion("YueXinID between", value1, value2, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidNotBetween(Integer value1, Integer value2) {
            addCriterion("YueXinID not between", value1, value2, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinIsNull() {
            addCriterion("YueXin is null");
            return (Criteria) this;
        }

        public Criteria andYuexinIsNotNull() {
            addCriterion("YueXin is not null");
            return (Criteria) this;
        }

        public Criteria andYuexinEqualTo(String value) {
            addCriterion("YueXin =", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinNotEqualTo(String value) {
            addCriterion("YueXin <>", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinGreaterThan(String value) {
            addCriterion("YueXin >", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinGreaterThanOrEqualTo(String value) {
            addCriterion("YueXin >=", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinLessThan(String value) {
            addCriterion("YueXin <", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinLessThanOrEqualTo(String value) {
            addCriterion("YueXin <=", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinLike(String value) {
            addCriterion("YueXin like", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinNotLike(String value) {
            addCriterion("YueXin not like", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinIn(List<String> values) {
            addCriterion("YueXin in", values, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinNotIn(List<String> values) {
            addCriterion("YueXin not in", values, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinBetween(String value1, String value2) {
            addCriterion("YueXin between", value1, value2, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinNotBetween(String value1, String value2) {
            addCriterion("YueXin not between", value1, value2, "yuexin");
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