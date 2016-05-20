package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubReptileKeywordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubReptileKeywordExample() {
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

        public Criteria andGuanjianciidIsNull() {
            addCriterion("GuanJianCiID is null");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidIsNotNull() {
            addCriterion("GuanJianCiID is not null");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidEqualTo(Integer value) {
            addCriterion("GuanJianCiID =", value, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidNotEqualTo(Integer value) {
            addCriterion("GuanJianCiID <>", value, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidGreaterThan(Integer value) {
            addCriterion("GuanJianCiID >", value, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GuanJianCiID >=", value, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidLessThan(Integer value) {
            addCriterion("GuanJianCiID <", value, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidLessThanOrEqualTo(Integer value) {
            addCriterion("GuanJianCiID <=", value, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidIn(List<Integer> values) {
            addCriterion("GuanJianCiID in", values, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidNotIn(List<Integer> values) {
            addCriterion("GuanJianCiID not in", values, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidBetween(Integer value1, Integer value2) {
            addCriterion("GuanJianCiID between", value1, value2, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciidNotBetween(Integer value1, Integer value2) {
            addCriterion("GuanJianCiID not between", value1, value2, "guanjianciid");
            return (Criteria) this;
        }

        public Criteria andGuanjianciIsNull() {
            addCriterion("GuanJianCi is null");
            return (Criteria) this;
        }

        public Criteria andGuanjianciIsNotNull() {
            addCriterion("GuanJianCi is not null");
            return (Criteria) this;
        }

        public Criteria andGuanjianciEqualTo(String value) {
            addCriterion("GuanJianCi =", value, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciNotEqualTo(String value) {
            addCriterion("GuanJianCi <>", value, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciGreaterThan(String value) {
            addCriterion("GuanJianCi >", value, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciGreaterThanOrEqualTo(String value) {
            addCriterion("GuanJianCi >=", value, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciLessThan(String value) {
            addCriterion("GuanJianCi <", value, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciLessThanOrEqualTo(String value) {
            addCriterion("GuanJianCi <=", value, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciLike(String value) {
            addCriterion("GuanJianCi like", value, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciNotLike(String value) {
            addCriterion("GuanJianCi not like", value, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciIn(List<String> values) {
            addCriterion("GuanJianCi in", values, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciNotIn(List<String> values) {
            addCriterion("GuanJianCi not in", values, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciBetween(String value1, String value2) {
            addCriterion("GuanJianCi between", value1, value2, "guanjianci");
            return (Criteria) this;
        }

        public Criteria andGuanjianciNotBetween(String value1, String value2) {
            addCriterion("GuanJianCi not between", value1, value2, "guanjianci");
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