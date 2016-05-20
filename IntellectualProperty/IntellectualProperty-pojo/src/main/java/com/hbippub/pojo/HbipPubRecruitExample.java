package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubRecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubRecruitExample() {
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

        public Criteria andZhaopinidIsNull() {
            addCriterion("ZhaoPinID is null");
            return (Criteria) this;
        }

        public Criteria andZhaopinidIsNotNull() {
            addCriterion("ZhaoPinID is not null");
            return (Criteria) this;
        }

        public Criteria andZhaopinidEqualTo(Integer value) {
            addCriterion("ZhaoPinID =", value, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidNotEqualTo(Integer value) {
            addCriterion("ZhaoPinID <>", value, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidGreaterThan(Integer value) {
            addCriterion("ZhaoPinID >", value, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZhaoPinID >=", value, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidLessThan(Integer value) {
            addCriterion("ZhaoPinID <", value, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidLessThanOrEqualTo(Integer value) {
            addCriterion("ZhaoPinID <=", value, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidIn(List<Integer> values) {
            addCriterion("ZhaoPinID in", values, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidNotIn(List<Integer> values) {
            addCriterion("ZhaoPinID not in", values, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidBetween(Integer value1, Integer value2) {
            addCriterion("ZhaoPinID between", value1, value2, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andZhaopinidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZhaoPinID not between", value1, value2, "zhaopinid");
            return (Criteria) this;
        }

        public Criteria andLururenidIsNull() {
            addCriterion("LuRuRenID is null");
            return (Criteria) this;
        }

        public Criteria andLururenidIsNotNull() {
            addCriterion("LuRuRenID is not null");
            return (Criteria) this;
        }

        public Criteria andLururenidEqualTo(Integer value) {
            addCriterion("LuRuRenID =", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidNotEqualTo(Integer value) {
            addCriterion("LuRuRenID <>", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidGreaterThan(Integer value) {
            addCriterion("LuRuRenID >", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LuRuRenID >=", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidLessThan(Integer value) {
            addCriterion("LuRuRenID <", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidLessThanOrEqualTo(Integer value) {
            addCriterion("LuRuRenID <=", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidIn(List<Integer> values) {
            addCriterion("LuRuRenID in", values, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidNotIn(List<Integer> values) {
            addCriterion("LuRuRenID not in", values, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidBetween(Integer value1, Integer value2) {
            addCriterion("LuRuRenID between", value1, value2, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidNotBetween(Integer value1, Integer value2) {
            addCriterion("LuRuRenID not between", value1, value2, "lururenid");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiIsNull() {
            addCriterion("ZhaoPinBiaoTi is null");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiIsNotNull() {
            addCriterion("ZhaoPinBiaoTi is not null");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiEqualTo(String value) {
            addCriterion("ZhaoPinBiaoTi =", value, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiNotEqualTo(String value) {
            addCriterion("ZhaoPinBiaoTi <>", value, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiGreaterThan(String value) {
            addCriterion("ZhaoPinBiaoTi >", value, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("ZhaoPinBiaoTi >=", value, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiLessThan(String value) {
            addCriterion("ZhaoPinBiaoTi <", value, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiLessThanOrEqualTo(String value) {
            addCriterion("ZhaoPinBiaoTi <=", value, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiLike(String value) {
            addCriterion("ZhaoPinBiaoTi like", value, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiNotLike(String value) {
            addCriterion("ZhaoPinBiaoTi not like", value, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiIn(List<String> values) {
            addCriterion("ZhaoPinBiaoTi in", values, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiNotIn(List<String> values) {
            addCriterion("ZhaoPinBiaoTi not in", values, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiBetween(String value1, String value2) {
            addCriterion("ZhaoPinBiaoTi between", value1, value2, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andZhaopinbiaotiNotBetween(String value1, String value2) {
            addCriterion("ZhaoPinBiaoTi not between", value1, value2, "zhaopinbiaoti");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIsNull() {
            addCriterion("DanWeiMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIsNotNull() {
            addCriterion("DanWeiMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengEqualTo(String value) {
            addCriterion("DanWeiMingCheng =", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotEqualTo(String value) {
            addCriterion("DanWeiMingCheng <>", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengGreaterThan(String value) {
            addCriterion("DanWeiMingCheng >", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DanWeiMingCheng >=", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLessThan(String value) {
            addCriterion("DanWeiMingCheng <", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLessThanOrEqualTo(String value) {
            addCriterion("DanWeiMingCheng <=", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengLike(String value) {
            addCriterion("DanWeiMingCheng like", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotLike(String value) {
            addCriterion("DanWeiMingCheng not like", value, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengIn(List<String> values) {
            addCriterion("DanWeiMingCheng in", values, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotIn(List<String> values) {
            addCriterion("DanWeiMingCheng not in", values, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengBetween(String value1, String value2) {
            addCriterion("DanWeiMingCheng between", value1, value2, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweimingchengNotBetween(String value1, String value2) {
            addCriterion("DanWeiMingCheng not between", value1, value2, "danweimingcheng");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidIsNull() {
            addCriterion("DanWeiXingZhiID is null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidIsNotNull() {
            addCriterion("DanWeiXingZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidEqualTo(Integer value) {
            addCriterion("DanWeiXingZhiID =", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidNotEqualTo(Integer value) {
            addCriterion("DanWeiXingZhiID <>", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidGreaterThan(Integer value) {
            addCriterion("DanWeiXingZhiID >", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DanWeiXingZhiID >=", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidLessThan(Integer value) {
            addCriterion("DanWeiXingZhiID <", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidLessThanOrEqualTo(Integer value) {
            addCriterion("DanWeiXingZhiID <=", value, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidIn(List<Integer> values) {
            addCriterion("DanWeiXingZhiID in", values, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidNotIn(List<Integer> values) {
            addCriterion("DanWeiXingZhiID not in", values, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidBetween(Integer value1, Integer value2) {
            addCriterion("DanWeiXingZhiID between", value1, value2, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("DanWeiXingZhiID not between", value1, value2, "danweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIsNull() {
            addCriterion("DanWeiXingZhi is null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIsNotNull() {
            addCriterion("DanWeiXingZhi is not null");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiEqualTo(String value) {
            addCriterion("DanWeiXingZhi =", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotEqualTo(String value) {
            addCriterion("DanWeiXingZhi <>", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiGreaterThan(String value) {
            addCriterion("DanWeiXingZhi >", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("DanWeiXingZhi >=", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLessThan(String value) {
            addCriterion("DanWeiXingZhi <", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLessThanOrEqualTo(String value) {
            addCriterion("DanWeiXingZhi <=", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiLike(String value) {
            addCriterion("DanWeiXingZhi like", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotLike(String value) {
            addCriterion("DanWeiXingZhi not like", value, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiIn(List<String> values) {
            addCriterion("DanWeiXingZhi in", values, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotIn(List<String> values) {
            addCriterion("DanWeiXingZhi not in", values, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiBetween(String value1, String value2) {
            addCriterion("DanWeiXingZhi between", value1, value2, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andDanweixingzhiNotBetween(String value1, String value2) {
            addCriterion("DanWeiXingZhi not between", value1, value2, "danweixingzhi");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidIsNull() {
            addCriterion("HangYeFenLeiID is null");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidIsNotNull() {
            addCriterion("HangYeFenLeiID is not null");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidEqualTo(Integer value) {
            addCriterion("HangYeFenLeiID =", value, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidNotEqualTo(Integer value) {
            addCriterion("HangYeFenLeiID <>", value, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidGreaterThan(Integer value) {
            addCriterion("HangYeFenLeiID >", value, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HangYeFenLeiID >=", value, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidLessThan(Integer value) {
            addCriterion("HangYeFenLeiID <", value, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidLessThanOrEqualTo(Integer value) {
            addCriterion("HangYeFenLeiID <=", value, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidIn(List<Integer> values) {
            addCriterion("HangYeFenLeiID in", values, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidNotIn(List<Integer> values) {
            addCriterion("HangYeFenLeiID not in", values, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidBetween(Integer value1, Integer value2) {
            addCriterion("HangYeFenLeiID between", value1, value2, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiidNotBetween(Integer value1, Integer value2) {
            addCriterion("HangYeFenLeiID not between", value1, value2, "hangyefenleiid");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiIsNull() {
            addCriterion("HangYeFenLei is null");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiIsNotNull() {
            addCriterion("HangYeFenLei is not null");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiEqualTo(String value) {
            addCriterion("HangYeFenLei =", value, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiNotEqualTo(String value) {
            addCriterion("HangYeFenLei <>", value, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiGreaterThan(String value) {
            addCriterion("HangYeFenLei >", value, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiGreaterThanOrEqualTo(String value) {
            addCriterion("HangYeFenLei >=", value, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiLessThan(String value) {
            addCriterion("HangYeFenLei <", value, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiLessThanOrEqualTo(String value) {
            addCriterion("HangYeFenLei <=", value, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiLike(String value) {
            addCriterion("HangYeFenLei like", value, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiNotLike(String value) {
            addCriterion("HangYeFenLei not like", value, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiIn(List<String> values) {
            addCriterion("HangYeFenLei in", values, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiNotIn(List<String> values) {
            addCriterion("HangYeFenLei not in", values, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiBetween(String value1, String value2) {
            addCriterion("HangYeFenLei between", value1, value2, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andHangyefenleiNotBetween(String value1, String value2) {
            addCriterion("HangYeFenLei not between", value1, value2, "hangyefenlei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiIsNull() {
            addCriterion("ZhaoPinGangWei is null");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiIsNotNull() {
            addCriterion("ZhaoPinGangWei is not null");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiEqualTo(String value) {
            addCriterion("ZhaoPinGangWei =", value, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiNotEqualTo(String value) {
            addCriterion("ZhaoPinGangWei <>", value, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiGreaterThan(String value) {
            addCriterion("ZhaoPinGangWei >", value, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiGreaterThanOrEqualTo(String value) {
            addCriterion("ZhaoPinGangWei >=", value, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiLessThan(String value) {
            addCriterion("ZhaoPinGangWei <", value, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiLessThanOrEqualTo(String value) {
            addCriterion("ZhaoPinGangWei <=", value, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiLike(String value) {
            addCriterion("ZhaoPinGangWei like", value, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiNotLike(String value) {
            addCriterion("ZhaoPinGangWei not like", value, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiIn(List<String> values) {
            addCriterion("ZhaoPinGangWei in", values, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiNotIn(List<String> values) {
            addCriterion("ZhaoPinGangWei not in", values, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiBetween(String value1, String value2) {
            addCriterion("ZhaoPinGangWei between", value1, value2, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andZhaopingangweiNotBetween(String value1, String value2) {
            addCriterion("ZhaoPinGangWei not between", value1, value2, "zhaopingangwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidIsNull() {
            addCriterion("GongZuoDiDianID is null");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidIsNotNull() {
            addCriterion("GongZuoDiDianID is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidEqualTo(Integer value) {
            addCriterion("GongZuoDiDianID =", value, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidNotEqualTo(Integer value) {
            addCriterion("GongZuoDiDianID <>", value, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidGreaterThan(Integer value) {
            addCriterion("GongZuoDiDianID >", value, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GongZuoDiDianID >=", value, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidLessThan(Integer value) {
            addCriterion("GongZuoDiDianID <", value, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidLessThanOrEqualTo(Integer value) {
            addCriterion("GongZuoDiDianID <=", value, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidIn(List<Integer> values) {
            addCriterion("GongZuoDiDianID in", values, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidNotIn(List<Integer> values) {
            addCriterion("GongZuoDiDianID not in", values, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidBetween(Integer value1, Integer value2) {
            addCriterion("GongZuoDiDianID between", value1, value2, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianidNotBetween(Integer value1, Integer value2) {
            addCriterion("GongZuoDiDianID not between", value1, value2, "gongzuodidianid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidIsNull() {
            addCriterion("GongZuoShiID is null");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidIsNotNull() {
            addCriterion("GongZuoShiID is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidEqualTo(Integer value) {
            addCriterion("GongZuoShiID =", value, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidNotEqualTo(Integer value) {
            addCriterion("GongZuoShiID <>", value, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidGreaterThan(Integer value) {
            addCriterion("GongZuoShiID >", value, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GongZuoShiID >=", value, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidLessThan(Integer value) {
            addCriterion("GongZuoShiID <", value, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidLessThanOrEqualTo(Integer value) {
            addCriterion("GongZuoShiID <=", value, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidIn(List<Integer> values) {
            addCriterion("GongZuoShiID in", values, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidNotIn(List<Integer> values) {
            addCriterion("GongZuoShiID not in", values, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidBetween(Integer value1, Integer value2) {
            addCriterion("GongZuoShiID between", value1, value2, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiidNotBetween(Integer value1, Integer value2) {
            addCriterion("GongZuoShiID not between", value1, value2, "gongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengIsNull() {
            addCriterion("GongZuoSheng is null");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengIsNotNull() {
            addCriterion("GongZuoSheng is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengEqualTo(String value) {
            addCriterion("GongZuoSheng =", value, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengNotEqualTo(String value) {
            addCriterion("GongZuoSheng <>", value, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengGreaterThan(String value) {
            addCriterion("GongZuoSheng >", value, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengGreaterThanOrEqualTo(String value) {
            addCriterion("GongZuoSheng >=", value, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengLessThan(String value) {
            addCriterion("GongZuoSheng <", value, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengLessThanOrEqualTo(String value) {
            addCriterion("GongZuoSheng <=", value, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengLike(String value) {
            addCriterion("GongZuoSheng like", value, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengNotLike(String value) {
            addCriterion("GongZuoSheng not like", value, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengIn(List<String> values) {
            addCriterion("GongZuoSheng in", values, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengNotIn(List<String> values) {
            addCriterion("GongZuoSheng not in", values, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengBetween(String value1, String value2) {
            addCriterion("GongZuoSheng between", value1, value2, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshengNotBetween(String value1, String value2) {
            addCriterion("GongZuoSheng not between", value1, value2, "gongzuosheng");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiIsNull() {
            addCriterion("GongZuoShi is null");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiIsNotNull() {
            addCriterion("GongZuoShi is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiEqualTo(String value) {
            addCriterion("GongZuoShi =", value, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiNotEqualTo(String value) {
            addCriterion("GongZuoShi <>", value, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiGreaterThan(String value) {
            addCriterion("GongZuoShi >", value, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiGreaterThanOrEqualTo(String value) {
            addCriterion("GongZuoShi >=", value, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiLessThan(String value) {
            addCriterion("GongZuoShi <", value, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiLessThanOrEqualTo(String value) {
            addCriterion("GongZuoShi <=", value, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiLike(String value) {
            addCriterion("GongZuoShi like", value, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiNotLike(String value) {
            addCriterion("GongZuoShi not like", value, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiIn(List<String> values) {
            addCriterion("GongZuoShi in", values, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiNotIn(List<String> values) {
            addCriterion("GongZuoShi not in", values, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiBetween(String value1, String value2) {
            addCriterion("GongZuoShi between", value1, value2, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andGongzuoshiNotBetween(String value1, String value2) {
            addCriterion("GongZuoShi not between", value1, value2, "gongzuoshi");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidIsNull() {
            addCriterion("XueLiYaoQiuID is null");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidIsNotNull() {
            addCriterion("XueLiYaoQiuID is not null");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidEqualTo(Integer value) {
            addCriterion("XueLiYaoQiuID =", value, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidNotEqualTo(Integer value) {
            addCriterion("XueLiYaoQiuID <>", value, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidGreaterThan(Integer value) {
            addCriterion("XueLiYaoQiuID >", value, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XueLiYaoQiuID >=", value, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidLessThan(Integer value) {
            addCriterion("XueLiYaoQiuID <", value, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidLessThanOrEqualTo(Integer value) {
            addCriterion("XueLiYaoQiuID <=", value, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidIn(List<Integer> values) {
            addCriterion("XueLiYaoQiuID in", values, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidNotIn(List<Integer> values) {
            addCriterion("XueLiYaoQiuID not in", values, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidBetween(Integer value1, Integer value2) {
            addCriterion("XueLiYaoQiuID between", value1, value2, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuidNotBetween(Integer value1, Integer value2) {
            addCriterion("XueLiYaoQiuID not between", value1, value2, "xueliyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuIsNull() {
            addCriterion("XueLiYaoQiu is null");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuIsNotNull() {
            addCriterion("XueLiYaoQiu is not null");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuEqualTo(String value) {
            addCriterion("XueLiYaoQiu =", value, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuNotEqualTo(String value) {
            addCriterion("XueLiYaoQiu <>", value, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuGreaterThan(String value) {
            addCriterion("XueLiYaoQiu >", value, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuGreaterThanOrEqualTo(String value) {
            addCriterion("XueLiYaoQiu >=", value, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuLessThan(String value) {
            addCriterion("XueLiYaoQiu <", value, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuLessThanOrEqualTo(String value) {
            addCriterion("XueLiYaoQiu <=", value, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuLike(String value) {
            addCriterion("XueLiYaoQiu like", value, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuNotLike(String value) {
            addCriterion("XueLiYaoQiu not like", value, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuIn(List<String> values) {
            addCriterion("XueLiYaoQiu in", values, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuNotIn(List<String> values) {
            addCriterion("XueLiYaoQiu not in", values, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuBetween(String value1, String value2) {
            addCriterion("XueLiYaoQiu between", value1, value2, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andXueliyaoqiuNotBetween(String value1, String value2) {
            addCriterion("XueLiYaoQiu not between", value1, value2, "xueliyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidIsNull() {
            addCriterion("JingYanYaoQiuID is null");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidIsNotNull() {
            addCriterion("JingYanYaoQiuID is not null");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidEqualTo(Integer value) {
            addCriterion("JingYanYaoQiuID =", value, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidNotEqualTo(Integer value) {
            addCriterion("JingYanYaoQiuID <>", value, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidGreaterThan(Integer value) {
            addCriterion("JingYanYaoQiuID >", value, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JingYanYaoQiuID >=", value, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidLessThan(Integer value) {
            addCriterion("JingYanYaoQiuID <", value, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidLessThanOrEqualTo(Integer value) {
            addCriterion("JingYanYaoQiuID <=", value, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidIn(List<Integer> values) {
            addCriterion("JingYanYaoQiuID in", values, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidNotIn(List<Integer> values) {
            addCriterion("JingYanYaoQiuID not in", values, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidBetween(Integer value1, Integer value2) {
            addCriterion("JingYanYaoQiuID between", value1, value2, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuidNotBetween(Integer value1, Integer value2) {
            addCriterion("JingYanYaoQiuID not between", value1, value2, "jingyanyaoqiuid");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuIsNull() {
            addCriterion("JingYanYaoQiu is null");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuIsNotNull() {
            addCriterion("JingYanYaoQiu is not null");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuEqualTo(String value) {
            addCriterion("JingYanYaoQiu =", value, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuNotEqualTo(String value) {
            addCriterion("JingYanYaoQiu <>", value, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuGreaterThan(String value) {
            addCriterion("JingYanYaoQiu >", value, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuGreaterThanOrEqualTo(String value) {
            addCriterion("JingYanYaoQiu >=", value, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuLessThan(String value) {
            addCriterion("JingYanYaoQiu <", value, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuLessThanOrEqualTo(String value) {
            addCriterion("JingYanYaoQiu <=", value, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuLike(String value) {
            addCriterion("JingYanYaoQiu like", value, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuNotLike(String value) {
            addCriterion("JingYanYaoQiu not like", value, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuIn(List<String> values) {
            addCriterion("JingYanYaoQiu in", values, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuNotIn(List<String> values) {
            addCriterion("JingYanYaoQiu not in", values, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuBetween(String value1, String value2) {
            addCriterion("JingYanYaoQiu between", value1, value2, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andJingyanyaoqiuNotBetween(String value1, String value2) {
            addCriterion("JingYanYaoQiu not between", value1, value2, "jingyanyaoqiu");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidIsNull() {
            addCriterion("GongZuoXingZhiID is null");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidIsNotNull() {
            addCriterion("GongZuoXingZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidEqualTo(Integer value) {
            addCriterion("GongZuoXingZhiID =", value, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidNotEqualTo(Integer value) {
            addCriterion("GongZuoXingZhiID <>", value, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidGreaterThan(Integer value) {
            addCriterion("GongZuoXingZhiID >", value, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GongZuoXingZhiID >=", value, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidLessThan(Integer value) {
            addCriterion("GongZuoXingZhiID <", value, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidLessThanOrEqualTo(Integer value) {
            addCriterion("GongZuoXingZhiID <=", value, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidIn(List<Integer> values) {
            addCriterion("GongZuoXingZhiID in", values, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidNotIn(List<Integer> values) {
            addCriterion("GongZuoXingZhiID not in", values, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidBetween(Integer value1, Integer value2) {
            addCriterion("GongZuoXingZhiID between", value1, value2, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andGongzuoxingzhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("GongZuoXingZhiID not between", value1, value2, "gongzuoxingzhiid");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuIsNull() {
            addCriterion("ZhaoPinRenShu is null");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuIsNotNull() {
            addCriterion("ZhaoPinRenShu is not null");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuEqualTo(Integer value) {
            addCriterion("ZhaoPinRenShu =", value, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuNotEqualTo(Integer value) {
            addCriterion("ZhaoPinRenShu <>", value, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuGreaterThan(Integer value) {
            addCriterion("ZhaoPinRenShu >", value, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZhaoPinRenShu >=", value, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuLessThan(Integer value) {
            addCriterion("ZhaoPinRenShu <", value, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuLessThanOrEqualTo(Integer value) {
            addCriterion("ZhaoPinRenShu <=", value, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuIn(List<Integer> values) {
            addCriterion("ZhaoPinRenShu in", values, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuNotIn(List<Integer> values) {
            addCriterion("ZhaoPinRenShu not in", values, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuBetween(Integer value1, Integer value2) {
            addCriterion("ZhaoPinRenShu between", value1, value2, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZhaoPinRenShu not between", value1, value2, "zhaopinrenshu");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianIsNull() {
            addCriterion("GuoQiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianIsNotNull() {
            addCriterion("GuoQiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianEqualTo(Date value) {
            addCriterion("GuoQiShiJian =", value, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianNotEqualTo(Date value) {
            addCriterion("GuoQiShiJian <>", value, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianGreaterThan(Date value) {
            addCriterion("GuoQiShiJian >", value, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("GuoQiShiJian >=", value, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianLessThan(Date value) {
            addCriterion("GuoQiShiJian <", value, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianLessThanOrEqualTo(Date value) {
            addCriterion("GuoQiShiJian <=", value, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianIn(List<Date> values) {
            addCriterion("GuoQiShiJian in", values, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianNotIn(List<Date> values) {
            addCriterion("GuoQiShiJian not in", values, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianBetween(Date value1, Date value2) {
            addCriterion("GuoQiShiJian between", value1, value2, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andGuoqishijianNotBetween(Date value1, Date value2) {
            addCriterion("GuoQiShiJian not between", value1, value2, "guoqishijian");
            return (Criteria) this;
        }

        public Criteria andYuexinidIsNull() {
            addCriterion("YueXinID is null");
            return (Criteria) this;
        }

        public Criteria andYuexinidIsNotNull() {
            addCriterion("YueXinID is not null");
            return (Criteria) this;
        }

        public Criteria andYuexinidEqualTo(Integer value) {
            addCriterion("YueXinID =", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidNotEqualTo(Integer value) {
            addCriterion("YueXinID <>", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidGreaterThan(Integer value) {
            addCriterion("YueXinID >", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YueXinID >=", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidLessThan(Integer value) {
            addCriterion("YueXinID <", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidLessThanOrEqualTo(Integer value) {
            addCriterion("YueXinID <=", value, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidIn(List<Integer> values) {
            addCriterion("YueXinID in", values, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidNotIn(List<Integer> values) {
            addCriterion("YueXinID not in", values, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidBetween(Integer value1, Integer value2) {
            addCriterion("YueXinID between", value1, value2, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinidNotBetween(Integer value1, Integer value2) {
            addCriterion("YueXinID not between", value1, value2, "yuexinid");
            return (Criteria) this;
        }

        public Criteria andYuexinIsNull() {
            addCriterion("YueXin is null");
            return (Criteria) this;
        }

        public Criteria andYuexinIsNotNull() {
            addCriterion("YueXin is not null");
            return (Criteria) this;
        }

        public Criteria andYuexinEqualTo(String value) {
            addCriterion("YueXin =", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinNotEqualTo(String value) {
            addCriterion("YueXin <>", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinGreaterThan(String value) {
            addCriterion("YueXin >", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinGreaterThanOrEqualTo(String value) {
            addCriterion("YueXin >=", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinLessThan(String value) {
            addCriterion("YueXin <", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinLessThanOrEqualTo(String value) {
            addCriterion("YueXin <=", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinLike(String value) {
            addCriterion("YueXin like", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinNotLike(String value) {
            addCriterion("YueXin not like", value, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinIn(List<String> values) {
            addCriterion("YueXin in", values, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinNotIn(List<String> values) {
            addCriterion("YueXin not in", values, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinBetween(String value1, String value2) {
            addCriterion("YueXin between", value1, value2, "yuexin");
            return (Criteria) this;
        }

        public Criteria andYuexinNotBetween(String value1, String value2) {
            addCriterion("YueXin not between", value1, value2, "yuexin");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingIsNull() {
            addCriterion("ZhaoPinRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingIsNotNull() {
            addCriterion("ZhaoPinRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingEqualTo(String value) {
            addCriterion("ZhaoPinRenXingMing =", value, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingNotEqualTo(String value) {
            addCriterion("ZhaoPinRenXingMing <>", value, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingGreaterThan(String value) {
            addCriterion("ZhaoPinRenXingMing >", value, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ZhaoPinRenXingMing >=", value, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingLessThan(String value) {
            addCriterion("ZhaoPinRenXingMing <", value, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ZhaoPinRenXingMing <=", value, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingLike(String value) {
            addCriterion("ZhaoPinRenXingMing like", value, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingNotLike(String value) {
            addCriterion("ZhaoPinRenXingMing not like", value, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingIn(List<String> values) {
            addCriterion("ZhaoPinRenXingMing in", values, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingNotIn(List<String> values) {
            addCriterion("ZhaoPinRenXingMing not in", values, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingBetween(String value1, String value2) {
            addCriterion("ZhaoPinRenXingMing between", value1, value2, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andZhaopinrenxingmingNotBetween(String value1, String value2) {
            addCriterion("ZhaoPinRenXingMing not between", value1, value2, "zhaopinrenxingming");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNull() {
            addCriterion("ShouJi is null");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNotNull() {
            addCriterion("ShouJi is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiEqualTo(String value) {
            addCriterion("ShouJi =", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotEqualTo(String value) {
            addCriterion("ShouJi <>", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThan(String value) {
            addCriterion("ShouJi >", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("ShouJi >=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThan(String value) {
            addCriterion("ShouJi <", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThanOrEqualTo(String value) {
            addCriterion("ShouJi <=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLike(String value) {
            addCriterion("ShouJi like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotLike(String value) {
            addCriterion("ShouJi not like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiIn(List<String> values) {
            addCriterion("ShouJi in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotIn(List<String> values) {
            addCriterion("ShouJi not in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiBetween(String value1, String value2) {
            addCriterion("ShouJi between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotBetween(String value1, String value2) {
            addCriterion("ShouJi not between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIsNull() {
            addCriterion("GuDingDianHua is null");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIsNotNull() {
            addCriterion("GuDingDianHua is not null");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaEqualTo(String value) {
            addCriterion("GuDingDianHua =", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotEqualTo(String value) {
            addCriterion("GuDingDianHua <>", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaGreaterThan(String value) {
            addCriterion("GuDingDianHua >", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("GuDingDianHua >=", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLessThan(String value) {
            addCriterion("GuDingDianHua <", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLessThanOrEqualTo(String value) {
            addCriterion("GuDingDianHua <=", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLike(String value) {
            addCriterion("GuDingDianHua like", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotLike(String value) {
            addCriterion("GuDingDianHua not like", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIn(List<String> values) {
            addCriterion("GuDingDianHua in", values, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotIn(List<String> values) {
            addCriterion("GuDingDianHua not in", values, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaBetween(String value1, String value2) {
            addCriterion("GuDingDianHua between", value1, value2, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotBetween(String value1, String value2) {
            addCriterion("GuDingDianHua not between", value1, value2, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIsNull() {
            addCriterion("DianZiYouXiang is null");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIsNotNull() {
            addCriterion("DianZiYouXiang is not null");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangEqualTo(String value) {
            addCriterion("DianZiYouXiang =", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotEqualTo(String value) {
            addCriterion("DianZiYouXiang <>", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangGreaterThan(String value) {
            addCriterion("DianZiYouXiang >", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("DianZiYouXiang >=", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLessThan(String value) {
            addCriterion("DianZiYouXiang <", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLessThanOrEqualTo(String value) {
            addCriterion("DianZiYouXiang <=", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLike(String value) {
            addCriterion("DianZiYouXiang like", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotLike(String value) {
            addCriterion("DianZiYouXiang not like", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIn(List<String> values) {
            addCriterion("DianZiYouXiang in", values, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotIn(List<String> values) {
            addCriterion("DianZiYouXiang not in", values, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangBetween(String value1, String value2) {
            addCriterion("DianZiYouXiang between", value1, value2, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotBetween(String value1, String value2) {
            addCriterion("DianZiYouXiang not between", value1, value2, "dianziyouxiang");
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

        public Criteria andZhaopinfangshiIsNull() {
            addCriterion("ZhaoPinFangShi is null");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiIsNotNull() {
            addCriterion("ZhaoPinFangShi is not null");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiEqualTo(String value) {
            addCriterion("ZhaoPinFangShi =", value, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiNotEqualTo(String value) {
            addCriterion("ZhaoPinFangShi <>", value, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiGreaterThan(String value) {
            addCriterion("ZhaoPinFangShi >", value, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiGreaterThanOrEqualTo(String value) {
            addCriterion("ZhaoPinFangShi >=", value, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiLessThan(String value) {
            addCriterion("ZhaoPinFangShi <", value, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiLessThanOrEqualTo(String value) {
            addCriterion("ZhaoPinFangShi <=", value, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiLike(String value) {
            addCriterion("ZhaoPinFangShi like", value, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiNotLike(String value) {
            addCriterion("ZhaoPinFangShi not like", value, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiIn(List<String> values) {
            addCriterion("ZhaoPinFangShi in", values, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiNotIn(List<String> values) {
            addCriterion("ZhaoPinFangShi not in", values, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiBetween(String value1, String value2) {
            addCriterion("ZhaoPinFangShi between", value1, value2, "zhaopinfangshi");
            return (Criteria) this;
        }

        public Criteria andZhaopinfangshiNotBetween(String value1, String value2) {
            addCriterion("ZhaoPinFangShi not between", value1, value2, "zhaopinfangshi");
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