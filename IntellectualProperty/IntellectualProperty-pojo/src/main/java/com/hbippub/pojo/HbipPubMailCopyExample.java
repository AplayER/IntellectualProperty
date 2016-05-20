package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubMailCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubMailCopyExample() {
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

        public Criteria andBianhaoidIsNull() {
            addCriterion("BianHaoID is null");
            return (Criteria) this;
        }

        public Criteria andBianhaoidIsNotNull() {
            addCriterion("BianHaoID is not null");
            return (Criteria) this;
        }

        public Criteria andBianhaoidEqualTo(Integer value) {
            addCriterion("BianHaoID =", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotEqualTo(Integer value) {
            addCriterion("BianHaoID <>", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidGreaterThan(Integer value) {
            addCriterion("BianHaoID >", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BianHaoID >=", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidLessThan(Integer value) {
            addCriterion("BianHaoID <", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidLessThanOrEqualTo(Integer value) {
            addCriterion("BianHaoID <=", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidIn(List<Integer> values) {
            addCriterion("BianHaoID in", values, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotIn(List<Integer> values) {
            addCriterion("BianHaoID not in", values, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidBetween(Integer value1, Integer value2) {
            addCriterion("BianHaoID between", value1, value2, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("BianHaoID not between", value1, value2, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidIsNull() {
            addCriterion("ChaoSongRenID is null");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidIsNotNull() {
            addCriterion("ChaoSongRenID is not null");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidEqualTo(Integer value) {
            addCriterion("ChaoSongRenID =", value, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidNotEqualTo(Integer value) {
            addCriterion("ChaoSongRenID <>", value, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidGreaterThan(Integer value) {
            addCriterion("ChaoSongRenID >", value, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChaoSongRenID >=", value, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidLessThan(Integer value) {
            addCriterion("ChaoSongRenID <", value, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidLessThanOrEqualTo(Integer value) {
            addCriterion("ChaoSongRenID <=", value, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidIn(List<Integer> values) {
            addCriterion("ChaoSongRenID in", values, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidNotIn(List<Integer> values) {
            addCriterion("ChaoSongRenID not in", values, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidBetween(Integer value1, Integer value2) {
            addCriterion("ChaoSongRenID between", value1, value2, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChaoSongRenID not between", value1, value2, "chaosongrenid");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingIsNull() {
            addCriterion("ChaoSongRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingIsNotNull() {
            addCriterion("ChaoSongRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingEqualTo(String value) {
            addCriterion("ChaoSongRenXingMing =", value, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingNotEqualTo(String value) {
            addCriterion("ChaoSongRenXingMing <>", value, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingGreaterThan(String value) {
            addCriterion("ChaoSongRenXingMing >", value, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ChaoSongRenXingMing >=", value, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingLessThan(String value) {
            addCriterion("ChaoSongRenXingMing <", value, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ChaoSongRenXingMing <=", value, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingLike(String value) {
            addCriterion("ChaoSongRenXingMing like", value, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingNotLike(String value) {
            addCriterion("ChaoSongRenXingMing not like", value, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingIn(List<String> values) {
            addCriterion("ChaoSongRenXingMing in", values, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingNotIn(List<String> values) {
            addCriterion("ChaoSongRenXingMing not in", values, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingBetween(String value1, String value2) {
            addCriterion("ChaoSongRenXingMing between", value1, value2, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andChaosongrenxingmingNotBetween(String value1, String value2) {
            addCriterion("ChaoSongRenXingMing not between", value1, value2, "chaosongrenxingming");
            return (Criteria) this;
        }

        public Criteria andYoujianidIsNull() {
            addCriterion("YouJianID is null");
            return (Criteria) this;
        }

        public Criteria andYoujianidIsNotNull() {
            addCriterion("YouJianID is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianidEqualTo(Integer value) {
            addCriterion("YouJianID =", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotEqualTo(Integer value) {
            addCriterion("YouJianID <>", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidGreaterThan(Integer value) {
            addCriterion("YouJianID >", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouJianID >=", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidLessThan(Integer value) {
            addCriterion("YouJianID <", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidLessThanOrEqualTo(Integer value) {
            addCriterion("YouJianID <=", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidIn(List<Integer> values) {
            addCriterion("YouJianID in", values, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotIn(List<Integer> values) {
            addCriterion("YouJianID not in", values, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidBetween(Integer value1, Integer value2) {
            addCriterion("YouJianID between", value1, value2, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotBetween(Integer value1, Integer value2) {
            addCriterion("YouJianID not between", value1, value2, "youjianid");
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