package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubAdministrativeDivisionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubAdministrativeDivisionExample() {
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

        public Criteria andXingzhengquhuaidIsNull() {
            addCriterion("XingZhengQuHuaID is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidIsNotNull() {
            addCriterion("XingZhengQuHuaID is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidEqualTo(Integer value) {
            addCriterion("XingZhengQuHuaID =", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidNotEqualTo(Integer value) {
            addCriterion("XingZhengQuHuaID <>", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidGreaterThan(Integer value) {
            addCriterion("XingZhengQuHuaID >", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XingZhengQuHuaID >=", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidLessThan(Integer value) {
            addCriterion("XingZhengQuHuaID <", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidLessThanOrEqualTo(Integer value) {
            addCriterion("XingZhengQuHuaID <=", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidIn(List<Integer> values) {
            addCriterion("XingZhengQuHuaID in", values, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidNotIn(List<Integer> values) {
            addCriterion("XingZhengQuHuaID not in", values, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidBetween(Integer value1, Integer value2) {
            addCriterion("XingZhengQuHuaID between", value1, value2, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidNotBetween(Integer value1, Integer value2) {
            addCriterion("XingZhengQuHuaID not between", value1, value2, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingIsNull() {
            addCriterion("XingZhengQuHuaMing is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingIsNotNull() {
            addCriterion("XingZhengQuHuaMing is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingEqualTo(String value) {
            addCriterion("XingZhengQuHuaMing =", value, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingNotEqualTo(String value) {
            addCriterion("XingZhengQuHuaMing <>", value, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingGreaterThan(String value) {
            addCriterion("XingZhengQuHuaMing >", value, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingGreaterThanOrEqualTo(String value) {
            addCriterion("XingZhengQuHuaMing >=", value, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingLessThan(String value) {
            addCriterion("XingZhengQuHuaMing <", value, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingLessThanOrEqualTo(String value) {
            addCriterion("XingZhengQuHuaMing <=", value, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingLike(String value) {
            addCriterion("XingZhengQuHuaMing like", value, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingNotLike(String value) {
            addCriterion("XingZhengQuHuaMing not like", value, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingIn(List<String> values) {
            addCriterion("XingZhengQuHuaMing in", values, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingNotIn(List<String> values) {
            addCriterion("XingZhengQuHuaMing not in", values, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingBetween(String value1, String value2) {
            addCriterion("XingZhengQuHuaMing between", value1, value2, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuamingNotBetween(String value1, String value2) {
            addCriterion("XingZhengQuHuaMing not between", value1, value2, "xingzhengquhuaming");
            return (Criteria) this;
        }

        public Criteria andShangjilujingIsNull() {
            addCriterion("ShangJiLuJing is null");
            return (Criteria) this;
        }

        public Criteria andShangjilujingIsNotNull() {
            addCriterion("ShangJiLuJing is not null");
            return (Criteria) this;
        }

        public Criteria andShangjilujingEqualTo(String value) {
            addCriterion("ShangJiLuJing =", value, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingNotEqualTo(String value) {
            addCriterion("ShangJiLuJing <>", value, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingGreaterThan(String value) {
            addCriterion("ShangJiLuJing >", value, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingGreaterThanOrEqualTo(String value) {
            addCriterion("ShangJiLuJing >=", value, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingLessThan(String value) {
            addCriterion("ShangJiLuJing <", value, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingLessThanOrEqualTo(String value) {
            addCriterion("ShangJiLuJing <=", value, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingLike(String value) {
            addCriterion("ShangJiLuJing like", value, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingNotLike(String value) {
            addCriterion("ShangJiLuJing not like", value, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingIn(List<String> values) {
            addCriterion("ShangJiLuJing in", values, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingNotIn(List<String> values) {
            addCriterion("ShangJiLuJing not in", values, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingBetween(String value1, String value2) {
            addCriterion("ShangJiLuJing between", value1, value2, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andShangjilujingNotBetween(String value1, String value2) {
            addCriterion("ShangJiLuJing not between", value1, value2, "shangjilujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingIsNull() {
            addCriterion("WanZhengLuJing is null");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingIsNotNull() {
            addCriterion("WanZhengLuJing is not null");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingEqualTo(String value) {
            addCriterion("WanZhengLuJing =", value, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingNotEqualTo(String value) {
            addCriterion("WanZhengLuJing <>", value, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingGreaterThan(String value) {
            addCriterion("WanZhengLuJing >", value, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingGreaterThanOrEqualTo(String value) {
            addCriterion("WanZhengLuJing >=", value, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingLessThan(String value) {
            addCriterion("WanZhengLuJing <", value, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingLessThanOrEqualTo(String value) {
            addCriterion("WanZhengLuJing <=", value, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingLike(String value) {
            addCriterion("WanZhengLuJing like", value, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingNotLike(String value) {
            addCriterion("WanZhengLuJing not like", value, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingIn(List<String> values) {
            addCriterion("WanZhengLuJing in", values, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingNotIn(List<String> values) {
            addCriterion("WanZhengLuJing not in", values, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingBetween(String value1, String value2) {
            addCriterion("WanZhengLuJing between", value1, value2, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andWanzhenglujingNotBetween(String value1, String value2) {
            addCriterion("WanZhengLuJing not between", value1, value2, "wanzhenglujing");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaIsNull() {
            addCriterion("QuHuaDaiMa is null");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaIsNotNull() {
            addCriterion("QuHuaDaiMa is not null");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaEqualTo(String value) {
            addCriterion("QuHuaDaiMa =", value, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaNotEqualTo(String value) {
            addCriterion("QuHuaDaiMa <>", value, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaGreaterThan(String value) {
            addCriterion("QuHuaDaiMa >", value, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaGreaterThanOrEqualTo(String value) {
            addCriterion("QuHuaDaiMa >=", value, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaLessThan(String value) {
            addCriterion("QuHuaDaiMa <", value, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaLessThanOrEqualTo(String value) {
            addCriterion("QuHuaDaiMa <=", value, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaLike(String value) {
            addCriterion("QuHuaDaiMa like", value, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaNotLike(String value) {
            addCriterion("QuHuaDaiMa not like", value, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaIn(List<String> values) {
            addCriterion("QuHuaDaiMa in", values, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaNotIn(List<String> values) {
            addCriterion("QuHuaDaiMa not in", values, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaBetween(String value1, String value2) {
            addCriterion("QuHuaDaiMa between", value1, value2, "quhuadaima");
            return (Criteria) this;
        }

        public Criteria andQuhuadaimaNotBetween(String value1, String value2) {
            addCriterion("QuHuaDaiMa not between", value1, value2, "quhuadaima");
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