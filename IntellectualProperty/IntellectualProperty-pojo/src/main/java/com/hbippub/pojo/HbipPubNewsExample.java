package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubNewsExample() {
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

        public Criteria andXinwenidIsNull() {
            addCriterion("XinWenID is null");
            return (Criteria) this;
        }

        public Criteria andXinwenidIsNotNull() {
            addCriterion("XinWenID is not null");
            return (Criteria) this;
        }

        public Criteria andXinwenidEqualTo(Integer value) {
            addCriterion("XinWenID =", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotEqualTo(Integer value) {
            addCriterion("XinWenID <>", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidGreaterThan(Integer value) {
            addCriterion("XinWenID >", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XinWenID >=", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidLessThan(Integer value) {
            addCriterion("XinWenID <", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidLessThanOrEqualTo(Integer value) {
            addCriterion("XinWenID <=", value, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidIn(List<Integer> values) {
            addCriterion("XinWenID in", values, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotIn(List<Integer> values) {
            addCriterion("XinWenID not in", values, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidBetween(Integer value1, Integer value2) {
            addCriterion("XinWenID between", value1, value2, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andXinwenidNotBetween(Integer value1, Integer value2) {
            addCriterion("XinWenID not between", value1, value2, "xinwenid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidIsNull() {
            addCriterion("FaBuZheID is null");
            return (Criteria) this;
        }

        public Criteria andFabuzheidIsNotNull() {
            addCriterion("FaBuZheID is not null");
            return (Criteria) this;
        }

        public Criteria andFabuzheidEqualTo(Integer value) {
            addCriterion("FaBuZheID =", value, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidNotEqualTo(Integer value) {
            addCriterion("FaBuZheID <>", value, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidGreaterThan(Integer value) {
            addCriterion("FaBuZheID >", value, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FaBuZheID >=", value, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidLessThan(Integer value) {
            addCriterion("FaBuZheID <", value, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidLessThanOrEqualTo(Integer value) {
            addCriterion("FaBuZheID <=", value, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidIn(List<Integer> values) {
            addCriterion("FaBuZheID in", values, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidNotIn(List<Integer> values) {
            addCriterion("FaBuZheID not in", values, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidBetween(Integer value1, Integer value2) {
            addCriterion("FaBuZheID between", value1, value2, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFabuzheidNotBetween(Integer value1, Integer value2) {
            addCriterion("FaBuZheID not between", value1, value2, "fabuzheid");
            return (Criteria) this;
        }

        public Criteria andFenleiidIsNull() {
            addCriterion("FenLeiID is null");
            return (Criteria) this;
        }

        public Criteria andFenleiidIsNotNull() {
            addCriterion("FenLeiID is not null");
            return (Criteria) this;
        }

        public Criteria andFenleiidEqualTo(Integer value) {
            addCriterion("FenLeiID =", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidNotEqualTo(Integer value) {
            addCriterion("FenLeiID <>", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidGreaterThan(Integer value) {
            addCriterion("FenLeiID >", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FenLeiID >=", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidLessThan(Integer value) {
            addCriterion("FenLeiID <", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidLessThanOrEqualTo(Integer value) {
            addCriterion("FenLeiID <=", value, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidIn(List<Integer> values) {
            addCriterion("FenLeiID in", values, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidNotIn(List<Integer> values) {
            addCriterion("FenLeiID not in", values, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidBetween(Integer value1, Integer value2) {
            addCriterion("FenLeiID between", value1, value2, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andFenleiidNotBetween(Integer value1, Integer value2) {
            addCriterion("FenLeiID not between", value1, value2, "fenleiid");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengIsNull() {
            addCriterion("XinWenMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengIsNotNull() {
            addCriterion("XinWenMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengEqualTo(String value) {
            addCriterion("XinWenMingCheng =", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengNotEqualTo(String value) {
            addCriterion("XinWenMingCheng <>", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengGreaterThan(String value) {
            addCriterion("XinWenMingCheng >", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("XinWenMingCheng >=", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengLessThan(String value) {
            addCriterion("XinWenMingCheng <", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengLessThanOrEqualTo(String value) {
            addCriterion("XinWenMingCheng <=", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengLike(String value) {
            addCriterion("XinWenMingCheng like", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengNotLike(String value) {
            addCriterion("XinWenMingCheng not like", value, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengIn(List<String> values) {
            addCriterion("XinWenMingCheng in", values, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengNotIn(List<String> values) {
            addCriterion("XinWenMingCheng not in", values, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengBetween(String value1, String value2) {
            addCriterion("XinWenMingCheng between", value1, value2, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinwenmingchengNotBetween(String value1, String value2) {
            addCriterion("XinWenMingCheng not between", value1, value2, "xinwenmingcheng");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanIsNull() {
            addCriterion("XinXiLaiYuan is null");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanIsNotNull() {
            addCriterion("XinXiLaiYuan is not null");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanEqualTo(String value) {
            addCriterion("XinXiLaiYuan =", value, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanNotEqualTo(String value) {
            addCriterion("XinXiLaiYuan <>", value, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanGreaterThan(String value) {
            addCriterion("XinXiLaiYuan >", value, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("XinXiLaiYuan >=", value, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanLessThan(String value) {
            addCriterion("XinXiLaiYuan <", value, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanLessThanOrEqualTo(String value) {
            addCriterion("XinXiLaiYuan <=", value, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanLike(String value) {
            addCriterion("XinXiLaiYuan like", value, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanNotLike(String value) {
            addCriterion("XinXiLaiYuan not like", value, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanIn(List<String> values) {
            addCriterion("XinXiLaiYuan in", values, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanNotIn(List<String> values) {
            addCriterion("XinXiLaiYuan not in", values, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanBetween(String value1, String value2) {
            addCriterion("XinXiLaiYuan between", value1, value2, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andXinxilaiyuanNotBetween(String value1, String value2) {
            addCriterion("XinXiLaiYuan not between", value1, value2, "xinxilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFengmianurlIsNull() {
            addCriterion("FengMianURL is null");
            return (Criteria) this;
        }

        public Criteria andFengmianurlIsNotNull() {
            addCriterion("FengMianURL is not null");
            return (Criteria) this;
        }

        public Criteria andFengmianurlEqualTo(String value) {
            addCriterion("FengMianURL =", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotEqualTo(String value) {
            addCriterion("FengMianURL <>", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlGreaterThan(String value) {
            addCriterion("FengMianURL >", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlGreaterThanOrEqualTo(String value) {
            addCriterion("FengMianURL >=", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLessThan(String value) {
            addCriterion("FengMianURL <", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLessThanOrEqualTo(String value) {
            addCriterion("FengMianURL <=", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlLike(String value) {
            addCriterion("FengMianURL like", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotLike(String value) {
            addCriterion("FengMianURL not like", value, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlIn(List<String> values) {
            addCriterion("FengMianURL in", values, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotIn(List<String> values) {
            addCriterion("FengMianURL not in", values, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlBetween(String value1, String value2) {
            addCriterion("FengMianURL between", value1, value2, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andFengmianurlNotBetween(String value1, String value2) {
            addCriterion("FengMianURL not between", value1, value2, "fengmianurl");
            return (Criteria) this;
        }

        public Criteria andLiulancishuIsNull() {
            addCriterion("LiuLanCiShu is null");
            return (Criteria) this;
        }

        public Criteria andLiulancishuIsNotNull() {
            addCriterion("LiuLanCiShu is not null");
            return (Criteria) this;
        }

        public Criteria andLiulancishuEqualTo(Integer value) {
            addCriterion("LiuLanCiShu =", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuNotEqualTo(Integer value) {
            addCriterion("LiuLanCiShu <>", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuGreaterThan(Integer value) {
            addCriterion("LiuLanCiShu >", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LiuLanCiShu >=", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuLessThan(Integer value) {
            addCriterion("LiuLanCiShu <", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuLessThanOrEqualTo(Integer value) {
            addCriterion("LiuLanCiShu <=", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuIn(List<Integer> values) {
            addCriterion("LiuLanCiShu in", values, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuNotIn(List<Integer> values) {
            addCriterion("LiuLanCiShu not in", values, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuBetween(Integer value1, Integer value2) {
            addCriterion("LiuLanCiShu between", value1, value2, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuNotBetween(Integer value1, Integer value2) {
            addCriterion("LiuLanCiShu not between", value1, value2, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingIsNull() {
            addCriterion("ShiFouZhiDing is null");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingIsNotNull() {
            addCriterion("ShiFouZhiDing is not null");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingEqualTo(Integer value) {
            addCriterion("ShiFouZhiDing =", value, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingNotEqualTo(Integer value) {
            addCriterion("ShiFouZhiDing <>", value, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingGreaterThan(Integer value) {
            addCriterion("ShiFouZhiDing >", value, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouZhiDing >=", value, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingLessThan(Integer value) {
            addCriterion("ShiFouZhiDing <", value, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouZhiDing <=", value, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingIn(List<Integer> values) {
            addCriterion("ShiFouZhiDing in", values, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingNotIn(List<Integer> values) {
            addCriterion("ShiFouZhiDing not in", values, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouZhiDing between", value1, value2, "shifouzhiding");
            return (Criteria) this;
        }

        public Criteria andShifouzhidingNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouZhiDing not between", value1, value2, "shifouzhiding");
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

        public Criteria andZhidingshijianIsNull() {
            addCriterion("ZhiDingShiJian is null");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianIsNotNull() {
            addCriterion("ZhiDingShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianEqualTo(Date value) {
            addCriterion("ZhiDingShiJian =", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianNotEqualTo(Date value) {
            addCriterion("ZhiDingShiJian <>", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianGreaterThan(Date value) {
            addCriterion("ZhiDingShiJian >", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZhiDingShiJian >=", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianLessThan(Date value) {
            addCriterion("ZhiDingShiJian <", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianLessThanOrEqualTo(Date value) {
            addCriterion("ZhiDingShiJian <=", value, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianIn(List<Date> values) {
            addCriterion("ZhiDingShiJian in", values, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianNotIn(List<Date> values) {
            addCriterion("ZhiDingShiJian not in", values, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianBetween(Date value1, Date value2) {
            addCriterion("ZhiDingShiJian between", value1, value2, "zhidingshijian");
            return (Criteria) this;
        }

        public Criteria andZhidingshijianNotBetween(Date value1, Date value2) {
            addCriterion("ZhiDingShiJian not between", value1, value2, "zhidingshijian");
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