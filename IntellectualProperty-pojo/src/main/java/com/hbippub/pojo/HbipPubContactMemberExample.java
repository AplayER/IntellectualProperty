package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubContactMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubContactMemberExample() {
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

        public Criteria andChengyuanidIsNull() {
            addCriterion("ChengYuanID is null");
            return (Criteria) this;
        }

        public Criteria andChengyuanidIsNotNull() {
            addCriterion("ChengYuanID is not null");
            return (Criteria) this;
        }

        public Criteria andChengyuanidEqualTo(Integer value) {
            addCriterion("ChengYuanID =", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidNotEqualTo(Integer value) {
            addCriterion("ChengYuanID <>", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidGreaterThan(Integer value) {
            addCriterion("ChengYuanID >", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanID >=", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidLessThan(Integer value) {
            addCriterion("ChengYuanID <", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidLessThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanID <=", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidIn(List<Integer> values) {
            addCriterion("ChengYuanID in", values, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidNotIn(List<Integer> values) {
            addCriterion("ChengYuanID not in", values, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanID between", value1, value2, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanID not between", value1, value2, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidIsNull() {
            addCriterion("TongXunLuID is null");
            return (Criteria) this;
        }

        public Criteria andTongxunluidIsNotNull() {
            addCriterion("TongXunLuID is not null");
            return (Criteria) this;
        }

        public Criteria andTongxunluidEqualTo(Integer value) {
            addCriterion("TongXunLuID =", value, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidNotEqualTo(Integer value) {
            addCriterion("TongXunLuID <>", value, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidGreaterThan(Integer value) {
            addCriterion("TongXunLuID >", value, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TongXunLuID >=", value, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidLessThan(Integer value) {
            addCriterion("TongXunLuID <", value, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidLessThanOrEqualTo(Integer value) {
            addCriterion("TongXunLuID <=", value, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidIn(List<Integer> values) {
            addCriterion("TongXunLuID in", values, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidNotIn(List<Integer> values) {
            addCriterion("TongXunLuID not in", values, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidBetween(Integer value1, Integer value2) {
            addCriterion("TongXunLuID between", value1, value2, "tongxunluid");
            return (Criteria) this;
        }

        public Criteria andTongxunluidNotBetween(Integer value1, Integer value2) {
            addCriterion("TongXunLuID not between", value1, value2, "tongxunluid");
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

        public Criteria andChuangjianyonghuidIsNull() {
            addCriterion("ChuangJianYongHuID is null");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidIsNotNull() {
            addCriterion("ChuangJianYongHuID is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidEqualTo(Integer value) {
            addCriterion("ChuangJianYongHuID =", value, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidNotEqualTo(Integer value) {
            addCriterion("ChuangJianYongHuID <>", value, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidGreaterThan(Integer value) {
            addCriterion("ChuangJianYongHuID >", value, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChuangJianYongHuID >=", value, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidLessThan(Integer value) {
            addCriterion("ChuangJianYongHuID <", value, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidLessThanOrEqualTo(Integer value) {
            addCriterion("ChuangJianYongHuID <=", value, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidIn(List<Integer> values) {
            addCriterion("ChuangJianYongHuID in", values, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidNotIn(List<Integer> values) {
            addCriterion("ChuangJianYongHuID not in", values, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidBetween(Integer value1, Integer value2) {
            addCriterion("ChuangJianYongHuID between", value1, value2, "chuangjianyonghuid");
            return (Criteria) this;
        }

        public Criteria andChuangjianyonghuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChuangJianYongHuID not between", value1, value2, "chuangjianyonghuid");
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

        public Criteria andJiarushijianIsNull() {
            addCriterion("JiaRuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andJiarushijianIsNotNull() {
            addCriterion("JiaRuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andJiarushijianEqualTo(Date value) {
            addCriterion("JiaRuShiJian =", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianNotEqualTo(Date value) {
            addCriterion("JiaRuShiJian <>", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianGreaterThan(Date value) {
            addCriterion("JiaRuShiJian >", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("JiaRuShiJian >=", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianLessThan(Date value) {
            addCriterion("JiaRuShiJian <", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianLessThanOrEqualTo(Date value) {
            addCriterion("JiaRuShiJian <=", value, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianIn(List<Date> values) {
            addCriterion("JiaRuShiJian in", values, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianNotIn(List<Date> values) {
            addCriterion("JiaRuShiJian not in", values, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianBetween(Date value1, Date value2) {
            addCriterion("JiaRuShiJian between", value1, value2, "jiarushijian");
            return (Criteria) this;
        }

        public Criteria andJiarushijianNotBetween(Date value1, Date value2) {
            addCriterion("JiaRuShiJian not between", value1, value2, "jiarushijian");
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