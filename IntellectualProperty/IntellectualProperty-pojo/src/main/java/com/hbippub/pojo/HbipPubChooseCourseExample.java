package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubChooseCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubChooseCourseExample() {
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

        public Criteria andKechengidIsNull() {
            addCriterion("KeChengID is null");
            return (Criteria) this;
        }

        public Criteria andKechengidIsNotNull() {
            addCriterion("KeChengID is not null");
            return (Criteria) this;
        }

        public Criteria andKechengidEqualTo(Integer value) {
            addCriterion("KeChengID =", value, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidNotEqualTo(Integer value) {
            addCriterion("KeChengID <>", value, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidGreaterThan(Integer value) {
            addCriterion("KeChengID >", value, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidGreaterThanOrEqualTo(Integer value) {
            addCriterion("KeChengID >=", value, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidLessThan(Integer value) {
            addCriterion("KeChengID <", value, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidLessThanOrEqualTo(Integer value) {
            addCriterion("KeChengID <=", value, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidIn(List<Integer> values) {
            addCriterion("KeChengID in", values, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidNotIn(List<Integer> values) {
            addCriterion("KeChengID not in", values, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidBetween(Integer value1, Integer value2) {
            addCriterion("KeChengID between", value1, value2, "kechengid");
            return (Criteria) this;
        }

        public Criteria andKechengidNotBetween(Integer value1, Integer value2) {
            addCriterion("KeChengID not between", value1, value2, "kechengid");
            return (Criteria) this;
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