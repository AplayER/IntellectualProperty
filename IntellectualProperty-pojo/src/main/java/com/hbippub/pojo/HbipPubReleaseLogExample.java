package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubReleaseLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubReleaseLogExample() {
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

        public Criteria andRizhiidIsNull() {
            addCriterion("RiZhiID is null");
            return (Criteria) this;
        }

        public Criteria andRizhiidIsNotNull() {
            addCriterion("RiZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andRizhiidEqualTo(Integer value) {
            addCriterion("RiZhiID =", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotEqualTo(Integer value) {
            addCriterion("RiZhiID <>", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidGreaterThan(Integer value) {
            addCriterion("RiZhiID >", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RiZhiID >=", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidLessThan(Integer value) {
            addCriterion("RiZhiID <", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidLessThanOrEqualTo(Integer value) {
            addCriterion("RiZhiID <=", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidIn(List<Integer> values) {
            addCriterion("RiZhiID in", values, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotIn(List<Integer> values) {
            addCriterion("RiZhiID not in", values, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidBetween(Integer value1, Integer value2) {
            addCriterion("RiZhiID between", value1, value2, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("RiZhiID not between", value1, value2, "rizhiid");
            return (Criteria) this;
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

        public Criteria andLeixingidIsNull() {
            addCriterion("LeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andLeixingidIsNotNull() {
            addCriterion("LeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingidEqualTo(Integer value) {
            addCriterion("LeiXingID =", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotEqualTo(Integer value) {
            addCriterion("LeiXingID <>", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidGreaterThan(Integer value) {
            addCriterion("LeiXingID >", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LeiXingID >=", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidLessThan(Integer value) {
            addCriterion("LeiXingID <", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidLessThanOrEqualTo(Integer value) {
            addCriterion("LeiXingID <=", value, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidIn(List<Integer> values) {
            addCriterion("LeiXingID in", values, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotIn(List<Integer> values) {
            addCriterion("LeiXingID not in", values, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidBetween(Integer value1, Integer value2) {
            addCriterion("LeiXingID between", value1, value2, "leixingid");
            return (Criteria) this;
        }

        public Criteria andLeixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("LeiXingID not between", value1, value2, "leixingid");
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

        public Criteria andFaburenxingmingIsNull() {
            addCriterion("FaBuRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingIsNotNull() {
            addCriterion("FaBuRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingEqualTo(String value) {
            addCriterion("FaBuRenXingMing =", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingNotEqualTo(String value) {
            addCriterion("FaBuRenXingMing <>", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingGreaterThan(String value) {
            addCriterion("FaBuRenXingMing >", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FaBuRenXingMing >=", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingLessThan(String value) {
            addCriterion("FaBuRenXingMing <", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingLessThanOrEqualTo(String value) {
            addCriterion("FaBuRenXingMing <=", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingLike(String value) {
            addCriterion("FaBuRenXingMing like", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingNotLike(String value) {
            addCriterion("FaBuRenXingMing not like", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingIn(List<String> values) {
            addCriterion("FaBuRenXingMing in", values, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingNotIn(List<String> values) {
            addCriterion("FaBuRenXingMing not in", values, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingBetween(String value1, String value2) {
            addCriterion("FaBuRenXingMing between", value1, value2, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingNotBetween(String value1, String value2) {
            addCriterion("FaBuRenXingMing not between", value1, value2, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andJilumingchengIsNull() {
            addCriterion("JiLuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andJilumingchengIsNotNull() {
            addCriterion("JiLuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andJilumingchengEqualTo(String value) {
            addCriterion("JiLuMingCheng =", value, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengNotEqualTo(String value) {
            addCriterion("JiLuMingCheng <>", value, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengGreaterThan(String value) {
            addCriterion("JiLuMingCheng >", value, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("JiLuMingCheng >=", value, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengLessThan(String value) {
            addCriterion("JiLuMingCheng <", value, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengLessThanOrEqualTo(String value) {
            addCriterion("JiLuMingCheng <=", value, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengLike(String value) {
            addCriterion("JiLuMingCheng like", value, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengNotLike(String value) {
            addCriterion("JiLuMingCheng not like", value, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengIn(List<String> values) {
            addCriterion("JiLuMingCheng in", values, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengNotIn(List<String> values) {
            addCriterion("JiLuMingCheng not in", values, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengBetween(String value1, String value2) {
            addCriterion("JiLuMingCheng between", value1, value2, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJilumingchengNotBetween(String value1, String value2) {
            addCriterion("JiLuMingCheng not between", value1, value2, "jilumingcheng");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingIsNull() {
            addCriterion("JiLuXiangQing is null");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingIsNotNull() {
            addCriterion("JiLuXiangQing is not null");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingEqualTo(String value) {
            addCriterion("JiLuXiangQing =", value, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingNotEqualTo(String value) {
            addCriterion("JiLuXiangQing <>", value, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingGreaterThan(String value) {
            addCriterion("JiLuXiangQing >", value, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingGreaterThanOrEqualTo(String value) {
            addCriterion("JiLuXiangQing >=", value, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingLessThan(String value) {
            addCriterion("JiLuXiangQing <", value, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingLessThanOrEqualTo(String value) {
            addCriterion("JiLuXiangQing <=", value, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingLike(String value) {
            addCriterion("JiLuXiangQing like", value, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingNotLike(String value) {
            addCriterion("JiLuXiangQing not like", value, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingIn(List<String> values) {
            addCriterion("JiLuXiangQing in", values, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingNotIn(List<String> values) {
            addCriterion("JiLuXiangQing not in", values, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingBetween(String value1, String value2) {
            addCriterion("JiLuXiangQing between", value1, value2, "jiluxiangqing");
            return (Criteria) this;
        }

        public Criteria andJiluxiangqingNotBetween(String value1, String value2) {
            addCriterion("JiLuXiangQing not between", value1, value2, "jiluxiangqing");
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

        public Criteria andTouxiangurlIsNull() {
            addCriterion("TouXiangURL is null");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlIsNotNull() {
            addCriterion("TouXiangURL is not null");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlEqualTo(String value) {
            addCriterion("TouXiangURL =", value, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlNotEqualTo(String value) {
            addCriterion("TouXiangURL <>", value, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlGreaterThan(String value) {
            addCriterion("TouXiangURL >", value, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlGreaterThanOrEqualTo(String value) {
            addCriterion("TouXiangURL >=", value, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlLessThan(String value) {
            addCriterion("TouXiangURL <", value, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlLessThanOrEqualTo(String value) {
            addCriterion("TouXiangURL <=", value, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlLike(String value) {
            addCriterion("TouXiangURL like", value, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlNotLike(String value) {
            addCriterion("TouXiangURL not like", value, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlIn(List<String> values) {
            addCriterion("TouXiangURL in", values, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlNotIn(List<String> values) {
            addCriterion("TouXiangURL not in", values, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlBetween(String value1, String value2) {
            addCriterion("TouXiangURL between", value1, value2, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andTouxiangurlNotBetween(String value1, String value2) {
            addCriterion("TouXiangURL not between", value1, value2, "touxiangurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlIsNull() {
            addCriterion("JiLuURL is null");
            return (Criteria) this;
        }

        public Criteria andJiluurlIsNotNull() {
            addCriterion("JiLuURL is not null");
            return (Criteria) this;
        }

        public Criteria andJiluurlEqualTo(String value) {
            addCriterion("JiLuURL =", value, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlNotEqualTo(String value) {
            addCriterion("JiLuURL <>", value, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlGreaterThan(String value) {
            addCriterion("JiLuURL >", value, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlGreaterThanOrEqualTo(String value) {
            addCriterion("JiLuURL >=", value, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlLessThan(String value) {
            addCriterion("JiLuURL <", value, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlLessThanOrEqualTo(String value) {
            addCriterion("JiLuURL <=", value, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlLike(String value) {
            addCriterion("JiLuURL like", value, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlNotLike(String value) {
            addCriterion("JiLuURL not like", value, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlIn(List<String> values) {
            addCriterion("JiLuURL in", values, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlNotIn(List<String> values) {
            addCriterion("JiLuURL not in", values, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlBetween(String value1, String value2) {
            addCriterion("JiLuURL between", value1, value2, "jiluurl");
            return (Criteria) this;
        }

        public Criteria andJiluurlNotBetween(String value1, String value2) {
            addCriterion("JiLuURL not between", value1, value2, "jiluurl");
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