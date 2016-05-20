package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubNewsSnatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubNewsSnatchExample() {
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

        public Criteria andXinwenidIsNull() {
            addCriterion("XinWenID is null");
            return (Criteria) this;
        }

        public Criteria andXinwenidIsNotNull() {
            addCriterion("XinWenID is not null");
            return (Criteria) this;
        }

        public Criteria andXinwenidEqualTo(Integer value) {
            addCriterion("XinWenID =", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotEqualTo(Integer value) {
            addCriterion("XinWenID <>", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidGreaterThan(Integer value) {
            addCriterion("XinWenID >", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XinWenID >=", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidLessThan(Integer value) {
            addCriterion("XinWenID <", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidLessThanOrEqualTo(Integer value) {
            addCriterion("XinWenID <=", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidIn(List<Integer> values) {
            addCriterion("XinWenID in", values, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotIn(List<Integer> values) {
            addCriterion("XinWenID not in", values, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidBetween(Integer value1, Integer value2) {
            addCriterion("XinWenID between", value1, value2, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotBetween(Integer value1, Integer value2) {
            addCriterion("XinWenID not between", value1, value2, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiIsNull() {
            addCriterion("XinWenBiaoTi is null");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiIsNotNull() {
            addCriterion("XinWenBiaoTi is not null");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiEqualTo(String value) {
            addCriterion("XinWenBiaoTi =", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiNotEqualTo(String value) {
            addCriterion("XinWenBiaoTi <>", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiGreaterThan(String value) {
            addCriterion("XinWenBiaoTi >", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("XinWenBiaoTi >=", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiLessThan(String value) {
            addCriterion("XinWenBiaoTi <", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiLessThanOrEqualTo(String value) {
            addCriterion("XinWenBiaoTi <=", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiLike(String value) {
            addCriterion("XinWenBiaoTi like", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiNotLike(String value) {
            addCriterion("XinWenBiaoTi not like", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiIn(List<String> values) {
            addCriterion("XinWenBiaoTi in", values, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiNotIn(List<String> values) {
            addCriterion("XinWenBiaoTi not in", values, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiBetween(String value1, String value2) {
            addCriterion("XinWenBiaoTi between", value1, value2, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiNotBetween(String value1, String value2) {
            addCriterion("XinWenBiaoTi not between", value1, value2, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenurlIsNull() {
            addCriterion("XinWenURL is null");
            return (Criteria) this;
        }

        public Criteria andXinwenurlIsNotNull() {
            addCriterion("XinWenURL is not null");
            return (Criteria) this;
        }

        public Criteria andXinwenurlEqualTo(String value) {
            addCriterion("XinWenURL =", value, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlNotEqualTo(String value) {
            addCriterion("XinWenURL <>", value, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlGreaterThan(String value) {
            addCriterion("XinWenURL >", value, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlGreaterThanOrEqualTo(String value) {
            addCriterion("XinWenURL >=", value, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlLessThan(String value) {
            addCriterion("XinWenURL <", value, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlLessThanOrEqualTo(String value) {
            addCriterion("XinWenURL <=", value, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlLike(String value) {
            addCriterion("XinWenURL like", value, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlNotLike(String value) {
            addCriterion("XinWenURL not like", value, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlIn(List<String> values) {
            addCriterion("XinWenURL in", values, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlNotIn(List<String> values) {
            addCriterion("XinWenURL not in", values, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlBetween(String value1, String value2) {
            addCriterion("XinWenURL between", value1, value2, "xinwenurl");
            return (Criteria) this;
        }

        public Criteria andXinwenurlNotBetween(String value1, String value2) {
            addCriterion("XinWenURL not between", value1, value2, "xinwenurl");
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