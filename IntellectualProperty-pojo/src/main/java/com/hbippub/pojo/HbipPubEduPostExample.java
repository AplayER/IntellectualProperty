package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubEduPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubEduPostExample() {
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

        public Criteria andBiaotiIsNull() {
            addCriterion("BiaoTi is null");
            return (Criteria) this;
        }

        public Criteria andBiaotiIsNotNull() {
            addCriterion("BiaoTi is not null");
            return (Criteria) this;
        }

        public Criteria andBiaotiEqualTo(String value) {
            addCriterion("BiaoTi =", value, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiNotEqualTo(String value) {
            addCriterion("BiaoTi <>", value, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiGreaterThan(String value) {
            addCriterion("BiaoTi >", value, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("BiaoTi >=", value, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiLessThan(String value) {
            addCriterion("BiaoTi <", value, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiLessThanOrEqualTo(String value) {
            addCriterion("BiaoTi <=", value, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiLike(String value) {
            addCriterion("BiaoTi like", value, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiNotLike(String value) {
            addCriterion("BiaoTi not like", value, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiIn(List<String> values) {
            addCriterion("BiaoTi in", values, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiNotIn(List<String> values) {
            addCriterion("BiaoTi not in", values, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiBetween(String value1, String value2) {
            addCriterion("BiaoTi between", value1, value2, "biaoti");
            return (Criteria) this;
        }

        public Criteria andBiaotiNotBetween(String value1, String value2) {
            addCriterion("BiaoTi not between", value1, value2, "biaoti");
            return (Criteria) this;
        }

        public Criteria andLouzhuidIsNull() {
            addCriterion("LouZhuID is null");
            return (Criteria) this;
        }

        public Criteria andLouzhuidIsNotNull() {
            addCriterion("LouZhuID is not null");
            return (Criteria) this;
        }

        public Criteria andLouzhuidEqualTo(Integer value) {
            addCriterion("LouZhuID =", value, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidNotEqualTo(Integer value) {
            addCriterion("LouZhuID <>", value, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidGreaterThan(Integer value) {
            addCriterion("LouZhuID >", value, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LouZhuID >=", value, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidLessThan(Integer value) {
            addCriterion("LouZhuID <", value, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidLessThanOrEqualTo(Integer value) {
            addCriterion("LouZhuID <=", value, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidIn(List<Integer> values) {
            addCriterion("LouZhuID in", values, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidNotIn(List<Integer> values) {
            addCriterion("LouZhuID not in", values, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidBetween(Integer value1, Integer value2) {
            addCriterion("LouZhuID between", value1, value2, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuidNotBetween(Integer value1, Integer value2) {
            addCriterion("LouZhuID not between", value1, value2, "louzhuid");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingIsNull() {
            addCriterion("LouZhuXingMing is null");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingIsNotNull() {
            addCriterion("LouZhuXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingEqualTo(String value) {
            addCriterion("LouZhuXingMing =", value, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingNotEqualTo(String value) {
            addCriterion("LouZhuXingMing <>", value, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingGreaterThan(String value) {
            addCriterion("LouZhuXingMing >", value, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("LouZhuXingMing >=", value, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingLessThan(String value) {
            addCriterion("LouZhuXingMing <", value, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingLessThanOrEqualTo(String value) {
            addCriterion("LouZhuXingMing <=", value, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingLike(String value) {
            addCriterion("LouZhuXingMing like", value, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingNotLike(String value) {
            addCriterion("LouZhuXingMing not like", value, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingIn(List<String> values) {
            addCriterion("LouZhuXingMing in", values, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingNotIn(List<String> values) {
            addCriterion("LouZhuXingMing not in", values, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingBetween(String value1, String value2) {
            addCriterion("LouZhuXingMing between", value1, value2, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andLouzhuxingmingNotBetween(String value1, String value2) {
            addCriterion("LouZhuXingMing not between", value1, value2, "louzhuxingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidIsNull() {
            addCriterion("ZuiJinHuiFuZheID is null");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidIsNotNull() {
            addCriterion("ZuiJinHuiFuZheID is not null");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidEqualTo(Integer value) {
            addCriterion("ZuiJinHuiFuZheID =", value, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidNotEqualTo(Integer value) {
            addCriterion("ZuiJinHuiFuZheID <>", value, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidGreaterThan(Integer value) {
            addCriterion("ZuiJinHuiFuZheID >", value, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZuiJinHuiFuZheID >=", value, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidLessThan(Integer value) {
            addCriterion("ZuiJinHuiFuZheID <", value, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidLessThanOrEqualTo(Integer value) {
            addCriterion("ZuiJinHuiFuZheID <=", value, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidIn(List<Integer> values) {
            addCriterion("ZuiJinHuiFuZheID in", values, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidNotIn(List<Integer> values) {
            addCriterion("ZuiJinHuiFuZheID not in", values, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidBetween(Integer value1, Integer value2) {
            addCriterion("ZuiJinHuiFuZheID between", value1, value2, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzheidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZuiJinHuiFuZheID not between", value1, value2, "zuijinhuifuzheid");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingIsNull() {
            addCriterion("ZuiJinHuiFuZheXingMing is null");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingIsNotNull() {
            addCriterion("ZuiJinHuiFuZheXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingEqualTo(String value) {
            addCriterion("ZuiJinHuiFuZheXingMing =", value, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingNotEqualTo(String value) {
            addCriterion("ZuiJinHuiFuZheXingMing <>", value, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingGreaterThan(String value) {
            addCriterion("ZuiJinHuiFuZheXingMing >", value, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ZuiJinHuiFuZheXingMing >=", value, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingLessThan(String value) {
            addCriterion("ZuiJinHuiFuZheXingMing <", value, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingLessThanOrEqualTo(String value) {
            addCriterion("ZuiJinHuiFuZheXingMing <=", value, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingLike(String value) {
            addCriterion("ZuiJinHuiFuZheXingMing like", value, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingNotLike(String value) {
            addCriterion("ZuiJinHuiFuZheXingMing not like", value, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingIn(List<String> values) {
            addCriterion("ZuiJinHuiFuZheXingMing in", values, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingNotIn(List<String> values) {
            addCriterion("ZuiJinHuiFuZheXingMing not in", values, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingBetween(String value1, String value2) {
            addCriterion("ZuiJinHuiFuZheXingMing between", value1, value2, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifuzhexingmingNotBetween(String value1, String value2) {
            addCriterion("ZuiJinHuiFuZheXingMing not between", value1, value2, "zuijinhuifuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianIsNull() {
            addCriterion("ZuiJinHuiFuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianIsNotNull() {
            addCriterion("ZuiJinHuiFuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianEqualTo(Date value) {
            addCriterion("ZuiJinHuiFuShiJian =", value, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianNotEqualTo(Date value) {
            addCriterion("ZuiJinHuiFuShiJian <>", value, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianGreaterThan(Date value) {
            addCriterion("ZuiJinHuiFuShiJian >", value, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZuiJinHuiFuShiJian >=", value, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianLessThan(Date value) {
            addCriterion("ZuiJinHuiFuShiJian <", value, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianLessThanOrEqualTo(Date value) {
            addCriterion("ZuiJinHuiFuShiJian <=", value, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianIn(List<Date> values) {
            addCriterion("ZuiJinHuiFuShiJian in", values, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianNotIn(List<Date> values) {
            addCriterion("ZuiJinHuiFuShiJian not in", values, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianBetween(Date value1, Date value2) {
            addCriterion("ZuiJinHuiFuShiJian between", value1, value2, "zuijinhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuijinhuifushijianNotBetween(Date value1, Date value2) {
            addCriterion("ZuiJinHuiFuShiJian not between", value1, value2, "zuijinhuifushijian");
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

        public Criteria andHuifushuIsNull() {
            addCriterion("HuiFuShu is null");
            return (Criteria) this;
        }

        public Criteria andHuifushuIsNotNull() {
            addCriterion("HuiFuShu is not null");
            return (Criteria) this;
        }

        public Criteria andHuifushuEqualTo(Integer value) {
            addCriterion("HuiFuShu =", value, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuNotEqualTo(Integer value) {
            addCriterion("HuiFuShu <>", value, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuGreaterThan(Integer value) {
            addCriterion("HuiFuShu >", value, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("HuiFuShu >=", value, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuLessThan(Integer value) {
            addCriterion("HuiFuShu <", value, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuLessThanOrEqualTo(Integer value) {
            addCriterion("HuiFuShu <=", value, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuIn(List<Integer> values) {
            addCriterion("HuiFuShu in", values, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuNotIn(List<Integer> values) {
            addCriterion("HuiFuShu not in", values, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuBetween(Integer value1, Integer value2) {
            addCriterion("HuiFuShu between", value1, value2, "huifushu");
            return (Criteria) this;
        }

        public Criteria andHuifushuNotBetween(Integer value1, Integer value2) {
            addCriterion("HuiFuShu not between", value1, value2, "huifushu");
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