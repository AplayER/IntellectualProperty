package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubGovNewsSubcategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubGovNewsSubcategoryExample() {
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

        public Criteria andErjifenleiidIsNull() {
            addCriterion("ErJiFenLeiID is null");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidIsNotNull() {
            addCriterion("ErJiFenLeiID is not null");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidEqualTo(Integer value) {
            addCriterion("ErJiFenLeiID =", value, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidNotEqualTo(Integer value) {
            addCriterion("ErJiFenLeiID <>", value, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidGreaterThan(Integer value) {
            addCriterion("ErJiFenLeiID >", value, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ErJiFenLeiID >=", value, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidLessThan(Integer value) {
            addCriterion("ErJiFenLeiID <", value, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidLessThanOrEqualTo(Integer value) {
            addCriterion("ErJiFenLeiID <=", value, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidIn(List<Integer> values) {
            addCriterion("ErJiFenLeiID in", values, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidNotIn(List<Integer> values) {
            addCriterion("ErJiFenLeiID not in", values, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidBetween(Integer value1, Integer value2) {
            addCriterion("ErJiFenLeiID between", value1, value2, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andErjifenleiidNotBetween(Integer value1, Integer value2) {
            addCriterion("ErJiFenLeiID not between", value1, value2, "erjifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidIsNull() {
            addCriterion("YiJiFenLeiID is null");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidIsNotNull() {
            addCriterion("YiJiFenLeiID is not null");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidEqualTo(Integer value) {
            addCriterion("YiJiFenLeiID =", value, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidNotEqualTo(Integer value) {
            addCriterion("YiJiFenLeiID <>", value, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidGreaterThan(Integer value) {
            addCriterion("YiJiFenLeiID >", value, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YiJiFenLeiID >=", value, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidLessThan(Integer value) {
            addCriterion("YiJiFenLeiID <", value, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidLessThanOrEqualTo(Integer value) {
            addCriterion("YiJiFenLeiID <=", value, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidIn(List<Integer> values) {
            addCriterion("YiJiFenLeiID in", values, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidNotIn(List<Integer> values) {
            addCriterion("YiJiFenLeiID not in", values, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidBetween(Integer value1, Integer value2) {
            addCriterion("YiJiFenLeiID between", value1, value2, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andYijifenleiidNotBetween(Integer value1, Integer value2) {
            addCriterion("YiJiFenLeiID not between", value1, value2, "yijifenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleimingIsNull() {
            addCriterion("FenLeiMing is null");
            return (Criteria) this;
        }

        public Criteria andFenleimingIsNotNull() {
            addCriterion("FenLeiMing is not null");
            return (Criteria) this;
        }

        public Criteria andFenleimingEqualTo(String value) {
            addCriterion("FenLeiMing =", value, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingNotEqualTo(String value) {
            addCriterion("FenLeiMing <>", value, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingGreaterThan(String value) {
            addCriterion("FenLeiMing >", value, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingGreaterThanOrEqualTo(String value) {
            addCriterion("FenLeiMing >=", value, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingLessThan(String value) {
            addCriterion("FenLeiMing <", value, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingLessThanOrEqualTo(String value) {
            addCriterion("FenLeiMing <=", value, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingLike(String value) {
            addCriterion("FenLeiMing like", value, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingNotLike(String value) {
            addCriterion("FenLeiMing not like", value, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingIn(List<String> values) {
            addCriterion("FenLeiMing in", values, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingNotIn(List<String> values) {
            addCriterion("FenLeiMing not in", values, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingBetween(String value1, String value2) {
            addCriterion("FenLeiMing between", value1, value2, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andFenleimingNotBetween(String value1, String value2) {
            addCriterion("FenLeiMing not between", value1, value2, "fenleiming");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoIsNull() {
            addCriterion("ShunXuHao is null");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoIsNotNull() {
            addCriterion("ShunXuHao is not null");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoEqualTo(Integer value) {
            addCriterion("ShunXuHao =", value, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoNotEqualTo(Integer value) {
            addCriterion("ShunXuHao <>", value, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoGreaterThan(Integer value) {
            addCriterion("ShunXuHao >", value, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShunXuHao >=", value, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoLessThan(Integer value) {
            addCriterion("ShunXuHao <", value, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoLessThanOrEqualTo(Integer value) {
            addCriterion("ShunXuHao <=", value, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoIn(List<Integer> values) {
            addCriterion("ShunXuHao in", values, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoNotIn(List<Integer> values) {
            addCriterion("ShunXuHao not in", values, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoBetween(Integer value1, Integer value2) {
            addCriterion("ShunXuHao between", value1, value2, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShunxuhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("ShunXuHao not between", value1, value2, "shunxuhao");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIsNull() {
            addCriterion("ShouCangShu is null");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIsNotNull() {
            addCriterion("ShouCangShu is not null");
            return (Criteria) this;
        }

        public Criteria andShoucangshuEqualTo(Integer value) {
            addCriterion("ShouCangShu =", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotEqualTo(Integer value) {
            addCriterion("ShouCangShu <>", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuGreaterThan(Integer value) {
            addCriterion("ShouCangShu >", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShouCangShu >=", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuLessThan(Integer value) {
            addCriterion("ShouCangShu <", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuLessThanOrEqualTo(Integer value) {
            addCriterion("ShouCangShu <=", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIn(List<Integer> values) {
            addCriterion("ShouCangShu in", values, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotIn(List<Integer> values) {
            addCriterion("ShouCangShu not in", values, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuBetween(Integer value1, Integer value2) {
            addCriterion("ShouCangShu between", value1, value2, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ShouCangShu not between", value1, value2, "shoucangshu");
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