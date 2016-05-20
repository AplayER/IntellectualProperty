package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubTeamMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubTeamMemberExample() {
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

        public Criteria andChengyuanidIsNull() {
            addCriterion("ChengYuanID is null");
            return (Criteria) this;
        }

        public Criteria andChengyuanidIsNotNull() {
            addCriterion("ChengYuanID is not null");
            return (Criteria) this;
        }

        public Criteria andChengyuanidEqualTo(Integer value) {
            addCriterion("ChengYuanID =", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidNotEqualTo(Integer value) {
            addCriterion("ChengYuanID <>", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidGreaterThan(Integer value) {
            addCriterion("ChengYuanID >", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanID >=", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidLessThan(Integer value) {
            addCriterion("ChengYuanID <", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidLessThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanID <=", value, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidIn(List<Integer> values) {
            addCriterion("ChengYuanID in", values, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidNotIn(List<Integer> values) {
            addCriterion("ChengYuanID not in", values, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanID between", value1, value2, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andChengyuanidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanID not between", value1, value2, "chengyuanid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidIsNull() {
            addCriterion("TuanDuiID is null");
            return (Criteria) this;
        }

        public Criteria andTuanduiidIsNotNull() {
            addCriterion("TuanDuiID is not null");
            return (Criteria) this;
        }

        public Criteria andTuanduiidEqualTo(Integer value) {
            addCriterion("TuanDuiID =", value, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidNotEqualTo(Integer value) {
            addCriterion("TuanDuiID <>", value, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidGreaterThan(Integer value) {
            addCriterion("TuanDuiID >", value, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TuanDuiID >=", value, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidLessThan(Integer value) {
            addCriterion("TuanDuiID <", value, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidLessThanOrEqualTo(Integer value) {
            addCriterion("TuanDuiID <=", value, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidIn(List<Integer> values) {
            addCriterion("TuanDuiID in", values, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidNotIn(List<Integer> values) {
            addCriterion("TuanDuiID not in", values, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidBetween(Integer value1, Integer value2) {
            addCriterion("TuanDuiID between", value1, value2, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andTuanduiidNotBetween(Integer value1, Integer value2) {
            addCriterion("TuanDuiID not between", value1, value2, "tuanduiid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidIsNull() {
            addCriterion("ChengYuanYongHuID is null");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidIsNotNull() {
            addCriterion("ChengYuanYongHuID is not null");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidEqualTo(Integer value) {
            addCriterion("ChengYuanYongHuID =", value, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidNotEqualTo(Integer value) {
            addCriterion("ChengYuanYongHuID <>", value, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidGreaterThan(Integer value) {
            addCriterion("ChengYuanYongHuID >", value, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanYongHuID >=", value, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidLessThan(Integer value) {
            addCriterion("ChengYuanYongHuID <", value, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidLessThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanYongHuID <=", value, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidIn(List<Integer> values) {
            addCriterion("ChengYuanYongHuID in", values, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidNotIn(List<Integer> values) {
            addCriterion("ChengYuanYongHuID not in", values, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanYongHuID between", value1, value2, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanyonghuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanYongHuID not between", value1, value2, "chengyuanyonghuid");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingIsNull() {
            addCriterion("ChengYuanXingMing is null");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingIsNotNull() {
            addCriterion("ChengYuanXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingEqualTo(String value) {
            addCriterion("ChengYuanXingMing =", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingNotEqualTo(String value) {
            addCriterion("ChengYuanXingMing <>", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingGreaterThan(String value) {
            addCriterion("ChengYuanXingMing >", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ChengYuanXingMing >=", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingLessThan(String value) {
            addCriterion("ChengYuanXingMing <", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingLessThanOrEqualTo(String value) {
            addCriterion("ChengYuanXingMing <=", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingLike(String value) {
            addCriterion("ChengYuanXingMing like", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingNotLike(String value) {
            addCriterion("ChengYuanXingMing not like", value, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingIn(List<String> values) {
            addCriterion("ChengYuanXingMing in", values, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingNotIn(List<String> values) {
            addCriterion("ChengYuanXingMing not in", values, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingBetween(String value1, String value2) {
            addCriterion("ChengYuanXingMing between", value1, value2, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanxingmingNotBetween(String value1, String value2) {
            addCriterion("ChengYuanXingMing not between", value1, value2, "chengyuanxingming");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieIsNull() {
            addCriterion("ChengYuanLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieIsNotNull() {
            addCriterion("ChengYuanLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieEqualTo(Integer value) {
            addCriterion("ChengYuanLeiBie =", value, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieNotEqualTo(Integer value) {
            addCriterion("ChengYuanLeiBie <>", value, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieGreaterThan(Integer value) {
            addCriterion("ChengYuanLeiBie >", value, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanLeiBie >=", value, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieLessThan(Integer value) {
            addCriterion("ChengYuanLeiBie <", value, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieLessThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanLeiBie <=", value, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieIn(List<Integer> values) {
            addCriterion("ChengYuanLeiBie in", values, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieNotIn(List<Integer> values) {
            addCriterion("ChengYuanLeiBie not in", values, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanLeiBie between", value1, value2, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andChengyuanleibieNotBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanLeiBie not between", value1, value2, "chengyuanleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieIsNull() {
            addCriterion("ShenQingLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieIsNotNull() {
            addCriterion("ShenQingLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieEqualTo(Integer value) {
            addCriterion("ShenQingLeiBie =", value, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieNotEqualTo(Integer value) {
            addCriterion("ShenQingLeiBie <>", value, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieGreaterThan(Integer value) {
            addCriterion("ShenQingLeiBie >", value, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenQingLeiBie >=", value, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieLessThan(Integer value) {
            addCriterion("ShenQingLeiBie <", value, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieLessThanOrEqualTo(Integer value) {
            addCriterion("ShenQingLeiBie <=", value, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieIn(List<Integer> values) {
            addCriterion("ShenQingLeiBie in", values, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieNotIn(List<Integer> values) {
            addCriterion("ShenQingLeiBie not in", values, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingLeiBie between", value1, value2, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenqingleibieNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingLeiBie not between", value1, value2, "shenqingleibie");
            return (Criteria) this;
        }

        public Criteria andShenfenIsNull() {
            addCriterion("ShenFen is null");
            return (Criteria) this;
        }

        public Criteria andShenfenIsNotNull() {
            addCriterion("ShenFen is not null");
            return (Criteria) this;
        }

        public Criteria andShenfenEqualTo(Integer value) {
            addCriterion("ShenFen =", value, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenNotEqualTo(Integer value) {
            addCriterion("ShenFen <>", value, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenGreaterThan(Integer value) {
            addCriterion("ShenFen >", value, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenFen >=", value, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenLessThan(Integer value) {
            addCriterion("ShenFen <", value, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenLessThanOrEqualTo(Integer value) {
            addCriterion("ShenFen <=", value, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenIn(List<Integer> values) {
            addCriterion("ShenFen in", values, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenNotIn(List<Integer> values) {
            addCriterion("ShenFen not in", values, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenBetween(Integer value1, Integer value2) {
            addCriterion("ShenFen between", value1, value2, "shenfen");
            return (Criteria) this;
        }

        public Criteria andShenfenNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenFen not between", value1, value2, "shenfen");
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

        public Criteria andShenqingliyouIsNull() {
            addCriterion("ShenQingLiYou is null");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouIsNotNull() {
            addCriterion("ShenQingLiYou is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouEqualTo(String value) {
            addCriterion("ShenQingLiYou =", value, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouNotEqualTo(String value) {
            addCriterion("ShenQingLiYou <>", value, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouGreaterThan(String value) {
            addCriterion("ShenQingLiYou >", value, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouGreaterThanOrEqualTo(String value) {
            addCriterion("ShenQingLiYou >=", value, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouLessThan(String value) {
            addCriterion("ShenQingLiYou <", value, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouLessThanOrEqualTo(String value) {
            addCriterion("ShenQingLiYou <=", value, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouLike(String value) {
            addCriterion("ShenQingLiYou like", value, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouNotLike(String value) {
            addCriterion("ShenQingLiYou not like", value, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouIn(List<String> values) {
            addCriterion("ShenQingLiYou in", values, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouNotIn(List<String> values) {
            addCriterion("ShenQingLiYou not in", values, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouBetween(String value1, String value2) {
            addCriterion("ShenQingLiYou between", value1, value2, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andShenqingliyouNotBetween(String value1, String value2) {
            addCriterion("ShenQingLiYou not between", value1, value2, "shenqingliyou");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidIsNull() {
            addCriterion("YaoQingRenID is null");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidIsNotNull() {
            addCriterion("YaoQingRenID is not null");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidEqualTo(Integer value) {
            addCriterion("YaoQingRenID =", value, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidNotEqualTo(Integer value) {
            addCriterion("YaoQingRenID <>", value, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidGreaterThan(Integer value) {
            addCriterion("YaoQingRenID >", value, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YaoQingRenID >=", value, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidLessThan(Integer value) {
            addCriterion("YaoQingRenID <", value, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidLessThanOrEqualTo(Integer value) {
            addCriterion("YaoQingRenID <=", value, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidIn(List<Integer> values) {
            addCriterion("YaoQingRenID in", values, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidNotIn(List<Integer> values) {
            addCriterion("YaoQingRenID not in", values, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidBetween(Integer value1, Integer value2) {
            addCriterion("YaoQingRenID between", value1, value2, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenidNotBetween(Integer value1, Integer value2) {
            addCriterion("YaoQingRenID not between", value1, value2, "yaoqingrenid");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingIsNull() {
            addCriterion("YaoQingRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingIsNotNull() {
            addCriterion("YaoQingRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingEqualTo(String value) {
            addCriterion("YaoQingRenXingMing =", value, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingNotEqualTo(String value) {
            addCriterion("YaoQingRenXingMing <>", value, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingGreaterThan(String value) {
            addCriterion("YaoQingRenXingMing >", value, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("YaoQingRenXingMing >=", value, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingLessThan(String value) {
            addCriterion("YaoQingRenXingMing <", value, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("YaoQingRenXingMing <=", value, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingLike(String value) {
            addCriterion("YaoQingRenXingMing like", value, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingNotLike(String value) {
            addCriterion("YaoQingRenXingMing not like", value, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingIn(List<String> values) {
            addCriterion("YaoQingRenXingMing in", values, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingNotIn(List<String> values) {
            addCriterion("YaoQingRenXingMing not in", values, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingBetween(String value1, String value2) {
            addCriterion("YaoQingRenXingMing between", value1, value2, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingrenxingmingNotBetween(String value1, String value2) {
            addCriterion("YaoQingRenXingMing not between", value1, value2, "yaoqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianIsNull() {
            addCriterion("YaoQingShiJian is null");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianIsNotNull() {
            addCriterion("YaoQingShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianEqualTo(Date value) {
            addCriterion("YaoQingShiJian =", value, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianNotEqualTo(Date value) {
            addCriterion("YaoQingShiJian <>", value, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianGreaterThan(Date value) {
            addCriterion("YaoQingShiJian >", value, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("YaoQingShiJian >=", value, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianLessThan(Date value) {
            addCriterion("YaoQingShiJian <", value, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianLessThanOrEqualTo(Date value) {
            addCriterion("YaoQingShiJian <=", value, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianIn(List<Date> values) {
            addCriterion("YaoQingShiJian in", values, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianNotIn(List<Date> values) {
            addCriterion("YaoQingShiJian not in", values, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianBetween(Date value1, Date value2) {
            addCriterion("YaoQingShiJian between", value1, value2, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andYaoqingshijianNotBetween(Date value1, Date value2) {
            addCriterion("YaoQingShiJian not between", value1, value2, "yaoqingshijian");
            return (Criteria) this;
        }

        public Criteria andShenherenidIsNull() {
            addCriterion("ShenHeRenID is null");
            return (Criteria) this;
        }

        public Criteria andShenherenidIsNotNull() {
            addCriterion("ShenHeRenID is not null");
            return (Criteria) this;
        }

        public Criteria andShenherenidEqualTo(Integer value) {
            addCriterion("ShenHeRenID =", value, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidNotEqualTo(Integer value) {
            addCriterion("ShenHeRenID <>", value, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidGreaterThan(Integer value) {
            addCriterion("ShenHeRenID >", value, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenHeRenID >=", value, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidLessThan(Integer value) {
            addCriterion("ShenHeRenID <", value, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidLessThanOrEqualTo(Integer value) {
            addCriterion("ShenHeRenID <=", value, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidIn(List<Integer> values) {
            addCriterion("ShenHeRenID in", values, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidNotIn(List<Integer> values) {
            addCriterion("ShenHeRenID not in", values, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidBetween(Integer value1, Integer value2) {
            addCriterion("ShenHeRenID between", value1, value2, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenHeRenID not between", value1, value2, "shenherenid");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingIsNull() {
            addCriterion("ShenHeRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingIsNotNull() {
            addCriterion("ShenHeRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingEqualTo(String value) {
            addCriterion("ShenHeRenXingMing =", value, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingNotEqualTo(String value) {
            addCriterion("ShenHeRenXingMing <>", value, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingGreaterThan(String value) {
            addCriterion("ShenHeRenXingMing >", value, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ShenHeRenXingMing >=", value, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingLessThan(String value) {
            addCriterion("ShenHeRenXingMing <", value, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ShenHeRenXingMing <=", value, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingLike(String value) {
            addCriterion("ShenHeRenXingMing like", value, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingNotLike(String value) {
            addCriterion("ShenHeRenXingMing not like", value, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingIn(List<String> values) {
            addCriterion("ShenHeRenXingMing in", values, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingNotIn(List<String> values) {
            addCriterion("ShenHeRenXingMing not in", values, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingBetween(String value1, String value2) {
            addCriterion("ShenHeRenXingMing between", value1, value2, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenherenxingmingNotBetween(String value1, String value2) {
            addCriterion("ShenHeRenXingMing not between", value1, value2, "shenherenxingming");
            return (Criteria) this;
        }

        public Criteria andShenheshijianIsNull() {
            addCriterion("ShenHeShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenheshijianIsNotNull() {
            addCriterion("ShenHeShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenheshijianEqualTo(Date value) {
            addCriterion("ShenHeShiJian =", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotEqualTo(Date value) {
            addCriterion("ShenHeShiJian <>", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianGreaterThan(Date value) {
            addCriterion("ShenHeShiJian >", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ShenHeShiJian >=", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianLessThan(Date value) {
            addCriterion("ShenHeShiJian <", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianLessThanOrEqualTo(Date value) {
            addCriterion("ShenHeShiJian <=", value, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianIn(List<Date> values) {
            addCriterion("ShenHeShiJian in", values, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotIn(List<Date> values) {
            addCriterion("ShenHeShiJian not in", values, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianBetween(Date value1, Date value2) {
            addCriterion("ShenHeShiJian between", value1, value2, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenheshijianNotBetween(Date value1, Date value2) {
            addCriterion("ShenHeShiJian not between", value1, value2, "shenheshijian");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoIsNull() {
            addCriterion("ShenHeJieGuo is null");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoIsNotNull() {
            addCriterion("ShenHeJieGuo is not null");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoEqualTo(Integer value) {
            addCriterion("ShenHeJieGuo =", value, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoNotEqualTo(Integer value) {
            addCriterion("ShenHeJieGuo <>", value, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoGreaterThan(Integer value) {
            addCriterion("ShenHeJieGuo >", value, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenHeJieGuo >=", value, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoLessThan(Integer value) {
            addCriterion("ShenHeJieGuo <", value, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoLessThanOrEqualTo(Integer value) {
            addCriterion("ShenHeJieGuo <=", value, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoIn(List<Integer> values) {
            addCriterion("ShenHeJieGuo in", values, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoNotIn(List<Integer> values) {
            addCriterion("ShenHeJieGuo not in", values, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoBetween(Integer value1, Integer value2) {
            addCriterion("ShenHeJieGuo between", value1, value2, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andShenhejieguoNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenHeJieGuo not between", value1, value2, "shenhejieguo");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingIsNull() {
            addCriterion("JieGuoShuoMing is null");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingIsNotNull() {
            addCriterion("JieGuoShuoMing is not null");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingEqualTo(String value) {
            addCriterion("JieGuoShuoMing =", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingNotEqualTo(String value) {
            addCriterion("JieGuoShuoMing <>", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingGreaterThan(String value) {
            addCriterion("JieGuoShuoMing >", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingGreaterThanOrEqualTo(String value) {
            addCriterion("JieGuoShuoMing >=", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingLessThan(String value) {
            addCriterion("JieGuoShuoMing <", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingLessThanOrEqualTo(String value) {
            addCriterion("JieGuoShuoMing <=", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingLike(String value) {
            addCriterion("JieGuoShuoMing like", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingNotLike(String value) {
            addCriterion("JieGuoShuoMing not like", value, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingIn(List<String> values) {
            addCriterion("JieGuoShuoMing in", values, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingNotIn(List<String> values) {
            addCriterion("JieGuoShuoMing not in", values, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingBetween(String value1, String value2) {
            addCriterion("JieGuoShuoMing between", value1, value2, "jieguoshuoming");
            return (Criteria) this;
        }

        public Criteria andJieguoshuomingNotBetween(String value1, String value2) {
            addCriterion("JieGuoShuoMing not between", value1, value2, "jieguoshuoming");
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