package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubDiscussionPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubDiscussionPostExample() {
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

        public Criteria andTaolunquidIsNull() {
            addCriterion("TaoLunQuID is null");
            return (Criteria) this;
        }

        public Criteria andTaolunquidIsNotNull() {
            addCriterion("TaoLunQuID is not null");
            return (Criteria) this;
        }

        public Criteria andTaolunquidEqualTo(Integer value) {
            addCriterion("TaoLunQuID =", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidNotEqualTo(Integer value) {
            addCriterion("TaoLunQuID <>", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidGreaterThan(Integer value) {
            addCriterion("TaoLunQuID >", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TaoLunQuID >=", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidLessThan(Integer value) {
            addCriterion("TaoLunQuID <", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidLessThanOrEqualTo(Integer value) {
            addCriterion("TaoLunQuID <=", value, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidIn(List<Integer> values) {
            addCriterion("TaoLunQuID in", values, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidNotIn(List<Integer> values) {
            addCriterion("TaoLunQuID not in", values, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidBetween(Integer value1, Integer value2) {
            addCriterion("TaoLunQuID between", value1, value2, "taolunquid");
            return (Criteria) this;
        }

        public Criteria andTaolunquidNotBetween(Integer value1, Integer value2) {
            addCriterion("TaoLunQuID not between", value1, value2, "taolunquid");
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

        public Criteria andNeirongIsNull() {
            addCriterion("NeiRong is null");
            return (Criteria) this;
        }

        public Criteria andNeirongIsNotNull() {
            addCriterion("NeiRong is not null");
            return (Criteria) this;
        }

        public Criteria andNeirongEqualTo(String value) {
            addCriterion("NeiRong =", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotEqualTo(String value) {
            addCriterion("NeiRong <>", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThan(String value) {
            addCriterion("NeiRong >", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThanOrEqualTo(String value) {
            addCriterion("NeiRong >=", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLessThan(String value) {
            addCriterion("NeiRong <", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLessThanOrEqualTo(String value) {
            addCriterion("NeiRong <=", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLike(String value) {
            addCriterion("NeiRong like", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotLike(String value) {
            addCriterion("NeiRong not like", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongIn(List<String> values) {
            addCriterion("NeiRong in", values, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotIn(List<String> values) {
            addCriterion("NeiRong not in", values, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongBetween(String value1, String value2) {
            addCriterion("NeiRong between", value1, value2, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotBetween(String value1, String value2) {
            addCriterion("NeiRong not between", value1, value2, "neirong");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianIsNull() {
            addCriterion("FaBiaoShiJian is null");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianIsNotNull() {
            addCriterion("FaBiaoShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianEqualTo(Date value) {
            addCriterion("FaBiaoShiJian =", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianNotEqualTo(Date value) {
            addCriterion("FaBiaoShiJian <>", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianGreaterThan(Date value) {
            addCriterion("FaBiaoShiJian >", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("FaBiaoShiJian >=", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianLessThan(Date value) {
            addCriterion("FaBiaoShiJian <", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianLessThanOrEqualTo(Date value) {
            addCriterion("FaBiaoShiJian <=", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianIn(List<Date> values) {
            addCriterion("FaBiaoShiJian in", values, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianNotIn(List<Date> values) {
            addCriterion("FaBiaoShiJian not in", values, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianBetween(Date value1, Date value2) {
            addCriterion("FaBiaoShiJian between", value1, value2, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianNotBetween(Date value1, Date value2) {
            addCriterion("FaBiaoShiJian not between", value1, value2, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingIsNull() {
            addCriterion("FaBuZheXingMing is null");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingIsNotNull() {
            addCriterion("FaBuZheXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingEqualTo(String value) {
            addCriterion("FaBuZheXingMing =", value, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingNotEqualTo(String value) {
            addCriterion("FaBuZheXingMing <>", value, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingGreaterThan(String value) {
            addCriterion("FaBuZheXingMing >", value, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FaBuZheXingMing >=", value, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingLessThan(String value) {
            addCriterion("FaBuZheXingMing <", value, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingLessThanOrEqualTo(String value) {
            addCriterion("FaBuZheXingMing <=", value, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingLike(String value) {
            addCriterion("FaBuZheXingMing like", value, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingNotLike(String value) {
            addCriterion("FaBuZheXingMing not like", value, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingIn(List<String> values) {
            addCriterion("FaBuZheXingMing in", values, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingNotIn(List<String> values) {
            addCriterion("FaBuZheXingMing not in", values, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingBetween(String value1, String value2) {
            addCriterion("FaBuZheXingMing between", value1, value2, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andFabuzhexingmingNotBetween(String value1, String value2) {
            addCriterion("FaBuZheXingMing not between", value1, value2, "fabuzhexingming");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNull() {
            addCriterion("ZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("ZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(Integer value) {
            addCriterion("ZhuangTai =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(Integer value) {
            addCriterion("ZhuangTai <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(Integer value) {
            addCriterion("ZhuangTai >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZhuangTai >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(Integer value) {
            addCriterion("ZhuangTai <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("ZhuangTai <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<Integer> values) {
            addCriterion("ZhuangTai in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<Integer> values) {
            addCriterion("ZhuangTai not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("ZhuangTai between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("ZhuangTai not between", value1, value2, "zhuangtai");
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

        public Criteria andZuihouhuifushijianIsNull() {
            addCriterion("ZuiHouHuiFuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianIsNotNull() {
            addCriterion("ZuiHouHuiFuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianEqualTo(Date value) {
            addCriterion("ZuiHouHuiFuShiJian =", value, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianNotEqualTo(Date value) {
            addCriterion("ZuiHouHuiFuShiJian <>", value, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianGreaterThan(Date value) {
            addCriterion("ZuiHouHuiFuShiJian >", value, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZuiHouHuiFuShiJian >=", value, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianLessThan(Date value) {
            addCriterion("ZuiHouHuiFuShiJian <", value, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianLessThanOrEqualTo(Date value) {
            addCriterion("ZuiHouHuiFuShiJian <=", value, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianIn(List<Date> values) {
            addCriterion("ZuiHouHuiFuShiJian in", values, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianNotIn(List<Date> values) {
            addCriterion("ZuiHouHuiFuShiJian not in", values, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianBetween(Date value1, Date value2) {
            addCriterion("ZuiHouHuiFuShiJian between", value1, value2, "zuihouhuifushijian");
            return (Criteria) this;
        }

        public Criteria andZuihouhuifushijianNotBetween(Date value1, Date value2) {
            addCriterion("ZuiHouHuiFuShiJian not between", value1, value2, "zuihouhuifushijian");
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