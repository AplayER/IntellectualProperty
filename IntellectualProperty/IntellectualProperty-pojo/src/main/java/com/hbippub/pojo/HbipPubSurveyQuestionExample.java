package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubSurveyQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubSurveyQuestionExample() {
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

        public Criteria andTimuidIsNull() {
            addCriterion("TiMuID is null");
            return (Criteria) this;
        }

        public Criteria andTimuidIsNotNull() {
            addCriterion("TiMuID is not null");
            return (Criteria) this;
        }

        public Criteria andTimuidEqualTo(Integer value) {
            addCriterion("TiMuID =", value, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidNotEqualTo(Integer value) {
            addCriterion("TiMuID <>", value, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidGreaterThan(Integer value) {
            addCriterion("TiMuID >", value, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TiMuID >=", value, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidLessThan(Integer value) {
            addCriterion("TiMuID <", value, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidLessThanOrEqualTo(Integer value) {
            addCriterion("TiMuID <=", value, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidIn(List<Integer> values) {
            addCriterion("TiMuID in", values, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidNotIn(List<Integer> values) {
            addCriterion("TiMuID not in", values, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidBetween(Integer value1, Integer value2) {
            addCriterion("TiMuID between", value1, value2, "timuid");
            return (Criteria) this;
        }

        public Criteria andTimuidNotBetween(Integer value1, Integer value2) {
            addCriterion("TiMuID not between", value1, value2, "timuid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidIsNull() {
            addCriterion("WenJuanID is null");
            return (Criteria) this;
        }

        public Criteria andWenjuanidIsNotNull() {
            addCriterion("WenJuanID is not null");
            return (Criteria) this;
        }

        public Criteria andWenjuanidEqualTo(Integer value) {
            addCriterion("WenJuanID =", value, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidNotEqualTo(Integer value) {
            addCriterion("WenJuanID <>", value, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidGreaterThan(Integer value) {
            addCriterion("WenJuanID >", value, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WenJuanID >=", value, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidLessThan(Integer value) {
            addCriterion("WenJuanID <", value, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidLessThanOrEqualTo(Integer value) {
            addCriterion("WenJuanID <=", value, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidIn(List<Integer> values) {
            addCriterion("WenJuanID in", values, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidNotIn(List<Integer> values) {
            addCriterion("WenJuanID not in", values, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidBetween(Integer value1, Integer value2) {
            addCriterion("WenJuanID between", value1, value2, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andWenjuanidNotBetween(Integer value1, Integer value2) {
            addCriterion("WenJuanID not between", value1, value2, "wenjuanid");
            return (Criteria) this;
        }

        public Criteria andTimumingchengIsNull() {
            addCriterion("TiMuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andTimumingchengIsNotNull() {
            addCriterion("TiMuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andTimumingchengEqualTo(String value) {
            addCriterion("TiMuMingCheng =", value, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengNotEqualTo(String value) {
            addCriterion("TiMuMingCheng <>", value, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengGreaterThan(String value) {
            addCriterion("TiMuMingCheng >", value, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("TiMuMingCheng >=", value, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengLessThan(String value) {
            addCriterion("TiMuMingCheng <", value, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengLessThanOrEqualTo(String value) {
            addCriterion("TiMuMingCheng <=", value, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengLike(String value) {
            addCriterion("TiMuMingCheng like", value, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengNotLike(String value) {
            addCriterion("TiMuMingCheng not like", value, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengIn(List<String> values) {
            addCriterion("TiMuMingCheng in", values, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengNotIn(List<String> values) {
            addCriterion("TiMuMingCheng not in", values, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengBetween(String value1, String value2) {
            addCriterion("TiMuMingCheng between", value1, value2, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andTimumingchengNotBetween(String value1, String value2) {
            addCriterion("TiMuMingCheng not between", value1, value2, "timumingcheng");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaIsNull() {
            addCriterion("XuanXiangA is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaIsNotNull() {
            addCriterion("XuanXiangA is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaEqualTo(String value) {
            addCriterion("XuanXiangA =", value, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaNotEqualTo(String value) {
            addCriterion("XuanXiangA <>", value, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaGreaterThan(String value) {
            addCriterion("XuanXiangA >", value, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaGreaterThanOrEqualTo(String value) {
            addCriterion("XuanXiangA >=", value, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaLessThan(String value) {
            addCriterion("XuanXiangA <", value, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaLessThanOrEqualTo(String value) {
            addCriterion("XuanXiangA <=", value, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaLike(String value) {
            addCriterion("XuanXiangA like", value, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaNotLike(String value) {
            addCriterion("XuanXiangA not like", value, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaIn(List<String> values) {
            addCriterion("XuanXiangA in", values, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaNotIn(List<String> values) {
            addCriterion("XuanXiangA not in", values, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaBetween(String value1, String value2) {
            addCriterion("XuanXiangA between", value1, value2, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangaNotBetween(String value1, String value2) {
            addCriterion("XuanXiangA not between", value1, value2, "xuanxianga");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbIsNull() {
            addCriterion("XuanXiangB is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbIsNotNull() {
            addCriterion("XuanXiangB is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbEqualTo(String value) {
            addCriterion("XuanXiangB =", value, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbNotEqualTo(String value) {
            addCriterion("XuanXiangB <>", value, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbGreaterThan(String value) {
            addCriterion("XuanXiangB >", value, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbGreaterThanOrEqualTo(String value) {
            addCriterion("XuanXiangB >=", value, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbLessThan(String value) {
            addCriterion("XuanXiangB <", value, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbLessThanOrEqualTo(String value) {
            addCriterion("XuanXiangB <=", value, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbLike(String value) {
            addCriterion("XuanXiangB like", value, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbNotLike(String value) {
            addCriterion("XuanXiangB not like", value, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbIn(List<String> values) {
            addCriterion("XuanXiangB in", values, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbNotIn(List<String> values) {
            addCriterion("XuanXiangB not in", values, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbBetween(String value1, String value2) {
            addCriterion("XuanXiangB between", value1, value2, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbNotBetween(String value1, String value2) {
            addCriterion("XuanXiangB not between", value1, value2, "xuanxiangb");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcIsNull() {
            addCriterion("XuanXiangC is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcIsNotNull() {
            addCriterion("XuanXiangC is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcEqualTo(String value) {
            addCriterion("XuanXiangC =", value, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcNotEqualTo(String value) {
            addCriterion("XuanXiangC <>", value, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcGreaterThan(String value) {
            addCriterion("XuanXiangC >", value, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcGreaterThanOrEqualTo(String value) {
            addCriterion("XuanXiangC >=", value, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcLessThan(String value) {
            addCriterion("XuanXiangC <", value, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcLessThanOrEqualTo(String value) {
            addCriterion("XuanXiangC <=", value, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcLike(String value) {
            addCriterion("XuanXiangC like", value, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcNotLike(String value) {
            addCriterion("XuanXiangC not like", value, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcIn(List<String> values) {
            addCriterion("XuanXiangC in", values, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcNotIn(List<String> values) {
            addCriterion("XuanXiangC not in", values, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcBetween(String value1, String value2) {
            addCriterion("XuanXiangC between", value1, value2, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcNotBetween(String value1, String value2) {
            addCriterion("XuanXiangC not between", value1, value2, "xuanxiangc");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdIsNull() {
            addCriterion("XuanXiangD is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdIsNotNull() {
            addCriterion("XuanXiangD is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdEqualTo(String value) {
            addCriterion("XuanXiangD =", value, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdNotEqualTo(String value) {
            addCriterion("XuanXiangD <>", value, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdGreaterThan(String value) {
            addCriterion("XuanXiangD >", value, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdGreaterThanOrEqualTo(String value) {
            addCriterion("XuanXiangD >=", value, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdLessThan(String value) {
            addCriterion("XuanXiangD <", value, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdLessThanOrEqualTo(String value) {
            addCriterion("XuanXiangD <=", value, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdLike(String value) {
            addCriterion("XuanXiangD like", value, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdNotLike(String value) {
            addCriterion("XuanXiangD not like", value, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdIn(List<String> values) {
            addCriterion("XuanXiangD in", values, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdNotIn(List<String> values) {
            addCriterion("XuanXiangD not in", values, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdBetween(String value1, String value2) {
            addCriterion("XuanXiangD between", value1, value2, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdNotBetween(String value1, String value2) {
            addCriterion("XuanXiangD not between", value1, value2, "xuanxiangd");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeIsNull() {
            addCriterion("XuanXiangE is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeIsNotNull() {
            addCriterion("XuanXiangE is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeEqualTo(String value) {
            addCriterion("XuanXiangE =", value, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeNotEqualTo(String value) {
            addCriterion("XuanXiangE <>", value, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeGreaterThan(String value) {
            addCriterion("XuanXiangE >", value, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeGreaterThanOrEqualTo(String value) {
            addCriterion("XuanXiangE >=", value, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeLessThan(String value) {
            addCriterion("XuanXiangE <", value, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeLessThanOrEqualTo(String value) {
            addCriterion("XuanXiangE <=", value, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeLike(String value) {
            addCriterion("XuanXiangE like", value, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeNotLike(String value) {
            addCriterion("XuanXiangE not like", value, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeIn(List<String> values) {
            addCriterion("XuanXiangE in", values, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeNotIn(List<String> values) {
            addCriterion("XuanXiangE not in", values, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeBetween(String value1, String value2) {
            addCriterion("XuanXiangE between", value1, value2, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangeNotBetween(String value1, String value2) {
            addCriterion("XuanXiangE not between", value1, value2, "xuanxiange");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfIsNull() {
            addCriterion("XuanXiangF is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfIsNotNull() {
            addCriterion("XuanXiangF is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfEqualTo(String value) {
            addCriterion("XuanXiangF =", value, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfNotEqualTo(String value) {
            addCriterion("XuanXiangF <>", value, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfGreaterThan(String value) {
            addCriterion("XuanXiangF >", value, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfGreaterThanOrEqualTo(String value) {
            addCriterion("XuanXiangF >=", value, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfLessThan(String value) {
            addCriterion("XuanXiangF <", value, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfLessThanOrEqualTo(String value) {
            addCriterion("XuanXiangF <=", value, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfLike(String value) {
            addCriterion("XuanXiangF like", value, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfNotLike(String value) {
            addCriterion("XuanXiangF not like", value, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfIn(List<String> values) {
            addCriterion("XuanXiangF in", values, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfNotIn(List<String> values) {
            addCriterion("XuanXiangF not in", values, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfBetween(String value1, String value2) {
            addCriterion("XuanXiangF between", value1, value2, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfNotBetween(String value1, String value2) {
            addCriterion("XuanXiangF not between", value1, value2, "xuanxiangf");
            return (Criteria) this;
        }

        public Criteria andXuanxianggIsNull() {
            addCriterion("XuanXiangG is null");
            return (Criteria) this;
        }

        public Criteria andXuanxianggIsNotNull() {
            addCriterion("XuanXiangG is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxianggEqualTo(String value) {
            addCriterion("XuanXiangG =", value, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggNotEqualTo(String value) {
            addCriterion("XuanXiangG <>", value, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggGreaterThan(String value) {
            addCriterion("XuanXiangG >", value, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggGreaterThanOrEqualTo(String value) {
            addCriterion("XuanXiangG >=", value, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggLessThan(String value) {
            addCriterion("XuanXiangG <", value, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggLessThanOrEqualTo(String value) {
            addCriterion("XuanXiangG <=", value, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggLike(String value) {
            addCriterion("XuanXiangG like", value, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggNotLike(String value) {
            addCriterion("XuanXiangG not like", value, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggIn(List<String> values) {
            addCriterion("XuanXiangG in", values, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggNotIn(List<String> values) {
            addCriterion("XuanXiangG not in", values, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggBetween(String value1, String value2) {
            addCriterion("XuanXiangG between", value1, value2, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianggNotBetween(String value1, String value2) {
            addCriterion("XuanXiangG not between", value1, value2, "xuanxiangg");
            return (Criteria) this;
        }

        public Criteria andXuanxianghIsNull() {
            addCriterion("XuanXiangH is null");
            return (Criteria) this;
        }

        public Criteria andXuanxianghIsNotNull() {
            addCriterion("XuanXiangH is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxianghEqualTo(String value) {
            addCriterion("XuanXiangH =", value, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghNotEqualTo(String value) {
            addCriterion("XuanXiangH <>", value, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghGreaterThan(String value) {
            addCriterion("XuanXiangH >", value, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghGreaterThanOrEqualTo(String value) {
            addCriterion("XuanXiangH >=", value, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghLessThan(String value) {
            addCriterion("XuanXiangH <", value, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghLessThanOrEqualTo(String value) {
            addCriterion("XuanXiangH <=", value, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghLike(String value) {
            addCriterion("XuanXiangH like", value, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghNotLike(String value) {
            addCriterion("XuanXiangH not like", value, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghIn(List<String> values) {
            addCriterion("XuanXiangH in", values, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghNotIn(List<String> values) {
            addCriterion("XuanXiangH not in", values, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghBetween(String value1, String value2) {
            addCriterion("XuanXiangH between", value1, value2, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxianghNotBetween(String value1, String value2) {
            addCriterion("XuanXiangH not between", value1, value2, "xuanxiangh");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuIsNull() {
            addCriterion("XuanXiangAJiShu is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuIsNotNull() {
            addCriterion("XuanXiangAJiShu is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuEqualTo(Integer value) {
            addCriterion("XuanXiangAJiShu =", value, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuNotEqualTo(Integer value) {
            addCriterion("XuanXiangAJiShu <>", value, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuGreaterThan(Integer value) {
            addCriterion("XuanXiangAJiShu >", value, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangAJiShu >=", value, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuLessThan(Integer value) {
            addCriterion("XuanXiangAJiShu <", value, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuLessThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangAJiShu <=", value, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuIn(List<Integer> values) {
            addCriterion("XuanXiangAJiShu in", values, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuNotIn(List<Integer> values) {
            addCriterion("XuanXiangAJiShu not in", values, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangAJiShu between", value1, value2, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangajishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangAJiShu not between", value1, value2, "xuanxiangajishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuIsNull() {
            addCriterion("XuanXiangBJiShu is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuIsNotNull() {
            addCriterion("XuanXiangBJiShu is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuEqualTo(Integer value) {
            addCriterion("XuanXiangBJiShu =", value, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuNotEqualTo(Integer value) {
            addCriterion("XuanXiangBJiShu <>", value, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuGreaterThan(Integer value) {
            addCriterion("XuanXiangBJiShu >", value, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangBJiShu >=", value, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuLessThan(Integer value) {
            addCriterion("XuanXiangBJiShu <", value, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuLessThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangBJiShu <=", value, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuIn(List<Integer> values) {
            addCriterion("XuanXiangBJiShu in", values, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuNotIn(List<Integer> values) {
            addCriterion("XuanXiangBJiShu not in", values, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangBJiShu between", value1, value2, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangbjishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangBJiShu not between", value1, value2, "xuanxiangbjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuIsNull() {
            addCriterion("XuanXiangCJiShu is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuIsNotNull() {
            addCriterion("XuanXiangCJiShu is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuEqualTo(Integer value) {
            addCriterion("XuanXiangCJiShu =", value, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuNotEqualTo(Integer value) {
            addCriterion("XuanXiangCJiShu <>", value, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuGreaterThan(Integer value) {
            addCriterion("XuanXiangCJiShu >", value, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangCJiShu >=", value, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuLessThan(Integer value) {
            addCriterion("XuanXiangCJiShu <", value, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuLessThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangCJiShu <=", value, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuIn(List<Integer> values) {
            addCriterion("XuanXiangCJiShu in", values, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuNotIn(List<Integer> values) {
            addCriterion("XuanXiangCJiShu not in", values, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangCJiShu between", value1, value2, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangcjishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangCJiShu not between", value1, value2, "xuanxiangcjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuIsNull() {
            addCriterion("XuanXiangDJiShu is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuIsNotNull() {
            addCriterion("XuanXiangDJiShu is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuEqualTo(Integer value) {
            addCriterion("XuanXiangDJiShu =", value, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuNotEqualTo(Integer value) {
            addCriterion("XuanXiangDJiShu <>", value, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuGreaterThan(Integer value) {
            addCriterion("XuanXiangDJiShu >", value, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangDJiShu >=", value, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuLessThan(Integer value) {
            addCriterion("XuanXiangDJiShu <", value, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuLessThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangDJiShu <=", value, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuIn(List<Integer> values) {
            addCriterion("XuanXiangDJiShu in", values, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuNotIn(List<Integer> values) {
            addCriterion("XuanXiangDJiShu not in", values, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangDJiShu between", value1, value2, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangdjishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangDJiShu not between", value1, value2, "xuanxiangdjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuIsNull() {
            addCriterion("XuanXiangEJiShu is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuIsNotNull() {
            addCriterion("XuanXiangEJiShu is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuEqualTo(Integer value) {
            addCriterion("XuanXiangEJiShu =", value, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuNotEqualTo(Integer value) {
            addCriterion("XuanXiangEJiShu <>", value, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuGreaterThan(Integer value) {
            addCriterion("XuanXiangEJiShu >", value, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangEJiShu >=", value, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuLessThan(Integer value) {
            addCriterion("XuanXiangEJiShu <", value, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuLessThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangEJiShu <=", value, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuIn(List<Integer> values) {
            addCriterion("XuanXiangEJiShu in", values, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuNotIn(List<Integer> values) {
            addCriterion("XuanXiangEJiShu not in", values, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangEJiShu between", value1, value2, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangejishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangEJiShu not between", value1, value2, "xuanxiangejishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuIsNull() {
            addCriterion("XuanXiangFJiShu is null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuIsNotNull() {
            addCriterion("XuanXiangFJiShu is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuEqualTo(Integer value) {
            addCriterion("XuanXiangFJiShu =", value, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuNotEqualTo(Integer value) {
            addCriterion("XuanXiangFJiShu <>", value, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuGreaterThan(Integer value) {
            addCriterion("XuanXiangFJiShu >", value, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangFJiShu >=", value, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuLessThan(Integer value) {
            addCriterion("XuanXiangFJiShu <", value, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuLessThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangFJiShu <=", value, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuIn(List<Integer> values) {
            addCriterion("XuanXiangFJiShu in", values, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuNotIn(List<Integer> values) {
            addCriterion("XuanXiangFJiShu not in", values, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangFJiShu between", value1, value2, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxiangfjishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangFJiShu not between", value1, value2, "xuanxiangfjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuIsNull() {
            addCriterion("XuanXiangGJiShu is null");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuIsNotNull() {
            addCriterion("XuanXiangGJiShu is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuEqualTo(Integer value) {
            addCriterion("XuanXiangGJiShu =", value, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuNotEqualTo(Integer value) {
            addCriterion("XuanXiangGJiShu <>", value, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuGreaterThan(Integer value) {
            addCriterion("XuanXiangGJiShu >", value, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangGJiShu >=", value, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuLessThan(Integer value) {
            addCriterion("XuanXiangGJiShu <", value, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuLessThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangGJiShu <=", value, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuIn(List<Integer> values) {
            addCriterion("XuanXiangGJiShu in", values, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuNotIn(List<Integer> values) {
            addCriterion("XuanXiangGJiShu not in", values, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangGJiShu between", value1, value2, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianggjishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangGJiShu not between", value1, value2, "xuanxianggjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuIsNull() {
            addCriterion("XuanXiangHJiShu is null");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuIsNotNull() {
            addCriterion("XuanXiangHJiShu is not null");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuEqualTo(Integer value) {
            addCriterion("XuanXiangHJiShu =", value, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuNotEqualTo(Integer value) {
            addCriterion("XuanXiangHJiShu <>", value, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuGreaterThan(Integer value) {
            addCriterion("XuanXiangHJiShu >", value, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangHJiShu >=", value, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuLessThan(Integer value) {
            addCriterion("XuanXiangHJiShu <", value, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuLessThanOrEqualTo(Integer value) {
            addCriterion("XuanXiangHJiShu <=", value, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuIn(List<Integer> values) {
            addCriterion("XuanXiangHJiShu in", values, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuNotIn(List<Integer> values) {
            addCriterion("XuanXiangHJiShu not in", values, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangHJiShu between", value1, value2, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andXuanxianghjishuNotBetween(Integer value1, Integer value2) {
            addCriterion("XuanXiangHJiShu not between", value1, value2, "xuanxianghjishu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIsNull() {
            addCriterion("ShiFouShanChu is null");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIsNotNull() {
            addCriterion("ShiFouShanChu is not null");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuEqualTo(Integer value) {
            addCriterion("ShiFouShanChu =", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotEqualTo(Integer value) {
            addCriterion("ShiFouShanChu <>", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuGreaterThan(Integer value) {
            addCriterion("ShiFouShanChu >", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouShanChu >=", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuLessThan(Integer value) {
            addCriterion("ShiFouShanChu <", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouShanChu <=", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIn(List<Integer> values) {
            addCriterion("ShiFouShanChu in", values, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotIn(List<Integer> values) {
            addCriterion("ShiFouShanChu not in", values, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouShanChu between", value1, value2, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouShanChu not between", value1, value2, "shifoushanchu");
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

        public Criteria andTimuleixingIsNull() {
            addCriterion("TiMuLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andTimuleixingIsNotNull() {
            addCriterion("TiMuLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andTimuleixingEqualTo(Integer value) {
            addCriterion("TiMuLeiXing =", value, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingNotEqualTo(Integer value) {
            addCriterion("TiMuLeiXing <>", value, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingGreaterThan(Integer value) {
            addCriterion("TiMuLeiXing >", value, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("TiMuLeiXing >=", value, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingLessThan(Integer value) {
            addCriterion("TiMuLeiXing <", value, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingLessThanOrEqualTo(Integer value) {
            addCriterion("TiMuLeiXing <=", value, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingIn(List<Integer> values) {
            addCriterion("TiMuLeiXing in", values, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingNotIn(List<Integer> values) {
            addCriterion("TiMuLeiXing not in", values, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingBetween(Integer value1, Integer value2) {
            addCriterion("TiMuLeiXing between", value1, value2, "timuleixing");
            return (Criteria) this;
        }

        public Criteria andTimuleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("TiMuLeiXing not between", value1, value2, "timuleixing");
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