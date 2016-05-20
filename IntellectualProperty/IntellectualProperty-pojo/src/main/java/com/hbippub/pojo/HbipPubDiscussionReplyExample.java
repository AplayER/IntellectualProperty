package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubDiscussionReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubDiscussionReplyExample() {
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

        public Criteria andHuifuidIsNull() {
            addCriterion("HuiFuID is null");
            return (Criteria) this;
        }

        public Criteria andHuifuidIsNotNull() {
            addCriterion("HuiFuID is not null");
            return (Criteria) this;
        }

        public Criteria andHuifuidEqualTo(Integer value) {
            addCriterion("HuiFuID =", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidNotEqualTo(Integer value) {
            addCriterion("HuiFuID <>", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidGreaterThan(Integer value) {
            addCriterion("HuiFuID >", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HuiFuID >=", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidLessThan(Integer value) {
            addCriterion("HuiFuID <", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidLessThanOrEqualTo(Integer value) {
            addCriterion("HuiFuID <=", value, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidIn(List<Integer> values) {
            addCriterion("HuiFuID in", values, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidNotIn(List<Integer> values) {
            addCriterion("HuiFuID not in", values, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidBetween(Integer value1, Integer value2) {
            addCriterion("HuiFuID between", value1, value2, "huifuid");
            return (Criteria) this;
        }

        public Criteria andHuifuidNotBetween(Integer value1, Integer value2) {
            addCriterion("HuiFuID not between", value1, value2, "huifuid");
            return (Criteria) this;
        }

        public Criteria andTieziidIsNull() {
            addCriterion("TieZiID is null");
            return (Criteria) this;
        }

        public Criteria andTieziidIsNotNull() {
            addCriterion("TieZiID is not null");
            return (Criteria) this;
        }

        public Criteria andTieziidEqualTo(Integer value) {
            addCriterion("TieZiID =", value, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidNotEqualTo(Integer value) {
            addCriterion("TieZiID <>", value, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidGreaterThan(Integer value) {
            addCriterion("TieZiID >", value, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TieZiID >=", value, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidLessThan(Integer value) {
            addCriterion("TieZiID <", value, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidLessThanOrEqualTo(Integer value) {
            addCriterion("TieZiID <=", value, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidIn(List<Integer> values) {
            addCriterion("TieZiID in", values, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidNotIn(List<Integer> values) {
            addCriterion("TieZiID not in", values, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidBetween(Integer value1, Integer value2) {
            addCriterion("TieZiID between", value1, value2, "tieziid");
            return (Criteria) this;
        }

        public Criteria andTieziidNotBetween(Integer value1, Integer value2) {
            addCriterion("TieZiID not between", value1, value2, "tieziid");
            return (Criteria) this;
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

        public Criteria andHuifuneirongIsNull() {
            addCriterion("HuiFuNeiRong is null");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongIsNotNull() {
            addCriterion("HuiFuNeiRong is not null");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongEqualTo(String value) {
            addCriterion("HuiFuNeiRong =", value, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongNotEqualTo(String value) {
            addCriterion("HuiFuNeiRong <>", value, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongGreaterThan(String value) {
            addCriterion("HuiFuNeiRong >", value, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongGreaterThanOrEqualTo(String value) {
            addCriterion("HuiFuNeiRong >=", value, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongLessThan(String value) {
            addCriterion("HuiFuNeiRong <", value, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongLessThanOrEqualTo(String value) {
            addCriterion("HuiFuNeiRong <=", value, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongLike(String value) {
            addCriterion("HuiFuNeiRong like", value, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongNotLike(String value) {
            addCriterion("HuiFuNeiRong not like", value, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongIn(List<String> values) {
            addCriterion("HuiFuNeiRong in", values, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongNotIn(List<String> values) {
            addCriterion("HuiFuNeiRong not in", values, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongBetween(String value1, String value2) {
            addCriterion("HuiFuNeiRong between", value1, value2, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifuneirongNotBetween(String value1, String value2) {
            addCriterion("HuiFuNeiRong not between", value1, value2, "huifuneirong");
            return (Criteria) this;
        }

        public Criteria andHuifushijianIsNull() {
            addCriterion("HuiFuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andHuifushijianIsNotNull() {
            addCriterion("HuiFuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andHuifushijianEqualTo(Date value) {
            addCriterion("HuiFuShiJian =", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianNotEqualTo(Date value) {
            addCriterion("HuiFuShiJian <>", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianGreaterThan(Date value) {
            addCriterion("HuiFuShiJian >", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("HuiFuShiJian >=", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianLessThan(Date value) {
            addCriterion("HuiFuShiJian <", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianLessThanOrEqualTo(Date value) {
            addCriterion("HuiFuShiJian <=", value, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianIn(List<Date> values) {
            addCriterion("HuiFuShiJian in", values, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianNotIn(List<Date> values) {
            addCriterion("HuiFuShiJian not in", values, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianBetween(Date value1, Date value2) {
            addCriterion("HuiFuShiJian between", value1, value2, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifushijianNotBetween(Date value1, Date value2) {
            addCriterion("HuiFuShiJian not between", value1, value2, "huifushijian");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingIsNull() {
            addCriterion("HuiFuZheXingMing is null");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingIsNotNull() {
            addCriterion("HuiFuZheXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingEqualTo(String value) {
            addCriterion("HuiFuZheXingMing =", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingNotEqualTo(String value) {
            addCriterion("HuiFuZheXingMing <>", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingGreaterThan(String value) {
            addCriterion("HuiFuZheXingMing >", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingGreaterThanOrEqualTo(String value) {
            addCriterion("HuiFuZheXingMing >=", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingLessThan(String value) {
            addCriterion("HuiFuZheXingMing <", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingLessThanOrEqualTo(String value) {
            addCriterion("HuiFuZheXingMing <=", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingLike(String value) {
            addCriterion("HuiFuZheXingMing like", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingNotLike(String value) {
            addCriterion("HuiFuZheXingMing not like", value, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingIn(List<String> values) {
            addCriterion("HuiFuZheXingMing in", values, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingNotIn(List<String> values) {
            addCriterion("HuiFuZheXingMing not in", values, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingBetween(String value1, String value2) {
            addCriterion("HuiFuZheXingMing between", value1, value2, "huifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andHuifuzhexingmingNotBetween(String value1, String value2) {
            addCriterion("HuiFuZheXingMing not between", value1, value2, "huifuzhexingming");
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