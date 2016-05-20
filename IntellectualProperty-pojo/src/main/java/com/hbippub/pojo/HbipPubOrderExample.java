package com.hbippub.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubOrderExample() {
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

        public Criteria andDingdanidIsNull() {
            addCriterion("DingDanID is null");
            return (Criteria) this;
        }

        public Criteria andDingdanidIsNotNull() {
            addCriterion("DingDanID is not null");
            return (Criteria) this;
        }

        public Criteria andDingdanidEqualTo(Integer value) {
            addCriterion("DingDanID =", value, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidNotEqualTo(Integer value) {
            addCriterion("DingDanID <>", value, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidGreaterThan(Integer value) {
            addCriterion("DingDanID >", value, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DingDanID >=", value, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidLessThan(Integer value) {
            addCriterion("DingDanID <", value, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidLessThanOrEqualTo(Integer value) {
            addCriterion("DingDanID <=", value, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidIn(List<Integer> values) {
            addCriterion("DingDanID in", values, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidNotIn(List<Integer> values) {
            addCriterion("DingDanID not in", values, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidBetween(Integer value1, Integer value2) {
            addCriterion("DingDanID between", value1, value2, "dingdanid");
            return (Criteria) this;
        }

        public Criteria andDingdanidNotBetween(Integer value1, Integer value2) {
            addCriterion("DingDanID not between", value1, value2, "dingdanid");
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

        public Criteria andXiadanjiageIsNull() {
            addCriterion("XiaDanJiaGe is null");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageIsNotNull() {
            addCriterion("XiaDanJiaGe is not null");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageEqualTo(BigDecimal value) {
            addCriterion("XiaDanJiaGe =", value, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageNotEqualTo(BigDecimal value) {
            addCriterion("XiaDanJiaGe <>", value, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageGreaterThan(BigDecimal value) {
            addCriterion("XiaDanJiaGe >", value, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XiaDanJiaGe >=", value, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageLessThan(BigDecimal value) {
            addCriterion("XiaDanJiaGe <", value, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XiaDanJiaGe <=", value, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageIn(List<BigDecimal> values) {
            addCriterion("XiaDanJiaGe in", values, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageNotIn(List<BigDecimal> values) {
            addCriterion("XiaDanJiaGe not in", values, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XiaDanJiaGe between", value1, value2, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanjiageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XiaDanJiaGe not between", value1, value2, "xiadanjiage");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianIsNull() {
            addCriterion("XiaDanShiJian is null");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianIsNotNull() {
            addCriterion("XiaDanShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianEqualTo(Date value) {
            addCriterion("XiaDanShiJian =", value, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianNotEqualTo(Date value) {
            addCriterion("XiaDanShiJian <>", value, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianGreaterThan(Date value) {
            addCriterion("XiaDanShiJian >", value, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("XiaDanShiJian >=", value, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianLessThan(Date value) {
            addCriterion("XiaDanShiJian <", value, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianLessThanOrEqualTo(Date value) {
            addCriterion("XiaDanShiJian <=", value, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianIn(List<Date> values) {
            addCriterion("XiaDanShiJian in", values, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianNotIn(List<Date> values) {
            addCriterion("XiaDanShiJian not in", values, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianBetween(Date value1, Date value2) {
            addCriterion("XiaDanShiJian between", value1, value2, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andXiadanshijianNotBetween(Date value1, Date value2) {
            addCriterion("XiaDanShiJian not between", value1, value2, "xiadanshijian");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiIsNull() {
            addCriterion("DingDanZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiIsNotNull() {
            addCriterion("DingDanZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiEqualTo(String value) {
            addCriterion("DingDanZhuangTai =", value, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiNotEqualTo(String value) {
            addCriterion("DingDanZhuangTai <>", value, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiGreaterThan(String value) {
            addCriterion("DingDanZhuangTai >", value, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("DingDanZhuangTai >=", value, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiLessThan(String value) {
            addCriterion("DingDanZhuangTai <", value, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("DingDanZhuangTai <=", value, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiLike(String value) {
            addCriterion("DingDanZhuangTai like", value, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiNotLike(String value) {
            addCriterion("DingDanZhuangTai not like", value, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiIn(List<String> values) {
            addCriterion("DingDanZhuangTai in", values, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiNotIn(List<String> values) {
            addCriterion("DingDanZhuangTai not in", values, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiBetween(String value1, String value2) {
            addCriterion("DingDanZhuangTai between", value1, value2, "dingdanzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDingdanzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("DingDanZhuangTai not between", value1, value2, "dingdanzhuangtai");
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