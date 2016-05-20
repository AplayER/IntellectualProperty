package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubTemplateFieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubTemplateFieldExample() {
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

        public Criteria andMobanidIsNull() {
            addCriterion("MoBanID is null");
            return (Criteria) this;
        }

        public Criteria andMobanidIsNotNull() {
            addCriterion("MoBanID is not null");
            return (Criteria) this;
        }

        public Criteria andMobanidEqualTo(Integer value) {
            addCriterion("MoBanID =", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidNotEqualTo(Integer value) {
            addCriterion("MoBanID <>", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidGreaterThan(Integer value) {
            addCriterion("MoBanID >", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoBanID >=", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidLessThan(Integer value) {
            addCriterion("MoBanID <", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidLessThanOrEqualTo(Integer value) {
            addCriterion("MoBanID <=", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidIn(List<Integer> values) {
            addCriterion("MoBanID in", values, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidNotIn(List<Integer> values) {
            addCriterion("MoBanID not in", values, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidBetween(Integer value1, Integer value2) {
            addCriterion("MoBanID between", value1, value2, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidNotBetween(Integer value1, Integer value2) {
            addCriterion("MoBanID not between", value1, value2, "mobanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidIsNull() {
            addCriterion("ZiDuanID is null");
            return (Criteria) this;
        }

        public Criteria andZiduanidIsNotNull() {
            addCriterion("ZiDuanID is not null");
            return (Criteria) this;
        }

        public Criteria andZiduanidEqualTo(Integer value) {
            addCriterion("ZiDuanID =", value, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidNotEqualTo(Integer value) {
            addCriterion("ZiDuanID <>", value, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidGreaterThan(Integer value) {
            addCriterion("ZiDuanID >", value, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZiDuanID >=", value, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidLessThan(Integer value) {
            addCriterion("ZiDuanID <", value, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidLessThanOrEqualTo(Integer value) {
            addCriterion("ZiDuanID <=", value, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidIn(List<Integer> values) {
            addCriterion("ZiDuanID in", values, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidNotIn(List<Integer> values) {
            addCriterion("ZiDuanID not in", values, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidBetween(Integer value1, Integer value2) {
            addCriterion("ZiDuanID between", value1, value2, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZiDuanID not between", value1, value2, "ziduanid");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengIsNull() {
            addCriterion("ZiDuanMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengIsNotNull() {
            addCriterion("ZiDuanMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengEqualTo(String value) {
            addCriterion("ZiDuanMingCheng =", value, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengNotEqualTo(String value) {
            addCriterion("ZiDuanMingCheng <>", value, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengGreaterThan(String value) {
            addCriterion("ZiDuanMingCheng >", value, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ZiDuanMingCheng >=", value, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengLessThan(String value) {
            addCriterion("ZiDuanMingCheng <", value, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengLessThanOrEqualTo(String value) {
            addCriterion("ZiDuanMingCheng <=", value, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengLike(String value) {
            addCriterion("ZiDuanMingCheng like", value, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengNotLike(String value) {
            addCriterion("ZiDuanMingCheng not like", value, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengIn(List<String> values) {
            addCriterion("ZiDuanMingCheng in", values, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengNotIn(List<String> values) {
            addCriterion("ZiDuanMingCheng not in", values, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengBetween(String value1, String value2) {
            addCriterion("ZiDuanMingCheng between", value1, value2, "ziduanmingcheng");
            return (Criteria) this;
        }

        public Criteria andZiduanmingchengNotBetween(String value1, String value2) {
            addCriterion("ZiDuanMingCheng not between", value1, value2, "ziduanmingcheng");
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

        public Criteria andZiduanleixingIsNull() {
            addCriterion("ZiDuanLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingIsNotNull() {
            addCriterion("ZiDuanLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingEqualTo(Integer value) {
            addCriterion("ZiDuanLeiXing =", value, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingNotEqualTo(Integer value) {
            addCriterion("ZiDuanLeiXing <>", value, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingGreaterThan(Integer value) {
            addCriterion("ZiDuanLeiXing >", value, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZiDuanLeiXing >=", value, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingLessThan(Integer value) {
            addCriterion("ZiDuanLeiXing <", value, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingLessThanOrEqualTo(Integer value) {
            addCriterion("ZiDuanLeiXing <=", value, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingIn(List<Integer> values) {
            addCriterion("ZiDuanLeiXing in", values, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingNotIn(List<Integer> values) {
            addCriterion("ZiDuanLeiXing not in", values, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingBetween(Integer value1, Integer value2) {
            addCriterion("ZiDuanLeiXing between", value1, value2, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("ZiDuanLeiXing not between", value1, value2, "ziduanleixing");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuIsNull() {
            addCriterion("ZiDuanShunXu is null");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuIsNotNull() {
            addCriterion("ZiDuanShunXu is not null");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuEqualTo(Integer value) {
            addCriterion("ZiDuanShunXu =", value, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuNotEqualTo(Integer value) {
            addCriterion("ZiDuanShunXu <>", value, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuGreaterThan(Integer value) {
            addCriterion("ZiDuanShunXu >", value, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZiDuanShunXu >=", value, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuLessThan(Integer value) {
            addCriterion("ZiDuanShunXu <", value, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuLessThanOrEqualTo(Integer value) {
            addCriterion("ZiDuanShunXu <=", value, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuIn(List<Integer> values) {
            addCriterion("ZiDuanShunXu in", values, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuNotIn(List<Integer> values) {
            addCriterion("ZiDuanShunXu not in", values, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuBetween(Integer value1, Integer value2) {
            addCriterion("ZiDuanShunXu between", value1, value2, "ziduanshunxu");
            return (Criteria) this;
        }

        public Criteria andZiduanshunxuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZiDuanShunXu not between", value1, value2, "ziduanshunxu");
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