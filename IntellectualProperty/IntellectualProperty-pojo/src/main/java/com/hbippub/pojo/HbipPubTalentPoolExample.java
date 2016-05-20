package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubTalentPoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubTalentPoolExample() {
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

        public Criteria andRencaikuidIsNull() {
            addCriterion("RenCaiKuID is null");
            return (Criteria) this;
        }

        public Criteria andRencaikuidIsNotNull() {
            addCriterion("RenCaiKuID is not null");
            return (Criteria) this;
        }

        public Criteria andRencaikuidEqualTo(Integer value) {
            addCriterion("RenCaiKuID =", value, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidNotEqualTo(Integer value) {
            addCriterion("RenCaiKuID <>", value, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidGreaterThan(Integer value) {
            addCriterion("RenCaiKuID >", value, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RenCaiKuID >=", value, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidLessThan(Integer value) {
            addCriterion("RenCaiKuID <", value, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidLessThanOrEqualTo(Integer value) {
            addCriterion("RenCaiKuID <=", value, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidIn(List<Integer> values) {
            addCriterion("RenCaiKuID in", values, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidNotIn(List<Integer> values) {
            addCriterion("RenCaiKuID not in", values, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidBetween(Integer value1, Integer value2) {
            addCriterion("RenCaiKuID between", value1, value2, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikuidNotBetween(Integer value1, Integer value2) {
            addCriterion("RenCaiKuID not between", value1, value2, "rencaikuid");
            return (Criteria) this;
        }

        public Criteria andRencaikumingIsNull() {
            addCriterion("RenCaiKuMing is null");
            return (Criteria) this;
        }

        public Criteria andRencaikumingIsNotNull() {
            addCriterion("RenCaiKuMing is not null");
            return (Criteria) this;
        }

        public Criteria andRencaikumingEqualTo(String value) {
            addCriterion("RenCaiKuMing =", value, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingNotEqualTo(String value) {
            addCriterion("RenCaiKuMing <>", value, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingGreaterThan(String value) {
            addCriterion("RenCaiKuMing >", value, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingGreaterThanOrEqualTo(String value) {
            addCriterion("RenCaiKuMing >=", value, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingLessThan(String value) {
            addCriterion("RenCaiKuMing <", value, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingLessThanOrEqualTo(String value) {
            addCriterion("RenCaiKuMing <=", value, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingLike(String value) {
            addCriterion("RenCaiKuMing like", value, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingNotLike(String value) {
            addCriterion("RenCaiKuMing not like", value, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingIn(List<String> values) {
            addCriterion("RenCaiKuMing in", values, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingNotIn(List<String> values) {
            addCriterion("RenCaiKuMing not in", values, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingBetween(String value1, String value2) {
            addCriterion("RenCaiKuMing between", value1, value2, "rencaikuming");
            return (Criteria) this;
        }

        public Criteria andRencaikumingNotBetween(String value1, String value2) {
            addCriterion("RenCaiKuMing not between", value1, value2, "rencaikuming");
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

        public Criteria andJianjieIsNull() {
            addCriterion("JianJie is null");
            return (Criteria) this;
        }

        public Criteria andJianjieIsNotNull() {
            addCriterion("JianJie is not null");
            return (Criteria) this;
        }

        public Criteria andJianjieEqualTo(String value) {
            addCriterion("JianJie =", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotEqualTo(String value) {
            addCriterion("JianJie <>", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieGreaterThan(String value) {
            addCriterion("JianJie >", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieGreaterThanOrEqualTo(String value) {
            addCriterion("JianJie >=", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLessThan(String value) {
            addCriterion("JianJie <", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLessThanOrEqualTo(String value) {
            addCriterion("JianJie <=", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieLike(String value) {
            addCriterion("JianJie like", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotLike(String value) {
            addCriterion("JianJie not like", value, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieIn(List<String> values) {
            addCriterion("JianJie in", values, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotIn(List<String> values) {
            addCriterion("JianJie not in", values, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieBetween(String value1, String value2) {
            addCriterion("JianJie between", value1, value2, "jianjie");
            return (Criteria) this;
        }

        public Criteria andJianjieNotBetween(String value1, String value2) {
            addCriterion("JianJie not between", value1, value2, "jianjie");
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