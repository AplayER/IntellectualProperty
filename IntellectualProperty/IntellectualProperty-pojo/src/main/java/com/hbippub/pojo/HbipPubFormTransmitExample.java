package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubFormTransmitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubFormTransmitExample() {
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

        public Criteria andBianhaoidIsNull() {
            addCriterion("BianHaoID is null");
            return (Criteria) this;
        }

        public Criteria andBianhaoidIsNotNull() {
            addCriterion("BianHaoID is not null");
            return (Criteria) this;
        }

        public Criteria andBianhaoidEqualTo(Integer value) {
            addCriterion("BianHaoID =", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotEqualTo(Integer value) {
            addCriterion("BianHaoID <>", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidGreaterThan(Integer value) {
            addCriterion("BianHaoID >", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BianHaoID >=", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidLessThan(Integer value) {
            addCriterion("BianHaoID <", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidLessThanOrEqualTo(Integer value) {
            addCriterion("BianHaoID <=", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidIn(List<Integer> values) {
            addCriterion("BianHaoID in", values, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotIn(List<Integer> values) {
            addCriterion("BianHaoID not in", values, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidBetween(Integer value1, Integer value2) {
            addCriterion("BianHaoID between", value1, value2, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("BianHaoID not between", value1, value2, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidIsNull() {
            addCriterion("ZhuanFaZhuanJiaID is null");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidIsNotNull() {
            addCriterion("ZhuanFaZhuanJiaID is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidEqualTo(Integer value) {
            addCriterion("ZhuanFaZhuanJiaID =", value, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidNotEqualTo(Integer value) {
            addCriterion("ZhuanFaZhuanJiaID <>", value, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidGreaterThan(Integer value) {
            addCriterion("ZhuanFaZhuanJiaID >", value, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZhuanFaZhuanJiaID >=", value, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidLessThan(Integer value) {
            addCriterion("ZhuanFaZhuanJiaID <", value, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidLessThanOrEqualTo(Integer value) {
            addCriterion("ZhuanFaZhuanJiaID <=", value, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidIn(List<Integer> values) {
            addCriterion("ZhuanFaZhuanJiaID in", values, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidNotIn(List<Integer> values) {
            addCriterion("ZhuanFaZhuanJiaID not in", values, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidBetween(Integer value1, Integer value2) {
            addCriterion("ZhuanFaZhuanJiaID between", value1, value2, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZhuanFaZhuanJiaID not between", value1, value2, "zhuanfazhuanjiaid");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingIsNull() {
            addCriterion("ZhuanFaZhuanJiaXingMing is null");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingIsNotNull() {
            addCriterion("ZhuanFaZhuanJiaXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingEqualTo(String value) {
            addCriterion("ZhuanFaZhuanJiaXingMing =", value, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingNotEqualTo(String value) {
            addCriterion("ZhuanFaZhuanJiaXingMing <>", value, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingGreaterThan(String value) {
            addCriterion("ZhuanFaZhuanJiaXingMing >", value, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuanFaZhuanJiaXingMing >=", value, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingLessThan(String value) {
            addCriterion("ZhuanFaZhuanJiaXingMing <", value, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingLessThanOrEqualTo(String value) {
            addCriterion("ZhuanFaZhuanJiaXingMing <=", value, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingLike(String value) {
            addCriterion("ZhuanFaZhuanJiaXingMing like", value, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingNotLike(String value) {
            addCriterion("ZhuanFaZhuanJiaXingMing not like", value, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingIn(List<String> values) {
            addCriterion("ZhuanFaZhuanJiaXingMing in", values, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingNotIn(List<String> values) {
            addCriterion("ZhuanFaZhuanJiaXingMing not in", values, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingBetween(String value1, String value2) {
            addCriterion("ZhuanFaZhuanJiaXingMing between", value1, value2, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfazhuanjiaxingmingNotBetween(String value1, String value2) {
            addCriterion("ZhuanFaZhuanJiaXingMing not between", value1, value2, "zhuanfazhuanjiaxingming");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianIsNull() {
            addCriterion("ZhuanFaShiJian is null");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianIsNotNull() {
            addCriterion("ZhuanFaShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianEqualTo(Date value) {
            addCriterion("ZhuanFaShiJian =", value, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianNotEqualTo(Date value) {
            addCriterion("ZhuanFaShiJian <>", value, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianGreaterThan(Date value) {
            addCriterion("ZhuanFaShiJian >", value, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZhuanFaShiJian >=", value, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianLessThan(Date value) {
            addCriterion("ZhuanFaShiJian <", value, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianLessThanOrEqualTo(Date value) {
            addCriterion("ZhuanFaShiJian <=", value, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianIn(List<Date> values) {
            addCriterion("ZhuanFaShiJian in", values, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianNotIn(List<Date> values) {
            addCriterion("ZhuanFaShiJian not in", values, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianBetween(Date value1, Date value2) {
            addCriterion("ZhuanFaShiJian between", value1, value2, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfashijianNotBetween(Date value1, Date value2) {
            addCriterion("ZhuanFaShiJian not between", value1, value2, "zhuanfashijian");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiIsNull() {
            addCriterion("HuiFuZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiIsNotNull() {
            addCriterion("HuiFuZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiEqualTo(Integer value) {
            addCriterion("HuiFuZhuangTai =", value, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiNotEqualTo(Integer value) {
            addCriterion("HuiFuZhuangTai <>", value, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiGreaterThan(Integer value) {
            addCriterion("HuiFuZhuangTai >", value, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("HuiFuZhuangTai >=", value, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiLessThan(Integer value) {
            addCriterion("HuiFuZhuangTai <", value, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("HuiFuZhuangTai <=", value, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiIn(List<Integer> values) {
            addCriterion("HuiFuZhuangTai in", values, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiNotIn(List<Integer> values) {
            addCriterion("HuiFuZhuangTai not in", values, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("HuiFuZhuangTai between", value1, value2, "huifuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andHuifuzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("HuiFuZhuangTai not between", value1, value2, "huifuzhuangtai");
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

        public Criteria andShenheyijianIsNull() {
            addCriterion("ShenHeYiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenheyijianIsNotNull() {
            addCriterion("ShenHeYiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenheyijianEqualTo(String value) {
            addCriterion("ShenHeYiJian =", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianNotEqualTo(String value) {
            addCriterion("ShenHeYiJian <>", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianGreaterThan(String value) {
            addCriterion("ShenHeYiJian >", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianGreaterThanOrEqualTo(String value) {
            addCriterion("ShenHeYiJian >=", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianLessThan(String value) {
            addCriterion("ShenHeYiJian <", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianLessThanOrEqualTo(String value) {
            addCriterion("ShenHeYiJian <=", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianLike(String value) {
            addCriterion("ShenHeYiJian like", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianNotLike(String value) {
            addCriterion("ShenHeYiJian not like", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianIn(List<String> values) {
            addCriterion("ShenHeYiJian in", values, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianNotIn(List<String> values) {
            addCriterion("ShenHeYiJian not in", values, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianBetween(String value1, String value2) {
            addCriterion("ShenHeYiJian between", value1, value2, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianNotBetween(String value1, String value2) {
            addCriterion("ShenHeYiJian not between", value1, value2, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidIsNull() {
            addCriterion("ShenQingBiaoID is null");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidIsNotNull() {
            addCriterion("ShenQingBiaoID is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidEqualTo(Integer value) {
            addCriterion("ShenQingBiaoID =", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidNotEqualTo(Integer value) {
            addCriterion("ShenQingBiaoID <>", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidGreaterThan(Integer value) {
            addCriterion("ShenQingBiaoID >", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenQingBiaoID >=", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidLessThan(Integer value) {
            addCriterion("ShenQingBiaoID <", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidLessThanOrEqualTo(Integer value) {
            addCriterion("ShenQingBiaoID <=", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidIn(List<Integer> values) {
            addCriterion("ShenQingBiaoID in", values, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidNotIn(List<Integer> values) {
            addCriterion("ShenQingBiaoID not in", values, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingBiaoID between", value1, value2, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingBiaoID not between", value1, value2, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanIsNull() {
            addCriterion("ShiFouNengChaKan is null");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanIsNotNull() {
            addCriterion("ShiFouNengChaKan is not null");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanEqualTo(Integer value) {
            addCriterion("ShiFouNengChaKan =", value, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanNotEqualTo(Integer value) {
            addCriterion("ShiFouNengChaKan <>", value, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanGreaterThan(Integer value) {
            addCriterion("ShiFouNengChaKan >", value, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouNengChaKan >=", value, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanLessThan(Integer value) {
            addCriterion("ShiFouNengChaKan <", value, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouNengChaKan <=", value, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanIn(List<Integer> values) {
            addCriterion("ShiFouNengChaKan in", values, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanNotIn(List<Integer> values) {
            addCriterion("ShiFouNengChaKan not in", values, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouNengChaKan between", value1, value2, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengchakanNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouNengChaKan not between", value1, value2, "shifounengchakan");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunIsNull() {
            addCriterion("ShiFouNengPingLun is null");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunIsNotNull() {
            addCriterion("ShiFouNengPingLun is not null");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunEqualTo(Integer value) {
            addCriterion("ShiFouNengPingLun =", value, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunNotEqualTo(Integer value) {
            addCriterion("ShiFouNengPingLun <>", value, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunGreaterThan(Integer value) {
            addCriterion("ShiFouNengPingLun >", value, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouNengPingLun >=", value, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunLessThan(Integer value) {
            addCriterion("ShiFouNengPingLun <", value, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouNengPingLun <=", value, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunIn(List<Integer> values) {
            addCriterion("ShiFouNengPingLun in", values, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunNotIn(List<Integer> values) {
            addCriterion("ShiFouNengPingLun not in", values, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouNengPingLun between", value1, value2, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andShifounengpinglunNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouNengPingLun not between", value1, value2, "shifounengpinglun");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieIsNull() {
            addCriterion("ZhuanJiaLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieIsNotNull() {
            addCriterion("ZhuanJiaLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieEqualTo(String value) {
            addCriterion("ZhuanJiaLeiBie =", value, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieNotEqualTo(String value) {
            addCriterion("ZhuanJiaLeiBie <>", value, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieGreaterThan(String value) {
            addCriterion("ZhuanJiaLeiBie >", value, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuanJiaLeiBie >=", value, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieLessThan(String value) {
            addCriterion("ZhuanJiaLeiBie <", value, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieLessThanOrEqualTo(String value) {
            addCriterion("ZhuanJiaLeiBie <=", value, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieLike(String value) {
            addCriterion("ZhuanJiaLeiBie like", value, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieNotLike(String value) {
            addCriterion("ZhuanJiaLeiBie not like", value, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieIn(List<String> values) {
            addCriterion("ZhuanJiaLeiBie in", values, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieNotIn(List<String> values) {
            addCriterion("ZhuanJiaLeiBie not in", values, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieBetween(String value1, String value2) {
            addCriterion("ZhuanJiaLeiBie between", value1, value2, "zhuanjialeibie");
            return (Criteria) this;
        }

        public Criteria andZhuanjialeibieNotBetween(String value1, String value2) {
            addCriterion("ZhuanJiaLeiBie not between", value1, value2, "zhuanjialeibie");
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