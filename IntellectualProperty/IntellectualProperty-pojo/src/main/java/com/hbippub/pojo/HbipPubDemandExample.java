package com.hbippub.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubDemandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubDemandExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andXuqiuidIsNull() {
            addCriterion("XuQiuID is null");
            return (Criteria) this;
        }

        public Criteria andXuqiuidIsNotNull() {
            addCriterion("XuQiuID is not null");
            return (Criteria) this;
        }

        public Criteria andXuqiuidEqualTo(Integer value) {
            addCriterion("XuQiuID =", value, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidNotEqualTo(Integer value) {
            addCriterion("XuQiuID <>", value, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidGreaterThan(Integer value) {
            addCriterion("XuQiuID >", value, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuQiuID >=", value, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidLessThan(Integer value) {
            addCriterion("XuQiuID <", value, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidLessThanOrEqualTo(Integer value) {
            addCriterion("XuQiuID <=", value, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidIn(List<Integer> values) {
            addCriterion("XuQiuID in", values, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidNotIn(List<Integer> values) {
            addCriterion("XuQiuID not in", values, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidBetween(Integer value1, Integer value2) {
            addCriterion("XuQiuID between", value1, value2, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiuidNotBetween(Integer value1, Integer value2) {
            addCriterion("XuQiuID not between", value1, value2, "xuqiuid");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengIsNull() {
            addCriterion("XuQiuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengIsNotNull() {
            addCriterion("XuQiuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengEqualTo(String value) {
            addCriterion("XuQiuMingCheng =", value, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengNotEqualTo(String value) {
            addCriterion("XuQiuMingCheng <>", value, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengGreaterThan(String value) {
            addCriterion("XuQiuMingCheng >", value, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("XuQiuMingCheng >=", value, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengLessThan(String value) {
            addCriterion("XuQiuMingCheng <", value, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengLessThanOrEqualTo(String value) {
            addCriterion("XuQiuMingCheng <=", value, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengLike(String value) {
            addCriterion("XuQiuMingCheng like", value, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengNotLike(String value) {
            addCriterion("XuQiuMingCheng not like", value, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengIn(List<String> values) {
            addCriterion("XuQiuMingCheng in", values, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengNotIn(List<String> values) {
            addCriterion("XuQiuMingCheng not in", values, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengBetween(String value1, String value2) {
            addCriterion("XuQiuMingCheng between", value1, value2, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuqiumingchengNotBetween(String value1, String value2) {
            addCriterion("XuQiuMingCheng not between", value1, value2, "xuqiumingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengIsNull() {
            addCriterion("ShangPinLeiXingMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengIsNotNull() {
            addCriterion("ShangPinLeiXingMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengEqualTo(String value) {
            addCriterion("ShangPinLeiXingMingCheng =", value, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengNotEqualTo(String value) {
            addCriterion("ShangPinLeiXingMingCheng <>", value, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengGreaterThan(String value) {
            addCriterion("ShangPinLeiXingMingCheng >", value, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ShangPinLeiXingMingCheng >=", value, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengLessThan(String value) {
            addCriterion("ShangPinLeiXingMingCheng <", value, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengLessThanOrEqualTo(String value) {
            addCriterion("ShangPinLeiXingMingCheng <=", value, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengLike(String value) {
            addCriterion("ShangPinLeiXingMingCheng like", value, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengNotLike(String value) {
            addCriterion("ShangPinLeiXingMingCheng not like", value, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengIn(List<String> values) {
            addCriterion("ShangPinLeiXingMingCheng in", values, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengNotIn(List<String> values) {
            addCriterion("ShangPinLeiXingMingCheng not in", values, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengBetween(String value1, String value2) {
            addCriterion("ShangPinLeiXingMingCheng between", value1, value2, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingmingchengNotBetween(String value1, String value2) {
            addCriterion("ShangPinLeiXingMingCheng not between", value1, value2, "shangpinleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidIsNull() {
            addCriterion("ShangPinLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidIsNotNull() {
            addCriterion("ShangPinLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidEqualTo(Integer value) {
            addCriterion("ShangPinLeiXingID =", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidNotEqualTo(Integer value) {
            addCriterion("ShangPinLeiXingID <>", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidGreaterThan(Integer value) {
            addCriterion("ShangPinLeiXingID >", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShangPinLeiXingID >=", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidLessThan(Integer value) {
            addCriterion("ShangPinLeiXingID <", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidLessThanOrEqualTo(Integer value) {
            addCriterion("ShangPinLeiXingID <=", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidIn(List<Integer> values) {
            addCriterion("ShangPinLeiXingID in", values, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidNotIn(List<Integer> values) {
            addCriterion("ShangPinLeiXingID not in", values, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinLeiXingID between", value1, value2, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinLeiXingID not between", value1, value2, "shangpinleixingid");
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

        public Criteria andXingmingIsNull() {
            addCriterion("XingMing is null");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNotNull() {
            addCriterion("XingMing is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingEqualTo(String value) {
            addCriterion("XingMing =", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotEqualTo(String value) {
            addCriterion("XingMing <>", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThan(String value) {
            addCriterion("XingMing >", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThanOrEqualTo(String value) {
            addCriterion("XingMing >=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThan(String value) {
            addCriterion("XingMing <", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThanOrEqualTo(String value) {
            addCriterion("XingMing <=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLike(String value) {
            addCriterion("XingMing like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotLike(String value) {
            addCriterion("XingMing not like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingIn(List<String> values) {
            addCriterion("XingMing in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotIn(List<String> values) {
            addCriterion("XingMing not in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingBetween(String value1, String value2) {
            addCriterion("XingMing between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotBetween(String value1, String value2) {
            addCriterion("XingMing not between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andFabushijianIsNull() {
            addCriterion("FaBuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andFabushijianIsNotNull() {
            addCriterion("FaBuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andFabushijianEqualTo(Date value) {
            addCriterion("FaBuShiJian =", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotEqualTo(Date value) {
            addCriterion("FaBuShiJian <>", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianGreaterThan(Date value) {
            addCriterion("FaBuShiJian >", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("FaBuShiJian >=", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianLessThan(Date value) {
            addCriterion("FaBuShiJian <", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianLessThanOrEqualTo(Date value) {
            addCriterion("FaBuShiJian <=", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianIn(List<Date> values) {
            addCriterion("FaBuShiJian in", values, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotIn(List<Date> values) {
            addCriterion("FaBuShiJian not in", values, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianBetween(Date value1, Date value2) {
            addCriterion("FaBuShiJian between", value1, value2, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotBetween(Date value1, Date value2) {
            addCriterion("FaBuShiJian not between", value1, value2, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianIsNull() {
            addCriterion("QiuGouJieZhiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianIsNotNull() {
            addCriterion("QiuGouJieZhiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianEqualTo(Date value) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian =", value, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian <>", value, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianGreaterThan(Date value) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian >", value, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian >=", value, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianLessThan(Date value) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian <", value, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian <=", value, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianIn(List<Date> values) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian in", values, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian not in", values, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian between", value1, value2, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andQiugoujiezhishijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("QiuGouJieZhiShiJian not between", value1, value2, "qiugoujiezhishijian");
            return (Criteria) this;
        }

        public Criteria andYuqijiageIsNull() {
            addCriterion("YuQiJiaGe is null");
            return (Criteria) this;
        }

        public Criteria andYuqijiageIsNotNull() {
            addCriterion("YuQiJiaGe is not null");
            return (Criteria) this;
        }

        public Criteria andYuqijiageEqualTo(BigDecimal value) {
            addCriterion("YuQiJiaGe =", value, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageNotEqualTo(BigDecimal value) {
            addCriterion("YuQiJiaGe <>", value, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageGreaterThan(BigDecimal value) {
            addCriterion("YuQiJiaGe >", value, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YuQiJiaGe >=", value, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageLessThan(BigDecimal value) {
            addCriterion("YuQiJiaGe <", value, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YuQiJiaGe <=", value, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageIn(List<BigDecimal> values) {
            addCriterion("YuQiJiaGe in", values, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageNotIn(List<BigDecimal> values) {
            addCriterion("YuQiJiaGe not in", values, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YuQiJiaGe between", value1, value2, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andYuqijiageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YuQiJiaGe not between", value1, value2, "yuqijiage");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengIsNull() {
            addCriterion("HangYeLeiXingMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengIsNotNull() {
            addCriterion("HangYeLeiXingMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengEqualTo(String value) {
            addCriterion("HangYeLeiXingMingCheng =", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengNotEqualTo(String value) {
            addCriterion("HangYeLeiXingMingCheng <>", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengGreaterThan(String value) {
            addCriterion("HangYeLeiXingMingCheng >", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("HangYeLeiXingMingCheng >=", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengLessThan(String value) {
            addCriterion("HangYeLeiXingMingCheng <", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengLessThanOrEqualTo(String value) {
            addCriterion("HangYeLeiXingMingCheng <=", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengLike(String value) {
            addCriterion("HangYeLeiXingMingCheng like", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengNotLike(String value) {
            addCriterion("HangYeLeiXingMingCheng not like", value, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengIn(List<String> values) {
            addCriterion("HangYeLeiXingMingCheng in", values, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengNotIn(List<String> values) {
            addCriterion("HangYeLeiXingMingCheng not in", values, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengBetween(String value1, String value2) {
            addCriterion("HangYeLeiXingMingCheng between", value1, value2, "hangyeleixingmingcheng");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingmingchengNotBetween(String value1, String value2) {
            addCriterion("HangYeLeiXingMingCheng not between", value1, value2, "hangyeleixingmingcheng");
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