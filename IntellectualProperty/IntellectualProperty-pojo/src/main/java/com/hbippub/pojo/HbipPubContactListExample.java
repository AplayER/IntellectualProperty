package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubContactListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubContactListExample() {
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

        public Criteria andChuangjianzhexingmingIsNull() {
            addCriterion("ChuangJianZheXingMing is null");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingIsNotNull() {
            addCriterion("ChuangJianZheXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingEqualTo(String value) {
            addCriterion("ChuangJianZheXingMing =", value, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingNotEqualTo(String value) {
            addCriterion("ChuangJianZheXingMing <>", value, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingGreaterThan(String value) {
            addCriterion("ChuangJianZheXingMing >", value, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ChuangJianZheXingMing >=", value, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingLessThan(String value) {
            addCriterion("ChuangJianZheXingMing <", value, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingLessThanOrEqualTo(String value) {
            addCriterion("ChuangJianZheXingMing <=", value, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingLike(String value) {
            addCriterion("ChuangJianZheXingMing like", value, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingNotLike(String value) {
            addCriterion("ChuangJianZheXingMing not like", value, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingIn(List<String> values) {
            addCriterion("ChuangJianZheXingMing in", values, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingNotIn(List<String> values) {
            addCriterion("ChuangJianZheXingMing not in", values, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingBetween(String value1, String value2) {
            addCriterion("ChuangJianZheXingMing between", value1, value2, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianzhexingmingNotBetween(String value1, String value2) {
            addCriterion("ChuangJianZheXingMing not between", value1, value2, "chuangjianzhexingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIsNull() {
            addCriterion("ChuangJianShiJian is null");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIsNotNull() {
            addCriterion("ChuangJianShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianEqualTo(Date value) {
            addCriterion("ChuangJianShiJian =", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotEqualTo(Date value) {
            addCriterion("ChuangJianShiJian <>", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianGreaterThan(Date value) {
            addCriterion("ChuangJianShiJian >", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ChuangJianShiJian >=", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianLessThan(Date value) {
            addCriterion("ChuangJianShiJian <", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianLessThanOrEqualTo(Date value) {
            addCriterion("ChuangJianShiJian <=", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIn(List<Date> values) {
            addCriterion("ChuangJianShiJian in", values, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotIn(List<Date> values) {
            addCriterion("ChuangJianShiJian not in", values, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianBetween(Date value1, Date value2) {
            addCriterion("ChuangJianShiJian between", value1, value2, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotBetween(Date value1, Date value2) {
            addCriterion("ChuangJianShiJian not between", value1, value2, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengIsNull() {
            addCriterion("TongXunLuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengIsNotNull() {
            addCriterion("TongXunLuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengEqualTo(String value) {
            addCriterion("TongXunLuMingCheng =", value, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengNotEqualTo(String value) {
            addCriterion("TongXunLuMingCheng <>", value, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengGreaterThan(String value) {
            addCriterion("TongXunLuMingCheng >", value, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("TongXunLuMingCheng >=", value, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengLessThan(String value) {
            addCriterion("TongXunLuMingCheng <", value, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengLessThanOrEqualTo(String value) {
            addCriterion("TongXunLuMingCheng <=", value, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengLike(String value) {
            addCriterion("TongXunLuMingCheng like", value, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengNotLike(String value) {
            addCriterion("TongXunLuMingCheng not like", value, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengIn(List<String> values) {
            addCriterion("TongXunLuMingCheng in", values, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengNotIn(List<String> values) {
            addCriterion("TongXunLuMingCheng not in", values, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengBetween(String value1, String value2) {
            addCriterion("TongXunLuMingCheng between", value1, value2, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andTongxunlumingchengNotBetween(String value1, String value2) {
            addCriterion("TongXunLuMingCheng not between", value1, value2, "tongxunlumingcheng");
            return (Criteria) this;
        }

        public Criteria andRenshuIsNull() {
            addCriterion("RenShu is null");
            return (Criteria) this;
        }

        public Criteria andRenshuIsNotNull() {
            addCriterion("RenShu is not null");
            return (Criteria) this;
        }

        public Criteria andRenshuEqualTo(Integer value) {
            addCriterion("RenShu =", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuNotEqualTo(Integer value) {
            addCriterion("RenShu <>", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuGreaterThan(Integer value) {
            addCriterion("RenShu >", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("RenShu >=", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuLessThan(Integer value) {
            addCriterion("RenShu <", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuLessThanOrEqualTo(Integer value) {
            addCriterion("RenShu <=", value, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuIn(List<Integer> values) {
            addCriterion("RenShu in", values, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuNotIn(List<Integer> values) {
            addCriterion("RenShu not in", values, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuBetween(Integer value1, Integer value2) {
            addCriterion("RenShu between", value1, value2, "renshu");
            return (Criteria) this;
        }

        public Criteria andRenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("RenShu not between", value1, value2, "renshu");
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