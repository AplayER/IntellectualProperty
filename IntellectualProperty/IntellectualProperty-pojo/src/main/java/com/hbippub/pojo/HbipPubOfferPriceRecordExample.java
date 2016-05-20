package com.hbippub.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubOfferPriceRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubOfferPriceRecordExample() {
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

        public Criteria andBaojialeibieIsNull() {
            addCriterion("BaoJiaLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieIsNotNull() {
            addCriterion("BaoJiaLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieEqualTo(Integer value) {
            addCriterion("BaoJiaLeiBie =", value, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieNotEqualTo(Integer value) {
            addCriterion("BaoJiaLeiBie <>", value, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieGreaterThan(Integer value) {
            addCriterion("BaoJiaLeiBie >", value, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieGreaterThanOrEqualTo(Integer value) {
            addCriterion("BaoJiaLeiBie >=", value, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieLessThan(Integer value) {
            addCriterion("BaoJiaLeiBie <", value, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieLessThanOrEqualTo(Integer value) {
            addCriterion("BaoJiaLeiBie <=", value, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieIn(List<Integer> values) {
            addCriterion("BaoJiaLeiBie in", values, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieNotIn(List<Integer> values) {
            addCriterion("BaoJiaLeiBie not in", values, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieBetween(Integer value1, Integer value2) {
            addCriterion("BaoJiaLeiBie between", value1, value2, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andBaojialeibieNotBetween(Integer value1, Integer value2) {
            addCriterion("BaoJiaLeiBie not between", value1, value2, "baojialeibie");
            return (Criteria) this;
        }

        public Criteria andShangpinidIsNull() {
            addCriterion("ShangPinID is null");
            return (Criteria) this;
        }

        public Criteria andShangpinidIsNotNull() {
            addCriterion("ShangPinID is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinidEqualTo(Integer value) {
            addCriterion("ShangPinID =", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotEqualTo(Integer value) {
            addCriterion("ShangPinID <>", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidGreaterThan(Integer value) {
            addCriterion("ShangPinID >", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShangPinID >=", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidLessThan(Integer value) {
            addCriterion("ShangPinID <", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidLessThanOrEqualTo(Integer value) {
            addCriterion("ShangPinID <=", value, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidIn(List<Integer> values) {
            addCriterion("ShangPinID in", values, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotIn(List<Integer> values) {
            addCriterion("ShangPinID not in", values, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinID between", value1, value2, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andShangpinidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinID not between", value1, value2, "shangpinid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidIsNull() {
            addCriterion("MaiJiaID is null");
            return (Criteria) this;
        }

        public Criteria andMaijiaidIsNotNull() {
            addCriterion("MaiJiaID is not null");
            return (Criteria) this;
        }

        public Criteria andMaijiaidEqualTo(Integer value) {
            addCriterion("MaiJiaID =", value, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidNotEqualTo(Integer value) {
            addCriterion("MaiJiaID <>", value, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidGreaterThan(Integer value) {
            addCriterion("MaiJiaID >", value, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaiJiaID >=", value, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidLessThan(Integer value) {
            addCriterion("MaiJiaID <", value, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidLessThanOrEqualTo(Integer value) {
            addCriterion("MaiJiaID <=", value, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidIn(List<Integer> values) {
            addCriterion("MaiJiaID in", values, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidNotIn(List<Integer> values) {
            addCriterion("MaiJiaID not in", values, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidBetween(Integer value1, Integer value2) {
            addCriterion("MaiJiaID between", value1, value2, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiaidNotBetween(Integer value1, Integer value2) {
            addCriterion("MaiJiaID not between", value1, value2, "maijiaid");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengIsNull() {
            addCriterion("MaiJiaMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengIsNotNull() {
            addCriterion("MaiJiaMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengEqualTo(String value) {
            addCriterion("MaiJiaMingCheng =", value, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengNotEqualTo(String value) {
            addCriterion("MaiJiaMingCheng <>", value, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengGreaterThan(String value) {
            addCriterion("MaiJiaMingCheng >", value, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengGreaterThanOrEqualTo(String value) {
            addCriterion("MaiJiaMingCheng >=", value, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengLessThan(String value) {
            addCriterion("MaiJiaMingCheng <", value, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengLessThanOrEqualTo(String value) {
            addCriterion("MaiJiaMingCheng <=", value, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengLike(String value) {
            addCriterion("MaiJiaMingCheng like", value, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengNotLike(String value) {
            addCriterion("MaiJiaMingCheng not like", value, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengIn(List<String> values) {
            addCriterion("MaiJiaMingCheng in", values, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengNotIn(List<String> values) {
            addCriterion("MaiJiaMingCheng not in", values, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengBetween(String value1, String value2) {
            addCriterion("MaiJiaMingCheng between", value1, value2, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andMaijiamingchengNotBetween(String value1, String value2) {
            addCriterion("MaiJiaMingCheng not between", value1, value2, "maijiamingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidIsNull() {
            addCriterion("ShangPinLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidIsNotNull() {
            addCriterion("ShangPinLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidEqualTo(Integer value) {
            addCriterion("ShangPinLeiXingID =", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidNotEqualTo(Integer value) {
            addCriterion("ShangPinLeiXingID <>", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidGreaterThan(Integer value) {
            addCriterion("ShangPinLeiXingID >", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShangPinLeiXingID >=", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidLessThan(Integer value) {
            addCriterion("ShangPinLeiXingID <", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidLessThanOrEqualTo(Integer value) {
            addCriterion("ShangPinLeiXingID <=", value, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidIn(List<Integer> values) {
            addCriterion("ShangPinLeiXingID in", values, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidNotIn(List<Integer> values) {
            addCriterion("ShangPinLeiXingID not in", values, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinLeiXingID between", value1, value2, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShangPinLeiXingID not between", value1, value2, "shangpinleixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidIsNull() {
            addCriterion("JiaoYiLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidIsNotNull() {
            addCriterion("JiaoYiLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidEqualTo(Integer value) {
            addCriterion("JiaoYiLeiXingID =", value, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidNotEqualTo(Integer value) {
            addCriterion("JiaoYiLeiXingID <>", value, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidGreaterThan(Integer value) {
            addCriterion("JiaoYiLeiXingID >", value, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiaoYiLeiXingID >=", value, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidLessThan(Integer value) {
            addCriterion("JiaoYiLeiXingID <", value, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidLessThanOrEqualTo(Integer value) {
            addCriterion("JiaoYiLeiXingID <=", value, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidIn(List<Integer> values) {
            addCriterion("JiaoYiLeiXingID in", values, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidNotIn(List<Integer> values) {
            addCriterion("JiaoYiLeiXingID not in", values, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidBetween(Integer value1, Integer value2) {
            addCriterion("JiaoYiLeiXingID between", value1, value2, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andJiaoyileixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("JiaoYiLeiXingID not between", value1, value2, "jiaoyileixingid");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIsNull() {
            addCriterion("ShangPinMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIsNotNull() {
            addCriterion("ShangPinMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengEqualTo(String value) {
            addCriterion("ShangPinMingCheng =", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotEqualTo(String value) {
            addCriterion("ShangPinMingCheng <>", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengGreaterThan(String value) {
            addCriterion("ShangPinMingCheng >", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ShangPinMingCheng >=", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLessThan(String value) {
            addCriterion("ShangPinMingCheng <", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLessThanOrEqualTo(String value) {
            addCriterion("ShangPinMingCheng <=", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengLike(String value) {
            addCriterion("ShangPinMingCheng like", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotLike(String value) {
            addCriterion("ShangPinMingCheng not like", value, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengIn(List<String> values) {
            addCriterion("ShangPinMingCheng in", values, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotIn(List<String> values) {
            addCriterion("ShangPinMingCheng not in", values, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengBetween(String value1, String value2) {
            addCriterion("ShangPinMingCheng between", value1, value2, "shangpinmingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinmingchengNotBetween(String value1, String value2) {
            addCriterion("ShangPinMingCheng not between", value1, value2, "shangpinmingcheng");
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

        public Criteria andYonghumingchengIsNull() {
            addCriterion("YongHuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengIsNotNull() {
            addCriterion("YongHuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengEqualTo(String value) {
            addCriterion("YongHuMingCheng =", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotEqualTo(String value) {
            addCriterion("YongHuMingCheng <>", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengGreaterThan(String value) {
            addCriterion("YongHuMingCheng >", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("YongHuMingCheng >=", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLessThan(String value) {
            addCriterion("YongHuMingCheng <", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLessThanOrEqualTo(String value) {
            addCriterion("YongHuMingCheng <=", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengLike(String value) {
            addCriterion("YongHuMingCheng like", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotLike(String value) {
            addCriterion("YongHuMingCheng not like", value, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengIn(List<String> values) {
            addCriterion("YongHuMingCheng in", values, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotIn(List<String> values) {
            addCriterion("YongHuMingCheng not in", values, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengBetween(String value1, String value2) {
            addCriterion("YongHuMingCheng between", value1, value2, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andYonghumingchengNotBetween(String value1, String value2) {
            addCriterion("YongHuMingCheng not between", value1, value2, "yonghumingcheng");
            return (Criteria) this;
        }

        public Criteria andJiageIsNull() {
            addCriterion("JiaGe is null");
            return (Criteria) this;
        }

        public Criteria andJiageIsNotNull() {
            addCriterion("JiaGe is not null");
            return (Criteria) this;
        }

        public Criteria andJiageEqualTo(BigDecimal value) {
            addCriterion("JiaGe =", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotEqualTo(BigDecimal value) {
            addCriterion("JiaGe <>", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageGreaterThan(BigDecimal value) {
            addCriterion("JiaGe >", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JiaGe >=", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageLessThan(BigDecimal value) {
            addCriterion("JiaGe <", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JiaGe <=", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageIn(List<BigDecimal> values) {
            addCriterion("JiaGe in", values, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotIn(List<BigDecimal> values) {
            addCriterion("JiaGe not in", values, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JiaGe between", value1, value2, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JiaGe not between", value1, value2, "jiage");
            return (Criteria) this;
        }

        public Criteria andCankaojiaIsNull() {
            addCriterion("CanKaoJia is null");
            return (Criteria) this;
        }

        public Criteria andCankaojiaIsNotNull() {
            addCriterion("CanKaoJia is not null");
            return (Criteria) this;
        }

        public Criteria andCankaojiaEqualTo(Integer value) {
            addCriterion("CanKaoJia =", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaNotEqualTo(Integer value) {
            addCriterion("CanKaoJia <>", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaGreaterThan(Integer value) {
            addCriterion("CanKaoJia >", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("CanKaoJia >=", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaLessThan(Integer value) {
            addCriterion("CanKaoJia <", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaLessThanOrEqualTo(Integer value) {
            addCriterion("CanKaoJia <=", value, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaIn(List<Integer> values) {
            addCriterion("CanKaoJia in", values, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaNotIn(List<Integer> values) {
            addCriterion("CanKaoJia not in", values, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaBetween(Integer value1, Integer value2) {
            addCriterion("CanKaoJia between", value1, value2, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andCankaojiaNotBetween(Integer value1, Integer value2) {
            addCriterion("CanKaoJia not between", value1, value2, "cankaojia");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiIsNull() {
            addCriterion("TongXunDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiIsNotNull() {
            addCriterion("TongXunDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiEqualTo(String value) {
            addCriterion("TongXunDiZhi =", value, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiNotEqualTo(String value) {
            addCriterion("TongXunDiZhi <>", value, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiGreaterThan(String value) {
            addCriterion("TongXunDiZhi >", value, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiGreaterThanOrEqualTo(String value) {
            addCriterion("TongXunDiZhi >=", value, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiLessThan(String value) {
            addCriterion("TongXunDiZhi <", value, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiLessThanOrEqualTo(String value) {
            addCriterion("TongXunDiZhi <=", value, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiLike(String value) {
            addCriterion("TongXunDiZhi like", value, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiNotLike(String value) {
            addCriterion("TongXunDiZhi not like", value, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiIn(List<String> values) {
            addCriterion("TongXunDiZhi in", values, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiNotIn(List<String> values) {
            addCriterion("TongXunDiZhi not in", values, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiBetween(String value1, String value2) {
            addCriterion("TongXunDiZhi between", value1, value2, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andTongxundizhiNotBetween(String value1, String value2) {
            addCriterion("TongXunDiZhi not between", value1, value2, "tongxundizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIsNull() {
            addCriterion("LianXiDianHua is null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIsNotNull() {
            addCriterion("LianXiDianHua is not null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaEqualTo(String value) {
            addCriterion("LianXiDianHua =", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotEqualTo(String value) {
            addCriterion("LianXiDianHua <>", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaGreaterThan(String value) {
            addCriterion("LianXiDianHua >", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("LianXiDianHua >=", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLessThan(String value) {
            addCriterion("LianXiDianHua <", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLessThanOrEqualTo(String value) {
            addCriterion("LianXiDianHua <=", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLike(String value) {
            addCriterion("LianXiDianHua like", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotLike(String value) {
            addCriterion("LianXiDianHua not like", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIn(List<String> values) {
            addCriterion("LianXiDianHua in", values, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotIn(List<String> values) {
            addCriterion("LianXiDianHua not in", values, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaBetween(String value1, String value2) {
            addCriterion("LianXiDianHua between", value1, value2, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotBetween(String value1, String value2) {
            addCriterion("LianXiDianHua not between", value1, value2, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianIsNull() {
            addCriterion("BaoJiaShiJian is null");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianIsNotNull() {
            addCriterion("BaoJiaShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianEqualTo(Date value) {
            addCriterion("BaoJiaShiJian =", value, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianNotEqualTo(Date value) {
            addCriterion("BaoJiaShiJian <>", value, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianGreaterThan(Date value) {
            addCriterion("BaoJiaShiJian >", value, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianGreaterThanOrEqualTo(Date value) {
            addCriterion("BaoJiaShiJian >=", value, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianLessThan(Date value) {
            addCriterion("BaoJiaShiJian <", value, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianLessThanOrEqualTo(Date value) {
            addCriterion("BaoJiaShiJian <=", value, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianIn(List<Date> values) {
            addCriterion("BaoJiaShiJian in", values, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianNotIn(List<Date> values) {
            addCriterion("BaoJiaShiJian not in", values, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianBetween(Date value1, Date value2) {
            addCriterion("BaoJiaShiJian between", value1, value2, "baojiashijian");
            return (Criteria) this;
        }

        public Criteria andBaojiashijianNotBetween(Date value1, Date value2) {
            addCriterion("BaoJiaShiJian not between", value1, value2, "baojiashijian");
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