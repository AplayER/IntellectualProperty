package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubTeamExample() {
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

        public Criteria andXingzhengquhuaidIsNull() {
            addCriterion("XingZhengQuHuaID is null");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidIsNotNull() {
            addCriterion("XingZhengQuHuaID is not null");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidEqualTo(Integer value) {
            addCriterion("XingZhengQuHuaID =", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidNotEqualTo(Integer value) {
            addCriterion("XingZhengQuHuaID <>", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidGreaterThan(Integer value) {
            addCriterion("XingZhengQuHuaID >", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XingZhengQuHuaID >=", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidLessThan(Integer value) {
            addCriterion("XingZhengQuHuaID <", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidLessThanOrEqualTo(Integer value) {
            addCriterion("XingZhengQuHuaID <=", value, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidIn(List<Integer> values) {
            addCriterion("XingZhengQuHuaID in", values, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidNotIn(List<Integer> values) {
            addCriterion("XingZhengQuHuaID not in", values, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidBetween(Integer value1, Integer value2) {
            addCriterion("XingZhengQuHuaID between", value1, value2, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andXingzhengquhuaidNotBetween(Integer value1, Integer value2) {
            addCriterion("XingZhengQuHuaID not between", value1, value2, "xingzhengquhuaid");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengIsNull() {
            addCriterion("TuanDuiMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengIsNotNull() {
            addCriterion("TuanDuiMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengEqualTo(String value) {
            addCriterion("TuanDuiMingCheng =", value, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengNotEqualTo(String value) {
            addCriterion("TuanDuiMingCheng <>", value, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengGreaterThan(String value) {
            addCriterion("TuanDuiMingCheng >", value, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengGreaterThanOrEqualTo(String value) {
            addCriterion("TuanDuiMingCheng >=", value, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengLessThan(String value) {
            addCriterion("TuanDuiMingCheng <", value, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengLessThanOrEqualTo(String value) {
            addCriterion("TuanDuiMingCheng <=", value, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengLike(String value) {
            addCriterion("TuanDuiMingCheng like", value, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengNotLike(String value) {
            addCriterion("TuanDuiMingCheng not like", value, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengIn(List<String> values) {
            addCriterion("TuanDuiMingCheng in", values, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengNotIn(List<String> values) {
            addCriterion("TuanDuiMingCheng not in", values, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengBetween(String value1, String value2) {
            addCriterion("TuanDuiMingCheng between", value1, value2, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduimingchengNotBetween(String value1, String value2) {
            addCriterion("TuanDuiMingCheng not between", value1, value2, "tuanduimingcheng");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieIsNull() {
            addCriterion("TuanDuiJianJie is null");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieIsNotNull() {
            addCriterion("TuanDuiJianJie is not null");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieEqualTo(String value) {
            addCriterion("TuanDuiJianJie =", value, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieNotEqualTo(String value) {
            addCriterion("TuanDuiJianJie <>", value, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieGreaterThan(String value) {
            addCriterion("TuanDuiJianJie >", value, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieGreaterThanOrEqualTo(String value) {
            addCriterion("TuanDuiJianJie >=", value, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieLessThan(String value) {
            addCriterion("TuanDuiJianJie <", value, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieLessThanOrEqualTo(String value) {
            addCriterion("TuanDuiJianJie <=", value, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieLike(String value) {
            addCriterion("TuanDuiJianJie like", value, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieNotLike(String value) {
            addCriterion("TuanDuiJianJie not like", value, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieIn(List<String> values) {
            addCriterion("TuanDuiJianJie in", values, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieNotIn(List<String> values) {
            addCriterion("TuanDuiJianJie not in", values, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieBetween(String value1, String value2) {
            addCriterion("TuanDuiJianJie between", value1, value2, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andTuanduijianjieNotBetween(String value1, String value2) {
            addCriterion("TuanDuiJianJie not between", value1, value2, "tuanduijianjie");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIsNull() {
            addCriterion("ChuangJianShiJian is null");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIsNotNull() {
            addCriterion("ChuangJianShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianEqualTo(Date value) {
            addCriterion("ChuangJianShiJian =", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotEqualTo(Date value) {
            addCriterion("ChuangJianShiJian <>", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianGreaterThan(Date value) {
            addCriterion("ChuangJianShiJian >", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ChuangJianShiJian >=", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianLessThan(Date value) {
            addCriterion("ChuangJianShiJian <", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianLessThanOrEqualTo(Date value) {
            addCriterion("ChuangJianShiJian <=", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIn(List<Date> values) {
            addCriterion("ChuangJianShiJian in", values, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotIn(List<Date> values) {
            addCriterion("ChuangJianShiJian not in", values, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianBetween(Date value1, Date value2) {
            addCriterion("ChuangJianShiJian between", value1, value2, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotBetween(Date value1, Date value2) {
            addCriterion("ChuangJianShiJian not between", value1, value2, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingIsNull() {
            addCriterion("ChuangJianRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingIsNotNull() {
            addCriterion("ChuangJianRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingEqualTo(String value) {
            addCriterion("ChuangJianRenXingMing =", value, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingNotEqualTo(String value) {
            addCriterion("ChuangJianRenXingMing <>", value, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingGreaterThan(String value) {
            addCriterion("ChuangJianRenXingMing >", value, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ChuangJianRenXingMing >=", value, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingLessThan(String value) {
            addCriterion("ChuangJianRenXingMing <", value, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ChuangJianRenXingMing <=", value, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingLike(String value) {
            addCriterion("ChuangJianRenXingMing like", value, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingNotLike(String value) {
            addCriterion("ChuangJianRenXingMing not like", value, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingIn(List<String> values) {
            addCriterion("ChuangJianRenXingMing in", values, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingNotIn(List<String> values) {
            addCriterion("ChuangJianRenXingMing not in", values, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingBetween(String value1, String value2) {
            addCriterion("ChuangJianRenXingMing between", value1, value2, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenxingmingNotBetween(String value1, String value2) {
            addCriterion("ChuangJianRenXingMing not between", value1, value2, "chuangjianrenxingming");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingIsNull() {
            addCriterion("ChuangJianRenLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingIsNotNull() {
            addCriterion("ChuangJianRenLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingEqualTo(Integer value) {
            addCriterion("ChuangJianRenLeiXing =", value, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingNotEqualTo(Integer value) {
            addCriterion("ChuangJianRenLeiXing <>", value, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingGreaterThan(Integer value) {
            addCriterion("ChuangJianRenLeiXing >", value, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChuangJianRenLeiXing >=", value, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingLessThan(Integer value) {
            addCriterion("ChuangJianRenLeiXing <", value, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingLessThanOrEqualTo(Integer value) {
            addCriterion("ChuangJianRenLeiXing <=", value, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingIn(List<Integer> values) {
            addCriterion("ChuangJianRenLeiXing in", values, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingNotIn(List<Integer> values) {
            addCriterion("ChuangJianRenLeiXing not in", values, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingBetween(Integer value1, Integer value2) {
            addCriterion("ChuangJianRenLeiXing between", value1, value2, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andChuangjianrenleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("ChuangJianRenLeiXing not between", value1, value2, "chuangjianrenleixing");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlIsNull() {
            addCriterion("FengMianTuPianURL is null");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlIsNotNull() {
            addCriterion("FengMianTuPianURL is not null");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlEqualTo(String value) {
            addCriterion("FengMianTuPianURL =", value, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlNotEqualTo(String value) {
            addCriterion("FengMianTuPianURL <>", value, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlGreaterThan(String value) {
            addCriterion("FengMianTuPianURL >", value, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlGreaterThanOrEqualTo(String value) {
            addCriterion("FengMianTuPianURL >=", value, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlLessThan(String value) {
            addCriterion("FengMianTuPianURL <", value, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlLessThanOrEqualTo(String value) {
            addCriterion("FengMianTuPianURL <=", value, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlLike(String value) {
            addCriterion("FengMianTuPianURL like", value, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlNotLike(String value) {
            addCriterion("FengMianTuPianURL not like", value, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlIn(List<String> values) {
            addCriterion("FengMianTuPianURL in", values, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlNotIn(List<String> values) {
            addCriterion("FengMianTuPianURL not in", values, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlBetween(String value1, String value2) {
            addCriterion("FengMianTuPianURL between", value1, value2, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andFengmiantupianurlNotBetween(String value1, String value2) {
            addCriterion("FengMianTuPianURL not between", value1, value2, "fengmiantupianurl");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuIsNull() {
            addCriterion("ChengYuanRenShu is null");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuIsNotNull() {
            addCriterion("ChengYuanRenShu is not null");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuEqualTo(Integer value) {
            addCriterion("ChengYuanRenShu =", value, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuNotEqualTo(Integer value) {
            addCriterion("ChengYuanRenShu <>", value, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuGreaterThan(Integer value) {
            addCriterion("ChengYuanRenShu >", value, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanRenShu >=", value, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuLessThan(Integer value) {
            addCriterion("ChengYuanRenShu <", value, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuLessThanOrEqualTo(Integer value) {
            addCriterion("ChengYuanRenShu <=", value, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuIn(List<Integer> values) {
            addCriterion("ChengYuanRenShu in", values, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuNotIn(List<Integer> values) {
            addCriterion("ChengYuanRenShu not in", values, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanRenShu between", value1, value2, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andChengyuanrenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ChengYuanRenShu not between", value1, value2, "chengyuanrenshu");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingIsNull() {
            addCriterion("LianXiRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingIsNotNull() {
            addCriterion("LianXiRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingEqualTo(String value) {
            addCriterion("LianXiRenXingMing =", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotEqualTo(String value) {
            addCriterion("LianXiRenXingMing <>", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingGreaterThan(String value) {
            addCriterion("LianXiRenXingMing >", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("LianXiRenXingMing >=", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLessThan(String value) {
            addCriterion("LianXiRenXingMing <", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLessThanOrEqualTo(String value) {
            addCriterion("LianXiRenXingMing <=", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLike(String value) {
            addCriterion("LianXiRenXingMing like", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotLike(String value) {
            addCriterion("LianXiRenXingMing not like", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingIn(List<String> values) {
            addCriterion("LianXiRenXingMing in", values, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotIn(List<String> values) {
            addCriterion("LianXiRenXingMing not in", values, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingBetween(String value1, String value2) {
            addCriterion("LianXiRenXingMing between", value1, value2, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotBetween(String value1, String value2) {
            addCriterion("LianXiRenXingMing not between", value1, value2, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiIsNull() {
            addCriterion("LianXiFangShi is null");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiIsNotNull() {
            addCriterion("LianXiFangShi is not null");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiEqualTo(String value) {
            addCriterion("LianXiFangShi =", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiNotEqualTo(String value) {
            addCriterion("LianXiFangShi <>", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiGreaterThan(String value) {
            addCriterion("LianXiFangShi >", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiGreaterThanOrEqualTo(String value) {
            addCriterion("LianXiFangShi >=", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiLessThan(String value) {
            addCriterion("LianXiFangShi <", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiLessThanOrEqualTo(String value) {
            addCriterion("LianXiFangShi <=", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiLike(String value) {
            addCriterion("LianXiFangShi like", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiNotLike(String value) {
            addCriterion("LianXiFangShi not like", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiIn(List<String> values) {
            addCriterion("LianXiFangShi in", values, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiNotIn(List<String> values) {
            addCriterion("LianXiFangShi not in", values, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiBetween(String value1, String value2) {
            addCriterion("LianXiFangShi between", value1, value2, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiNotBetween(String value1, String value2) {
            addCriterion("LianXiFangShi not between", value1, value2, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andYouxiangIsNull() {
            addCriterion("YouXiang is null");
            return (Criteria) this;
        }

        public Criteria andYouxiangIsNotNull() {
            addCriterion("YouXiang is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiangEqualTo(String value) {
            addCriterion("YouXiang =", value, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangNotEqualTo(String value) {
            addCriterion("YouXiang <>", value, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangGreaterThan(String value) {
            addCriterion("YouXiang >", value, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("YouXiang >=", value, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangLessThan(String value) {
            addCriterion("YouXiang <", value, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangLessThanOrEqualTo(String value) {
            addCriterion("YouXiang <=", value, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangLike(String value) {
            addCriterion("YouXiang like", value, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangNotLike(String value) {
            addCriterion("YouXiang not like", value, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangIn(List<String> values) {
            addCriterion("YouXiang in", values, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangNotIn(List<String> values) {
            addCriterion("YouXiang not in", values, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangBetween(String value1, String value2) {
            addCriterion("YouXiang between", value1, value2, "youxiang");
            return (Criteria) this;
        }

        public Criteria andYouxiangNotBetween(String value1, String value2) {
            addCriterion("YouXiang not between", value1, value2, "youxiang");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenIsNull() {
            addCriterion("SuoZaiShengFen is null");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenIsNotNull() {
            addCriterion("SuoZaiShengFen is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenEqualTo(String value) {
            addCriterion("SuoZaiShengFen =", value, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenNotEqualTo(String value) {
            addCriterion("SuoZaiShengFen <>", value, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenGreaterThan(String value) {
            addCriterion("SuoZaiShengFen >", value, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenGreaterThanOrEqualTo(String value) {
            addCriterion("SuoZaiShengFen >=", value, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenLessThan(String value) {
            addCriterion("SuoZaiShengFen <", value, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenLessThanOrEqualTo(String value) {
            addCriterion("SuoZaiShengFen <=", value, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenLike(String value) {
            addCriterion("SuoZaiShengFen like", value, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenNotLike(String value) {
            addCriterion("SuoZaiShengFen not like", value, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenIn(List<String> values) {
            addCriterion("SuoZaiShengFen in", values, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenNotIn(List<String> values) {
            addCriterion("SuoZaiShengFen not in", values, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenBetween(String value1, String value2) {
            addCriterion("SuoZaiShengFen between", value1, value2, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaishengfenNotBetween(String value1, String value2) {
            addCriterion("SuoZaiShengFen not between", value1, value2, "suozaishengfen");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiIsNull() {
            addCriterion("SuoZaiChengShi is null");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiIsNotNull() {
            addCriterion("SuoZaiChengShi is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiEqualTo(String value) {
            addCriterion("SuoZaiChengShi =", value, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiNotEqualTo(String value) {
            addCriterion("SuoZaiChengShi <>", value, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiGreaterThan(String value) {
            addCriterion("SuoZaiChengShi >", value, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiGreaterThanOrEqualTo(String value) {
            addCriterion("SuoZaiChengShi >=", value, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiLessThan(String value) {
            addCriterion("SuoZaiChengShi <", value, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiLessThanOrEqualTo(String value) {
            addCriterion("SuoZaiChengShi <=", value, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiLike(String value) {
            addCriterion("SuoZaiChengShi like", value, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiNotLike(String value) {
            addCriterion("SuoZaiChengShi not like", value, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiIn(List<String> values) {
            addCriterion("SuoZaiChengShi in", values, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiNotIn(List<String> values) {
            addCriterion("SuoZaiChengShi not in", values, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiBetween(String value1, String value2) {
            addCriterion("SuoZaiChengShi between", value1, value2, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andSuozaichengshiNotBetween(String value1, String value2) {
            addCriterion("SuoZaiChengShi not between", value1, value2, "suozaichengshi");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNull() {
            addCriterion("ZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("ZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(Integer value) {
            addCriterion("ZhuangTai =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(Integer value) {
            addCriterion("ZhuangTai <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(Integer value) {
            addCriterion("ZhuangTai >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZhuangTai >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(Integer value) {
            addCriterion("ZhuangTai <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("ZhuangTai <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<Integer> values) {
            addCriterion("ZhuangTai in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<Integer> values) {
            addCriterion("ZhuangTai not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("ZhuangTai between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("ZhuangTai not between", value1, value2, "zhuangtai");
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