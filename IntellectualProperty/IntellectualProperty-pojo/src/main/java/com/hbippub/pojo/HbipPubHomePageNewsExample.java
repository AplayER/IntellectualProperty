package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubHomePageNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubHomePageNewsExample() {
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

        public Criteria andXinwenidIsNull() {
            addCriterion("XinWenID is null");
            return (Criteria) this;
        }

        public Criteria andXinwenidIsNotNull() {
            addCriterion("XinWenID is not null");
            return (Criteria) this;
        }

        public Criteria andXinwenidEqualTo(Integer value) {
            addCriterion("XinWenID =", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotEqualTo(Integer value) {
            addCriterion("XinWenID <>", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidGreaterThan(Integer value) {
            addCriterion("XinWenID >", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XinWenID >=", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidLessThan(Integer value) {
            addCriterion("XinWenID <", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidLessThanOrEqualTo(Integer value) {
            addCriterion("XinWenID <=", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidIn(List<Integer> values) {
            addCriterion("XinWenID in", values, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotIn(List<Integer> values) {
            addCriterion("XinWenID not in", values, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidBetween(Integer value1, Integer value2) {
            addCriterion("XinWenID between", value1, value2, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotBetween(Integer value1, Integer value2) {
            addCriterion("XinWenID not between", value1, value2, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengIsNull() {
            addCriterion("XinWenMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengIsNotNull() {
            addCriterion("XinWenMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengEqualTo(String value) {
            addCriterion("XinWenMingCheng =", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengNotEqualTo(String value) {
            addCriterion("XinWenMingCheng <>", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengGreaterThan(String value) {
            addCriterion("XinWenMingCheng >", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("XinWenMingCheng >=", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengLessThan(String value) {
            addCriterion("XinWenMingCheng <", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengLessThanOrEqualTo(String value) {
            addCriterion("XinWenMingCheng <=", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengLike(String value) {
            addCriterion("XinWenMingCheng like", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengNotLike(String value) {
            addCriterion("XinWenMingCheng not like", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengIn(List<String> values) {
            addCriterion("XinWenMingCheng in", values, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengNotIn(List<String> values) {
            addCriterion("XinWenMingCheng not in", values, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengBetween(String value1, String value2) {
            addCriterion("XinWenMingCheng between", value1, value2, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengNotBetween(String value1, String value2) {
            addCriterion("XinWenMingCheng not between", value1, value2, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andFengmianurlIsNull() {
            addCriterion("FengMianURL is null");
            return (Criteria) this;
        }

        public Criteria andFengmianurlIsNotNull() {
            addCriterion("FengMianURL is not null");
            return (Criteria) this;
        }

        public Criteria andFengmianurlEqualTo(String value) {
            addCriterion("FengMianURL =", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotEqualTo(String value) {
            addCriterion("FengMianURL <>", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlGreaterThan(String value) {
            addCriterion("FengMianURL >", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlGreaterThanOrEqualTo(String value) {
            addCriterion("FengMianURL >=", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLessThan(String value) {
            addCriterion("FengMianURL <", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLessThanOrEqualTo(String value) {
            addCriterion("FengMianURL <=", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLike(String value) {
            addCriterion("FengMianURL like", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotLike(String value) {
            addCriterion("FengMianURL not like", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlIn(List<String> values) {
            addCriterion("FengMianURL in", values, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotIn(List<String> values) {
            addCriterion("FengMianURL not in", values, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlBetween(String value1, String value2) {
            addCriterion("FengMianURL between", value1, value2, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotBetween(String value1, String value2) {
            addCriterion("FengMianURL not between", value1, value2, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianIsNull() {
            addCriterion("TuiSongShiJian is null");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianIsNotNull() {
            addCriterion("TuiSongShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianEqualTo(Date value) {
            addCriterion("TuiSongShiJian =", value, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianNotEqualTo(Date value) {
            addCriterion("TuiSongShiJian <>", value, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianGreaterThan(Date value) {
            addCriterion("TuiSongShiJian >", value, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("TuiSongShiJian >=", value, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianLessThan(Date value) {
            addCriterion("TuiSongShiJian <", value, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianLessThanOrEqualTo(Date value) {
            addCriterion("TuiSongShiJian <=", value, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianIn(List<Date> values) {
            addCriterion("TuiSongShiJian in", values, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianNotIn(List<Date> values) {
            addCriterion("TuiSongShiJian not in", values, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianBetween(Date value1, Date value2) {
            addCriterion("TuiSongShiJian between", value1, value2, "tuisongshijian");
            return (Criteria) this;
        }

        public Criteria andTuisongshijianNotBetween(Date value1, Date value2) {
            addCriterion("TuiSongShiJian not between", value1, value2, "tuisongshijian");
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