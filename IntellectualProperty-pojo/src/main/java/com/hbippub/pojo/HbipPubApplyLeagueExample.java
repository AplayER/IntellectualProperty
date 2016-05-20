package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubApplyLeagueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubApplyLeagueExample() {
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

        public Criteria andShenqingrenidIsNull() {
            addCriterion("ShenQingRenID is null");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidIsNotNull() {
            addCriterion("ShenQingRenID is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidEqualTo(Integer value) {
            addCriterion("ShenQingRenID =", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidNotEqualTo(Integer value) {
            addCriterion("ShenQingRenID <>", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidGreaterThan(Integer value) {
            addCriterion("ShenQingRenID >", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenQingRenID >=", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidLessThan(Integer value) {
            addCriterion("ShenQingRenID <", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidLessThanOrEqualTo(Integer value) {
            addCriterion("ShenQingRenID <=", value, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidIn(List<Integer> values) {
            addCriterion("ShenQingRenID in", values, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidNotIn(List<Integer> values) {
            addCriterion("ShenQingRenID not in", values, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingRenID between", value1, value2, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingRenID not between", value1, value2, "shenqingrenid");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingIsNull() {
            addCriterion("ShenQingRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingIsNotNull() {
            addCriterion("ShenQingRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingEqualTo(String value) {
            addCriterion("ShenQingRenXingMing =", value, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingNotEqualTo(String value) {
            addCriterion("ShenQingRenXingMing <>", value, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingGreaterThan(String value) {
            addCriterion("ShenQingRenXingMing >", value, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ShenQingRenXingMing >=", value, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingLessThan(String value) {
            addCriterion("ShenQingRenXingMing <", value, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ShenQingRenXingMing <=", value, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingLike(String value) {
            addCriterion("ShenQingRenXingMing like", value, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingNotLike(String value) {
            addCriterion("ShenQingRenXingMing not like", value, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingIn(List<String> values) {
            addCriterion("ShenQingRenXingMing in", values, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingNotIn(List<String> values) {
            addCriterion("ShenQingRenXingMing not in", values, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingBetween(String value1, String value2) {
            addCriterion("ShenQingRenXingMing between", value1, value2, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrenxingmingNotBetween(String value1, String value2) {
            addCriterion("ShenQingRenXingMing not between", value1, value2, "shenqingrenxingming");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaIsNull() {
            addCriterion("ShenQingRenDianHua is null");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaIsNotNull() {
            addCriterion("ShenQingRenDianHua is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaEqualTo(String value) {
            addCriterion("ShenQingRenDianHua =", value, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaNotEqualTo(String value) {
            addCriterion("ShenQingRenDianHua <>", value, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaGreaterThan(String value) {
            addCriterion("ShenQingRenDianHua >", value, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("ShenQingRenDianHua >=", value, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaLessThan(String value) {
            addCriterion("ShenQingRenDianHua <", value, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaLessThanOrEqualTo(String value) {
            addCriterion("ShenQingRenDianHua <=", value, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaLike(String value) {
            addCriterion("ShenQingRenDianHua like", value, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaNotLike(String value) {
            addCriterion("ShenQingRenDianHua not like", value, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaIn(List<String> values) {
            addCriterion("ShenQingRenDianHua in", values, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaNotIn(List<String> values) {
            addCriterion("ShenQingRenDianHua not in", values, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaBetween(String value1, String value2) {
            addCriterion("ShenQingRenDianHua between", value1, value2, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendianhuaNotBetween(String value1, String value2) {
            addCriterion("ShenQingRenDianHua not between", value1, value2, "shenqingrendianhua");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiIsNull() {
            addCriterion("ShenQingRenDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiIsNotNull() {
            addCriterion("ShenQingRenDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiEqualTo(String value) {
            addCriterion("ShenQingRenDiZhi =", value, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiNotEqualTo(String value) {
            addCriterion("ShenQingRenDiZhi <>", value, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiGreaterThan(String value) {
            addCriterion("ShenQingRenDiZhi >", value, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiGreaterThanOrEqualTo(String value) {
            addCriterion("ShenQingRenDiZhi >=", value, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiLessThan(String value) {
            addCriterion("ShenQingRenDiZhi <", value, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiLessThanOrEqualTo(String value) {
            addCriterion("ShenQingRenDiZhi <=", value, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiLike(String value) {
            addCriterion("ShenQingRenDiZhi like", value, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiNotLike(String value) {
            addCriterion("ShenQingRenDiZhi not like", value, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiIn(List<String> values) {
            addCriterion("ShenQingRenDiZhi in", values, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiNotIn(List<String> values) {
            addCriterion("ShenQingRenDiZhi not in", values, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiBetween(String value1, String value2) {
            addCriterion("ShenQingRenDiZhi between", value1, value2, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andShenqingrendizhiNotBetween(String value1, String value2) {
            addCriterion("ShenQingRenDiZhi not between", value1, value2, "shenqingrendizhi");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidIsNull() {
            addCriterion("FuWuJiGouID is null");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidIsNotNull() {
            addCriterion("FuWuJiGouID is not null");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidEqualTo(Integer value) {
            addCriterion("FuWuJiGouID =", value, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidNotEqualTo(Integer value) {
            addCriterion("FuWuJiGouID <>", value, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidGreaterThan(Integer value) {
            addCriterion("FuWuJiGouID >", value, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FuWuJiGouID >=", value, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidLessThan(Integer value) {
            addCriterion("FuWuJiGouID <", value, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidLessThanOrEqualTo(Integer value) {
            addCriterion("FuWuJiGouID <=", value, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidIn(List<Integer> values) {
            addCriterion("FuWuJiGouID in", values, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidNotIn(List<Integer> values) {
            addCriterion("FuWuJiGouID not in", values, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidBetween(Integer value1, Integer value2) {
            addCriterion("FuWuJiGouID between", value1, value2, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigouidNotBetween(Integer value1, Integer value2) {
            addCriterion("FuWuJiGouID not between", value1, value2, "fuwujigouid");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengIsNull() {
            addCriterion("FuWuJiGouMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengIsNotNull() {
            addCriterion("FuWuJiGouMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengEqualTo(String value) {
            addCriterion("FuWuJiGouMingCheng =", value, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengNotEqualTo(String value) {
            addCriterion("FuWuJiGouMingCheng <>", value, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengGreaterThan(String value) {
            addCriterion("FuWuJiGouMingCheng >", value, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("FuWuJiGouMingCheng >=", value, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengLessThan(String value) {
            addCriterion("FuWuJiGouMingCheng <", value, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengLessThanOrEqualTo(String value) {
            addCriterion("FuWuJiGouMingCheng <=", value, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengLike(String value) {
            addCriterion("FuWuJiGouMingCheng like", value, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengNotLike(String value) {
            addCriterion("FuWuJiGouMingCheng not like", value, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengIn(List<String> values) {
            addCriterion("FuWuJiGouMingCheng in", values, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengNotIn(List<String> values) {
            addCriterion("FuWuJiGouMingCheng not in", values, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengBetween(String value1, String value2) {
            addCriterion("FuWuJiGouMingCheng between", value1, value2, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andFuwujigoumingchengNotBetween(String value1, String value2) {
            addCriterion("FuWuJiGouMingCheng not between", value1, value2, "fuwujigoumingcheng");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiIsNull() {
            addCriterion("ShenQingZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiIsNotNull() {
            addCriterion("ShenQingZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiEqualTo(Integer value) {
            addCriterion("ShenQingZhuangTai =", value, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiNotEqualTo(Integer value) {
            addCriterion("ShenQingZhuangTai <>", value, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiGreaterThan(Integer value) {
            addCriterion("ShenQingZhuangTai >", value, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenQingZhuangTai >=", value, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiLessThan(Integer value) {
            addCriterion("ShenQingZhuangTai <", value, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("ShenQingZhuangTai <=", value, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiIn(List<Integer> values) {
            addCriterion("ShenQingZhuangTai in", values, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiNotIn(List<Integer> values) {
            addCriterion("ShenQingZhuangTai not in", values, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingZhuangTai between", value1, value2, "shenqingzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingZhuangTai not between", value1, value2, "shenqingzhuangtai");
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

        public Criteria andChulishijianIsNull() {
            addCriterion("ChuLiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andChulishijianIsNotNull() {
            addCriterion("ChuLiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andChulishijianEqualTo(Date value) {
            addCriterion("ChuLiShiJian =", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianNotEqualTo(Date value) {
            addCriterion("ChuLiShiJian <>", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianGreaterThan(Date value) {
            addCriterion("ChuLiShiJian >", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ChuLiShiJian >=", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianLessThan(Date value) {
            addCriterion("ChuLiShiJian <", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianLessThanOrEqualTo(Date value) {
            addCriterion("ChuLiShiJian <=", value, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianIn(List<Date> values) {
            addCriterion("ChuLiShiJian in", values, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianNotIn(List<Date> values) {
            addCriterion("ChuLiShiJian not in", values, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianBetween(Date value1, Date value2) {
            addCriterion("ChuLiShiJian between", value1, value2, "chulishijian");
            return (Criteria) this;
        }

        public Criteria andChulishijianNotBetween(Date value1, Date value2) {
            addCriterion("ChuLiShiJian not between", value1, value2, "chulishijian");
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