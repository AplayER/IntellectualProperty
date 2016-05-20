package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubMailContactGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubMailContactGroupExample() {
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

        public Criteria andFenzuidIsNull() {
            addCriterion("FenZuID is null");
            return (Criteria) this;
        }

        public Criteria andFenzuidIsNotNull() {
            addCriterion("FenZuID is not null");
            return (Criteria) this;
        }

        public Criteria andFenzuidEqualTo(Integer value) {
            addCriterion("FenZuID =", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidNotEqualTo(Integer value) {
            addCriterion("FenZuID <>", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidGreaterThan(Integer value) {
            addCriterion("FenZuID >", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FenZuID >=", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidLessThan(Integer value) {
            addCriterion("FenZuID <", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidLessThanOrEqualTo(Integer value) {
            addCriterion("FenZuID <=", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidIn(List<Integer> values) {
            addCriterion("FenZuID in", values, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidNotIn(List<Integer> values) {
            addCriterion("FenZuID not in", values, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidBetween(Integer value1, Integer value2) {
            addCriterion("FenZuID between", value1, value2, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidNotBetween(Integer value1, Integer value2) {
            addCriterion("FenZuID not between", value1, value2, "fenzuid");
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

        public Criteria andFenzumingchengIsNull() {
            addCriterion("FenZuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengIsNotNull() {
            addCriterion("FenZuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengEqualTo(String value) {
            addCriterion("FenZuMingCheng =", value, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengNotEqualTo(String value) {
            addCriterion("FenZuMingCheng <>", value, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengGreaterThan(String value) {
            addCriterion("FenZuMingCheng >", value, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("FenZuMingCheng >=", value, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengLessThan(String value) {
            addCriterion("FenZuMingCheng <", value, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengLessThanOrEqualTo(String value) {
            addCriterion("FenZuMingCheng <=", value, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengLike(String value) {
            addCriterion("FenZuMingCheng like", value, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengNotLike(String value) {
            addCriterion("FenZuMingCheng not like", value, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengIn(List<String> values) {
            addCriterion("FenZuMingCheng in", values, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengNotIn(List<String> values) {
            addCriterion("FenZuMingCheng not in", values, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengBetween(String value1, String value2) {
            addCriterion("FenZuMingCheng between", value1, value2, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andFenzumingchengNotBetween(String value1, String value2) {
            addCriterion("FenZuMingCheng not between", value1, value2, "fenzumingcheng");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIsNull() {
            addCriterion("ShiFouShanChu is null");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIsNotNull() {
            addCriterion("ShiFouShanChu is not null");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuEqualTo(Integer value) {
            addCriterion("ShiFouShanChu =", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotEqualTo(Integer value) {
            addCriterion("ShiFouShanChu <>", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuGreaterThan(Integer value) {
            addCriterion("ShiFouShanChu >", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouShanChu >=", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuLessThan(Integer value) {
            addCriterion("ShiFouShanChu <", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouShanChu <=", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIn(List<Integer> values) {
            addCriterion("ShiFouShanChu in", values, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotIn(List<Integer> values) {
            addCriterion("ShiFouShanChu not in", values, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouShanChu between", value1, value2, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouShanChu not between", value1, value2, "shifoushanchu");
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