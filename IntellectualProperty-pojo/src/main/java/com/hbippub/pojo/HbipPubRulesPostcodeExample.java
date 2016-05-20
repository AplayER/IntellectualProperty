package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubRulesPostcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubRulesPostcodeExample() {
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

        public Criteria andGuizeidIsNull() {
            addCriterion("GuiZeID is null");
            return (Criteria) this;
        }

        public Criteria andGuizeidIsNotNull() {
            addCriterion("GuiZeID is not null");
            return (Criteria) this;
        }

        public Criteria andGuizeidEqualTo(Integer value) {
            addCriterion("GuiZeID =", value, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidNotEqualTo(Integer value) {
            addCriterion("GuiZeID <>", value, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidGreaterThan(Integer value) {
            addCriterion("GuiZeID >", value, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GuiZeID >=", value, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidLessThan(Integer value) {
            addCriterion("GuiZeID <", value, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidLessThanOrEqualTo(Integer value) {
            addCriterion("GuiZeID <=", value, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidIn(List<Integer> values) {
            addCriterion("GuiZeID in", values, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidNotIn(List<Integer> values) {
            addCriterion("GuiZeID not in", values, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidBetween(Integer value1, Integer value2) {
            addCriterion("GuiZeID between", value1, value2, "guizeid");
            return (Criteria) this;
        }

        public Criteria andGuizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("GuiZeID not between", value1, value2, "guizeid");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNull() {
            addCriterion("YouBian is null");
            return (Criteria) this;
        }

        public Criteria andYoubianIsNotNull() {
            addCriterion("YouBian is not null");
            return (Criteria) this;
        }

        public Criteria andYoubianEqualTo(String value) {
            addCriterion("YouBian =", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotEqualTo(String value) {
            addCriterion("YouBian <>", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThan(String value) {
            addCriterion("YouBian >", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianGreaterThanOrEqualTo(String value) {
            addCriterion("YouBian >=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThan(String value) {
            addCriterion("YouBian <", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLessThanOrEqualTo(String value) {
            addCriterion("YouBian <=", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianLike(String value) {
            addCriterion("YouBian like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotLike(String value) {
            addCriterion("YouBian not like", value, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianIn(List<String> values) {
            addCriterion("YouBian in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotIn(List<String> values) {
            addCriterion("YouBian not in", values, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianBetween(String value1, String value2) {
            addCriterion("YouBian between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andYoubianNotBetween(String value1, String value2) {
            addCriterion("YouBian not between", value1, value2, "youbian");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengIsNull() {
            addCriterion("ShengFenMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengIsNotNull() {
            addCriterion("ShengFenMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengEqualTo(String value) {
            addCriterion("ShengFenMingCheng =", value, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengNotEqualTo(String value) {
            addCriterion("ShengFenMingCheng <>", value, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengGreaterThan(String value) {
            addCriterion("ShengFenMingCheng >", value, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ShengFenMingCheng >=", value, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengLessThan(String value) {
            addCriterion("ShengFenMingCheng <", value, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengLessThanOrEqualTo(String value) {
            addCriterion("ShengFenMingCheng <=", value, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengLike(String value) {
            addCriterion("ShengFenMingCheng like", value, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengNotLike(String value) {
            addCriterion("ShengFenMingCheng not like", value, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengIn(List<String> values) {
            addCriterion("ShengFenMingCheng in", values, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengNotIn(List<String> values) {
            addCriterion("ShengFenMingCheng not in", values, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengBetween(String value1, String value2) {
            addCriterion("ShengFenMingCheng between", value1, value2, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andShengfenmingchengNotBetween(String value1, String value2) {
            addCriterion("ShengFenMingCheng not between", value1, value2, "shengfenmingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengIsNull() {
            addCriterion("ChengShiMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengIsNotNull() {
            addCriterion("ChengShiMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengEqualTo(String value) {
            addCriterion("ChengShiMingCheng =", value, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengNotEqualTo(String value) {
            addCriterion("ChengShiMingCheng <>", value, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengGreaterThan(String value) {
            addCriterion("ChengShiMingCheng >", value, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ChengShiMingCheng >=", value, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengLessThan(String value) {
            addCriterion("ChengShiMingCheng <", value, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengLessThanOrEqualTo(String value) {
            addCriterion("ChengShiMingCheng <=", value, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengLike(String value) {
            addCriterion("ChengShiMingCheng like", value, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengNotLike(String value) {
            addCriterion("ChengShiMingCheng not like", value, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengIn(List<String> values) {
            addCriterion("ChengShiMingCheng in", values, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengNotIn(List<String> values) {
            addCriterion("ChengShiMingCheng not in", values, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengBetween(String value1, String value2) {
            addCriterion("ChengShiMingCheng between", value1, value2, "chengshimingcheng");
            return (Criteria) this;
        }

        public Criteria andChengshimingchengNotBetween(String value1, String value2) {
            addCriterion("ChengShiMingCheng not between", value1, value2, "chengshimingcheng");
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