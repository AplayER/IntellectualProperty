package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubApplicationExample() {
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

        public Criteria andQiuzhiidIsNull() {
            addCriterion("QiuZhiID is null");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidIsNotNull() {
            addCriterion("QiuZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidEqualTo(Integer value) {
            addCriterion("QiuZhiID =", value, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidNotEqualTo(Integer value) {
            addCriterion("QiuZhiID <>", value, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidGreaterThan(Integer value) {
            addCriterion("QiuZhiID >", value, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QiuZhiID >=", value, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidLessThan(Integer value) {
            addCriterion("QiuZhiID <", value, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidLessThanOrEqualTo(Integer value) {
            addCriterion("QiuZhiID <=", value, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidIn(List<Integer> values) {
            addCriterion("QiuZhiID in", values, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidNotIn(List<Integer> values) {
            addCriterion("QiuZhiID not in", values, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidBetween(Integer value1, Integer value2) {
            addCriterion("QiuZhiID between", value1, value2, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("QiuZhiID not between", value1, value2, "qiuzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiIsNull() {
            addCriterion("QiuZhiBiaoTi is null");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiIsNotNull() {
            addCriterion("QiuZhiBiaoTi is not null");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiEqualTo(String value) {
            addCriterion("QiuZhiBiaoTi =", value, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiNotEqualTo(String value) {
            addCriterion("QiuZhiBiaoTi <>", value, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiGreaterThan(String value) {
            addCriterion("QiuZhiBiaoTi >", value, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("QiuZhiBiaoTi >=", value, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiLessThan(String value) {
            addCriterion("QiuZhiBiaoTi <", value, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiLessThanOrEqualTo(String value) {
            addCriterion("QiuZhiBiaoTi <=", value, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiLike(String value) {
            addCriterion("QiuZhiBiaoTi like", value, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiNotLike(String value) {
            addCriterion("QiuZhiBiaoTi not like", value, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiIn(List<String> values) {
            addCriterion("QiuZhiBiaoTi in", values, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiNotIn(List<String> values) {
            addCriterion("QiuZhiBiaoTi not in", values, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiBetween(String value1, String value2) {
            addCriterion("QiuZhiBiaoTi between", value1, value2, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andQiuzhibiaotiNotBetween(String value1, String value2) {
            addCriterion("QiuZhiBiaoTi not between", value1, value2, "qiuzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andLururenidIsNull() {
            addCriterion("LuRuRenID is null");
            return (Criteria) this;
        }

        public Criteria andLururenidIsNotNull() {
            addCriterion("LuRuRenID is not null");
            return (Criteria) this;
        }

        public Criteria andLururenidEqualTo(Integer value) {
            addCriterion("LuRuRenID =", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidNotEqualTo(Integer value) {
            addCriterion("LuRuRenID <>", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidGreaterThan(Integer value) {
            addCriterion("LuRuRenID >", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LuRuRenID >=", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidLessThan(Integer value) {
            addCriterion("LuRuRenID <", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidLessThanOrEqualTo(Integer value) {
            addCriterion("LuRuRenID <=", value, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidIn(List<Integer> values) {
            addCriterion("LuRuRenID in", values, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidNotIn(List<Integer> values) {
            addCriterion("LuRuRenID not in", values, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidBetween(Integer value1, Integer value2) {
            addCriterion("LuRuRenID between", value1, value2, "lururenid");
            return (Criteria) this;
        }

        public Criteria andLururenidNotBetween(Integer value1, Integer value2) {
            addCriterion("LuRuRenID not between", value1, value2, "lururenid");
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

        public Criteria andXingbieIsNull() {
            addCriterion("XingBie is null");
            return (Criteria) this;
        }

        public Criteria andXingbieIsNotNull() {
            addCriterion("XingBie is not null");
            return (Criteria) this;
        }

        public Criteria andXingbieEqualTo(Integer value) {
            addCriterion("XingBie =", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotEqualTo(Integer value) {
            addCriterion("XingBie <>", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThan(Integer value) {
            addCriterion("XingBie >", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieGreaterThanOrEqualTo(Integer value) {
            addCriterion("XingBie >=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThan(Integer value) {
            addCriterion("XingBie <", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieLessThanOrEqualTo(Integer value) {
            addCriterion("XingBie <=", value, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieIn(List<Integer> values) {
            addCriterion("XingBie in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotIn(List<Integer> values) {
            addCriterion("XingBie not in", values, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieBetween(Integer value1, Integer value2) {
            addCriterion("XingBie between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andXingbieNotBetween(Integer value1, Integer value2) {
            addCriterion("XingBie not between", value1, value2, "xingbie");
            return (Criteria) this;
        }

        public Criteria andShifouyihunIsNull() {
            addCriterion("ShiFouYiHun is null");
            return (Criteria) this;
        }

        public Criteria andShifouyihunIsNotNull() {
            addCriterion("ShiFouYiHun is not null");
            return (Criteria) this;
        }

        public Criteria andShifouyihunEqualTo(Integer value) {
            addCriterion("ShiFouYiHun =", value, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunNotEqualTo(Integer value) {
            addCriterion("ShiFouYiHun <>", value, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunGreaterThan(Integer value) {
            addCriterion("ShiFouYiHun >", value, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYiHun >=", value, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunLessThan(Integer value) {
            addCriterion("ShiFouYiHun <", value, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYiHun <=", value, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunIn(List<Integer> values) {
            addCriterion("ShiFouYiHun in", values, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunNotIn(List<Integer> values) {
            addCriterion("ShiFouYiHun not in", values, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYiHun between", value1, value2, "shifouyihun");
            return (Criteria) this;
        }

        public Criteria andShifouyihunNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYiHun not between", value1, value2, "shifouyihun");
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

        public Criteria andShoujiIsNull() {
            addCriterion("ShouJi is null");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNotNull() {
            addCriterion("ShouJi is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiEqualTo(String value) {
            addCriterion("ShouJi =", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotEqualTo(String value) {
            addCriterion("ShouJi <>", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThan(String value) {
            addCriterion("ShouJi >", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("ShouJi >=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThan(String value) {
            addCriterion("ShouJi <", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThanOrEqualTo(String value) {
            addCriterion("ShouJi <=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLike(String value) {
            addCriterion("ShouJi like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotLike(String value) {
            addCriterion("ShouJi not like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiIn(List<String> values) {
            addCriterion("ShouJi in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotIn(List<String> values) {
            addCriterion("ShouJi not in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiBetween(String value1, String value2) {
            addCriterion("ShouJi between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotBetween(String value1, String value2) {
            addCriterion("ShouJi not between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIsNull() {
            addCriterion("GuDingDianHua is null");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIsNotNull() {
            addCriterion("GuDingDianHua is not null");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaEqualTo(String value) {
            addCriterion("GuDingDianHua =", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotEqualTo(String value) {
            addCriterion("GuDingDianHua <>", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaGreaterThan(String value) {
            addCriterion("GuDingDianHua >", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("GuDingDianHua >=", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLessThan(String value) {
            addCriterion("GuDingDianHua <", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLessThanOrEqualTo(String value) {
            addCriterion("GuDingDianHua <=", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLike(String value) {
            addCriterion("GuDingDianHua like", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotLike(String value) {
            addCriterion("GuDingDianHua not like", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIn(List<String> values) {
            addCriterion("GuDingDianHua in", values, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotIn(List<String> values) {
            addCriterion("GuDingDianHua not in", values, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaBetween(String value1, String value2) {
            addCriterion("GuDingDianHua between", value1, value2, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotBetween(String value1, String value2) {
            addCriterion("GuDingDianHua not between", value1, value2, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIsNull() {
            addCriterion("DianZiYouXiang is null");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIsNotNull() {
            addCriterion("DianZiYouXiang is not null");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangEqualTo(String value) {
            addCriterion("DianZiYouXiang =", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotEqualTo(String value) {
            addCriterion("DianZiYouXiang <>", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangGreaterThan(String value) {
            addCriterion("DianZiYouXiang >", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("DianZiYouXiang >=", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLessThan(String value) {
            addCriterion("DianZiYouXiang <", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLessThanOrEqualTo(String value) {
            addCriterion("DianZiYouXiang <=", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangLike(String value) {
            addCriterion("DianZiYouXiang like", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotLike(String value) {
            addCriterion("DianZiYouXiang not like", value, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangIn(List<String> values) {
            addCriterion("DianZiYouXiang in", values, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotIn(List<String> values) {
            addCriterion("DianZiYouXiang not in", values, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangBetween(String value1, String value2) {
            addCriterion("DianZiYouXiang between", value1, value2, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andDianziyouxiangNotBetween(String value1, String value2) {
            addCriterion("DianZiYouXiang not between", value1, value2, "dianziyouxiang");
            return (Criteria) this;
        }

        public Criteria andXueliidIsNull() {
            addCriterion("XueLiID is null");
            return (Criteria) this;
        }

        public Criteria andXueliidIsNotNull() {
            addCriterion("XueLiID is not null");
            return (Criteria) this;
        }

        public Criteria andXueliidEqualTo(Integer value) {
            addCriterion("XueLiID =", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotEqualTo(Integer value) {
            addCriterion("XueLiID <>", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidGreaterThan(Integer value) {
            addCriterion("XueLiID >", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XueLiID >=", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidLessThan(Integer value) {
            addCriterion("XueLiID <", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidLessThanOrEqualTo(Integer value) {
            addCriterion("XueLiID <=", value, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidIn(List<Integer> values) {
            addCriterion("XueLiID in", values, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotIn(List<Integer> values) {
            addCriterion("XueLiID not in", values, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidBetween(Integer value1, Integer value2) {
            addCriterion("XueLiID between", value1, value2, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliidNotBetween(Integer value1, Integer value2) {
            addCriterion("XueLiID not between", value1, value2, "xueliid");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("XueLi is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("XueLi is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("XueLi =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("XueLi <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("XueLi >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("XueLi >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("XueLi <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("XueLi <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("XueLi like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("XueLi not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("XueLi in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("XueLi not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("XueLi between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("XueLi not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoIsNull() {
            addCriterion("BiYeYuanXiao is null");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoIsNotNull() {
            addCriterion("BiYeYuanXiao is not null");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoEqualTo(String value) {
            addCriterion("BiYeYuanXiao =", value, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoNotEqualTo(String value) {
            addCriterion("BiYeYuanXiao <>", value, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoGreaterThan(String value) {
            addCriterion("BiYeYuanXiao >", value, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoGreaterThanOrEqualTo(String value) {
            addCriterion("BiYeYuanXiao >=", value, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoLessThan(String value) {
            addCriterion("BiYeYuanXiao <", value, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoLessThanOrEqualTo(String value) {
            addCriterion("BiYeYuanXiao <=", value, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoLike(String value) {
            addCriterion("BiYeYuanXiao like", value, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoNotLike(String value) {
            addCriterion("BiYeYuanXiao not like", value, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoIn(List<String> values) {
            addCriterion("BiYeYuanXiao in", values, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoNotIn(List<String> values) {
            addCriterion("BiYeYuanXiao not in", values, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoBetween(String value1, String value2) {
            addCriterion("BiYeYuanXiao between", value1, value2, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andBiyeyuanxiaoNotBetween(String value1, String value2) {
            addCriterion("BiYeYuanXiao not between", value1, value2, "biyeyuanxiao");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNull() {
            addCriterion("ZhuanYe is null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIsNotNull() {
            addCriterion("ZhuanYe is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanyeEqualTo(String value) {
            addCriterion("ZhuanYe =", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotEqualTo(String value) {
            addCriterion("ZhuanYe <>", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThan(String value) {
            addCriterion("ZhuanYe >", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeGreaterThanOrEqualTo(String value) {
            addCriterion("ZhuanYe >=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThan(String value) {
            addCriterion("ZhuanYe <", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLessThanOrEqualTo(String value) {
            addCriterion("ZhuanYe <=", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeLike(String value) {
            addCriterion("ZhuanYe like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotLike(String value) {
            addCriterion("ZhuanYe not like", value, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeIn(List<String> values) {
            addCriterion("ZhuanYe in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotIn(List<String> values) {
            addCriterion("ZhuanYe not in", values, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeBetween(String value1, String value2) {
            addCriterion("ZhuanYe between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andZhuanyeNotBetween(String value1, String value2) {
            addCriterion("ZhuanYe not between", value1, value2, "zhuanye");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidIsNull() {
            addCriterion("GongZuoJingYanID is null");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidIsNotNull() {
            addCriterion("GongZuoJingYanID is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidEqualTo(Integer value) {
            addCriterion("GongZuoJingYanID =", value, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidNotEqualTo(Integer value) {
            addCriterion("GongZuoJingYanID <>", value, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidGreaterThan(Integer value) {
            addCriterion("GongZuoJingYanID >", value, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GongZuoJingYanID >=", value, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidLessThan(Integer value) {
            addCriterion("GongZuoJingYanID <", value, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidLessThanOrEqualTo(Integer value) {
            addCriterion("GongZuoJingYanID <=", value, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidIn(List<Integer> values) {
            addCriterion("GongZuoJingYanID in", values, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidNotIn(List<Integer> values) {
            addCriterion("GongZuoJingYanID not in", values, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidBetween(Integer value1, Integer value2) {
            addCriterion("GongZuoJingYanID between", value1, value2, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanidNotBetween(Integer value1, Integer value2) {
            addCriterion("GongZuoJingYanID not between", value1, value2, "gongzuojingyanid");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanIsNull() {
            addCriterion("GongZuoJingYan is null");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanIsNotNull() {
            addCriterion("GongZuoJingYan is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanEqualTo(String value) {
            addCriterion("GongZuoJingYan =", value, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanNotEqualTo(String value) {
            addCriterion("GongZuoJingYan <>", value, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanGreaterThan(String value) {
            addCriterion("GongZuoJingYan >", value, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanGreaterThanOrEqualTo(String value) {
            addCriterion("GongZuoJingYan >=", value, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanLessThan(String value) {
            addCriterion("GongZuoJingYan <", value, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanLessThanOrEqualTo(String value) {
            addCriterion("GongZuoJingYan <=", value, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanLike(String value) {
            addCriterion("GongZuoJingYan like", value, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanNotLike(String value) {
            addCriterion("GongZuoJingYan not like", value, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanIn(List<String> values) {
            addCriterion("GongZuoJingYan in", values, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanNotIn(List<String> values) {
            addCriterion("GongZuoJingYan not in", values, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanBetween(String value1, String value2) {
            addCriterion("GongZuoJingYan between", value1, value2, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andGongzuojingyanNotBetween(String value1, String value2) {
            addCriterion("GongZuoJingYan not between", value1, value2, "gongzuojingyan");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidIsNull() {
            addCriterion("DangQianSuoZaiDiID is null");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidIsNotNull() {
            addCriterion("DangQianSuoZaiDiID is not null");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidEqualTo(Integer value) {
            addCriterion("DangQianSuoZaiDiID =", value, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidNotEqualTo(Integer value) {
            addCriterion("DangQianSuoZaiDiID <>", value, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidGreaterThan(Integer value) {
            addCriterion("DangQianSuoZaiDiID >", value, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DangQianSuoZaiDiID >=", value, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidLessThan(Integer value) {
            addCriterion("DangQianSuoZaiDiID <", value, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidLessThanOrEqualTo(Integer value) {
            addCriterion("DangQianSuoZaiDiID <=", value, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidIn(List<Integer> values) {
            addCriterion("DangQianSuoZaiDiID in", values, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidNotIn(List<Integer> values) {
            addCriterion("DangQianSuoZaiDiID not in", values, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidBetween(Integer value1, Integer value2) {
            addCriterion("DangQianSuoZaiDiID between", value1, value2, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaidiidNotBetween(Integer value1, Integer value2) {
            addCriterion("DangQianSuoZaiDiID not between", value1, value2, "dangqiansuozaidiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidIsNull() {
            addCriterion("DangQianSuoZaiShiID is null");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidIsNotNull() {
            addCriterion("DangQianSuoZaiShiID is not null");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidEqualTo(Integer value) {
            addCriterion("DangQianSuoZaiShiID =", value, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidNotEqualTo(Integer value) {
            addCriterion("DangQianSuoZaiShiID <>", value, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidGreaterThan(Integer value) {
            addCriterion("DangQianSuoZaiShiID >", value, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DangQianSuoZaiShiID >=", value, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidLessThan(Integer value) {
            addCriterion("DangQianSuoZaiShiID <", value, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidLessThanOrEqualTo(Integer value) {
            addCriterion("DangQianSuoZaiShiID <=", value, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidIn(List<Integer> values) {
            addCriterion("DangQianSuoZaiShiID in", values, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidNotIn(List<Integer> values) {
            addCriterion("DangQianSuoZaiShiID not in", values, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidBetween(Integer value1, Integer value2) {
            addCriterion("DangQianSuoZaiShiID between", value1, value2, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiidNotBetween(Integer value1, Integer value2) {
            addCriterion("DangQianSuoZaiShiID not between", value1, value2, "dangqiansuozaishiid");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengIsNull() {
            addCriterion("DangQianSuoZaiSheng is null");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengIsNotNull() {
            addCriterion("DangQianSuoZaiSheng is not null");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengEqualTo(String value) {
            addCriterion("DangQianSuoZaiSheng =", value, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengNotEqualTo(String value) {
            addCriterion("DangQianSuoZaiSheng <>", value, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengGreaterThan(String value) {
            addCriterion("DangQianSuoZaiSheng >", value, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengGreaterThanOrEqualTo(String value) {
            addCriterion("DangQianSuoZaiSheng >=", value, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengLessThan(String value) {
            addCriterion("DangQianSuoZaiSheng <", value, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengLessThanOrEqualTo(String value) {
            addCriterion("DangQianSuoZaiSheng <=", value, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengLike(String value) {
            addCriterion("DangQianSuoZaiSheng like", value, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengNotLike(String value) {
            addCriterion("DangQianSuoZaiSheng not like", value, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengIn(List<String> values) {
            addCriterion("DangQianSuoZaiSheng in", values, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengNotIn(List<String> values) {
            addCriterion("DangQianSuoZaiSheng not in", values, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengBetween(String value1, String value2) {
            addCriterion("DangQianSuoZaiSheng between", value1, value2, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishengNotBetween(String value1, String value2) {
            addCriterion("DangQianSuoZaiSheng not between", value1, value2, "dangqiansuozaisheng");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiIsNull() {
            addCriterion("DangQianSuoZaiShi is null");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiIsNotNull() {
            addCriterion("DangQianSuoZaiShi is not null");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiEqualTo(String value) {
            addCriterion("DangQianSuoZaiShi =", value, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiNotEqualTo(String value) {
            addCriterion("DangQianSuoZaiShi <>", value, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiGreaterThan(String value) {
            addCriterion("DangQianSuoZaiShi >", value, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiGreaterThanOrEqualTo(String value) {
            addCriterion("DangQianSuoZaiShi >=", value, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiLessThan(String value) {
            addCriterion("DangQianSuoZaiShi <", value, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiLessThanOrEqualTo(String value) {
            addCriterion("DangQianSuoZaiShi <=", value, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiLike(String value) {
            addCriterion("DangQianSuoZaiShi like", value, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiNotLike(String value) {
            addCriterion("DangQianSuoZaiShi not like", value, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiIn(List<String> values) {
            addCriterion("DangQianSuoZaiShi in", values, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiNotIn(List<String> values) {
            addCriterion("DangQianSuoZaiShi not in", values, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiBetween(String value1, String value2) {
            addCriterion("DangQianSuoZaiShi between", value1, value2, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andDangqiansuozaishiNotBetween(String value1, String value2) {
            addCriterion("DangQianSuoZaiShi not between", value1, value2, "dangqiansuozaishi");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlIsNull() {
            addCriterion("ZhaoPianURL is null");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlIsNotNull() {
            addCriterion("ZhaoPianURL is not null");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlEqualTo(String value) {
            addCriterion("ZhaoPianURL =", value, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlNotEqualTo(String value) {
            addCriterion("ZhaoPianURL <>", value, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlGreaterThan(String value) {
            addCriterion("ZhaoPianURL >", value, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlGreaterThanOrEqualTo(String value) {
            addCriterion("ZhaoPianURL >=", value, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlLessThan(String value) {
            addCriterion("ZhaoPianURL <", value, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlLessThanOrEqualTo(String value) {
            addCriterion("ZhaoPianURL <=", value, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlLike(String value) {
            addCriterion("ZhaoPianURL like", value, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlNotLike(String value) {
            addCriterion("ZhaoPianURL not like", value, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlIn(List<String> values) {
            addCriterion("ZhaoPianURL in", values, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlNotIn(List<String> values) {
            addCriterion("ZhaoPianURL not in", values, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlBetween(String value1, String value2) {
            addCriterion("ZhaoPianURL between", value1, value2, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andZhaopianurlNotBetween(String value1, String value2) {
            addCriterion("ZhaoPianURL not between", value1, value2, "zhaopianurl");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidIsNull() {
            addCriterion("QiuZhiXingZhiID is null");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidIsNotNull() {
            addCriterion("QiuZhiXingZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidEqualTo(Integer value) {
            addCriterion("QiuZhiXingZhiID =", value, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidNotEqualTo(Integer value) {
            addCriterion("QiuZhiXingZhiID <>", value, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidGreaterThan(Integer value) {
            addCriterion("QiuZhiXingZhiID >", value, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QiuZhiXingZhiID >=", value, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidLessThan(Integer value) {
            addCriterion("QiuZhiXingZhiID <", value, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidLessThanOrEqualTo(Integer value) {
            addCriterion("QiuZhiXingZhiID <=", value, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidIn(List<Integer> values) {
            addCriterion("QiuZhiXingZhiID in", values, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidNotIn(List<Integer> values) {
            addCriterion("QiuZhiXingZhiID not in", values, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidBetween(Integer value1, Integer value2) {
            addCriterion("QiuZhiXingZhiID between", value1, value2, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiuzhixingzhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("QiuZhiXingZhiID not between", value1, value2, "qiuzhixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidIsNull() {
            addCriterion("QiWangDanWeiXingZhiID is null");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidIsNotNull() {
            addCriterion("QiWangDanWeiXingZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidEqualTo(Integer value) {
            addCriterion("QiWangDanWeiXingZhiID =", value, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidNotEqualTo(Integer value) {
            addCriterion("QiWangDanWeiXingZhiID <>", value, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidGreaterThan(Integer value) {
            addCriterion("QiWangDanWeiXingZhiID >", value, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QiWangDanWeiXingZhiID >=", value, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidLessThan(Integer value) {
            addCriterion("QiWangDanWeiXingZhiID <", value, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidLessThanOrEqualTo(Integer value) {
            addCriterion("QiWangDanWeiXingZhiID <=", value, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidIn(List<Integer> values) {
            addCriterion("QiWangDanWeiXingZhiID in", values, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidNotIn(List<Integer> values) {
            addCriterion("QiWangDanWeiXingZhiID not in", values, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidBetween(Integer value1, Integer value2) {
            addCriterion("QiWangDanWeiXingZhiID between", value1, value2, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("QiWangDanWeiXingZhiID not between", value1, value2, "qiwangdanweixingzhiid");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiIsNull() {
            addCriterion("QiWangDanWeiXingZhi is null");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiIsNotNull() {
            addCriterion("QiWangDanWeiXingZhi is not null");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiEqualTo(String value) {
            addCriterion("QiWangDanWeiXingZhi =", value, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiNotEqualTo(String value) {
            addCriterion("QiWangDanWeiXingZhi <>", value, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiGreaterThan(String value) {
            addCriterion("QiWangDanWeiXingZhi >", value, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("QiWangDanWeiXingZhi >=", value, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiLessThan(String value) {
            addCriterion("QiWangDanWeiXingZhi <", value, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiLessThanOrEqualTo(String value) {
            addCriterion("QiWangDanWeiXingZhi <=", value, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiLike(String value) {
            addCriterion("QiWangDanWeiXingZhi like", value, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiNotLike(String value) {
            addCriterion("QiWangDanWeiXingZhi not like", value, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiIn(List<String> values) {
            addCriterion("QiWangDanWeiXingZhi in", values, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiNotIn(List<String> values) {
            addCriterion("QiWangDanWeiXingZhi not in", values, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiBetween(String value1, String value2) {
            addCriterion("QiWangDanWeiXingZhi between", value1, value2, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andQiwangdanweixingzhiNotBetween(String value1, String value2) {
            addCriterion("QiWangDanWeiXingZhi not between", value1, value2, "qiwangdanweixingzhi");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidIsNull() {
            addCriterion("HangYeYiXiangID is null");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidIsNotNull() {
            addCriterion("HangYeYiXiangID is not null");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidEqualTo(Integer value) {
            addCriterion("HangYeYiXiangID =", value, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidNotEqualTo(Integer value) {
            addCriterion("HangYeYiXiangID <>", value, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidGreaterThan(Integer value) {
            addCriterion("HangYeYiXiangID >", value, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HangYeYiXiangID >=", value, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidLessThan(Integer value) {
            addCriterion("HangYeYiXiangID <", value, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidLessThanOrEqualTo(Integer value) {
            addCriterion("HangYeYiXiangID <=", value, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidIn(List<Integer> values) {
            addCriterion("HangYeYiXiangID in", values, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidNotIn(List<Integer> values) {
            addCriterion("HangYeYiXiangID not in", values, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidBetween(Integer value1, Integer value2) {
            addCriterion("HangYeYiXiangID between", value1, value2, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangidNotBetween(Integer value1, Integer value2) {
            addCriterion("HangYeYiXiangID not between", value1, value2, "hangyeyixiangid");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangIsNull() {
            addCriterion("HangYeYiXiang is null");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangIsNotNull() {
            addCriterion("HangYeYiXiang is not null");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangEqualTo(String value) {
            addCriterion("HangYeYiXiang =", value, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangNotEqualTo(String value) {
            addCriterion("HangYeYiXiang <>", value, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangGreaterThan(String value) {
            addCriterion("HangYeYiXiang >", value, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangGreaterThanOrEqualTo(String value) {
            addCriterion("HangYeYiXiang >=", value, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangLessThan(String value) {
            addCriterion("HangYeYiXiang <", value, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangLessThanOrEqualTo(String value) {
            addCriterion("HangYeYiXiang <=", value, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangLike(String value) {
            addCriterion("HangYeYiXiang like", value, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangNotLike(String value) {
            addCriterion("HangYeYiXiang not like", value, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangIn(List<String> values) {
            addCriterion("HangYeYiXiang in", values, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangNotIn(List<String> values) {
            addCriterion("HangYeYiXiang not in", values, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangBetween(String value1, String value2) {
            addCriterion("HangYeYiXiang between", value1, value2, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andHangyeyixiangNotBetween(String value1, String value2) {
            addCriterion("HangYeYiXiang not between", value1, value2, "hangyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangIsNull() {
            addCriterion("ZhiYeYiXiang is null");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangIsNotNull() {
            addCriterion("ZhiYeYiXiang is not null");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangEqualTo(String value) {
            addCriterion("ZhiYeYiXiang =", value, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangNotEqualTo(String value) {
            addCriterion("ZhiYeYiXiang <>", value, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangGreaterThan(String value) {
            addCriterion("ZhiYeYiXiang >", value, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangGreaterThanOrEqualTo(String value) {
            addCriterion("ZhiYeYiXiang >=", value, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangLessThan(String value) {
            addCriterion("ZhiYeYiXiang <", value, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangLessThanOrEqualTo(String value) {
            addCriterion("ZhiYeYiXiang <=", value, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangLike(String value) {
            addCriterion("ZhiYeYiXiang like", value, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangNotLike(String value) {
            addCriterion("ZhiYeYiXiang not like", value, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangIn(List<String> values) {
            addCriterion("ZhiYeYiXiang in", values, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangNotIn(List<String> values) {
            addCriterion("ZhiYeYiXiang not in", values, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangBetween(String value1, String value2) {
            addCriterion("ZhiYeYiXiang between", value1, value2, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andZhiyeyixiangNotBetween(String value1, String value2) {
            addCriterion("ZhiYeYiXiang not between", value1, value2, "zhiyeyixiang");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidIsNull() {
            addCriterion("QiWangGongZuoDiID is null");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidIsNotNull() {
            addCriterion("QiWangGongZuoDiID is not null");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidEqualTo(Integer value) {
            addCriterion("QiWangGongZuoDiID =", value, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidNotEqualTo(Integer value) {
            addCriterion("QiWangGongZuoDiID <>", value, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidGreaterThan(Integer value) {
            addCriterion("QiWangGongZuoDiID >", value, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QiWangGongZuoDiID >=", value, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidLessThan(Integer value) {
            addCriterion("QiWangGongZuoDiID <", value, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidLessThanOrEqualTo(Integer value) {
            addCriterion("QiWangGongZuoDiID <=", value, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidIn(List<Integer> values) {
            addCriterion("QiWangGongZuoDiID in", values, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidNotIn(List<Integer> values) {
            addCriterion("QiWangGongZuoDiID not in", values, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidBetween(Integer value1, Integer value2) {
            addCriterion("QiWangGongZuoDiID between", value1, value2, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuodiidNotBetween(Integer value1, Integer value2) {
            addCriterion("QiWangGongZuoDiID not between", value1, value2, "qiwanggongzuodiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidIsNull() {
            addCriterion("QiWangGongZuoShiID is null");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidIsNotNull() {
            addCriterion("QiWangGongZuoShiID is not null");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidEqualTo(Integer value) {
            addCriterion("QiWangGongZuoShiID =", value, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidNotEqualTo(Integer value) {
            addCriterion("QiWangGongZuoShiID <>", value, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidGreaterThan(Integer value) {
            addCriterion("QiWangGongZuoShiID >", value, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QiWangGongZuoShiID >=", value, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidLessThan(Integer value) {
            addCriterion("QiWangGongZuoShiID <", value, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidLessThanOrEqualTo(Integer value) {
            addCriterion("QiWangGongZuoShiID <=", value, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidIn(List<Integer> values) {
            addCriterion("QiWangGongZuoShiID in", values, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidNotIn(List<Integer> values) {
            addCriterion("QiWangGongZuoShiID not in", values, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidBetween(Integer value1, Integer value2) {
            addCriterion("QiWangGongZuoShiID between", value1, value2, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiidNotBetween(Integer value1, Integer value2) {
            addCriterion("QiWangGongZuoShiID not between", value1, value2, "qiwanggongzuoshiid");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengIsNull() {
            addCriterion("QiWangGongZuoSheng is null");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengIsNotNull() {
            addCriterion("QiWangGongZuoSheng is not null");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengEqualTo(String value) {
            addCriterion("QiWangGongZuoSheng =", value, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengNotEqualTo(String value) {
            addCriterion("QiWangGongZuoSheng <>", value, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengGreaterThan(String value) {
            addCriterion("QiWangGongZuoSheng >", value, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengGreaterThanOrEqualTo(String value) {
            addCriterion("QiWangGongZuoSheng >=", value, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengLessThan(String value) {
            addCriterion("QiWangGongZuoSheng <", value, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengLessThanOrEqualTo(String value) {
            addCriterion("QiWangGongZuoSheng <=", value, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengLike(String value) {
            addCriterion("QiWangGongZuoSheng like", value, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengNotLike(String value) {
            addCriterion("QiWangGongZuoSheng not like", value, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengIn(List<String> values) {
            addCriterion("QiWangGongZuoSheng in", values, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengNotIn(List<String> values) {
            addCriterion("QiWangGongZuoSheng not in", values, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengBetween(String value1, String value2) {
            addCriterion("QiWangGongZuoSheng between", value1, value2, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshengNotBetween(String value1, String value2) {
            addCriterion("QiWangGongZuoSheng not between", value1, value2, "qiwanggongzuosheng");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiIsNull() {
            addCriterion("QiWangGongZuoShi is null");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiIsNotNull() {
            addCriterion("QiWangGongZuoShi is not null");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiEqualTo(String value) {
            addCriterion("QiWangGongZuoShi =", value, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiNotEqualTo(String value) {
            addCriterion("QiWangGongZuoShi <>", value, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiGreaterThan(String value) {
            addCriterion("QiWangGongZuoShi >", value, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiGreaterThanOrEqualTo(String value) {
            addCriterion("QiWangGongZuoShi >=", value, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiLessThan(String value) {
            addCriterion("QiWangGongZuoShi <", value, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiLessThanOrEqualTo(String value) {
            addCriterion("QiWangGongZuoShi <=", value, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiLike(String value) {
            addCriterion("QiWangGongZuoShi like", value, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiNotLike(String value) {
            addCriterion("QiWangGongZuoShi not like", value, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiIn(List<String> values) {
            addCriterion("QiWangGongZuoShi in", values, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiNotIn(List<String> values) {
            addCriterion("QiWangGongZuoShi not in", values, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiBetween(String value1, String value2) {
            addCriterion("QiWangGongZuoShi between", value1, value2, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwanggongzuoshiNotBetween(String value1, String value2) {
            addCriterion("QiWangGongZuoShi not between", value1, value2, "qiwanggongzuoshi");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidIsNull() {
            addCriterion("QiWangYueXinID is null");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidIsNotNull() {
            addCriterion("QiWangYueXinID is not null");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidEqualTo(Integer value) {
            addCriterion("QiWangYueXinID =", value, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidNotEqualTo(Integer value) {
            addCriterion("QiWangYueXinID <>", value, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidGreaterThan(Integer value) {
            addCriterion("QiWangYueXinID >", value, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QiWangYueXinID >=", value, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidLessThan(Integer value) {
            addCriterion("QiWangYueXinID <", value, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidLessThanOrEqualTo(Integer value) {
            addCriterion("QiWangYueXinID <=", value, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidIn(List<Integer> values) {
            addCriterion("QiWangYueXinID in", values, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidNotIn(List<Integer> values) {
            addCriterion("QiWangYueXinID not in", values, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidBetween(Integer value1, Integer value2) {
            addCriterion("QiWangYueXinID between", value1, value2, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinidNotBetween(Integer value1, Integer value2) {
            addCriterion("QiWangYueXinID not between", value1, value2, "qiwangyuexinid");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinIsNull() {
            addCriterion("QiWangYueXin is null");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinIsNotNull() {
            addCriterion("QiWangYueXin is not null");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinEqualTo(String value) {
            addCriterion("QiWangYueXin =", value, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinNotEqualTo(String value) {
            addCriterion("QiWangYueXin <>", value, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinGreaterThan(String value) {
            addCriterion("QiWangYueXin >", value, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinGreaterThanOrEqualTo(String value) {
            addCriterion("QiWangYueXin >=", value, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinLessThan(String value) {
            addCriterion("QiWangYueXin <", value, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinLessThanOrEqualTo(String value) {
            addCriterion("QiWangYueXin <=", value, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinLike(String value) {
            addCriterion("QiWangYueXin like", value, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinNotLike(String value) {
            addCriterion("QiWangYueXin not like", value, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinIn(List<String> values) {
            addCriterion("QiWangYueXin in", values, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinNotIn(List<String> values) {
            addCriterion("QiWangYueXin not in", values, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinBetween(String value1, String value2) {
            addCriterion("QiWangYueXin between", value1, value2, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andQiwangyuexinNotBetween(String value1, String value2) {
            addCriterion("QiWangYueXin not between", value1, value2, "qiwangyuexin");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidIsNull() {
            addCriterion("MuQianGongZuoZhuangTaiID is null");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidIsNotNull() {
            addCriterion("MuQianGongZuoZhuangTaiID is not null");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidEqualTo(Integer value) {
            addCriterion("MuQianGongZuoZhuangTaiID =", value, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidNotEqualTo(Integer value) {
            addCriterion("MuQianGongZuoZhuangTaiID <>", value, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidGreaterThan(Integer value) {
            addCriterion("MuQianGongZuoZhuangTaiID >", value, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MuQianGongZuoZhuangTaiID >=", value, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidLessThan(Integer value) {
            addCriterion("MuQianGongZuoZhuangTaiID <", value, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidLessThanOrEqualTo(Integer value) {
            addCriterion("MuQianGongZuoZhuangTaiID <=", value, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidIn(List<Integer> values) {
            addCriterion("MuQianGongZuoZhuangTaiID in", values, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidNotIn(List<Integer> values) {
            addCriterion("MuQianGongZuoZhuangTaiID not in", values, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidBetween(Integer value1, Integer value2) {
            addCriterion("MuQianGongZuoZhuangTaiID between", value1, value2, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiidNotBetween(Integer value1, Integer value2) {
            addCriterion("MuQianGongZuoZhuangTaiID not between", value1, value2, "muqiangongzuozhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiIsNull() {
            addCriterion("MuQianGongZuoZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiIsNotNull() {
            addCriterion("MuQianGongZuoZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiEqualTo(String value) {
            addCriterion("MuQianGongZuoZhuangTai =", value, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiNotEqualTo(String value) {
            addCriterion("MuQianGongZuoZhuangTai <>", value, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiGreaterThan(String value) {
            addCriterion("MuQianGongZuoZhuangTai >", value, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("MuQianGongZuoZhuangTai >=", value, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiLessThan(String value) {
            addCriterion("MuQianGongZuoZhuangTai <", value, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("MuQianGongZuoZhuangTai <=", value, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiLike(String value) {
            addCriterion("MuQianGongZuoZhuangTai like", value, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiNotLike(String value) {
            addCriterion("MuQianGongZuoZhuangTai not like", value, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiIn(List<String> values) {
            addCriterion("MuQianGongZuoZhuangTai in", values, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiNotIn(List<String> values) {
            addCriterion("MuQianGongZuoZhuangTai not in", values, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiBetween(String value1, String value2) {
            addCriterion("MuQianGongZuoZhuangTai between", value1, value2, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andMuqiangongzuozhuangtaiNotBetween(String value1, String value2) {
            addCriterion("MuQianGongZuoZhuangTai not between", value1, value2, "muqiangongzuozhuangtai");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIsNull() {
            addCriterion("ShouCangShu is null");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIsNotNull() {
            addCriterion("ShouCangShu is not null");
            return (Criteria) this;
        }

        public Criteria andShoucangshuEqualTo(Integer value) {
            addCriterion("ShouCangShu =", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotEqualTo(Integer value) {
            addCriterion("ShouCangShu <>", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuGreaterThan(Integer value) {
            addCriterion("ShouCangShu >", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShouCangShu >=", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuLessThan(Integer value) {
            addCriterion("ShouCangShu <", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuLessThanOrEqualTo(Integer value) {
            addCriterion("ShouCangShu <=", value, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuIn(List<Integer> values) {
            addCriterion("ShouCangShu in", values, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotIn(List<Integer> values) {
            addCriterion("ShouCangShu not in", values, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuBetween(Integer value1, Integer value2) {
            addCriterion("ShouCangShu between", value1, value2, "shoucangshu");
            return (Criteria) this;
        }

        public Criteria andShoucangshuNotBetween(Integer value1, Integer value2) {
            addCriterion("ShouCangShu not between", value1, value2, "shoucangshu");
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

        public Criteria andJiaoyujingliIsNull() {
            addCriterion("JiaoYuJingLi is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliIsNotNull() {
            addCriterion("JiaoYuJingLi is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliEqualTo(String value) {
            addCriterion("JiaoYuJingLi =", value, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliNotEqualTo(String value) {
            addCriterion("JiaoYuJingLi <>", value, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliGreaterThan(String value) {
            addCriterion("JiaoYuJingLi >", value, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliGreaterThanOrEqualTo(String value) {
            addCriterion("JiaoYuJingLi >=", value, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliLessThan(String value) {
            addCriterion("JiaoYuJingLi <", value, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliLessThanOrEqualTo(String value) {
            addCriterion("JiaoYuJingLi <=", value, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliLike(String value) {
            addCriterion("JiaoYuJingLi like", value, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliNotLike(String value) {
            addCriterion("JiaoYuJingLi not like", value, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliIn(List<String> values) {
            addCriterion("JiaoYuJingLi in", values, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliNotIn(List<String> values) {
            addCriterion("JiaoYuJingLi not in", values, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliBetween(String value1, String value2) {
            addCriterion("JiaoYuJingLi between", value1, value2, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andJiaoyujingliNotBetween(String value1, String value2) {
            addCriterion("JiaoYuJingLi not between", value1, value2, "jiaoyujingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliIsNull() {
            addCriterion("GongZuoJingLi is null");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliIsNotNull() {
            addCriterion("GongZuoJingLi is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliEqualTo(String value) {
            addCriterion("GongZuoJingLi =", value, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliNotEqualTo(String value) {
            addCriterion("GongZuoJingLi <>", value, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliGreaterThan(String value) {
            addCriterion("GongZuoJingLi >", value, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliGreaterThanOrEqualTo(String value) {
            addCriterion("GongZuoJingLi >=", value, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliLessThan(String value) {
            addCriterion("GongZuoJingLi <", value, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliLessThanOrEqualTo(String value) {
            addCriterion("GongZuoJingLi <=", value, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliLike(String value) {
            addCriterion("GongZuoJingLi like", value, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliNotLike(String value) {
            addCriterion("GongZuoJingLi not like", value, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliIn(List<String> values) {
            addCriterion("GongZuoJingLi in", values, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliNotIn(List<String> values) {
            addCriterion("GongZuoJingLi not in", values, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliBetween(String value1, String value2) {
            addCriterion("GongZuoJingLi between", value1, value2, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andGongzuojingliNotBetween(String value1, String value2) {
            addCriterion("GongZuoJingLi not between", value1, value2, "gongzuojingli");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaIsNull() {
            addCriterion("ZiWoPingJia is null");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaIsNotNull() {
            addCriterion("ZiWoPingJia is not null");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaEqualTo(String value) {
            addCriterion("ZiWoPingJia =", value, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaNotEqualTo(String value) {
            addCriterion("ZiWoPingJia <>", value, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaGreaterThan(String value) {
            addCriterion("ZiWoPingJia >", value, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaGreaterThanOrEqualTo(String value) {
            addCriterion("ZiWoPingJia >=", value, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaLessThan(String value) {
            addCriterion("ZiWoPingJia <", value, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaLessThanOrEqualTo(String value) {
            addCriterion("ZiWoPingJia <=", value, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaLike(String value) {
            addCriterion("ZiWoPingJia like", value, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaNotLike(String value) {
            addCriterion("ZiWoPingJia not like", value, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaIn(List<String> values) {
            addCriterion("ZiWoPingJia in", values, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaNotIn(List<String> values) {
            addCriterion("ZiWoPingJia not in", values, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaBetween(String value1, String value2) {
            addCriterion("ZiWoPingJia between", value1, value2, "ziwopingjia");
            return (Criteria) this;
        }

        public Criteria andZiwopingjiaNotBetween(String value1, String value2) {
            addCriterion("ZiWoPingJia not between", value1, value2, "ziwopingjia");
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