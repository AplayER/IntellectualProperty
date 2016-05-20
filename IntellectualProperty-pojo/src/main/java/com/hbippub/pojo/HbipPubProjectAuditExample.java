package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubProjectAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubProjectAuditExample() {
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

        public Criteria andShenheidIsNull() {
            addCriterion("ShenHeID is null");
            return (Criteria) this;
        }

        public Criteria andShenheidIsNotNull() {
            addCriterion("ShenHeID is not null");
            return (Criteria) this;
        }

        public Criteria andShenheidEqualTo(Integer value) {
            addCriterion("ShenHeID =", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidNotEqualTo(Integer value) {
            addCriterion("ShenHeID <>", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidGreaterThan(Integer value) {
            addCriterion("ShenHeID >", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenHeID >=", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidLessThan(Integer value) {
            addCriterion("ShenHeID <", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidLessThanOrEqualTo(Integer value) {
            addCriterion("ShenHeID <=", value, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidIn(List<Integer> values) {
            addCriterion("ShenHeID in", values, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidNotIn(List<Integer> values) {
            addCriterion("ShenHeID not in", values, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidBetween(Integer value1, Integer value2) {
            addCriterion("ShenHeID between", value1, value2, "shenheid");
            return (Criteria) this;
        }

        public Criteria andShenheidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenHeID not between", value1, value2, "shenheid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidIsNull() {
            addCriterion("XiangMuID is null");
            return (Criteria) this;
        }

        public Criteria andXiangmuidIsNotNull() {
            addCriterion("XiangMuID is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmuidEqualTo(Integer value) {
            addCriterion("XiangMuID =", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidNotEqualTo(Integer value) {
            addCriterion("XiangMuID <>", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidGreaterThan(Integer value) {
            addCriterion("XiangMuID >", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XiangMuID >=", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidLessThan(Integer value) {
            addCriterion("XiangMuID <", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidLessThanOrEqualTo(Integer value) {
            addCriterion("XiangMuID <=", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidIn(List<Integer> values) {
            addCriterion("XiangMuID in", values, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidNotIn(List<Integer> values) {
            addCriterion("XiangMuID not in", values, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidBetween(Integer value1, Integer value2) {
            addCriterion("XiangMuID between", value1, value2, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidNotBetween(Integer value1, Integer value2) {
            addCriterion("XiangMuID not between", value1, value2, "xiangmuid");
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

        public Criteria andShenheshijianIsNull() {
            addCriterion("ShenHeShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenheshijianIsNotNull() {
            addCriterion("ShenHeShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenheshijianEqualTo(Date value) {
            addCriterion("ShenHeShiJian =", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotEqualTo(Date value) {
            addCriterion("ShenHeShiJian <>", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianGreaterThan(Date value) {
            addCriterion("ShenHeShiJian >", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ShenHeShiJian >=", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianLessThan(Date value) {
            addCriterion("ShenHeShiJian <", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianLessThanOrEqualTo(Date value) {
            addCriterion("ShenHeShiJian <=", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianIn(List<Date> values) {
            addCriterion("ShenHeShiJian in", values, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotIn(List<Date> values) {
            addCriterion("ShenHeShiJian not in", values, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianBetween(Date value1, Date value2) {
            addCriterion("ShenHeShiJian between", value1, value2, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotBetween(Date value1, Date value2) {
            addCriterion("ShenHeShiJian not between", value1, value2, "shenheshijian");
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

        public Criteria andShenheneirongIsNull() {
            addCriterion("ShenHeNeiRong is null");
            return (Criteria) this;
        }

        public Criteria andShenheneirongIsNotNull() {
            addCriterion("ShenHeNeiRong is not null");
            return (Criteria) this;
        }

        public Criteria andShenheneirongEqualTo(String value) {
            addCriterion("ShenHeNeiRong =", value, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongNotEqualTo(String value) {
            addCriterion("ShenHeNeiRong <>", value, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongGreaterThan(String value) {
            addCriterion("ShenHeNeiRong >", value, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongGreaterThanOrEqualTo(String value) {
            addCriterion("ShenHeNeiRong >=", value, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongLessThan(String value) {
            addCriterion("ShenHeNeiRong <", value, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongLessThanOrEqualTo(String value) {
            addCriterion("ShenHeNeiRong <=", value, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongLike(String value) {
            addCriterion("ShenHeNeiRong like", value, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongNotLike(String value) {
            addCriterion("ShenHeNeiRong not like", value, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongIn(List<String> values) {
            addCriterion("ShenHeNeiRong in", values, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongNotIn(List<String> values) {
            addCriterion("ShenHeNeiRong not in", values, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongBetween(String value1, String value2) {
            addCriterion("ShenHeNeiRong between", value1, value2, "shenheneirong");
            return (Criteria) this;
        }

        public Criteria andShenheneirongNotBetween(String value1, String value2) {
            addCriterion("ShenHeNeiRong not between", value1, value2, "shenheneirong");
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

        public Criteria andYonghuxingmingIsNull() {
            addCriterion("YongHuXingMing is null");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingIsNotNull() {
            addCriterion("YongHuXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingEqualTo(String value) {
            addCriterion("YongHuXingMing =", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingNotEqualTo(String value) {
            addCriterion("YongHuXingMing <>", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingGreaterThan(String value) {
            addCriterion("YongHuXingMing >", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("YongHuXingMing >=", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingLessThan(String value) {
            addCriterion("YongHuXingMing <", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingLessThanOrEqualTo(String value) {
            addCriterion("YongHuXingMing <=", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingLike(String value) {
            addCriterion("YongHuXingMing like", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingNotLike(String value) {
            addCriterion("YongHuXingMing not like", value, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingIn(List<String> values) {
            addCriterion("YongHuXingMing in", values, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingNotIn(List<String> values) {
            addCriterion("YongHuXingMing not in", values, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingBetween(String value1, String value2) {
            addCriterion("YongHuXingMing between", value1, value2, "yonghuxingming");
            return (Criteria) this;
        }

        public Criteria andYonghuxingmingNotBetween(String value1, String value2) {
            addCriterion("YongHuXingMing not between", value1, value2, "yonghuxingming");
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