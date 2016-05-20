package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubMarketRecommendShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubMarketRecommendShopExample() {
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

        public Criteria andYonghuidIsNull() {
            addCriterion("YongHuID is null");
            return (Criteria) this;
        }

        public Criteria andYonghuidIsNotNull() {
            addCriterion("YongHuID is not null");
            return (Criteria) this;
        }

        public Criteria andYonghuidEqualTo(Integer value) {
            addCriterion("YongHuID =", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotEqualTo(Integer value) {
            addCriterion("YongHuID <>", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidGreaterThan(Integer value) {
            addCriterion("YongHuID >", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YongHuID >=", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidLessThan(Integer value) {
            addCriterion("YongHuID <", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidLessThanOrEqualTo(Integer value) {
            addCriterion("YongHuID <=", value, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidIn(List<Integer> values) {
            addCriterion("YongHuID in", values, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotIn(List<Integer> values) {
            addCriterion("YongHuID not in", values, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidBetween(Integer value1, Integer value2) {
            addCriterion("YongHuID between", value1, value2, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andYonghuidNotBetween(Integer value1, Integer value2) {
            addCriterion("YongHuID not between", value1, value2, "yonghuid");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIsNull() {
            addCriterion("DianPuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIsNotNull() {
            addCriterion("DianPuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengEqualTo(String value) {
            addCriterion("DianPuMingCheng =", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotEqualTo(String value) {
            addCriterion("DianPuMingCheng <>", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengGreaterThan(String value) {
            addCriterion("DianPuMingCheng >", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DianPuMingCheng >=", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLessThan(String value) {
            addCriterion("DianPuMingCheng <", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLessThanOrEqualTo(String value) {
            addCriterion("DianPuMingCheng <=", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLike(String value) {
            addCriterion("DianPuMingCheng like", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotLike(String value) {
            addCriterion("DianPuMingCheng not like", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIn(List<String> values) {
            addCriterion("DianPuMingCheng in", values, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotIn(List<String> values) {
            addCriterion("DianPuMingCheng not in", values, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengBetween(String value1, String value2) {
            addCriterion("DianPuMingCheng between", value1, value2, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotBetween(String value1, String value2) {
            addCriterion("DianPuMingCheng not between", value1, value2, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoIsNull() {
            addCriterion("DianPuTuBiao is null");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoIsNotNull() {
            addCriterion("DianPuTuBiao is not null");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoEqualTo(String value) {
            addCriterion("DianPuTuBiao =", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoNotEqualTo(String value) {
            addCriterion("DianPuTuBiao <>", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoGreaterThan(String value) {
            addCriterion("DianPuTuBiao >", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoGreaterThanOrEqualTo(String value) {
            addCriterion("DianPuTuBiao >=", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoLessThan(String value) {
            addCriterion("DianPuTuBiao <", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoLessThanOrEqualTo(String value) {
            addCriterion("DianPuTuBiao <=", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoLike(String value) {
            addCriterion("DianPuTuBiao like", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoNotLike(String value) {
            addCriterion("DianPuTuBiao not like", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoIn(List<String> values) {
            addCriterion("DianPuTuBiao in", values, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoNotIn(List<String> values) {
            addCriterion("DianPuTuBiao not in", values, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoBetween(String value1, String value2) {
            addCriterion("DianPuTuBiao between", value1, value2, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoNotBetween(String value1, String value2) {
            addCriterion("DianPuTuBiao not between", value1, value2, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieIsNull() {
            addCriterion("DianPuJianJie is null");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieIsNotNull() {
            addCriterion("DianPuJianJie is not null");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieEqualTo(String value) {
            addCriterion("DianPuJianJie =", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieNotEqualTo(String value) {
            addCriterion("DianPuJianJie <>", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieGreaterThan(String value) {
            addCriterion("DianPuJianJie >", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieGreaterThanOrEqualTo(String value) {
            addCriterion("DianPuJianJie >=", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieLessThan(String value) {
            addCriterion("DianPuJianJie <", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieLessThanOrEqualTo(String value) {
            addCriterion("DianPuJianJie <=", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieLike(String value) {
            addCriterion("DianPuJianJie like", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieNotLike(String value) {
            addCriterion("DianPuJianJie not like", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieIn(List<String> values) {
            addCriterion("DianPuJianJie in", values, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieNotIn(List<String> values) {
            addCriterion("DianPuJianJie not in", values, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieBetween(String value1, String value2) {
            addCriterion("DianPuJianJie between", value1, value2, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieNotBetween(String value1, String value2) {
            addCriterion("DianPuJianJie not between", value1, value2, "dianpujianjie");
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