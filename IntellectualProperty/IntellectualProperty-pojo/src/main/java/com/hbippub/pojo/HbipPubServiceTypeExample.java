package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubServiceTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubServiceTypeExample() {
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

        public Criteria andFuwuleixingidIsNull() {
            addCriterion("FuWuLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidIsNotNull() {
            addCriterion("FuWuLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidEqualTo(Integer value) {
            addCriterion("FuWuLeiXingID =", value, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidNotEqualTo(Integer value) {
            addCriterion("FuWuLeiXingID <>", value, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidGreaterThan(Integer value) {
            addCriterion("FuWuLeiXingID >", value, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FuWuLeiXingID >=", value, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidLessThan(Integer value) {
            addCriterion("FuWuLeiXingID <", value, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidLessThanOrEqualTo(Integer value) {
            addCriterion("FuWuLeiXingID <=", value, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidIn(List<Integer> values) {
            addCriterion("FuWuLeiXingID in", values, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidNotIn(List<Integer> values) {
            addCriterion("FuWuLeiXingID not in", values, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidBetween(Integer value1, Integer value2) {
            addCriterion("FuWuLeiXingID between", value1, value2, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andFuwuleixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("FuWuLeiXingID not between", value1, value2, "fuwuleixingid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidIsNull() {
            addCriterion("ShangJiFuWuID is null");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidIsNotNull() {
            addCriterion("ShangJiFuWuID is not null");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidEqualTo(Integer value) {
            addCriterion("ShangJiFuWuID =", value, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidNotEqualTo(Integer value) {
            addCriterion("ShangJiFuWuID <>", value, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidGreaterThan(Integer value) {
            addCriterion("ShangJiFuWuID >", value, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShangJiFuWuID >=", value, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidLessThan(Integer value) {
            addCriterion("ShangJiFuWuID <", value, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidLessThanOrEqualTo(Integer value) {
            addCriterion("ShangJiFuWuID <=", value, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidIn(List<Integer> values) {
            addCriterion("ShangJiFuWuID in", values, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidNotIn(List<Integer> values) {
            addCriterion("ShangJiFuWuID not in", values, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidBetween(Integer value1, Integer value2) {
            addCriterion("ShangJiFuWuID between", value1, value2, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andShangjifuwuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShangJiFuWuID not between", value1, value2, "shangjifuwuid");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiIsNull() {
            addCriterion("FuWuDengJi is null");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiIsNotNull() {
            addCriterion("FuWuDengJi is not null");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiEqualTo(Integer value) {
            addCriterion("FuWuDengJi =", value, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiNotEqualTo(Integer value) {
            addCriterion("FuWuDengJi <>", value, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiGreaterThan(Integer value) {
            addCriterion("FuWuDengJi >", value, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("FuWuDengJi >=", value, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiLessThan(Integer value) {
            addCriterion("FuWuDengJi <", value, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiLessThanOrEqualTo(Integer value) {
            addCriterion("FuWuDengJi <=", value, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiIn(List<Integer> values) {
            addCriterion("FuWuDengJi in", values, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiNotIn(List<Integer> values) {
            addCriterion("FuWuDengJi not in", values, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiBetween(Integer value1, Integer value2) {
            addCriterion("FuWuDengJi between", value1, value2, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andFuwudengjiNotBetween(Integer value1, Integer value2) {
            addCriterion("FuWuDengJi not between", value1, value2, "fuwudengji");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengIsNull() {
            addCriterion("LeiXingMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengIsNotNull() {
            addCriterion("LeiXingMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengEqualTo(String value) {
            addCriterion("LeiXingMingCheng =", value, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengNotEqualTo(String value) {
            addCriterion("LeiXingMingCheng <>", value, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengGreaterThan(String value) {
            addCriterion("LeiXingMingCheng >", value, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("LeiXingMingCheng >=", value, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengLessThan(String value) {
            addCriterion("LeiXingMingCheng <", value, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengLessThanOrEqualTo(String value) {
            addCriterion("LeiXingMingCheng <=", value, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengLike(String value) {
            addCriterion("LeiXingMingCheng like", value, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengNotLike(String value) {
            addCriterion("LeiXingMingCheng not like", value, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengIn(List<String> values) {
            addCriterion("LeiXingMingCheng in", values, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengNotIn(List<String> values) {
            addCriterion("LeiXingMingCheng not in", values, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengBetween(String value1, String value2) {
            addCriterion("LeiXingMingCheng between", value1, value2, "leixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andLeixingmingchengNotBetween(String value1, String value2) {
            addCriterion("LeiXingMingCheng not between", value1, value2, "leixingmingcheng");
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

        public Criteria andBeizhuEqualTo(Integer value) {
            addCriterion("BeiZhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(Integer value) {
            addCriterion("BeiZhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(Integer value) {
            addCriterion("BeiZhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(Integer value) {
            addCriterion("BeiZhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(Integer value) {
            addCriterion("BeiZhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(Integer value) {
            addCriterion("BeiZhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<Integer> values) {
            addCriterion("BeiZhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<Integer> values) {
            addCriterion("BeiZhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(Integer value1, Integer value2) {
            addCriterion("BeiZhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(Integer value1, Integer value2) {
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