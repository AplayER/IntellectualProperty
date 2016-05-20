package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubOutmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubOutmailExample() {
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

        public Criteria andYoujianidIsNull() {
            addCriterion("YouJianID is null");
            return (Criteria) this;
        }

        public Criteria andYoujianidIsNotNull() {
            addCriterion("YouJianID is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianidEqualTo(Integer value) {
            addCriterion("YouJianID =", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotEqualTo(Integer value) {
            addCriterion("YouJianID <>", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidGreaterThan(Integer value) {
            addCriterion("YouJianID >", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouJianID >=", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidLessThan(Integer value) {
            addCriterion("YouJianID <", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidLessThanOrEqualTo(Integer value) {
            addCriterion("YouJianID <=", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidIn(List<Integer> values) {
            addCriterion("YouJianID in", values, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotIn(List<Integer> values) {
            addCriterion("YouJianID not in", values, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidBetween(Integer value1, Integer value2) {
            addCriterion("YouJianID between", value1, value2, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotBetween(Integer value1, Integer value2) {
            addCriterion("YouJianID not between", value1, value2, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidIsNull() {
            addCriterion("YouXiangID is null");
            return (Criteria) this;
        }

        public Criteria andYouxiangidIsNotNull() {
            addCriterion("YouXiangID is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiangidEqualTo(Integer value) {
            addCriterion("YouXiangID =", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidNotEqualTo(Integer value) {
            addCriterion("YouXiangID <>", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidGreaterThan(Integer value) {
            addCriterion("YouXiangID >", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouXiangID >=", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidLessThan(Integer value) {
            addCriterion("YouXiangID <", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidLessThanOrEqualTo(Integer value) {
            addCriterion("YouXiangID <=", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidIn(List<Integer> values) {
            addCriterion("YouXiangID in", values, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidNotIn(List<Integer> values) {
            addCriterion("YouXiangID not in", values, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidBetween(Integer value1, Integer value2) {
            addCriterion("YouXiangID between", value1, value2, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidNotBetween(Integer value1, Integer value2) {
            addCriterion("YouXiangID not between", value1, value2, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingIsNull() {
            addCriterion("YouJianLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingIsNotNull() {
            addCriterion("YouJianLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingEqualTo(Integer value) {
            addCriterion("YouJianLeiXing =", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingNotEqualTo(Integer value) {
            addCriterion("YouJianLeiXing <>", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingGreaterThan(Integer value) {
            addCriterion("YouJianLeiXing >", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouJianLeiXing >=", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingLessThan(Integer value) {
            addCriterion("YouJianLeiXing <", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingLessThanOrEqualTo(Integer value) {
            addCriterion("YouJianLeiXing <=", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingIn(List<Integer> values) {
            addCriterion("YouJianLeiXing in", values, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingNotIn(List<Integer> values) {
            addCriterion("YouJianLeiXing not in", values, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingBetween(Integer value1, Integer value2) {
            addCriterion("YouJianLeiXing between", value1, value2, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("YouJianLeiXing not between", value1, value2, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianIsNull() {
            addCriterion("ShiFouYouFuJian is null");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianIsNotNull() {
            addCriterion("ShiFouYouFuJian is not null");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianEqualTo(Integer value) {
            addCriterion("ShiFouYouFuJian =", value, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianNotEqualTo(Integer value) {
            addCriterion("ShiFouYouFuJian <>", value, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianGreaterThan(Integer value) {
            addCriterion("ShiFouYouFuJian >", value, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYouFuJian >=", value, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianLessThan(Integer value) {
            addCriterion("ShiFouYouFuJian <", value, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYouFuJian <=", value, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianIn(List<Integer> values) {
            addCriterion("ShiFouYouFuJian in", values, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianNotIn(List<Integer> values) {
            addCriterion("ShiFouYouFuJian not in", values, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYouFuJian between", value1, value2, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andShifouyoufujianNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYouFuJian not between", value1, value2, "shifouyoufujian");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingIsNull() {
            addCriterion("FaJianRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingIsNotNull() {
            addCriterion("FaJianRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingEqualTo(String value) {
            addCriterion("FaJianRenXingMing =", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingNotEqualTo(String value) {
            addCriterion("FaJianRenXingMing <>", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingGreaterThan(String value) {
            addCriterion("FaJianRenXingMing >", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FaJianRenXingMing >=", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingLessThan(String value) {
            addCriterion("FaJianRenXingMing <", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("FaJianRenXingMing <=", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingLike(String value) {
            addCriterion("FaJianRenXingMing like", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingNotLike(String value) {
            addCriterion("FaJianRenXingMing not like", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingIn(List<String> values) {
            addCriterion("FaJianRenXingMing in", values, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingNotIn(List<String> values) {
            addCriterion("FaJianRenXingMing not in", values, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingBetween(String value1, String value2) {
            addCriterion("FaJianRenXingMing between", value1, value2, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingNotBetween(String value1, String value2) {
            addCriterion("FaJianRenXingMing not between", value1, value2, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiIsNull() {
            addCriterion("FaJianRenYouJianDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiIsNotNull() {
            addCriterion("FaJianRenYouJianDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiEqualTo(String value) {
            addCriterion("FaJianRenYouJianDiZhi =", value, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiNotEqualTo(String value) {
            addCriterion("FaJianRenYouJianDiZhi <>", value, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiGreaterThan(String value) {
            addCriterion("FaJianRenYouJianDiZhi >", value, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiGreaterThanOrEqualTo(String value) {
            addCriterion("FaJianRenYouJianDiZhi >=", value, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiLessThan(String value) {
            addCriterion("FaJianRenYouJianDiZhi <", value, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiLessThanOrEqualTo(String value) {
            addCriterion("FaJianRenYouJianDiZhi <=", value, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiLike(String value) {
            addCriterion("FaJianRenYouJianDiZhi like", value, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiNotLike(String value) {
            addCriterion("FaJianRenYouJianDiZhi not like", value, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiIn(List<String> values) {
            addCriterion("FaJianRenYouJianDiZhi in", values, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiNotIn(List<String> values) {
            addCriterion("FaJianRenYouJianDiZhi not in", values, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiBetween(String value1, String value2) {
            addCriterion("FaJianRenYouJianDiZhi between", value1, value2, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andFajianrenyoujiandizhiNotBetween(String value1, String value2) {
            addCriterion("FaJianRenYouJianDiZhi not between", value1, value2, "fajianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingIsNull() {
            addCriterion("ShouJianRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingIsNotNull() {
            addCriterion("ShouJianRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingEqualTo(String value) {
            addCriterion("ShouJianRenXingMing =", value, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingNotEqualTo(String value) {
            addCriterion("ShouJianRenXingMing <>", value, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingGreaterThan(String value) {
            addCriterion("ShouJianRenXingMing >", value, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ShouJianRenXingMing >=", value, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingLessThan(String value) {
            addCriterion("ShouJianRenXingMing <", value, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ShouJianRenXingMing <=", value, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingLike(String value) {
            addCriterion("ShouJianRenXingMing like", value, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingNotLike(String value) {
            addCriterion("ShouJianRenXingMing not like", value, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingIn(List<String> values) {
            addCriterion("ShouJianRenXingMing in", values, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingNotIn(List<String> values) {
            addCriterion("ShouJianRenXingMing not in", values, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingBetween(String value1, String value2) {
            addCriterion("ShouJianRenXingMing between", value1, value2, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenxingmingNotBetween(String value1, String value2) {
            addCriterion("ShouJianRenXingMing not between", value1, value2, "shoujianrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiIsNull() {
            addCriterion("ShouJianRenYouJianDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiIsNotNull() {
            addCriterion("ShouJianRenYouJianDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiEqualTo(String value) {
            addCriterion("ShouJianRenYouJianDiZhi =", value, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiNotEqualTo(String value) {
            addCriterion("ShouJianRenYouJianDiZhi <>", value, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiGreaterThan(String value) {
            addCriterion("ShouJianRenYouJianDiZhi >", value, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiGreaterThanOrEqualTo(String value) {
            addCriterion("ShouJianRenYouJianDiZhi >=", value, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiLessThan(String value) {
            addCriterion("ShouJianRenYouJianDiZhi <", value, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiLessThanOrEqualTo(String value) {
            addCriterion("ShouJianRenYouJianDiZhi <=", value, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiLike(String value) {
            addCriterion("ShouJianRenYouJianDiZhi like", value, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiNotLike(String value) {
            addCriterion("ShouJianRenYouJianDiZhi not like", value, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiIn(List<String> values) {
            addCriterion("ShouJianRenYouJianDiZhi in", values, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiNotIn(List<String> values) {
            addCriterion("ShouJianRenYouJianDiZhi not in", values, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiBetween(String value1, String value2) {
            addCriterion("ShouJianRenYouJianDiZhi between", value1, value2, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShoujianrenyoujiandizhiNotBetween(String value1, String value2) {
            addCriterion("ShouJianRenYouJianDiZhi not between", value1, value2, "shoujianrenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiIsNull() {
            addCriterion("YouJianZhuTi is null");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiIsNotNull() {
            addCriterion("YouJianZhuTi is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiEqualTo(String value) {
            addCriterion("YouJianZhuTi =", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiNotEqualTo(String value) {
            addCriterion("YouJianZhuTi <>", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiGreaterThan(String value) {
            addCriterion("YouJianZhuTi >", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiGreaterThanOrEqualTo(String value) {
            addCriterion("YouJianZhuTi >=", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiLessThan(String value) {
            addCriterion("YouJianZhuTi <", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiLessThanOrEqualTo(String value) {
            addCriterion("YouJianZhuTi <=", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiLike(String value) {
            addCriterion("YouJianZhuTi like", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiNotLike(String value) {
            addCriterion("YouJianZhuTi not like", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiIn(List<String> values) {
            addCriterion("YouJianZhuTi in", values, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiNotIn(List<String> values) {
            addCriterion("YouJianZhuTi not in", values, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiBetween(String value1, String value2) {
            addCriterion("YouJianZhuTi between", value1, value2, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiNotBetween(String value1, String value2) {
            addCriterion("YouJianZhuTi not between", value1, value2, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiIsNull() {
            addCriterion("YouJianZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiIsNotNull() {
            addCriterion("YouJianZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiEqualTo(Integer value) {
            addCriterion("YouJianZhuangTai =", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiNotEqualTo(Integer value) {
            addCriterion("YouJianZhuangTai <>", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiGreaterThan(Integer value) {
            addCriterion("YouJianZhuangTai >", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouJianZhuangTai >=", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiLessThan(Integer value) {
            addCriterion("YouJianZhuangTai <", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("YouJianZhuangTai <=", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiIn(List<Integer> values) {
            addCriterion("YouJianZhuangTai in", values, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiNotIn(List<Integer> values) {
            addCriterion("YouJianZhuangTai not in", values, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("YouJianZhuangTai between", value1, value2, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("YouJianZhuangTai not between", value1, value2, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShijianIsNull() {
            addCriterion("ShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShijianIsNotNull() {
            addCriterion("ShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShijianEqualTo(Date value) {
            addCriterion("ShiJian =", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotEqualTo(Date value) {
            addCriterion("ShiJian <>", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThan(Date value) {
            addCriterion("ShiJian >", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ShiJian >=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThan(Date value) {
            addCriterion("ShiJian <", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThanOrEqualTo(Date value) {
            addCriterion("ShiJian <=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianIn(List<Date> values) {
            addCriterion("ShiJian in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotIn(List<Date> values) {
            addCriterion("ShiJian not in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianBetween(Date value1, Date value2) {
            addCriterion("ShiJian between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotBetween(Date value1, Date value2) {
            addCriterion("ShiJian not between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingIsNull() {
            addCriterion("YouJianXiangQing is null");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingIsNotNull() {
            addCriterion("YouJianXiangQing is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingEqualTo(String value) {
            addCriterion("YouJianXiangQing =", value, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingNotEqualTo(String value) {
            addCriterion("YouJianXiangQing <>", value, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingGreaterThan(String value) {
            addCriterion("YouJianXiangQing >", value, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingGreaterThanOrEqualTo(String value) {
            addCriterion("YouJianXiangQing >=", value, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingLessThan(String value) {
            addCriterion("YouJianXiangQing <", value, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingLessThanOrEqualTo(String value) {
            addCriterion("YouJianXiangQing <=", value, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingLike(String value) {
            addCriterion("YouJianXiangQing like", value, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingNotLike(String value) {
            addCriterion("YouJianXiangQing not like", value, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingIn(List<String> values) {
            addCriterion("YouJianXiangQing in", values, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingNotIn(List<String> values) {
            addCriterion("YouJianXiangQing not in", values, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingBetween(String value1, String value2) {
            addCriterion("YouJianXiangQing between", value1, value2, "youjianxiangqing");
            return (Criteria) this;
        }

        public Criteria andYoujianxiangqingNotBetween(String value1, String value2) {
            addCriterion("YouJianXiangQing not between", value1, value2, "youjianxiangqing");
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