package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubStoreProxyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubStoreProxyExample() {
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

        public Criteria andJiluidIsNull() {
            addCriterion("JiLuID is null");
            return (Criteria) this;
        }

        public Criteria andJiluidIsNotNull() {
            addCriterion("JiLuID is not null");
            return (Criteria) this;
        }

        public Criteria andJiluidEqualTo(Integer value) {
            addCriterion("JiLuID =", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotEqualTo(Integer value) {
            addCriterion("JiLuID <>", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidGreaterThan(Integer value) {
            addCriterion("JiLuID >", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiLuID >=", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidLessThan(Integer value) {
            addCriterion("JiLuID <", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidLessThanOrEqualTo(Integer value) {
            addCriterion("JiLuID <=", value, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidIn(List<Integer> values) {
            addCriterion("JiLuID in", values, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotIn(List<Integer> values) {
            addCriterion("JiLuID not in", values, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidBetween(Integer value1, Integer value2) {
            addCriterion("JiLuID between", value1, value2, "jiluid");
            return (Criteria) this;
        }

        public Criteria andJiluidNotBetween(Integer value1, Integer value2) {
            addCriterion("JiLuID not between", value1, value2, "jiluid");
            return (Criteria) this;
        }

        public Criteria andDailirenidIsNull() {
            addCriterion("DaiLiRenID is null");
            return (Criteria) this;
        }

        public Criteria andDailirenidIsNotNull() {
            addCriterion("DaiLiRenID is not null");
            return (Criteria) this;
        }

        public Criteria andDailirenidEqualTo(Integer value) {
            addCriterion("DaiLiRenID =", value, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidNotEqualTo(Integer value) {
            addCriterion("DaiLiRenID <>", value, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidGreaterThan(Integer value) {
            addCriterion("DaiLiRenID >", value, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DaiLiRenID >=", value, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidLessThan(Integer value) {
            addCriterion("DaiLiRenID <", value, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidLessThanOrEqualTo(Integer value) {
            addCriterion("DaiLiRenID <=", value, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidIn(List<Integer> values) {
            addCriterion("DaiLiRenID in", values, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidNotIn(List<Integer> values) {
            addCriterion("DaiLiRenID not in", values, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidBetween(Integer value1, Integer value2) {
            addCriterion("DaiLiRenID between", value1, value2, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDailirenidNotBetween(Integer value1, Integer value2) {
            addCriterion("DaiLiRenID not between", value1, value2, "dailirenid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidIsNull() {
            addCriterion("DianZhuID is null");
            return (Criteria) this;
        }

        public Criteria andDianzhuidIsNotNull() {
            addCriterion("DianZhuID is not null");
            return (Criteria) this;
        }

        public Criteria andDianzhuidEqualTo(Integer value) {
            addCriterion("DianZhuID =", value, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidNotEqualTo(Integer value) {
            addCriterion("DianZhuID <>", value, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidGreaterThan(Integer value) {
            addCriterion("DianZhuID >", value, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DianZhuID >=", value, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidLessThan(Integer value) {
            addCriterion("DianZhuID <", value, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidLessThanOrEqualTo(Integer value) {
            addCriterion("DianZhuID <=", value, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidIn(List<Integer> values) {
            addCriterion("DianZhuID in", values, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidNotIn(List<Integer> values) {
            addCriterion("DianZhuID not in", values, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidBetween(Integer value1, Integer value2) {
            addCriterion("DianZhuID between", value1, value2, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDianzhuidNotBetween(Integer value1, Integer value2) {
            addCriterion("DianZhuID not between", value1, value2, "dianzhuid");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiIsNull() {
            addCriterion("DaiLiZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiIsNotNull() {
            addCriterion("DaiLiZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiEqualTo(Integer value) {
            addCriterion("DaiLiZhuangTai =", value, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiNotEqualTo(Integer value) {
            addCriterion("DaiLiZhuangTai <>", value, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiGreaterThan(Integer value) {
            addCriterion("DaiLiZhuangTai >", value, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("DaiLiZhuangTai >=", value, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiLessThan(Integer value) {
            addCriterion("DaiLiZhuangTai <", value, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("DaiLiZhuangTai <=", value, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiIn(List<Integer> values) {
            addCriterion("DaiLiZhuangTai in", values, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiNotIn(List<Integer> values) {
            addCriterion("DaiLiZhuangTai not in", values, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("DaiLiZhuangTai between", value1, value2, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailizhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("DaiLiZhuangTai not between", value1, value2, "dailizhuangtai");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengIsNull() {
            addCriterion("DaiLiRenMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengIsNotNull() {
            addCriterion("DaiLiRenMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengEqualTo(String value) {
            addCriterion("DaiLiRenMingCheng =", value, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengNotEqualTo(String value) {
            addCriterion("DaiLiRenMingCheng <>", value, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengGreaterThan(String value) {
            addCriterion("DaiLiRenMingCheng >", value, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DaiLiRenMingCheng >=", value, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengLessThan(String value) {
            addCriterion("DaiLiRenMingCheng <", value, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengLessThanOrEqualTo(String value) {
            addCriterion("DaiLiRenMingCheng <=", value, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengLike(String value) {
            addCriterion("DaiLiRenMingCheng like", value, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengNotLike(String value) {
            addCriterion("DaiLiRenMingCheng not like", value, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengIn(List<String> values) {
            addCriterion("DaiLiRenMingCheng in", values, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengNotIn(List<String> values) {
            addCriterion("DaiLiRenMingCheng not in", values, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengBetween(String value1, String value2) {
            addCriterion("DaiLiRenMingCheng between", value1, value2, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDailirenmingchengNotBetween(String value1, String value2) {
            addCriterion("DaiLiRenMingCheng not between", value1, value2, "dailirenmingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengIsNull() {
            addCriterion("DianZhuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengIsNotNull() {
            addCriterion("DianZhuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengEqualTo(String value) {
            addCriterion("DianZhuMingCheng =", value, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengNotEqualTo(String value) {
            addCriterion("DianZhuMingCheng <>", value, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengGreaterThan(String value) {
            addCriterion("DianZhuMingCheng >", value, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DianZhuMingCheng >=", value, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengLessThan(String value) {
            addCriterion("DianZhuMingCheng <", value, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengLessThanOrEqualTo(String value) {
            addCriterion("DianZhuMingCheng <=", value, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengLike(String value) {
            addCriterion("DianZhuMingCheng like", value, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengNotLike(String value) {
            addCriterion("DianZhuMingCheng not like", value, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengIn(List<String> values) {
            addCriterion("DianZhuMingCheng in", values, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengNotIn(List<String> values) {
            addCriterion("DianZhuMingCheng not in", values, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengBetween(String value1, String value2) {
            addCriterion("DianZhuMingCheng between", value1, value2, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianzhumingchengNotBetween(String value1, String value2) {
            addCriterion("DianZhuMingCheng not between", value1, value2, "dianzhumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIsNull() {
            addCriterion("DianPuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIsNotNull() {
            addCriterion("DianPuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengEqualTo(String value) {
            addCriterion("DianPuMingCheng =", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotEqualTo(String value) {
            addCriterion("DianPuMingCheng <>", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengGreaterThan(String value) {
            addCriterion("DianPuMingCheng >", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DianPuMingCheng >=", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLessThan(String value) {
            addCriterion("DianPuMingCheng <", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLessThanOrEqualTo(String value) {
            addCriterion("DianPuMingCheng <=", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLike(String value) {
            addCriterion("DianPuMingCheng like", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotLike(String value) {
            addCriterion("DianPuMingCheng not like", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIn(List<String> values) {
            addCriterion("DianPuMingCheng in", values, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotIn(List<String> values) {
            addCriterion("DianPuMingCheng not in", values, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengBetween(String value1, String value2) {
            addCriterion("DianPuMingCheng between", value1, value2, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotBetween(String value1, String value2) {
            addCriterion("DianPuMingCheng not between", value1, value2, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianIsNull() {
            addCriterion("ShenQingShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianIsNotNull() {
            addCriterion("ShenQingShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianEqualTo(Date value) {
            addCriterion("ShenQingShiJian =", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianNotEqualTo(Date value) {
            addCriterion("ShenQingShiJian <>", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianGreaterThan(Date value) {
            addCriterion("ShenQingShiJian >", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ShenQingShiJian >=", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianLessThan(Date value) {
            addCriterion("ShenQingShiJian <", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianLessThanOrEqualTo(Date value) {
            addCriterion("ShenQingShiJian <=", value, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianIn(List<Date> values) {
            addCriterion("ShenQingShiJian in", values, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianNotIn(List<Date> values) {
            addCriterion("ShenQingShiJian not in", values, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianBetween(Date value1, Date value2) {
            addCriterion("ShenQingShiJian between", value1, value2, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingshijianNotBetween(Date value1, Date value2) {
            addCriterion("ShenQingShiJian not between", value1, value2, "shenqingshijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianIsNull() {
            addCriterion("KaiShiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andKaishishijianIsNotNull() {
            addCriterion("KaiShiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andKaishishijianEqualTo(Date value) {
            addCriterion("KaiShiShiJian =", value, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianNotEqualTo(Date value) {
            addCriterion("KaiShiShiJian <>", value, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianGreaterThan(Date value) {
            addCriterion("KaiShiShiJian >", value, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("KaiShiShiJian >=", value, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianLessThan(Date value) {
            addCriterion("KaiShiShiJian <", value, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianLessThanOrEqualTo(Date value) {
            addCriterion("KaiShiShiJian <=", value, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianIn(List<Date> values) {
            addCriterion("KaiShiShiJian in", values, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianNotIn(List<Date> values) {
            addCriterion("KaiShiShiJian not in", values, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianBetween(Date value1, Date value2) {
            addCriterion("KaiShiShiJian between", value1, value2, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andKaishishijianNotBetween(Date value1, Date value2) {
            addCriterion("KaiShiShiJian not between", value1, value2, "kaishishijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIsNull() {
            addCriterion("JieShuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIsNotNull() {
            addCriterion("JieShuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andJieshushijianEqualTo(Date value) {
            addCriterion("JieShuShiJian =", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotEqualTo(Date value) {
            addCriterion("JieShuShiJian <>", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianGreaterThan(Date value) {
            addCriterion("JieShuShiJian >", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("JieShuShiJian >=", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianLessThan(Date value) {
            addCriterion("JieShuShiJian <", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianLessThanOrEqualTo(Date value) {
            addCriterion("JieShuShiJian <=", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIn(List<Date> values) {
            addCriterion("JieShuShiJian in", values, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotIn(List<Date> values) {
            addCriterion("JieShuShiJian not in", values, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianBetween(Date value1, Date value2) {
            addCriterion("JieShuShiJian between", value1, value2, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotBetween(Date value1, Date value2) {
            addCriterion("JieShuShiJian not between", value1, value2, "jieshushijian");
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