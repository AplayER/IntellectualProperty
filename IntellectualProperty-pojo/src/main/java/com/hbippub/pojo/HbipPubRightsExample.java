package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubRightsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubRightsExample() {
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

        public Criteria andQuanxianmingIsNull() {
            addCriterion("QuanXianMing is null");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingIsNotNull() {
            addCriterion("QuanXianMing is not null");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingEqualTo(String value) {
            addCriterion("QuanXianMing =", value, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingNotEqualTo(String value) {
            addCriterion("QuanXianMing <>", value, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingGreaterThan(String value) {
            addCriterion("QuanXianMing >", value, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingGreaterThanOrEqualTo(String value) {
            addCriterion("QuanXianMing >=", value, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingLessThan(String value) {
            addCriterion("QuanXianMing <", value, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingLessThanOrEqualTo(String value) {
            addCriterion("QuanXianMing <=", value, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingLike(String value) {
            addCriterion("QuanXianMing like", value, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingNotLike(String value) {
            addCriterion("QuanXianMing not like", value, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingIn(List<String> values) {
            addCriterion("QuanXianMing in", values, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingNotIn(List<String> values) {
            addCriterion("QuanXianMing not in", values, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingBetween(String value1, String value2) {
            addCriterion("QuanXianMing between", value1, value2, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmingNotBetween(String value1, String value2) {
            addCriterion("QuanXianMing not between", value1, value2, "quanxianming");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuIsNull() {
            addCriterion("QuanXianMiaoShu is null");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuIsNotNull() {
            addCriterion("QuanXianMiaoShu is not null");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuEqualTo(String value) {
            addCriterion("QuanXianMiaoShu =", value, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuNotEqualTo(String value) {
            addCriterion("QuanXianMiaoShu <>", value, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuGreaterThan(String value) {
            addCriterion("QuanXianMiaoShu >", value, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("QuanXianMiaoShu >=", value, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuLessThan(String value) {
            addCriterion("QuanXianMiaoShu <", value, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuLessThanOrEqualTo(String value) {
            addCriterion("QuanXianMiaoShu <=", value, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuLike(String value) {
            addCriterion("QuanXianMiaoShu like", value, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuNotLike(String value) {
            addCriterion("QuanXianMiaoShu not like", value, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuIn(List<String> values) {
            addCriterion("QuanXianMiaoShu in", values, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuNotIn(List<String> values) {
            addCriterion("QuanXianMiaoShu not in", values, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuBetween(String value1, String value2) {
            addCriterion("QuanXianMiaoShu between", value1, value2, "quanxianmiaoshu");
            return (Criteria) this;
        }

        public Criteria andQuanxianmiaoshuNotBetween(String value1, String value2) {
            addCriterion("QuanXianMiaoShu not between", value1, value2, "quanxianmiaoshu");
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