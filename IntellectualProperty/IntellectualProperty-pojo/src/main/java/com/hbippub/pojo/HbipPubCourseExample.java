package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubCourseExample() {
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

        public Criteria andKechengmingIsNull() {
            addCriterion("KeChengMing is null");
            return (Criteria) this;
        }

        public Criteria andKechengmingIsNotNull() {
            addCriterion("KeChengMing is not null");
            return (Criteria) this;
        }

        public Criteria andKechengmingEqualTo(String value) {
            addCriterion("KeChengMing =", value, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingNotEqualTo(String value) {
            addCriterion("KeChengMing <>", value, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingGreaterThan(String value) {
            addCriterion("KeChengMing >", value, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingGreaterThanOrEqualTo(String value) {
            addCriterion("KeChengMing >=", value, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingLessThan(String value) {
            addCriterion("KeChengMing <", value, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingLessThanOrEqualTo(String value) {
            addCriterion("KeChengMing <=", value, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingLike(String value) {
            addCriterion("KeChengMing like", value, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingNotLike(String value) {
            addCriterion("KeChengMing not like", value, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingIn(List<String> values) {
            addCriterion("KeChengMing in", values, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingNotIn(List<String> values) {
            addCriterion("KeChengMing not in", values, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingBetween(String value1, String value2) {
            addCriterion("KeChengMing between", value1, value2, "kechengming");
            return (Criteria) this;
        }

        public Criteria andKechengmingNotBetween(String value1, String value2) {
            addCriterion("KeChengMing not between", value1, value2, "kechengming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingIsNull() {
            addCriterion("JiaoShiXingMing is null");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingIsNotNull() {
            addCriterion("JiaoShiXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingEqualTo(String value) {
            addCriterion("JiaoShiXingMing =", value, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingNotEqualTo(String value) {
            addCriterion("JiaoShiXingMing <>", value, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingGreaterThan(String value) {
            addCriterion("JiaoShiXingMing >", value, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingGreaterThanOrEqualTo(String value) {
            addCriterion("JiaoShiXingMing >=", value, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingLessThan(String value) {
            addCriterion("JiaoShiXingMing <", value, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingLessThanOrEqualTo(String value) {
            addCriterion("JiaoShiXingMing <=", value, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingLike(String value) {
            addCriterion("JiaoShiXingMing like", value, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingNotLike(String value) {
            addCriterion("JiaoShiXingMing not like", value, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingIn(List<String> values) {
            addCriterion("JiaoShiXingMing in", values, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingNotIn(List<String> values) {
            addCriterion("JiaoShiXingMing not in", values, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingBetween(String value1, String value2) {
            addCriterion("JiaoShiXingMing between", value1, value2, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andJiaoshixingmingNotBetween(String value1, String value2) {
            addCriterion("JiaoShiXingMing not between", value1, value2, "jiaoshixingming");
            return (Criteria) this;
        }

        public Criteria andXuefenIsNull() {
            addCriterion("XueFen is null");
            return (Criteria) this;
        }

        public Criteria andXuefenIsNotNull() {
            addCriterion("XueFen is not null");
            return (Criteria) this;
        }

        public Criteria andXuefenEqualTo(Float value) {
            addCriterion("XueFen =", value, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenNotEqualTo(Float value) {
            addCriterion("XueFen <>", value, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenGreaterThan(Float value) {
            addCriterion("XueFen >", value, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenGreaterThanOrEqualTo(Float value) {
            addCriterion("XueFen >=", value, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenLessThan(Float value) {
            addCriterion("XueFen <", value, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenLessThanOrEqualTo(Float value) {
            addCriterion("XueFen <=", value, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenIn(List<Float> values) {
            addCriterion("XueFen in", values, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenNotIn(List<Float> values) {
            addCriterion("XueFen not in", values, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenBetween(Float value1, Float value2) {
            addCriterion("XueFen between", value1, value2, "xuefen");
            return (Criteria) this;
        }

        public Criteria andXuefenNotBetween(Float value1, Float value2) {
            addCriterion("XueFen not between", value1, value2, "xuefen");
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