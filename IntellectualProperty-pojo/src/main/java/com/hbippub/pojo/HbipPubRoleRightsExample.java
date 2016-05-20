package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubRoleRightsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubRoleRightsExample() {
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

        public Criteria andQuanxianidIsNull() {
            addCriterion("QuanXianID is null");
            return (Criteria) this;
        }

        public Criteria andQuanxianidIsNotNull() {
            addCriterion("QuanXianID is not null");
            return (Criteria) this;
        }

        public Criteria andQuanxianidEqualTo(Integer value) {
            addCriterion("QuanXianID =", value, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidNotEqualTo(Integer value) {
            addCriterion("QuanXianID <>", value, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidGreaterThan(Integer value) {
            addCriterion("QuanXianID >", value, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QuanXianID >=", value, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidLessThan(Integer value) {
            addCriterion("QuanXianID <", value, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidLessThanOrEqualTo(Integer value) {
            addCriterion("QuanXianID <=", value, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidIn(List<Integer> values) {
            addCriterion("QuanXianID in", values, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidNotIn(List<Integer> values) {
            addCriterion("QuanXianID not in", values, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidBetween(Integer value1, Integer value2) {
            addCriterion("QuanXianID between", value1, value2, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andQuanxianidNotBetween(Integer value1, Integer value2) {
            addCriterion("QuanXianID not between", value1, value2, "quanxianid");
            return (Criteria) this;
        }

        public Criteria andJueseidIsNull() {
            addCriterion("JueSeID is null");
            return (Criteria) this;
        }

        public Criteria andJueseidIsNotNull() {
            addCriterion("JueSeID is not null");
            return (Criteria) this;
        }

        public Criteria andJueseidEqualTo(Integer value) {
            addCriterion("JueSeID =", value, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidNotEqualTo(Integer value) {
            addCriterion("JueSeID <>", value, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidGreaterThan(Integer value) {
            addCriterion("JueSeID >", value, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JueSeID >=", value, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidLessThan(Integer value) {
            addCriterion("JueSeID <", value, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidLessThanOrEqualTo(Integer value) {
            addCriterion("JueSeID <=", value, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidIn(List<Integer> values) {
            addCriterion("JueSeID in", values, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidNotIn(List<Integer> values) {
            addCriterion("JueSeID not in", values, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidBetween(Integer value1, Integer value2) {
            addCriterion("JueSeID between", value1, value2, "jueseid");
            return (Criteria) this;
        }

        public Criteria andJueseidNotBetween(Integer value1, Integer value2) {
            addCriterion("JueSeID not between", value1, value2, "jueseid");
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