package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubCompanyPropertyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubCompanyPropertyExample() {
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

        public Criteria andDanweixingzhiidIsNull() {
            addCriterion("DanWeiXingZhiID is null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidIsNotNull() {
            addCriterion("DanWeiXingZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidEqualTo(Integer value) {
            addCriterion("DanWeiXingZhiID =", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidNotEqualTo(Integer value) {
            addCriterion("DanWeiXingZhiID <>", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidGreaterThan(Integer value) {
            addCriterion("DanWeiXingZhiID >", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DanWeiXingZhiID >=", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidLessThan(Integer value) {
            addCriterion("DanWeiXingZhiID <", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidLessThanOrEqualTo(Integer value) {
            addCriterion("DanWeiXingZhiID <=", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidIn(List<Integer> values) {
            addCriterion("DanWeiXingZhiID in", values, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidNotIn(List<Integer> values) {
            addCriterion("DanWeiXingZhiID not in", values, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidBetween(Integer value1, Integer value2) {
            addCriterion("DanWeiXingZhiID between", value1, value2, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("DanWeiXingZhiID not between", value1, value2, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIsNull() {
            addCriterion("DanWeiXingZhi is null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIsNotNull() {
            addCriterion("DanWeiXingZhi is not null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiEqualTo(String value) {
            addCriterion("DanWeiXingZhi =", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotEqualTo(String value) {
            addCriterion("DanWeiXingZhi <>", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiGreaterThan(String value) {
            addCriterion("DanWeiXingZhi >", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("DanWeiXingZhi >=", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLessThan(String value) {
            addCriterion("DanWeiXingZhi <", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLessThanOrEqualTo(String value) {
            addCriterion("DanWeiXingZhi <=", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLike(String value) {
            addCriterion("DanWeiXingZhi like", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotLike(String value) {
            addCriterion("DanWeiXingZhi not like", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIn(List<String> values) {
            addCriterion("DanWeiXingZhi in", values, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotIn(List<String> values) {
            addCriterion("DanWeiXingZhi not in", values, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiBetween(String value1, String value2) {
            addCriterion("DanWeiXingZhi between", value1, value2, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotBetween(String value1, String value2) {
            addCriterion("DanWeiXingZhi not between", value1, value2, "danweixingzhi");
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