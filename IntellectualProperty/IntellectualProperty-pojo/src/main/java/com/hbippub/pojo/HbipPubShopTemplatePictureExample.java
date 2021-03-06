package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubShopTemplatePictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubShopTemplatePictureExample() {
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

        public Criteria andLeixingidIsNull() {
            addCriterion("LeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andLeixingidIsNotNull() {
            addCriterion("LeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingidEqualTo(Integer value) {
            addCriterion("LeiXingID =", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotEqualTo(Integer value) {
            addCriterion("LeiXingID <>", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidGreaterThan(Integer value) {
            addCriterion("LeiXingID >", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LeiXingID >=", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidLessThan(Integer value) {
            addCriterion("LeiXingID <", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidLessThanOrEqualTo(Integer value) {
            addCriterion("LeiXingID <=", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidIn(List<Integer> values) {
            addCriterion("LeiXingID in", values, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotIn(List<Integer> values) {
            addCriterion("LeiXingID not in", values, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidBetween(Integer value1, Integer value2) {
            addCriterion("LeiXingID between", value1, value2, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("LeiXingID not between", value1, value2, "leixingid");
            return (Criteria) this;
        }

        public Criteria andMubanidIsNull() {
            addCriterion("MuBanID is null");
            return (Criteria) this;
        }

        public Criteria andMubanidIsNotNull() {
            addCriterion("MuBanID is not null");
            return (Criteria) this;
        }

        public Criteria andMubanidEqualTo(Integer value) {
            addCriterion("MuBanID =", value, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidNotEqualTo(Integer value) {
            addCriterion("MuBanID <>", value, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidGreaterThan(Integer value) {
            addCriterion("MuBanID >", value, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MuBanID >=", value, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidLessThan(Integer value) {
            addCriterion("MuBanID <", value, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidLessThanOrEqualTo(Integer value) {
            addCriterion("MuBanID <=", value, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidIn(List<Integer> values) {
            addCriterion("MuBanID in", values, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidNotIn(List<Integer> values) {
            addCriterion("MuBanID not in", values, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidBetween(Integer value1, Integer value2) {
            addCriterion("MuBanID between", value1, value2, "mubanid");
            return (Criteria) this;
        }

        public Criteria andMubanidNotBetween(Integer value1, Integer value2) {
            addCriterion("MuBanID not between", value1, value2, "mubanid");
            return (Criteria) this;
        }

        public Criteria andTupianlujingIsNull() {
            addCriterion("TuPianLuJing is null");
            return (Criteria) this;
        }

        public Criteria andTupianlujingIsNotNull() {
            addCriterion("TuPianLuJing is not null");
            return (Criteria) this;
        }

        public Criteria andTupianlujingEqualTo(String value) {
            addCriterion("TuPianLuJing =", value, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingNotEqualTo(String value) {
            addCriterion("TuPianLuJing <>", value, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingGreaterThan(String value) {
            addCriterion("TuPianLuJing >", value, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingGreaterThanOrEqualTo(String value) {
            addCriterion("TuPianLuJing >=", value, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingLessThan(String value) {
            addCriterion("TuPianLuJing <", value, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingLessThanOrEqualTo(String value) {
            addCriterion("TuPianLuJing <=", value, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingLike(String value) {
            addCriterion("TuPianLuJing like", value, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingNotLike(String value) {
            addCriterion("TuPianLuJing not like", value, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingIn(List<String> values) {
            addCriterion("TuPianLuJing in", values, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingNotIn(List<String> values) {
            addCriterion("TuPianLuJing not in", values, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingBetween(String value1, String value2) {
            addCriterion("TuPianLuJing between", value1, value2, "tupianlujing");
            return (Criteria) this;
        }

        public Criteria andTupianlujingNotBetween(String value1, String value2) {
            addCriterion("TuPianLuJing not between", value1, value2, "tupianlujing");
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