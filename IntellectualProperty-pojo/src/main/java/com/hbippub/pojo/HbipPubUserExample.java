package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDuanxingyanzhengIsNull() {
            addCriterion("DuanXingYanZheng is null");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengIsNotNull() {
            addCriterion("DuanXingYanZheng is not null");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengEqualTo(Integer value) {
            addCriterion("DuanXingYanZheng =", value, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengNotEqualTo(Integer value) {
            addCriterion("DuanXingYanZheng <>", value, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengGreaterThan(Integer value) {
            addCriterion("DuanXingYanZheng >", value, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengGreaterThanOrEqualTo(Integer value) {
            addCriterion("DuanXingYanZheng >=", value, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengLessThan(Integer value) {
            addCriterion("DuanXingYanZheng <", value, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengLessThanOrEqualTo(Integer value) {
            addCriterion("DuanXingYanZheng <=", value, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengIn(List<Integer> values) {
            addCriterion("DuanXingYanZheng in", values, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengNotIn(List<Integer> values) {
            addCriterion("DuanXingYanZheng not in", values, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengBetween(Integer value1, Integer value2) {
            addCriterion("DuanXingYanZheng between", value1, value2, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andDuanxingyanzhengNotBetween(Integer value1, Integer value2) {
            addCriterion("DuanXingYanZheng not between", value1, value2, "duanxingyanzheng");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidIsNull() {
            addCriterion("SuoZaiQuHuaID is null");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidIsNotNull() {
            addCriterion("SuoZaiQuHuaID is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidEqualTo(Integer value) {
            addCriterion("SuoZaiQuHuaID =", value, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidNotEqualTo(Integer value) {
            addCriterion("SuoZaiQuHuaID <>", value, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidGreaterThan(Integer value) {
            addCriterion("SuoZaiQuHuaID >", value, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SuoZaiQuHuaID >=", value, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidLessThan(Integer value) {
            addCriterion("SuoZaiQuHuaID <", value, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidLessThanOrEqualTo(Integer value) {
            addCriterion("SuoZaiQuHuaID <=", value, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidIn(List<Integer> values) {
            addCriterion("SuoZaiQuHuaID in", values, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidNotIn(List<Integer> values) {
            addCriterion("SuoZaiQuHuaID not in", values, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidBetween(Integer value1, Integer value2) {
            addCriterion("SuoZaiQuHuaID between", value1, value2, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andSuozaiquhuaidNotBetween(Integer value1, Integer value2) {
            addCriterion("SuoZaiQuHuaID not between", value1, value2, "suozaiquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidIsNull() {
            addCriterion("JiGuanQuHuaID is null");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidIsNotNull() {
            addCriterion("JiGuanQuHuaID is not null");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidEqualTo(Integer value) {
            addCriterion("JiGuanQuHuaID =", value, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidNotEqualTo(Integer value) {
            addCriterion("JiGuanQuHuaID <>", value, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidGreaterThan(Integer value) {
            addCriterion("JiGuanQuHuaID >", value, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiGuanQuHuaID >=", value, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidLessThan(Integer value) {
            addCriterion("JiGuanQuHuaID <", value, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidLessThanOrEqualTo(Integer value) {
            addCriterion("JiGuanQuHuaID <=", value, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidIn(List<Integer> values) {
            addCriterion("JiGuanQuHuaID in", values, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidNotIn(List<Integer> values) {
            addCriterion("JiGuanQuHuaID not in", values, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidBetween(Integer value1, Integer value2) {
            addCriterion("JiGuanQuHuaID between", value1, value2, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andJiguanquhuaidNotBetween(Integer value1, Integer value2) {
            addCriterion("JiGuanQuHuaID not between", value1, value2, "jiguanquhuaid");
            return (Criteria) this;
        }

        public Criteria andYonghumingIsNull() {
            addCriterion("YongHuMing is null");
            return (Criteria) this;
        }

        public Criteria andYonghumingIsNotNull() {
            addCriterion("YongHuMing is not null");
            return (Criteria) this;
        }

        public Criteria andYonghumingEqualTo(String value) {
            addCriterion("YongHuMing =", value, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingNotEqualTo(String value) {
            addCriterion("YongHuMing <>", value, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingGreaterThan(String value) {
            addCriterion("YongHuMing >", value, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingGreaterThanOrEqualTo(String value) {
            addCriterion("YongHuMing >=", value, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingLessThan(String value) {
            addCriterion("YongHuMing <", value, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingLessThanOrEqualTo(String value) {
            addCriterion("YongHuMing <=", value, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingLike(String value) {
            addCriterion("YongHuMing like", value, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingNotLike(String value) {
            addCriterion("YongHuMing not like", value, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingIn(List<String> values) {
            addCriterion("YongHuMing in", values, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingNotIn(List<String> values) {
            addCriterion("YongHuMing not in", values, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingBetween(String value1, String value2) {
            addCriterion("YongHuMing between", value1, value2, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andYonghumingNotBetween(String value1, String value2) {
            addCriterion("YongHuMing not between", value1, value2, "yonghuming");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNull() {
            addCriterion("XingMing is null");
            return (Criteria) this;
        }

        public Criteria andXingmingIsNotNull() {
            addCriterion("XingMing is not null");
            return (Criteria) this;
        }

        public Criteria andXingmingEqualTo(String value) {
            addCriterion("XingMing =", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotEqualTo(String value) {
            addCriterion("XingMing <>", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThan(String value) {
            addCriterion("XingMing >", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingGreaterThanOrEqualTo(String value) {
            addCriterion("XingMing >=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThan(String value) {
            addCriterion("XingMing <", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLessThanOrEqualTo(String value) {
            addCriterion("XingMing <=", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingLike(String value) {
            addCriterion("XingMing like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotLike(String value) {
            addCriterion("XingMing not like", value, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingIn(List<String> values) {
            addCriterion("XingMing in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotIn(List<String> values) {
            addCriterion("XingMing not in", values, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingBetween(String value1, String value2) {
            addCriterion("XingMing between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andXingmingNotBetween(String value1, String value2) {
            addCriterion("XingMing not between", value1, value2, "xingming");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingIsNull() {
            addCriterion("ZuZhiLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingIsNotNull() {
            addCriterion("ZuZhiLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingEqualTo(String value) {
            addCriterion("ZuZhiLeiXing =", value, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingNotEqualTo(String value) {
            addCriterion("ZuZhiLeiXing <>", value, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingGreaterThan(String value) {
            addCriterion("ZuZhiLeiXing >", value, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingGreaterThanOrEqualTo(String value) {
            addCriterion("ZuZhiLeiXing >=", value, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingLessThan(String value) {
            addCriterion("ZuZhiLeiXing <", value, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingLessThanOrEqualTo(String value) {
            addCriterion("ZuZhiLeiXing <=", value, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingLike(String value) {
            addCriterion("ZuZhiLeiXing like", value, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingNotLike(String value) {
            addCriterion("ZuZhiLeiXing not like", value, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingIn(List<String> values) {
            addCriterion("ZuZhiLeiXing in", values, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingNotIn(List<String> values) {
            addCriterion("ZuZhiLeiXing not in", values, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingBetween(String value1, String value2) {
            addCriterion("ZuZhiLeiXing between", value1, value2, "zuzhileixing");
            return (Criteria) this;
        }

        public Criteria andZuzhileixingNotBetween(String value1, String value2) {
            addCriterion("ZuZhiLeiXing not between", value1, value2, "zuzhileixing");
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

        public Criteria andNichengIsNull() {
            addCriterion("NiCheng is null");
            return (Criteria) this;
        }

        public Criteria andNichengIsNotNull() {
            addCriterion("NiCheng is not null");
            return (Criteria) this;
        }

        public Criteria andNichengEqualTo(String value) {
            addCriterion("NiCheng =", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotEqualTo(String value) {
            addCriterion("NiCheng <>", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengGreaterThan(String value) {
            addCriterion("NiCheng >", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengGreaterThanOrEqualTo(String value) {
            addCriterion("NiCheng >=", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLessThan(String value) {
            addCriterion("NiCheng <", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLessThanOrEqualTo(String value) {
            addCriterion("NiCheng <=", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengLike(String value) {
            addCriterion("NiCheng like", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotLike(String value) {
            addCriterion("NiCheng not like", value, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengIn(List<String> values) {
            addCriterion("NiCheng in", values, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotIn(List<String> values) {
            addCriterion("NiCheng not in", values, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengBetween(String value1, String value2) {
            addCriterion("NiCheng between", value1, value2, "nicheng");
            return (Criteria) this;
        }

        public Criteria andNichengNotBetween(String value1, String value2) {
            addCriterion("NiCheng not between", value1, value2, "nicheng");
            return (Criteria) this;
        }

        public Criteria andMimaIsNull() {
            addCriterion("MiMa is null");
            return (Criteria) this;
        }

        public Criteria andMimaIsNotNull() {
            addCriterion("MiMa is not null");
            return (Criteria) this;
        }

        public Criteria andMimaEqualTo(String value) {
            addCriterion("MiMa =", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaNotEqualTo(String value) {
            addCriterion("MiMa <>", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaGreaterThan(String value) {
            addCriterion("MiMa >", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaGreaterThanOrEqualTo(String value) {
            addCriterion("MiMa >=", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaLessThan(String value) {
            addCriterion("MiMa <", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaLessThanOrEqualTo(String value) {
            addCriterion("MiMa <=", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaLike(String value) {
            addCriterion("MiMa like", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaNotLike(String value) {
            addCriterion("MiMa not like", value, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaIn(List<String> values) {
            addCriterion("MiMa in", values, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaNotIn(List<String> values) {
            addCriterion("MiMa not in", values, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaBetween(String value1, String value2) {
            addCriterion("MiMa between", value1, value2, "mima");
            return (Criteria) this;
        }

        public Criteria andMimaNotBetween(String value1, String value2) {
            addCriterion("MiMa not between", value1, value2, "mima");
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

        public Criteria andXingbieIsNull() {
            addCriterion("XingBie is null");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNotNull() {
            addCriterion("XingBie is not null");
            return (Criteria) this;
        }

        public Criteria andXingbieEqualTo(String value) {
            addCriterion("XingBie =", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotEqualTo(String value) {
            addCriterion("XingBie <>", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThan(String value) {
            addCriterion("XingBie >", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThanOrEqualTo(String value) {
            addCriterion("XingBie >=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThan(String value) {
            addCriterion("XingBie <", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThanOrEqualTo(String value) {
            addCriterion("XingBie <=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLike(String value) {
            addCriterion("XingBie like", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotLike(String value) {
            addCriterion("XingBie not like", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieIn(List<String> values) {
            addCriterion("XingBie in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotIn(List<String> values) {
            addCriterion("XingBie not in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieBetween(String value1, String value2) {
            addCriterion("XingBie between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotBetween(String value1, String value2) {
            addCriterion("XingBie not between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidIsNull() {
            addCriterion("LianHeDengLuID is null");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidIsNotNull() {
            addCriterion("LianHeDengLuID is not null");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidEqualTo(String value) {
            addCriterion("LianHeDengLuID =", value, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidNotEqualTo(String value) {
            addCriterion("LianHeDengLuID <>", value, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidGreaterThan(String value) {
            addCriterion("LianHeDengLuID >", value, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidGreaterThanOrEqualTo(String value) {
            addCriterion("LianHeDengLuID >=", value, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidLessThan(String value) {
            addCriterion("LianHeDengLuID <", value, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidLessThanOrEqualTo(String value) {
            addCriterion("LianHeDengLuID <=", value, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidLike(String value) {
            addCriterion("LianHeDengLuID like", value, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidNotLike(String value) {
            addCriterion("LianHeDengLuID not like", value, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidIn(List<String> values) {
            addCriterion("LianHeDengLuID in", values, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidNotIn(List<String> values) {
            addCriterion("LianHeDengLuID not in", values, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidBetween(String value1, String value2) {
            addCriterion("LianHeDengLuID between", value1, value2, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andLianhedengluidNotBetween(String value1, String value2) {
            addCriterion("LianHeDengLuID not between", value1, value2, "lianhedengluid");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiIsNull() {
            addCriterion("DengLuFangShi is null");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiIsNotNull() {
            addCriterion("DengLuFangShi is not null");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiEqualTo(Integer value) {
            addCriterion("DengLuFangShi =", value, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiNotEqualTo(Integer value) {
            addCriterion("DengLuFangShi <>", value, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiGreaterThan(Integer value) {
            addCriterion("DengLuFangShi >", value, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiGreaterThanOrEqualTo(Integer value) {
            addCriterion("DengLuFangShi >=", value, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiLessThan(Integer value) {
            addCriterion("DengLuFangShi <", value, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiLessThanOrEqualTo(Integer value) {
            addCriterion("DengLuFangShi <=", value, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiIn(List<Integer> values) {
            addCriterion("DengLuFangShi in", values, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiNotIn(List<Integer> values) {
            addCriterion("DengLuFangShi not in", values, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiBetween(Integer value1, Integer value2) {
            addCriterion("DengLuFangShi between", value1, value2, "denglufangshi");
            return (Criteria) this;
        }

        public Criteria andDenglufangshiNotBetween(Integer value1, Integer value2) {
            addCriterion("DengLuFangShi not between", value1, value2, "denglufangshi");
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

        public Criteria andRenzhengurl2IsNull() {
            addCriterion("RenZhengURL2 is null");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2IsNotNull() {
            addCriterion("RenZhengURL2 is not null");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2EqualTo(String value) {
            addCriterion("RenZhengURL2 =", value, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2NotEqualTo(String value) {
            addCriterion("RenZhengURL2 <>", value, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2GreaterThan(String value) {
            addCriterion("RenZhengURL2 >", value, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2GreaterThanOrEqualTo(String value) {
            addCriterion("RenZhengURL2 >=", value, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2LessThan(String value) {
            addCriterion("RenZhengURL2 <", value, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2LessThanOrEqualTo(String value) {
            addCriterion("RenZhengURL2 <=", value, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2Like(String value) {
            addCriterion("RenZhengURL2 like", value, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2NotLike(String value) {
            addCriterion("RenZhengURL2 not like", value, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2In(List<String> values) {
            addCriterion("RenZhengURL2 in", values, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2NotIn(List<String> values) {
            addCriterion("RenZhengURL2 not in", values, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2Between(String value1, String value2) {
            addCriterion("RenZhengURL2 between", value1, value2, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl2NotBetween(String value1, String value2) {
            addCriterion("RenZhengURL2 not between", value1, value2, "renzhengurl2");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1IsNull() {
            addCriterion("RenZhengURL1 is null");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1IsNotNull() {
            addCriterion("RenZhengURL1 is not null");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1EqualTo(String value) {
            addCriterion("RenZhengURL1 =", value, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1NotEqualTo(String value) {
            addCriterion("RenZhengURL1 <>", value, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1GreaterThan(String value) {
            addCriterion("RenZhengURL1 >", value, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1GreaterThanOrEqualTo(String value) {
            addCriterion("RenZhengURL1 >=", value, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1LessThan(String value) {
            addCriterion("RenZhengURL1 <", value, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1LessThanOrEqualTo(String value) {
            addCriterion("RenZhengURL1 <=", value, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1Like(String value) {
            addCriterion("RenZhengURL1 like", value, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1NotLike(String value) {
            addCriterion("RenZhengURL1 not like", value, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1In(List<String> values) {
            addCriterion("RenZhengURL1 in", values, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1NotIn(List<String> values) {
            addCriterion("RenZhengURL1 not in", values, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1Between(String value1, String value2) {
            addCriterion("RenZhengURL1 between", value1, value2, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andRenzhengurl1NotBetween(String value1, String value2) {
            addCriterion("RenZhengURL1 not between", value1, value2, "renzhengurl1");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieIsNull() {
            addCriterion("YongHuLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieIsNotNull() {
            addCriterion("YongHuLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieEqualTo(Integer value) {
            addCriterion("YongHuLeiBie =", value, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieNotEqualTo(Integer value) {
            addCriterion("YongHuLeiBie <>", value, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieGreaterThan(Integer value) {
            addCriterion("YongHuLeiBie >", value, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieGreaterThanOrEqualTo(Integer value) {
            addCriterion("YongHuLeiBie >=", value, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieLessThan(Integer value) {
            addCriterion("YongHuLeiBie <", value, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieLessThanOrEqualTo(Integer value) {
            addCriterion("YongHuLeiBie <=", value, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieIn(List<Integer> values) {
            addCriterion("YongHuLeiBie in", values, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieNotIn(List<Integer> values) {
            addCriterion("YongHuLeiBie not in", values, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieBetween(Integer value1, Integer value2) {
            addCriterion("YongHuLeiBie between", value1, value2, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andYonghuleibieNotBetween(Integer value1, Integer value2) {
            addCriterion("YongHuLeiBie not between", value1, value2, "yonghuleibie");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingIsNull() {
            addCriterion("ZhengJianLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingIsNotNull() {
            addCriterion("ZhengJianLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingEqualTo(Integer value) {
            addCriterion("ZhengJianLeiXing =", value, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingNotEqualTo(Integer value) {
            addCriterion("ZhengJianLeiXing <>", value, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingGreaterThan(Integer value) {
            addCriterion("ZhengJianLeiXing >", value, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZhengJianLeiXing >=", value, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingLessThan(Integer value) {
            addCriterion("ZhengJianLeiXing <", value, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingLessThanOrEqualTo(Integer value) {
            addCriterion("ZhengJianLeiXing <=", value, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingIn(List<Integer> values) {
            addCriterion("ZhengJianLeiXing in", values, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingNotIn(List<Integer> values) {
            addCriterion("ZhengJianLeiXing not in", values, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingBetween(Integer value1, Integer value2) {
            addCriterion("ZhengJianLeiXing between", value1, value2, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("ZhengJianLeiXing not between", value1, value2, "zhengjianleixing");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoIsNull() {
            addCriterion("ZhengJianHao is null");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoIsNotNull() {
            addCriterion("ZhengJianHao is not null");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoEqualTo(String value) {
            addCriterion("ZhengJianHao =", value, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoNotEqualTo(String value) {
            addCriterion("ZhengJianHao <>", value, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoGreaterThan(String value) {
            addCriterion("ZhengJianHao >", value, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("ZhengJianHao >=", value, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoLessThan(String value) {
            addCriterion("ZhengJianHao <", value, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoLessThanOrEqualTo(String value) {
            addCriterion("ZhengJianHao <=", value, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoLike(String value) {
            addCriterion("ZhengJianHao like", value, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoNotLike(String value) {
            addCriterion("ZhengJianHao not like", value, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoIn(List<String> values) {
            addCriterion("ZhengJianHao in", values, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoNotIn(List<String> values) {
            addCriterion("ZhengJianHao not in", values, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoBetween(String value1, String value2) {
            addCriterion("ZhengJianHao between", value1, value2, "zhengjianhao");
            return (Criteria) this;
        }

        public Criteria andZhengjianhaoNotBetween(String value1, String value2) {
            addCriterion("ZhengJianHao not between", value1, value2, "zhengjianhao");
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

        public Criteria andHeimingdanbiaojiIsNull() {
            addCriterion("HeiMingDanBiaoJi is null");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiIsNotNull() {
            addCriterion("HeiMingDanBiaoJi is not null");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiEqualTo(Integer value) {
            addCriterion("HeiMingDanBiaoJi =", value, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiNotEqualTo(Integer value) {
            addCriterion("HeiMingDanBiaoJi <>", value, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiGreaterThan(Integer value) {
            addCriterion("HeiMingDanBiaoJi >", value, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiGreaterThanOrEqualTo(Integer value) {
            addCriterion("HeiMingDanBiaoJi >=", value, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiLessThan(Integer value) {
            addCriterion("HeiMingDanBiaoJi <", value, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiLessThanOrEqualTo(Integer value) {
            addCriterion("HeiMingDanBiaoJi <=", value, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiIn(List<Integer> values) {
            addCriterion("HeiMingDanBiaoJi in", values, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiNotIn(List<Integer> values) {
            addCriterion("HeiMingDanBiaoJi not in", values, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiBetween(Integer value1, Integer value2) {
            addCriterion("HeiMingDanBiaoJi between", value1, value2, "heimingdanbiaoji");
            return (Criteria) this;
        }

        public Criteria andHeimingdanbiaojiNotBetween(Integer value1, Integer value2) {
            addCriterion("HeiMingDanBiaoJi not between", value1, value2, "heimingdanbiaoji");
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

        public Criteria andYouzhengbianmaIsNull() {
            addCriterion("YouZhengBianMa is null");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaIsNotNull() {
            addCriterion("YouZhengBianMa is not null");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaEqualTo(String value) {
            addCriterion("YouZhengBianMa =", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaNotEqualTo(String value) {
            addCriterion("YouZhengBianMa <>", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaGreaterThan(String value) {
            addCriterion("YouZhengBianMa >", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaGreaterThanOrEqualTo(String value) {
            addCriterion("YouZhengBianMa >=", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaLessThan(String value) {
            addCriterion("YouZhengBianMa <", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaLessThanOrEqualTo(String value) {
            addCriterion("YouZhengBianMa <=", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaLike(String value) {
            addCriterion("YouZhengBianMa like", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaNotLike(String value) {
            addCriterion("YouZhengBianMa not like", value, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaIn(List<String> values) {
            addCriterion("YouZhengBianMa in", values, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaNotIn(List<String> values) {
            addCriterion("YouZhengBianMa not in", values, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaBetween(String value1, String value2) {
            addCriterion("YouZhengBianMa between", value1, value2, "youzhengbianma");
            return (Criteria) this;
        }

        public Criteria andYouzhengbianmaNotBetween(String value1, String value2) {
            addCriterion("YouZhengBianMa not between", value1, value2, "youzhengbianma");
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

        public Criteria andJiguanchengshiIsNull() {
            addCriterion("JiGuanChengShi is null");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiIsNotNull() {
            addCriterion("JiGuanChengShi is not null");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiEqualTo(String value) {
            addCriterion("JiGuanChengShi =", value, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiNotEqualTo(String value) {
            addCriterion("JiGuanChengShi <>", value, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiGreaterThan(String value) {
            addCriterion("JiGuanChengShi >", value, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiGreaterThanOrEqualTo(String value) {
            addCriterion("JiGuanChengShi >=", value, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiLessThan(String value) {
            addCriterion("JiGuanChengShi <", value, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiLessThanOrEqualTo(String value) {
            addCriterion("JiGuanChengShi <=", value, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiLike(String value) {
            addCriterion("JiGuanChengShi like", value, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiNotLike(String value) {
            addCriterion("JiGuanChengShi not like", value, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiIn(List<String> values) {
            addCriterion("JiGuanChengShi in", values, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiNotIn(List<String> values) {
            addCriterion("JiGuanChengShi not in", values, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiBetween(String value1, String value2) {
            addCriterion("JiGuanChengShi between", value1, value2, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanchengshiNotBetween(String value1, String value2) {
            addCriterion("JiGuanChengShi not between", value1, value2, "jiguanchengshi");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenIsNull() {
            addCriterion("JiGuanShengFen is null");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenIsNotNull() {
            addCriterion("JiGuanShengFen is not null");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenEqualTo(String value) {
            addCriterion("JiGuanShengFen =", value, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenNotEqualTo(String value) {
            addCriterion("JiGuanShengFen <>", value, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenGreaterThan(String value) {
            addCriterion("JiGuanShengFen >", value, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenGreaterThanOrEqualTo(String value) {
            addCriterion("JiGuanShengFen >=", value, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenLessThan(String value) {
            addCriterion("JiGuanShengFen <", value, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenLessThanOrEqualTo(String value) {
            addCriterion("JiGuanShengFen <=", value, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenLike(String value) {
            addCriterion("JiGuanShengFen like", value, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenNotLike(String value) {
            addCriterion("JiGuanShengFen not like", value, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenIn(List<String> values) {
            addCriterion("JiGuanShengFen in", values, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenNotIn(List<String> values) {
            addCriterion("JiGuanShengFen not in", values, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenBetween(String value1, String value2) {
            addCriterion("JiGuanShengFen between", value1, value2, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andJiguanshengfenNotBetween(String value1, String value2) {
            addCriterion("JiGuanShengFen not between", value1, value2, "jiguanshengfen");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiIsNull() {
            addCriterion("LianXiDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiIsNotNull() {
            addCriterion("LianXiDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiEqualTo(String value) {
            addCriterion("LianXiDiZhi =", value, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiNotEqualTo(String value) {
            addCriterion("LianXiDiZhi <>", value, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiGreaterThan(String value) {
            addCriterion("LianXiDiZhi >", value, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiGreaterThanOrEqualTo(String value) {
            addCriterion("LianXiDiZhi >=", value, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiLessThan(String value) {
            addCriterion("LianXiDiZhi <", value, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiLessThanOrEqualTo(String value) {
            addCriterion("LianXiDiZhi <=", value, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiLike(String value) {
            addCriterion("LianXiDiZhi like", value, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiNotLike(String value) {
            addCriterion("LianXiDiZhi not like", value, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiIn(List<String> values) {
            addCriterion("LianXiDiZhi in", values, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiNotIn(List<String> values) {
            addCriterion("LianXiDiZhi not in", values, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiBetween(String value1, String value2) {
            addCriterion("LianXiDiZhi between", value1, value2, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andLianxidizhiNotBetween(String value1, String value2) {
            addCriterion("LianXiDiZhi not between", value1, value2, "lianxidizhi");
            return (Criteria) this;
        }

        public Criteria andHuoyueduIsNull() {
            addCriterion("HuoYueDu is null");
            return (Criteria) this;
        }

        public Criteria andHuoyueduIsNotNull() {
            addCriterion("HuoYueDu is not null");
            return (Criteria) this;
        }

        public Criteria andHuoyueduEqualTo(Integer value) {
            addCriterion("HuoYueDu =", value, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduNotEqualTo(Integer value) {
            addCriterion("HuoYueDu <>", value, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduGreaterThan(Integer value) {
            addCriterion("HuoYueDu >", value, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduGreaterThanOrEqualTo(Integer value) {
            addCriterion("HuoYueDu >=", value, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduLessThan(Integer value) {
            addCriterion("HuoYueDu <", value, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduLessThanOrEqualTo(Integer value) {
            addCriterion("HuoYueDu <=", value, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduIn(List<Integer> values) {
            addCriterion("HuoYueDu in", values, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduNotIn(List<Integer> values) {
            addCriterion("HuoYueDu not in", values, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduBetween(Integer value1, Integer value2) {
            addCriterion("HuoYueDu between", value1, value2, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andHuoyueduNotBetween(Integer value1, Integer value2) {
            addCriterion("HuoYueDu not between", value1, value2, "huoyuedu");
            return (Criteria) this;
        }

        public Criteria andFensishuIsNull() {
            addCriterion("FenSiShu is null");
            return (Criteria) this;
        }

        public Criteria andFensishuIsNotNull() {
            addCriterion("FenSiShu is not null");
            return (Criteria) this;
        }

        public Criteria andFensishuEqualTo(Integer value) {
            addCriterion("FenSiShu =", value, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuNotEqualTo(Integer value) {
            addCriterion("FenSiShu <>", value, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuGreaterThan(Integer value) {
            addCriterion("FenSiShu >", value, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("FenSiShu >=", value, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuLessThan(Integer value) {
            addCriterion("FenSiShu <", value, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuLessThanOrEqualTo(Integer value) {
            addCriterion("FenSiShu <=", value, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuIn(List<Integer> values) {
            addCriterion("FenSiShu in", values, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuNotIn(List<Integer> values) {
            addCriterion("FenSiShu not in", values, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuBetween(Integer value1, Integer value2) {
            addCriterion("FenSiShu between", value1, value2, "fensishu");
            return (Criteria) this;
        }

        public Criteria andFensishuNotBetween(Integer value1, Integer value2) {
            addCriterion("FenSiShu not between", value1, value2, "fensishu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuIsNull() {
            addCriterion("GuanZhuShu is null");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuIsNotNull() {
            addCriterion("GuanZhuShu is not null");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuEqualTo(Integer value) {
            addCriterion("GuanZhuShu =", value, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuNotEqualTo(Integer value) {
            addCriterion("GuanZhuShu <>", value, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuGreaterThan(Integer value) {
            addCriterion("GuanZhuShu >", value, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GuanZhuShu >=", value, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuLessThan(Integer value) {
            addCriterion("GuanZhuShu <", value, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuLessThanOrEqualTo(Integer value) {
            addCriterion("GuanZhuShu <=", value, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuIn(List<Integer> values) {
            addCriterion("GuanZhuShu in", values, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuNotIn(List<Integer> values) {
            addCriterion("GuanZhuShu not in", values, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuBetween(Integer value1, Integer value2) {
            addCriterion("GuanZhuShu between", value1, value2, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andGuanzhushuNotBetween(Integer value1, Integer value2) {
            addCriterion("GuanZhuShu not between", value1, value2, "guanzhushu");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouIsNull() {
            addCriterion("ShiFouFuWuJiGou is null");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouIsNotNull() {
            addCriterion("ShiFouFuWuJiGou is not null");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouEqualTo(Integer value) {
            addCriterion("ShiFouFuWuJiGou =", value, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouNotEqualTo(Integer value) {
            addCriterion("ShiFouFuWuJiGou <>", value, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouGreaterThan(Integer value) {
            addCriterion("ShiFouFuWuJiGou >", value, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouFuWuJiGou >=", value, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouLessThan(Integer value) {
            addCriterion("ShiFouFuWuJiGou <", value, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouFuWuJiGou <=", value, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouIn(List<Integer> values) {
            addCriterion("ShiFouFuWuJiGou in", values, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouNotIn(List<Integer> values) {
            addCriterion("ShiFouFuWuJiGou not in", values, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouFuWuJiGou between", value1, value2, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andShifoufuwujigouNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouFuWuJiGou not between", value1, value2, "shifoufuwujigou");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiIsNull() {
            addCriterion("DianPuZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiIsNotNull() {
            addCriterion("DianPuZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiEqualTo(Integer value) {
            addCriterion("DianPuZhuangTai =", value, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiNotEqualTo(Integer value) {
            addCriterion("DianPuZhuangTai <>", value, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiGreaterThan(Integer value) {
            addCriterion("DianPuZhuangTai >", value, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("DianPuZhuangTai >=", value, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiLessThan(Integer value) {
            addCriterion("DianPuZhuangTai <", value, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("DianPuZhuangTai <=", value, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiIn(List<Integer> values) {
            addCriterion("DianPuZhuangTai in", values, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiNotIn(List<Integer> values) {
            addCriterion("DianPuZhuangTai not in", values, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("DianPuZhuangTai between", value1, value2, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("DianPuZhuangTai not between", value1, value2, "dianpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuIsNull() {
            addCriterion("DianPuLiuLanShu is null");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuIsNotNull() {
            addCriterion("DianPuLiuLanShu is not null");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuEqualTo(Integer value) {
            addCriterion("DianPuLiuLanShu =", value, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuNotEqualTo(Integer value) {
            addCriterion("DianPuLiuLanShu <>", value, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuGreaterThan(Integer value) {
            addCriterion("DianPuLiuLanShu >", value, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("DianPuLiuLanShu >=", value, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuLessThan(Integer value) {
            addCriterion("DianPuLiuLanShu <", value, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuLessThanOrEqualTo(Integer value) {
            addCriterion("DianPuLiuLanShu <=", value, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuIn(List<Integer> values) {
            addCriterion("DianPuLiuLanShu in", values, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuNotIn(List<Integer> values) {
            addCriterion("DianPuLiuLanShu not in", values, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuBetween(Integer value1, Integer value2) {
            addCriterion("DianPuLiuLanShu between", value1, value2, "dianpuliulanshu");
            return (Criteria) this;
        }

        public Criteria andDianpuliulanshuNotBetween(Integer value1, Integer value2) {
            addCriterion("DianPuLiuLanShu not between", value1, value2, "dianpuliulanshu");
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

        public Criteria andDianpuqqIsNull() {
            addCriterion("DianPuQQ is null");
            return (Criteria) this;
        }

        public Criteria andDianpuqqIsNotNull() {
            addCriterion("DianPuQQ is not null");
            return (Criteria) this;
        }

        public Criteria andDianpuqqEqualTo(Integer value) {
            addCriterion("DianPuQQ =", value, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqNotEqualTo(Integer value) {
            addCriterion("DianPuQQ <>", value, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqGreaterThan(Integer value) {
            addCriterion("DianPuQQ >", value, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqGreaterThanOrEqualTo(Integer value) {
            addCriterion("DianPuQQ >=", value, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqLessThan(Integer value) {
            addCriterion("DianPuQQ <", value, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqLessThanOrEqualTo(Integer value) {
            addCriterion("DianPuQQ <=", value, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqIn(List<Integer> values) {
            addCriterion("DianPuQQ in", values, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqNotIn(List<Integer> values) {
            addCriterion("DianPuQQ not in", values, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqBetween(Integer value1, Integer value2) {
            addCriterion("DianPuQQ between", value1, value2, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianpuqqNotBetween(Integer value1, Integer value2) {
            addCriterion("DianPuQQ not between", value1, value2, "dianpuqq");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoIsNull() {
            addCriterion("DianPuTuBiao is null");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoIsNotNull() {
            addCriterion("DianPuTuBiao is not null");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoEqualTo(String value) {
            addCriterion("DianPuTuBiao =", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoNotEqualTo(String value) {
            addCriterion("DianPuTuBiao <>", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoGreaterThan(String value) {
            addCriterion("DianPuTuBiao >", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoGreaterThanOrEqualTo(String value) {
            addCriterion("DianPuTuBiao >=", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoLessThan(String value) {
            addCriterion("DianPuTuBiao <", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoLessThanOrEqualTo(String value) {
            addCriterion("DianPuTuBiao <=", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoLike(String value) {
            addCriterion("DianPuTuBiao like", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoNotLike(String value) {
            addCriterion("DianPuTuBiao not like", value, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoIn(List<String> values) {
            addCriterion("DianPuTuBiao in", values, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoNotIn(List<String> values) {
            addCriterion("DianPuTuBiao not in", values, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoBetween(String value1, String value2) {
            addCriterion("DianPuTuBiao between", value1, value2, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andDianputubiaoNotBetween(String value1, String value2) {
            addCriterion("DianPuTuBiao not between", value1, value2, "dianputubiao");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuIsNull() {
            addCriterion("ZhuYingYeWu is null");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuIsNotNull() {
            addCriterion("ZhuYingYeWu is not null");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuEqualTo(String value) {
            addCriterion("ZhuYingYeWu =", value, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuNotEqualTo(String value) {
            addCriterion("ZhuYingYeWu <>", value, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuGreaterThan(String value) {
            addCriterion("ZhuYingYeWu >", value, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuYingYeWu >=", value, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuLessThan(String value) {
            addCriterion("ZhuYingYeWu <", value, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuLessThanOrEqualTo(String value) {
            addCriterion("ZhuYingYeWu <=", value, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuLike(String value) {
            addCriterion("ZhuYingYeWu like", value, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuNotLike(String value) {
            addCriterion("ZhuYingYeWu not like", value, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuIn(List<String> values) {
            addCriterion("ZhuYingYeWu in", values, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuNotIn(List<String> values) {
            addCriterion("ZhuYingYeWu not in", values, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuBetween(String value1, String value2) {
            addCriterion("ZhuYingYeWu between", value1, value2, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andZhuyingyewuNotBetween(String value1, String value2) {
            addCriterion("ZhuYingYeWu not between", value1, value2, "zhuyingyewu");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianIsNull() {
            addCriterion("KaiDianShiJian is null");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianIsNotNull() {
            addCriterion("KaiDianShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianEqualTo(Date value) {
            addCriterion("KaiDianShiJian =", value, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianNotEqualTo(Date value) {
            addCriterion("KaiDianShiJian <>", value, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianGreaterThan(Date value) {
            addCriterion("KaiDianShiJian >", value, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("KaiDianShiJian >=", value, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianLessThan(Date value) {
            addCriterion("KaiDianShiJian <", value, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianLessThanOrEqualTo(Date value) {
            addCriterion("KaiDianShiJian <=", value, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianIn(List<Date> values) {
            addCriterion("KaiDianShiJian in", values, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianNotIn(List<Date> values) {
            addCriterion("KaiDianShiJian not in", values, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianBetween(Date value1, Date value2) {
            addCriterion("KaiDianShiJian between", value1, value2, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andKaidianshijianNotBetween(Date value1, Date value2) {
            addCriterion("KaiDianShiJian not between", value1, value2, "kaidianshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianIsNull() {
            addCriterion("TiJiaoShenHeShiJian is null");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianIsNotNull() {
            addCriterion("TiJiaoShenHeShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianEqualTo(Date value) {
            addCriterion("TiJiaoShenHeShiJian =", value, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianNotEqualTo(Date value) {
            addCriterion("TiJiaoShenHeShiJian <>", value, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianGreaterThan(Date value) {
            addCriterion("TiJiaoShenHeShiJian >", value, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("TiJiaoShenHeShiJian >=", value, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianLessThan(Date value) {
            addCriterion("TiJiaoShenHeShiJian <", value, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianLessThanOrEqualTo(Date value) {
            addCriterion("TiJiaoShenHeShiJian <=", value, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianIn(List<Date> values) {
            addCriterion("TiJiaoShenHeShiJian in", values, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianNotIn(List<Date> values) {
            addCriterion("TiJiaoShenHeShiJian not in", values, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianBetween(Date value1, Date value2) {
            addCriterion("TiJiaoShenHeShiJian between", value1, value2, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andTijiaoshenheshijianNotBetween(Date value1, Date value2) {
            addCriterion("TiJiaoShenHeShiJian not between", value1, value2, "tijiaoshenheshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianIsNull() {
            addCriterion("ZhuCeShiJian is null");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianIsNotNull() {
            addCriterion("ZhuCeShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianEqualTo(Date value) {
            addCriterion("ZhuCeShiJian =", value, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianNotEqualTo(Date value) {
            addCriterion("ZhuCeShiJian <>", value, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianGreaterThan(Date value) {
            addCriterion("ZhuCeShiJian >", value, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZhuCeShiJian >=", value, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianLessThan(Date value) {
            addCriterion("ZhuCeShiJian <", value, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianLessThanOrEqualTo(Date value) {
            addCriterion("ZhuCeShiJian <=", value, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianIn(List<Date> values) {
            addCriterion("ZhuCeShiJian in", values, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianNotIn(List<Date> values) {
            addCriterion("ZhuCeShiJian not in", values, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianBetween(Date value1, Date value2) {
            addCriterion("ZhuCeShiJian between", value1, value2, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZhuceshijianNotBetween(Date value1, Date value2) {
            addCriterion("ZhuCeShiJian not between", value1, value2, "zhuceshijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianIsNull() {
            addCriterion("ZuiHouDengLuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianIsNotNull() {
            addCriterion("ZuiHouDengLuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianEqualTo(Date value) {
            addCriterion("ZuiHouDengLuShiJian =", value, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianNotEqualTo(Date value) {
            addCriterion("ZuiHouDengLuShiJian <>", value, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianGreaterThan(Date value) {
            addCriterion("ZuiHouDengLuShiJian >", value, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ZuiHouDengLuShiJian >=", value, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianLessThan(Date value) {
            addCriterion("ZuiHouDengLuShiJian <", value, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianLessThanOrEqualTo(Date value) {
            addCriterion("ZuiHouDengLuShiJian <=", value, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianIn(List<Date> values) {
            addCriterion("ZuiHouDengLuShiJian in", values, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianNotIn(List<Date> values) {
            addCriterion("ZuiHouDengLuShiJian not in", values, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianBetween(Date value1, Date value2) {
            addCriterion("ZuiHouDengLuShiJian between", value1, value2, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andZuihoudenglushijianNotBetween(Date value1, Date value2) {
            addCriterion("ZuiHouDengLuShiJian not between", value1, value2, "zuihoudenglushijian");
            return (Criteria) this;
        }

        public Criteria andShengriIsNull() {
            addCriterion("ShengRi is null");
            return (Criteria) this;
        }

        public Criteria andShengriIsNotNull() {
            addCriterion("ShengRi is not null");
            return (Criteria) this;
        }

        public Criteria andShengriEqualTo(Date value) {
            addCriterionForJDBCDate("ShengRi =", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotEqualTo(Date value) {
            addCriterionForJDBCDate("ShengRi <>", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriGreaterThan(Date value) {
            addCriterionForJDBCDate("ShengRi >", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShengRi >=", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLessThan(Date value) {
            addCriterionForJDBCDate("ShengRi <", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShengRi <=", value, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriIn(List<Date> values) {
            addCriterionForJDBCDate("ShengRi in", values, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotIn(List<Date> values) {
            addCriterionForJDBCDate("ShengRi not in", values, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShengRi between", value1, value2, "shengri");
            return (Criteria) this;
        }

        public Criteria andShengriNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShengRi not between", value1, value2, "shengri");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieIsNull() {
            addCriterion("DianPuJianJie is null");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieIsNotNull() {
            addCriterion("DianPuJianJie is not null");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieEqualTo(String value) {
            addCriterion("DianPuJianJie =", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieNotEqualTo(String value) {
            addCriterion("DianPuJianJie <>", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieGreaterThan(String value) {
            addCriterion("DianPuJianJie >", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieGreaterThanOrEqualTo(String value) {
            addCriterion("DianPuJianJie >=", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieLessThan(String value) {
            addCriterion("DianPuJianJie <", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieLessThanOrEqualTo(String value) {
            addCriterion("DianPuJianJie <=", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieLike(String value) {
            addCriterion("DianPuJianJie like", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieNotLike(String value) {
            addCriterion("DianPuJianJie not like", value, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieIn(List<String> values) {
            addCriterion("DianPuJianJie in", values, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieNotIn(List<String> values) {
            addCriterion("DianPuJianJie not in", values, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieBetween(String value1, String value2) {
            addCriterion("DianPuJianJie between", value1, value2, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andDianpujianjieNotBetween(String value1, String value2) {
            addCriterion("DianPuJianJie not between", value1, value2, "dianpujianjie");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoIsNull() {
            addCriterion("ZiWoJieShao is null");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoIsNotNull() {
            addCriterion("ZiWoJieShao is not null");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoEqualTo(String value) {
            addCriterion("ZiWoJieShao =", value, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoNotEqualTo(String value) {
            addCriterion("ZiWoJieShao <>", value, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoGreaterThan(String value) {
            addCriterion("ZiWoJieShao >", value, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoGreaterThanOrEqualTo(String value) {
            addCriterion("ZiWoJieShao >=", value, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoLessThan(String value) {
            addCriterion("ZiWoJieShao <", value, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoLessThanOrEqualTo(String value) {
            addCriterion("ZiWoJieShao <=", value, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoLike(String value) {
            addCriterion("ZiWoJieShao like", value, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoNotLike(String value) {
            addCriterion("ZiWoJieShao not like", value, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoIn(List<String> values) {
            addCriterion("ZiWoJieShao in", values, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoNotIn(List<String> values) {
            addCriterion("ZiWoJieShao not in", values, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoBetween(String value1, String value2) {
            addCriterion("ZiWoJieShao between", value1, value2, "ziwojieshao");
            return (Criteria) this;
        }

        public Criteria andZiwojieshaoNotBetween(String value1, String value2) {
            addCriterion("ZiWoJieShao not between", value1, value2, "ziwojieshao");
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

        public Criteria andHangyeleixingidIsNull() {
            addCriterion("HangYeLeiXingID is null");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidIsNotNull() {
            addCriterion("HangYeLeiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidEqualTo(Integer value) {
            addCriterion("HangYeLeiXingID =", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidNotEqualTo(Integer value) {
            addCriterion("HangYeLeiXingID <>", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidGreaterThan(Integer value) {
            addCriterion("HangYeLeiXingID >", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HangYeLeiXingID >=", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidLessThan(Integer value) {
            addCriterion("HangYeLeiXingID <", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidLessThanOrEqualTo(Integer value) {
            addCriterion("HangYeLeiXingID <=", value, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidIn(List<Integer> values) {
            addCriterion("HangYeLeiXingID in", values, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidNotIn(List<Integer> values) {
            addCriterion("HangYeLeiXingID not in", values, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidBetween(Integer value1, Integer value2) {
            addCriterion("HangYeLeiXingID between", value1, value2, "hangyeleixingid");
            return (Criteria) this;
        }

        public Criteria andHangyeleixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("HangYeLeiXingID not between", value1, value2, "hangyeleixingid");
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

        public Criteria andJiamengzhuangtaiIsNull() {
            addCriterion("JiaMengZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiIsNotNull() {
            addCriterion("JiaMengZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiEqualTo(Integer value) {
            addCriterion("JiaMengZhuangTai =", value, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiNotEqualTo(Integer value) {
            addCriterion("JiaMengZhuangTai <>", value, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiGreaterThan(Integer value) {
            addCriterion("JiaMengZhuangTai >", value, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiaMengZhuangTai >=", value, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiLessThan(Integer value) {
            addCriterion("JiaMengZhuangTai <", value, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("JiaMengZhuangTai <=", value, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiIn(List<Integer> values) {
            addCriterion("JiaMengZhuangTai in", values, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiNotIn(List<Integer> values) {
            addCriterion("JiaMengZhuangTai not in", values, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("JiaMengZhuangTai between", value1, value2, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andJiamengzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("JiaMengZhuangTai not between", value1, value2, "jiamengzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenIsNull() {
            addCriterion("ShiFouDingYueXinWen is null");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenIsNotNull() {
            addCriterion("ShiFouDingYueXinWen is not null");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenEqualTo(Integer value) {
            addCriterion("ShiFouDingYueXinWen =", value, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenNotEqualTo(Integer value) {
            addCriterion("ShiFouDingYueXinWen <>", value, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenGreaterThan(Integer value) {
            addCriterion("ShiFouDingYueXinWen >", value, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouDingYueXinWen >=", value, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenLessThan(Integer value) {
            addCriterion("ShiFouDingYueXinWen <", value, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouDingYueXinWen <=", value, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenIn(List<Integer> values) {
            addCriterion("ShiFouDingYueXinWen in", values, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenNotIn(List<Integer> values) {
            addCriterion("ShiFouDingYueXinWen not in", values, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouDingYueXinWen between", value1, value2, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andShifoudingyuexinwenNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouDingYueXinWen not between", value1, value2, "shifoudingyuexinwen");
            return (Criteria) this;
        }

        public Criteria andChongzhimaIsNull() {
            addCriterion("ChongZhiMa is null");
            return (Criteria) this;
        }

        public Criteria andChongzhimaIsNotNull() {
            addCriterion("ChongZhiMa is not null");
            return (Criteria) this;
        }

        public Criteria andChongzhimaEqualTo(String value) {
            addCriterion("ChongZhiMa =", value, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaNotEqualTo(String value) {
            addCriterion("ChongZhiMa <>", value, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaGreaterThan(String value) {
            addCriterion("ChongZhiMa >", value, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaGreaterThanOrEqualTo(String value) {
            addCriterion("ChongZhiMa >=", value, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaLessThan(String value) {
            addCriterion("ChongZhiMa <", value, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaLessThanOrEqualTo(String value) {
            addCriterion("ChongZhiMa <=", value, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaLike(String value) {
            addCriterion("ChongZhiMa like", value, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaNotLike(String value) {
            addCriterion("ChongZhiMa not like", value, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaIn(List<String> values) {
            addCriterion("ChongZhiMa in", values, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaNotIn(List<String> values) {
            addCriterion("ChongZhiMa not in", values, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaBetween(String value1, String value2) {
            addCriterion("ChongZhiMa between", value1, value2, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimaNotBetween(String value1, String value2) {
            addCriterion("ChongZhiMa not between", value1, value2, "chongzhima");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianIsNull() {
            addCriterion("ChongZhiMaChuangJianShiJian is null");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianIsNotNull() {
            addCriterion("ChongZhiMaChuangJianShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianEqualTo(Date value) {
            addCriterion("ChongZhiMaChuangJianShiJian =", value, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianNotEqualTo(Date value) {
            addCriterion("ChongZhiMaChuangJianShiJian <>", value, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianGreaterThan(Date value) {
            addCriterion("ChongZhiMaChuangJianShiJian >", value, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ChongZhiMaChuangJianShiJian >=", value, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianLessThan(Date value) {
            addCriterion("ChongZhiMaChuangJianShiJian <", value, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianLessThanOrEqualTo(Date value) {
            addCriterion("ChongZhiMaChuangJianShiJian <=", value, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianIn(List<Date> values) {
            addCriterion("ChongZhiMaChuangJianShiJian in", values, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianNotIn(List<Date> values) {
            addCriterion("ChongZhiMaChuangJianShiJian not in", values, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianBetween(Date value1, Date value2) {
            addCriterion("ChongZhiMaChuangJianShiJian between", value1, value2, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChongzhimachuangjianshijianNotBetween(Date value1, Date value2) {
            addCriterion("ChongZhiMaChuangJianShiJian not between", value1, value2, "chongzhimachuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andInsertFlagIsNull() {
            addCriterion("insert_flag is null");
            return (Criteria) this;
        }

        public Criteria andInsertFlagIsNotNull() {
            addCriterion("insert_flag is not null");
            return (Criteria) this;
        }

        public Criteria andInsertFlagEqualTo(Integer value) {
            addCriterion("insert_flag =", value, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagNotEqualTo(Integer value) {
            addCriterion("insert_flag <>", value, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagGreaterThan(Integer value) {
            addCriterion("insert_flag >", value, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("insert_flag >=", value, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagLessThan(Integer value) {
            addCriterion("insert_flag <", value, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagLessThanOrEqualTo(Integer value) {
            addCriterion("insert_flag <=", value, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagIn(List<Integer> values) {
            addCriterion("insert_flag in", values, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagNotIn(List<Integer> values) {
            addCriterion("insert_flag not in", values, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagBetween(Integer value1, Integer value2) {
            addCriterion("insert_flag between", value1, value2, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andInsertFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("insert_flag not between", value1, value2, "insertFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNull() {
            addCriterion("update_flag is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIsNotNull() {
            addCriterion("update_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagEqualTo(Integer value) {
            addCriterion("update_flag =", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotEqualTo(Integer value) {
            addCriterion("update_flag <>", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThan(Integer value) {
            addCriterion("update_flag >", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_flag >=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThan(Integer value) {
            addCriterion("update_flag <", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagLessThanOrEqualTo(Integer value) {
            addCriterion("update_flag <=", value, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagIn(List<Integer> values) {
            addCriterion("update_flag in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotIn(List<Integer> values) {
            addCriterion("update_flag not in", values, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagBetween(Integer value1, Integer value2) {
            addCriterion("update_flag between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("update_flag not between", value1, value2, "updateFlag");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNull() {
            addCriterion("isRead is null");
            return (Criteria) this;
        }

        public Criteria andIsreadIsNotNull() {
            addCriterion("isRead is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadEqualTo(Integer value) {
            addCriterion("isRead =", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotEqualTo(Integer value) {
            addCriterion("isRead <>", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThan(Integer value) {
            addCriterion("isRead >", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadGreaterThanOrEqualTo(Integer value) {
            addCriterion("isRead >=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThan(Integer value) {
            addCriterion("isRead <", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadLessThanOrEqualTo(Integer value) {
            addCriterion("isRead <=", value, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadIn(List<Integer> values) {
            addCriterion("isRead in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotIn(List<Integer> values) {
            addCriterion("isRead not in", values, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadBetween(Integer value1, Integer value2) {
            addCriterion("isRead between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andIsreadNotBetween(Integer value1, Integer value2) {
            addCriterion("isRead not between", value1, value2, "isread");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingIsNull() {
            addCriterion("DianPuMuBanLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingIsNotNull() {
            addCriterion("DianPuMuBanLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingEqualTo(Integer value) {
            addCriterion("DianPuMuBanLeiXing =", value, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingNotEqualTo(Integer value) {
            addCriterion("DianPuMuBanLeiXing <>", value, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingGreaterThan(Integer value) {
            addCriterion("DianPuMuBanLeiXing >", value, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("DianPuMuBanLeiXing >=", value, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingLessThan(Integer value) {
            addCriterion("DianPuMuBanLeiXing <", value, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingLessThanOrEqualTo(Integer value) {
            addCriterion("DianPuMuBanLeiXing <=", value, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingIn(List<Integer> values) {
            addCriterion("DianPuMuBanLeiXing in", values, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingNotIn(List<Integer> values) {
            addCriterion("DianPuMuBanLeiXing not in", values, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingBetween(Integer value1, Integer value2) {
            addCriterion("DianPuMuBanLeiXing between", value1, value2, "dianpumubanleixing");
            return (Criteria) this;
        }

        public Criteria andDianpumubanleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("DianPuMuBanLeiXing not between", value1, value2, "dianpumubanleixing");
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