package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubCollectRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubCollectRecordExample() {
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

        public Criteria andShoucangjiluidIsNull() {
            addCriterion("ShouCangJiLuID is null");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidIsNotNull() {
            addCriterion("ShouCangJiLuID is not null");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidEqualTo(Integer value) {
            addCriterion("ShouCangJiLuID =", value, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidNotEqualTo(Integer value) {
            addCriterion("ShouCangJiLuID <>", value, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidGreaterThan(Integer value) {
            addCriterion("ShouCangJiLuID >", value, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShouCangJiLuID >=", value, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidLessThan(Integer value) {
            addCriterion("ShouCangJiLuID <", value, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidLessThanOrEqualTo(Integer value) {
            addCriterion("ShouCangJiLuID <=", value, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidIn(List<Integer> values) {
            addCriterion("ShouCangJiLuID in", values, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidNotIn(List<Integer> values) {
            addCriterion("ShouCangJiLuID not in", values, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidBetween(Integer value1, Integer value2) {
            addCriterion("ShouCangJiLuID between", value1, value2, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andShoucangjiluidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShouCangJiLuID not between", value1, value2, "shoucangjiluid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidIsNull() {
            addCriterion("YeWuLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidIsNotNull() {
            addCriterion("YeWuLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidEqualTo(Integer value) {
            addCriterion("YeWuLeiXingID =", value, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidNotEqualTo(Integer value) {
            addCriterion("YeWuLeiXingID <>", value, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidGreaterThan(Integer value) {
            addCriterion("YeWuLeiXingID >", value, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YeWuLeiXingID >=", value, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidLessThan(Integer value) {
            addCriterion("YeWuLeiXingID <", value, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidLessThanOrEqualTo(Integer value) {
            addCriterion("YeWuLeiXingID <=", value, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidIn(List<Integer> values) {
            addCriterion("YeWuLeiXingID in", values, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidNotIn(List<Integer> values) {
            addCriterion("YeWuLeiXingID not in", values, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidBetween(Integer value1, Integer value2) {
            addCriterion("YeWuLeiXingID between", value1, value2, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andYewuleixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("YeWuLeiXingID not between", value1, value2, "yewuleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinidIsNull() {
            addCriterion("ShangPinID is null");
            return (Criteria) this;
        }

        public Criteria andShangpinidIsNotNull() {
            addCriterion("ShangPinID is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinidEqualTo(Integer value) {
            addCriterion("ShangPinID =", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotEqualTo(Integer value) {
            addCriterion("ShangPinID <>", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidGreaterThan(Integer value) {
            addCriterion("ShangPinID >", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShangPinID >=", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidLessThan(Integer value) {
            addCriterion("ShangPinID <", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidLessThanOrEqualTo(Integer value) {
            addCriterion("ShangPinID <=", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidIn(List<Integer> values) {
            addCriterion("ShangPinID in", values, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotIn(List<Integer> values) {
            addCriterion("ShangPinID not in", values, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinID between", value1, value2, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinID not between", value1, value2, "shangpinid");
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

        public Criteria andYonghumingchengIsNull() {
            addCriterion("YongHuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengIsNotNull() {
            addCriterion("YongHuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengEqualTo(String value) {
            addCriterion("YongHuMingCheng =", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotEqualTo(String value) {
            addCriterion("YongHuMingCheng <>", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengGreaterThan(String value) {
            addCriterion("YongHuMingCheng >", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("YongHuMingCheng >=", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLessThan(String value) {
            addCriterion("YongHuMingCheng <", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLessThanOrEqualTo(String value) {
            addCriterion("YongHuMingCheng <=", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLike(String value) {
            addCriterion("YongHuMingCheng like", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotLike(String value) {
            addCriterion("YongHuMingCheng not like", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengIn(List<String> values) {
            addCriterion("YongHuMingCheng in", values, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotIn(List<String> values) {
            addCriterion("YongHuMingCheng not in", values, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengBetween(String value1, String value2) {
            addCriterion("YongHuMingCheng between", value1, value2, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotBetween(String value1, String value2) {
            addCriterion("YongHuMingCheng not between", value1, value2, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIsNull() {
            addCriterion("ShangPinMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIsNotNull() {
            addCriterion("ShangPinMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengEqualTo(String value) {
            addCriterion("ShangPinMingCheng =", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotEqualTo(String value) {
            addCriterion("ShangPinMingCheng <>", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengGreaterThan(String value) {
            addCriterion("ShangPinMingCheng >", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ShangPinMingCheng >=", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLessThan(String value) {
            addCriterion("ShangPinMingCheng <", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLessThanOrEqualTo(String value) {
            addCriterion("ShangPinMingCheng <=", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLike(String value) {
            addCriterion("ShangPinMingCheng like", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotLike(String value) {
            addCriterion("ShangPinMingCheng not like", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIn(List<String> values) {
            addCriterion("ShangPinMingCheng in", values, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotIn(List<String> values) {
            addCriterion("ShangPinMingCheng not in", values, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengBetween(String value1, String value2) {
            addCriterion("ShangPinMingCheng between", value1, value2, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotBetween(String value1, String value2) {
            addCriterion("ShangPinMingCheng not between", value1, value2, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianIsNull() {
            addCriterion("ShouCangShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianIsNotNull() {
            addCriterion("ShouCangShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianEqualTo(Date value) {
            addCriterion("ShouCangShiJian =", value, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianNotEqualTo(Date value) {
            addCriterion("ShouCangShiJian <>", value, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianGreaterThan(Date value) {
            addCriterion("ShouCangShiJian >", value, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ShouCangShiJian >=", value, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianLessThan(Date value) {
            addCriterion("ShouCangShiJian <", value, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianLessThanOrEqualTo(Date value) {
            addCriterion("ShouCangShiJian <=", value, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianIn(List<Date> values) {
            addCriterion("ShouCangShiJian in", values, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianNotIn(List<Date> values) {
            addCriterion("ShouCangShiJian not in", values, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianBetween(Date value1, Date value2) {
            addCriterion("ShouCangShiJian between", value1, value2, "shoucangshijian");
            return (Criteria) this;
        }

        public Criteria andShoucangshijianNotBetween(Date value1, Date value2) {
            addCriterion("ShouCangShiJian not between", value1, value2, "shoucangshijian");
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