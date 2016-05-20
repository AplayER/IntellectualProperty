package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubGovNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubGovNewsExample() {
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

        public Criteria andFaburenidIsNull() {
            addCriterion("FaBuRenID is null");
            return (Criteria) this;
        }

        public Criteria andFaburenidIsNotNull() {
            addCriterion("FaBuRenID is not null");
            return (Criteria) this;
        }

        public Criteria andFaburenidEqualTo(Integer value) {
            addCriterion("FaBuRenID =", value, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidNotEqualTo(Integer value) {
            addCriterion("FaBuRenID <>", value, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidGreaterThan(Integer value) {
            addCriterion("FaBuRenID >", value, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FaBuRenID >=", value, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidLessThan(Integer value) {
            addCriterion("FaBuRenID <", value, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidLessThanOrEqualTo(Integer value) {
            addCriterion("FaBuRenID <=", value, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidIn(List<Integer> values) {
            addCriterion("FaBuRenID in", values, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidNotIn(List<Integer> values) {
            addCriterion("FaBuRenID not in", values, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidBetween(Integer value1, Integer value2) {
            addCriterion("FaBuRenID between", value1, value2, "faburenid");
            return (Criteria) this;
        }

        public Criteria andFaburenidNotBetween(Integer value1, Integer value2) {
            addCriterion("FaBuRenID not between", value1, value2, "faburenid");
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

        public Criteria andXinwenbiaotiIsNull() {
            addCriterion("XinWenBiaoTi is null");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiIsNotNull() {
            addCriterion("XinWenBiaoTi is not null");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiEqualTo(String value) {
            addCriterion("XinWenBiaoTi =", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiNotEqualTo(String value) {
            addCriterion("XinWenBiaoTi <>", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiGreaterThan(String value) {
            addCriterion("XinWenBiaoTi >", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("XinWenBiaoTi >=", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiLessThan(String value) {
            addCriterion("XinWenBiaoTi <", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiLessThanOrEqualTo(String value) {
            addCriterion("XinWenBiaoTi <=", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiLike(String value) {
            addCriterion("XinWenBiaoTi like", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiNotLike(String value) {
            addCriterion("XinWenBiaoTi not like", value, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiIn(List<String> values) {
            addCriterion("XinWenBiaoTi in", values, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiNotIn(List<String> values) {
            addCriterion("XinWenBiaoTi not in", values, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiBetween(String value1, String value2) {
            addCriterion("XinWenBiaoTi between", value1, value2, "xinwenbiaoti");
            return (Criteria) this;
        }

        public Criteria andXinwenbiaotiNotBetween(String value1, String value2) {
            addCriterion("XinWenBiaoTi not between", value1, value2, "xinwenbiaoti");
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

        public Criteria andFujianurl1IsNull() {
            addCriterion("FuJianURL1 is null");
            return (Criteria) this;
        }

        public Criteria andFujianurl1IsNotNull() {
            addCriterion("FuJianURL1 is not null");
            return (Criteria) this;
        }

        public Criteria andFujianurl1EqualTo(String value) {
            addCriterion("FuJianURL1 =", value, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1NotEqualTo(String value) {
            addCriterion("FuJianURL1 <>", value, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1GreaterThan(String value) {
            addCriterion("FuJianURL1 >", value, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1GreaterThanOrEqualTo(String value) {
            addCriterion("FuJianURL1 >=", value, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1LessThan(String value) {
            addCriterion("FuJianURL1 <", value, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1LessThanOrEqualTo(String value) {
            addCriterion("FuJianURL1 <=", value, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1Like(String value) {
            addCriterion("FuJianURL1 like", value, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1NotLike(String value) {
            addCriterion("FuJianURL1 not like", value, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1In(List<String> values) {
            addCriterion("FuJianURL1 in", values, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1NotIn(List<String> values) {
            addCriterion("FuJianURL1 not in", values, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1Between(String value1, String value2) {
            addCriterion("FuJianURL1 between", value1, value2, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl1NotBetween(String value1, String value2) {
            addCriterion("FuJianURL1 not between", value1, value2, "fujianurl1");
            return (Criteria) this;
        }

        public Criteria andFujianurl2IsNull() {
            addCriterion("FuJianURL2 is null");
            return (Criteria) this;
        }

        public Criteria andFujianurl2IsNotNull() {
            addCriterion("FuJianURL2 is not null");
            return (Criteria) this;
        }

        public Criteria andFujianurl2EqualTo(String value) {
            addCriterion("FuJianURL2 =", value, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2NotEqualTo(String value) {
            addCriterion("FuJianURL2 <>", value, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2GreaterThan(String value) {
            addCriterion("FuJianURL2 >", value, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2GreaterThanOrEqualTo(String value) {
            addCriterion("FuJianURL2 >=", value, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2LessThan(String value) {
            addCriterion("FuJianURL2 <", value, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2LessThanOrEqualTo(String value) {
            addCriterion("FuJianURL2 <=", value, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2Like(String value) {
            addCriterion("FuJianURL2 like", value, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2NotLike(String value) {
            addCriterion("FuJianURL2 not like", value, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2In(List<String> values) {
            addCriterion("FuJianURL2 in", values, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2NotIn(List<String> values) {
            addCriterion("FuJianURL2 not in", values, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2Between(String value1, String value2) {
            addCriterion("FuJianURL2 between", value1, value2, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl2NotBetween(String value1, String value2) {
            addCriterion("FuJianURL2 not between", value1, value2, "fujianurl2");
            return (Criteria) this;
        }

        public Criteria andFujianurl3IsNull() {
            addCriterion("FuJianURL3 is null");
            return (Criteria) this;
        }

        public Criteria andFujianurl3IsNotNull() {
            addCriterion("FuJianURL3 is not null");
            return (Criteria) this;
        }

        public Criteria andFujianurl3EqualTo(String value) {
            addCriterion("FuJianURL3 =", value, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3NotEqualTo(String value) {
            addCriterion("FuJianURL3 <>", value, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3GreaterThan(String value) {
            addCriterion("FuJianURL3 >", value, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3GreaterThanOrEqualTo(String value) {
            addCriterion("FuJianURL3 >=", value, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3LessThan(String value) {
            addCriterion("FuJianURL3 <", value, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3LessThanOrEqualTo(String value) {
            addCriterion("FuJianURL3 <=", value, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3Like(String value) {
            addCriterion("FuJianURL3 like", value, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3NotLike(String value) {
            addCriterion("FuJianURL3 not like", value, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3In(List<String> values) {
            addCriterion("FuJianURL3 in", values, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3NotIn(List<String> values) {
            addCriterion("FuJianURL3 not in", values, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3Between(String value1, String value2) {
            addCriterion("FuJianURL3 between", value1, value2, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl3NotBetween(String value1, String value2) {
            addCriterion("FuJianURL3 not between", value1, value2, "fujianurl3");
            return (Criteria) this;
        }

        public Criteria andFujianurl4IsNull() {
            addCriterion("FuJianURL4 is null");
            return (Criteria) this;
        }

        public Criteria andFujianurl4IsNotNull() {
            addCriterion("FuJianURL4 is not null");
            return (Criteria) this;
        }

        public Criteria andFujianurl4EqualTo(String value) {
            addCriterion("FuJianURL4 =", value, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4NotEqualTo(String value) {
            addCriterion("FuJianURL4 <>", value, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4GreaterThan(String value) {
            addCriterion("FuJianURL4 >", value, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4GreaterThanOrEqualTo(String value) {
            addCriterion("FuJianURL4 >=", value, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4LessThan(String value) {
            addCriterion("FuJianURL4 <", value, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4LessThanOrEqualTo(String value) {
            addCriterion("FuJianURL4 <=", value, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4Like(String value) {
            addCriterion("FuJianURL4 like", value, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4NotLike(String value) {
            addCriterion("FuJianURL4 not like", value, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4In(List<String> values) {
            addCriterion("FuJianURL4 in", values, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4NotIn(List<String> values) {
            addCriterion("FuJianURL4 not in", values, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4Between(String value1, String value2) {
            addCriterion("FuJianURL4 between", value1, value2, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl4NotBetween(String value1, String value2) {
            addCriterion("FuJianURL4 not between", value1, value2, "fujianurl4");
            return (Criteria) this;
        }

        public Criteria andFujianurl5IsNull() {
            addCriterion("FuJianURL5 is null");
            return (Criteria) this;
        }

        public Criteria andFujianurl5IsNotNull() {
            addCriterion("FuJianURL5 is not null");
            return (Criteria) this;
        }

        public Criteria andFujianurl5EqualTo(String value) {
            addCriterion("FuJianURL5 =", value, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5NotEqualTo(String value) {
            addCriterion("FuJianURL5 <>", value, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5GreaterThan(String value) {
            addCriterion("FuJianURL5 >", value, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5GreaterThanOrEqualTo(String value) {
            addCriterion("FuJianURL5 >=", value, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5LessThan(String value) {
            addCriterion("FuJianURL5 <", value, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5LessThanOrEqualTo(String value) {
            addCriterion("FuJianURL5 <=", value, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5Like(String value) {
            addCriterion("FuJianURL5 like", value, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5NotLike(String value) {
            addCriterion("FuJianURL5 not like", value, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5In(List<String> values) {
            addCriterion("FuJianURL5 in", values, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5NotIn(List<String> values) {
            addCriterion("FuJianURL5 not in", values, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5Between(String value1, String value2) {
            addCriterion("FuJianURL5 between", value1, value2, "fujianurl5");
            return (Criteria) this;
        }

        public Criteria andFujianurl5NotBetween(String value1, String value2) {
            addCriterion("FuJianURL5 not between", value1, value2, "fujianurl5");
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