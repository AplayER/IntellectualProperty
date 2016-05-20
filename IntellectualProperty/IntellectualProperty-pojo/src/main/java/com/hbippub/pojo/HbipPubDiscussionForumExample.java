package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubDiscussionForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubDiscussionForumExample() {
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

        public Criteria andTaolunquidIsNull() {
            addCriterion("TaoLunQuID is null");
            return (Criteria) this;
        }

        public Criteria andTaolunquidIsNotNull() {
            addCriterion("TaoLunQuID is not null");
            return (Criteria) this;
        }

        public Criteria andTaolunquidEqualTo(Integer value) {
            addCriterion("TaoLunQuID =", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidNotEqualTo(Integer value) {
            addCriterion("TaoLunQuID <>", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidGreaterThan(Integer value) {
            addCriterion("TaoLunQuID >", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TaoLunQuID >=", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidLessThan(Integer value) {
            addCriterion("TaoLunQuID <", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidLessThanOrEqualTo(Integer value) {
            addCriterion("TaoLunQuID <=", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidIn(List<Integer> values) {
            addCriterion("TaoLunQuID in", values, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidNotIn(List<Integer> values) {
            addCriterion("TaoLunQuID not in", values, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidBetween(Integer value1, Integer value2) {
            addCriterion("TaoLunQuID between", value1, value2, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidNotBetween(Integer value1, Integer value2) {
            addCriterion("TaoLunQuID not between", value1, value2, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidIsNull() {
            addCriterion("TaoLunDuiXiangID is null");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidIsNotNull() {
            addCriterion("TaoLunDuiXiangID is not null");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidEqualTo(Integer value) {
            addCriterion("TaoLunDuiXiangID =", value, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidNotEqualTo(Integer value) {
            addCriterion("TaoLunDuiXiangID <>", value, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidGreaterThan(Integer value) {
            addCriterion("TaoLunDuiXiangID >", value, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TaoLunDuiXiangID >=", value, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidLessThan(Integer value) {
            addCriterion("TaoLunDuiXiangID <", value, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidLessThanOrEqualTo(Integer value) {
            addCriterion("TaoLunDuiXiangID <=", value, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidIn(List<Integer> values) {
            addCriterion("TaoLunDuiXiangID in", values, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidNotIn(List<Integer> values) {
            addCriterion("TaoLunDuiXiangID not in", values, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidBetween(Integer value1, Integer value2) {
            addCriterion("TaoLunDuiXiangID between", value1, value2, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andTaolunduixiangidNotBetween(Integer value1, Integer value2) {
            addCriterion("TaoLunDuiXiangID not between", value1, value2, "taolunduixiangid");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieIsNull() {
            addCriterion("DuiXiangLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieIsNotNull() {
            addCriterion("DuiXiangLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieEqualTo(Integer value) {
            addCriterion("DuiXiangLeiBie =", value, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieNotEqualTo(Integer value) {
            addCriterion("DuiXiangLeiBie <>", value, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieGreaterThan(Integer value) {
            addCriterion("DuiXiangLeiBie >", value, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieGreaterThanOrEqualTo(Integer value) {
            addCriterion("DuiXiangLeiBie >=", value, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieLessThan(Integer value) {
            addCriterion("DuiXiangLeiBie <", value, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieLessThanOrEqualTo(Integer value) {
            addCriterion("DuiXiangLeiBie <=", value, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieIn(List<Integer> values) {
            addCriterion("DuiXiangLeiBie in", values, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieNotIn(List<Integer> values) {
            addCriterion("DuiXiangLeiBie not in", values, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieBetween(Integer value1, Integer value2) {
            addCriterion("DuiXiangLeiBie between", value1, value2, "duixiangleibie");
            return (Criteria) this;
        }

        public Criteria andDuixiangleibieNotBetween(Integer value1, Integer value2) {
            addCriterion("DuiXiangLeiBie not between", value1, value2, "duixiangleibie");
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