package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubEntrustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubEntrustExample() {
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

        public Criteria andShangpinleixingIsNull() {
            addCriterion("ShangPinLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingIsNotNull() {
            addCriterion("ShangPinLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingEqualTo(String value) {
            addCriterion("ShangPinLeiXing =", value, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingNotEqualTo(String value) {
            addCriterion("ShangPinLeiXing <>", value, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingGreaterThan(String value) {
            addCriterion("ShangPinLeiXing >", value, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingGreaterThanOrEqualTo(String value) {
            addCriterion("ShangPinLeiXing >=", value, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingLessThan(String value) {
            addCriterion("ShangPinLeiXing <", value, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingLessThanOrEqualTo(String value) {
            addCriterion("ShangPinLeiXing <=", value, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingLike(String value) {
            addCriterion("ShangPinLeiXing like", value, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingNotLike(String value) {
            addCriterion("ShangPinLeiXing not like", value, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingIn(List<String> values) {
            addCriterion("ShangPinLeiXing in", values, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingNotIn(List<String> values) {
            addCriterion("ShangPinLeiXing not in", values, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingBetween(String value1, String value2) {
            addCriterion("ShangPinLeiXing between", value1, value2, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andShangpinleixingNotBetween(String value1, String value2) {
            addCriterion("ShangPinLeiXing not between", value1, value2, "shangpinleixing");
            return (Criteria) this;
        }

        public Criteria andWeituorenidIsNull() {
            addCriterion("WeiTuoRenID is null");
            return (Criteria) this;
        }

        public Criteria andWeituorenidIsNotNull() {
            addCriterion("WeiTuoRenID is not null");
            return (Criteria) this;
        }

        public Criteria andWeituorenidEqualTo(Integer value) {
            addCriterion("WeiTuoRenID =", value, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidNotEqualTo(Integer value) {
            addCriterion("WeiTuoRenID <>", value, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidGreaterThan(Integer value) {
            addCriterion("WeiTuoRenID >", value, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WeiTuoRenID >=", value, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidLessThan(Integer value) {
            addCriterion("WeiTuoRenID <", value, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidLessThanOrEqualTo(Integer value) {
            addCriterion("WeiTuoRenID <=", value, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidIn(List<Integer> values) {
            addCriterion("WeiTuoRenID in", values, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidNotIn(List<Integer> values) {
            addCriterion("WeiTuoRenID not in", values, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidBetween(Integer value1, Integer value2) {
            addCriterion("WeiTuoRenID between", value1, value2, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenidNotBetween(Integer value1, Integer value2) {
            addCriterion("WeiTuoRenID not between", value1, value2, "weituorenid");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingIsNull() {
            addCriterion("WeiTuoRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingIsNotNull() {
            addCriterion("WeiTuoRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingEqualTo(String value) {
            addCriterion("WeiTuoRenXingMing =", value, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingNotEqualTo(String value) {
            addCriterion("WeiTuoRenXingMing <>", value, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingGreaterThan(String value) {
            addCriterion("WeiTuoRenXingMing >", value, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("WeiTuoRenXingMing >=", value, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingLessThan(String value) {
            addCriterion("WeiTuoRenXingMing <", value, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingLessThanOrEqualTo(String value) {
            addCriterion("WeiTuoRenXingMing <=", value, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingLike(String value) {
            addCriterion("WeiTuoRenXingMing like", value, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingNotLike(String value) {
            addCriterion("WeiTuoRenXingMing not like", value, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingIn(List<String> values) {
            addCriterion("WeiTuoRenXingMing in", values, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingNotIn(List<String> values) {
            addCriterion("WeiTuoRenXingMing not in", values, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingBetween(String value1, String value2) {
            addCriterion("WeiTuoRenXingMing between", value1, value2, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andWeituorenxingmingNotBetween(String value1, String value2) {
            addCriterion("WeiTuoRenXingMing not between", value1, value2, "weituorenxingming");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidIsNull() {
            addCriterion("BeiWeiTuoDianPuID is null");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidIsNotNull() {
            addCriterion("BeiWeiTuoDianPuID is not null");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidEqualTo(Integer value) {
            addCriterion("BeiWeiTuoDianPuID =", value, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidNotEqualTo(Integer value) {
            addCriterion("BeiWeiTuoDianPuID <>", value, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidGreaterThan(Integer value) {
            addCriterion("BeiWeiTuoDianPuID >", value, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BeiWeiTuoDianPuID >=", value, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidLessThan(Integer value) {
            addCriterion("BeiWeiTuoDianPuID <", value, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidLessThanOrEqualTo(Integer value) {
            addCriterion("BeiWeiTuoDianPuID <=", value, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidIn(List<Integer> values) {
            addCriterion("BeiWeiTuoDianPuID in", values, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidNotIn(List<Integer> values) {
            addCriterion("BeiWeiTuoDianPuID not in", values, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidBetween(Integer value1, Integer value2) {
            addCriterion("BeiWeiTuoDianPuID between", value1, value2, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andBeiweituodianpuidNotBetween(Integer value1, Integer value2) {
            addCriterion("BeiWeiTuoDianPuID not between", value1, value2, "beiweituodianpuid");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIsNull() {
            addCriterion("DianPuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIsNotNull() {
            addCriterion("DianPuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengEqualTo(String value) {
            addCriterion("DianPuMingCheng =", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotEqualTo(String value) {
            addCriterion("DianPuMingCheng <>", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengGreaterThan(String value) {
            addCriterion("DianPuMingCheng >", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("DianPuMingCheng >=", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLessThan(String value) {
            addCriterion("DianPuMingCheng <", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLessThanOrEqualTo(String value) {
            addCriterion("DianPuMingCheng <=", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengLike(String value) {
            addCriterion("DianPuMingCheng like", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotLike(String value) {
            addCriterion("DianPuMingCheng not like", value, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengIn(List<String> values) {
            addCriterion("DianPuMingCheng in", values, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotIn(List<String> values) {
            addCriterion("DianPuMingCheng not in", values, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengBetween(String value1, String value2) {
            addCriterion("DianPuMingCheng between", value1, value2, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andDianpumingchengNotBetween(String value1, String value2) {
            addCriterion("DianPuMingCheng not between", value1, value2, "dianpumingcheng");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiIsNull() {
            addCriterion("WeiTuoZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiIsNotNull() {
            addCriterion("WeiTuoZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiEqualTo(Integer value) {
            addCriterion("WeiTuoZhuangTai =", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiNotEqualTo(Integer value) {
            addCriterion("WeiTuoZhuangTai <>", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiGreaterThan(Integer value) {
            addCriterion("WeiTuoZhuangTai >", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("WeiTuoZhuangTai >=", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiLessThan(Integer value) {
            addCriterion("WeiTuoZhuangTai <", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("WeiTuoZhuangTai <=", value, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiIn(List<Integer> values) {
            addCriterion("WeiTuoZhuangTai in", values, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiNotIn(List<Integer> values) {
            addCriterion("WeiTuoZhuangTai not in", values, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("WeiTuoZhuangTai between", value1, value2, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andWeituozhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("WeiTuoZhuangTai not between", value1, value2, "weituozhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianIsNull() {
            addCriterion("ShenQingWeiTuoShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianIsNotNull() {
            addCriterion("ShenQingWeiTuoShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianEqualTo(Date value) {
            addCriterion("ShenQingWeiTuoShiJian =", value, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianNotEqualTo(Date value) {
            addCriterion("ShenQingWeiTuoShiJian <>", value, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianGreaterThan(Date value) {
            addCriterion("ShenQingWeiTuoShiJian >", value, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ShenQingWeiTuoShiJian >=", value, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianLessThan(Date value) {
            addCriterion("ShenQingWeiTuoShiJian <", value, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianLessThanOrEqualTo(Date value) {
            addCriterion("ShenQingWeiTuoShiJian <=", value, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianIn(List<Date> values) {
            addCriterion("ShenQingWeiTuoShiJian in", values, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianNotIn(List<Date> values) {
            addCriterion("ShenQingWeiTuoShiJian not in", values, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianBetween(Date value1, Date value2) {
            addCriterion("ShenQingWeiTuoShiJian between", value1, value2, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingweituoshijianNotBetween(Date value1, Date value2) {
            addCriterion("ShenQingWeiTuoShiJian not between", value1, value2, "shenqingweituoshijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianIsNull() {
            addCriterion("WeiTuoKaiShiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianIsNotNull() {
            addCriterion("WeiTuoKaiShiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianEqualTo(Date value) {
            addCriterion("WeiTuoKaiShiShiJian =", value, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianNotEqualTo(Date value) {
            addCriterion("WeiTuoKaiShiShiJian <>", value, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianGreaterThan(Date value) {
            addCriterion("WeiTuoKaiShiShiJian >", value, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianGreaterThanOrEqualTo(Date value) {
            addCriterion("WeiTuoKaiShiShiJian >=", value, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianLessThan(Date value) {
            addCriterion("WeiTuoKaiShiShiJian <", value, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianLessThanOrEqualTo(Date value) {
            addCriterion("WeiTuoKaiShiShiJian <=", value, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianIn(List<Date> values) {
            addCriterion("WeiTuoKaiShiShiJian in", values, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianNotIn(List<Date> values) {
            addCriterion("WeiTuoKaiShiShiJian not in", values, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianBetween(Date value1, Date value2) {
            addCriterion("WeiTuoKaiShiShiJian between", value1, value2, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andWeituokaishishijianNotBetween(Date value1, Date value2) {
            addCriterion("WeiTuoKaiShiShiJian not between", value1, value2, "weituokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianIsNull() {
            addCriterion("ShenQingJieChuWeiTuoShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianIsNotNull() {
            addCriterion("ShenQingJieChuWeiTuoShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianEqualTo(Date value) {
            addCriterion("ShenQingJieChuWeiTuoShiJian =", value, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianNotEqualTo(Date value) {
            addCriterion("ShenQingJieChuWeiTuoShiJian <>", value, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianGreaterThan(Date value) {
            addCriterion("ShenQingJieChuWeiTuoShiJian >", value, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ShenQingJieChuWeiTuoShiJian >=", value, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianLessThan(Date value) {
            addCriterion("ShenQingJieChuWeiTuoShiJian <", value, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianLessThanOrEqualTo(Date value) {
            addCriterion("ShenQingJieChuWeiTuoShiJian <=", value, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianIn(List<Date> values) {
            addCriterion("ShenQingJieChuWeiTuoShiJian in", values, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianNotIn(List<Date> values) {
            addCriterion("ShenQingJieChuWeiTuoShiJian not in", values, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianBetween(Date value1, Date value2) {
            addCriterion("ShenQingJieChuWeiTuoShiJian between", value1, value2, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andShenqingjiechuweituoshijianNotBetween(Date value1, Date value2) {
            addCriterion("ShenQingJieChuWeiTuoShiJian not between", value1, value2, "shenqingjiechuweituoshijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianIsNull() {
            addCriterion("WeiTuoJieShuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianIsNotNull() {
            addCriterion("WeiTuoJieShuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianEqualTo(Date value) {
            addCriterion("WeiTuoJieShuShiJian =", value, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianNotEqualTo(Date value) {
            addCriterion("WeiTuoJieShuShiJian <>", value, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianGreaterThan(Date value) {
            addCriterion("WeiTuoJieShuShiJian >", value, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("WeiTuoJieShuShiJian >=", value, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianLessThan(Date value) {
            addCriterion("WeiTuoJieShuShiJian <", value, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianLessThanOrEqualTo(Date value) {
            addCriterion("WeiTuoJieShuShiJian <=", value, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianIn(List<Date> values) {
            addCriterion("WeiTuoJieShuShiJian in", values, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianNotIn(List<Date> values) {
            addCriterion("WeiTuoJieShuShiJian not in", values, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianBetween(Date value1, Date value2) {
            addCriterion("WeiTuoJieShuShiJian between", value1, value2, "weituojieshushijian");
            return (Criteria) this;
        }

        public Criteria andWeituojieshushijianNotBetween(Date value1, Date value2) {
            addCriterion("WeiTuoJieShuShiJian not between", value1, value2, "weituojieshushijian");
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