package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubCommodityPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubCommodityPictureExample() {
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

        public Criteria andTupianidIsNull() {
            addCriterion("TuPianID is null");
            return (Criteria) this;
        }

        public Criteria andTupianidIsNotNull() {
            addCriterion("TuPianID is not null");
            return (Criteria) this;
        }

        public Criteria andTupianidEqualTo(Integer value) {
            addCriterion("TuPianID =", value, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidNotEqualTo(Integer value) {
            addCriterion("TuPianID <>", value, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidGreaterThan(Integer value) {
            addCriterion("TuPianID >", value, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TuPianID >=", value, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidLessThan(Integer value) {
            addCriterion("TuPianID <", value, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidLessThanOrEqualTo(Integer value) {
            addCriterion("TuPianID <=", value, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidIn(List<Integer> values) {
            addCriterion("TuPianID in", values, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidNotIn(List<Integer> values) {
            addCriterion("TuPianID not in", values, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidBetween(Integer value1, Integer value2) {
            addCriterion("TuPianID between", value1, value2, "tupianid");
            return (Criteria) this;
        }

        public Criteria andTupianidNotBetween(Integer value1, Integer value2) {
            addCriterion("TuPianID not between", value1, value2, "tupianid");
            return (Criteria) this;
        }

        public Criteria andShangpinidIsNull() {
            addCriterion("ShangPinID is null");
            return (Criteria) this;
        }

        public Criteria andShangpinidIsNotNull() {
            addCriterion("ShangPinID is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinidEqualTo(Integer value) {
            addCriterion("ShangPinID =", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotEqualTo(Integer value) {
            addCriterion("ShangPinID <>", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidGreaterThan(Integer value) {
            addCriterion("ShangPinID >", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShangPinID >=", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidLessThan(Integer value) {
            addCriterion("ShangPinID <", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidLessThanOrEqualTo(Integer value) {
            addCriterion("ShangPinID <=", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidIn(List<Integer> values) {
            addCriterion("ShangPinID in", values, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotIn(List<Integer> values) {
            addCriterion("ShangPinID not in", values, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinID between", value1, value2, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinID not between", value1, value2, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andTupianleixingIsNull() {
            addCriterion("TuPianLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andTupianleixingIsNotNull() {
            addCriterion("TuPianLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andTupianleixingEqualTo(Integer value) {
            addCriterion("TuPianLeiXing =", value, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingNotEqualTo(Integer value) {
            addCriterion("TuPianLeiXing <>", value, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingGreaterThan(Integer value) {
            addCriterion("TuPianLeiXing >", value, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("TuPianLeiXing >=", value, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingLessThan(Integer value) {
            addCriterion("TuPianLeiXing <", value, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingLessThanOrEqualTo(Integer value) {
            addCriterion("TuPianLeiXing <=", value, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingIn(List<Integer> values) {
            addCriterion("TuPianLeiXing in", values, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingNotIn(List<Integer> values) {
            addCriterion("TuPianLeiXing not in", values, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingBetween(Integer value1, Integer value2) {
            addCriterion("TuPianLeiXing between", value1, value2, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andTupianleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("TuPianLeiXing not between", value1, value2, "tupianleixing");
            return (Criteria) this;
        }

        public Criteria andUrl1IsNull() {
            addCriterion("URL1 is null");
            return (Criteria) this;
        }

        public Criteria andUrl1IsNotNull() {
            addCriterion("URL1 is not null");
            return (Criteria) this;
        }

        public Criteria andUrl1EqualTo(String value) {
            addCriterion("URL1 =", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotEqualTo(String value) {
            addCriterion("URL1 <>", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1GreaterThan(String value) {
            addCriterion("URL1 >", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("URL1 >=", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1LessThan(String value) {
            addCriterion("URL1 <", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1LessThanOrEqualTo(String value) {
            addCriterion("URL1 <=", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1Like(String value) {
            addCriterion("URL1 like", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotLike(String value) {
            addCriterion("URL1 not like", value, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1In(List<String> values) {
            addCriterion("URL1 in", values, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotIn(List<String> values) {
            addCriterion("URL1 not in", values, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1Between(String value1, String value2) {
            addCriterion("URL1 between", value1, value2, "url1");
            return (Criteria) this;
        }

        public Criteria andUrl1NotBetween(String value1, String value2) {
            addCriterion("URL1 not between", value1, value2, "url1");
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