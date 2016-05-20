package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubEduBackgroundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubEduBackgroundExample() {
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

        public Criteria andXueliidIsNull() {
            addCriterion("XueLiID is null");
            return (Criteria) this;
        }

        public Criteria andXueliidIsNotNull() {
            addCriterion("XueLiID is not null");
            return (Criteria) this;
        }

        public Criteria andXueliidEqualTo(Integer value) {
            addCriterion("XueLiID =", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotEqualTo(Integer value) {
            addCriterion("XueLiID <>", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidGreaterThan(Integer value) {
            addCriterion("XueLiID >", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XueLiID >=", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidLessThan(Integer value) {
            addCriterion("XueLiID <", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidLessThanOrEqualTo(Integer value) {
            addCriterion("XueLiID <=", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidIn(List<Integer> values) {
            addCriterion("XueLiID in", values, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotIn(List<Integer> values) {
            addCriterion("XueLiID not in", values, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidBetween(Integer value1, Integer value2) {
            addCriterion("XueLiID between", value1, value2, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotBetween(Integer value1, Integer value2) {
            addCriterion("XueLiID not between", value1, value2, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengIsNull() {
            addCriterion("XueLiMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengIsNotNull() {
            addCriterion("XueLiMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengEqualTo(String value) {
            addCriterion("XueLiMingCheng =", value, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengNotEqualTo(String value) {
            addCriterion("XueLiMingCheng <>", value, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengGreaterThan(String value) {
            addCriterion("XueLiMingCheng >", value, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("XueLiMingCheng >=", value, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengLessThan(String value) {
            addCriterion("XueLiMingCheng <", value, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengLessThanOrEqualTo(String value) {
            addCriterion("XueLiMingCheng <=", value, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengLike(String value) {
            addCriterion("XueLiMingCheng like", value, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengNotLike(String value) {
            addCriterion("XueLiMingCheng not like", value, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengIn(List<String> values) {
            addCriterion("XueLiMingCheng in", values, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengNotIn(List<String> values) {
            addCriterion("XueLiMingCheng not in", values, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengBetween(String value1, String value2) {
            addCriterion("XueLiMingCheng between", value1, value2, "xuelimingcheng");
            return (Criteria) this;
        }

        public Criteria andXuelimingchengNotBetween(String value1, String value2) {
            addCriterion("XueLiMingCheng not between", value1, value2, "xuelimingcheng");
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