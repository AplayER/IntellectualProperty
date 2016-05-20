package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubProjectExample() {
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

        public Criteria andXiangmuidIsNull() {
            addCriterion("XiangMuID is null");
            return (Criteria) this;
        }

        public Criteria andXiangmuidIsNotNull() {
            addCriterion("XiangMuID is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmuidEqualTo(Integer value) {
            addCriterion("XiangMuID =", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidNotEqualTo(Integer value) {
            addCriterion("XiangMuID <>", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidGreaterThan(Integer value) {
            addCriterion("XiangMuID >", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XiangMuID >=", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidLessThan(Integer value) {
            addCriterion("XiangMuID <", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidLessThanOrEqualTo(Integer value) {
            addCriterion("XiangMuID <=", value, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidIn(List<Integer> values) {
            addCriterion("XiangMuID in", values, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidNotIn(List<Integer> values) {
            addCriterion("XiangMuID not in", values, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidBetween(Integer value1, Integer value2) {
            addCriterion("XiangMuID between", value1, value2, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andXiangmuidNotBetween(Integer value1, Integer value2) {
            addCriterion("XiangMuID not between", value1, value2, "xiangmuid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidIsNull() {
            addCriterion("TongZhiID is null");
            return (Criteria) this;
        }

        public Criteria andTongzhiidIsNotNull() {
            addCriterion("TongZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andTongzhiidEqualTo(Integer value) {
            addCriterion("TongZhiID =", value, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidNotEqualTo(Integer value) {
            addCriterion("TongZhiID <>", value, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidGreaterThan(Integer value) {
            addCriterion("TongZhiID >", value, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TongZhiID >=", value, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidLessThan(Integer value) {
            addCriterion("TongZhiID <", value, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidLessThanOrEqualTo(Integer value) {
            addCriterion("TongZhiID <=", value, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidIn(List<Integer> values) {
            addCriterion("TongZhiID in", values, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidNotIn(List<Integer> values) {
            addCriterion("TongZhiID not in", values, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidBetween(Integer value1, Integer value2) {
            addCriterion("TongZhiID between", value1, value2, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andTongzhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("TongZhiID not between", value1, value2, "tongzhiid");
            return (Criteria) this;
        }

        public Criteria andMobanidIsNull() {
            addCriterion("MoBanID is null");
            return (Criteria) this;
        }

        public Criteria andMobanidIsNotNull() {
            addCriterion("MoBanID is not null");
            return (Criteria) this;
        }

        public Criteria andMobanidEqualTo(Integer value) {
            addCriterion("MoBanID =", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidNotEqualTo(Integer value) {
            addCriterion("MoBanID <>", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidGreaterThan(Integer value) {
            addCriterion("MoBanID >", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoBanID >=", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidLessThan(Integer value) {
            addCriterion("MoBanID <", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidLessThanOrEqualTo(Integer value) {
            addCriterion("MoBanID <=", value, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidIn(List<Integer> values) {
            addCriterion("MoBanID in", values, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidNotIn(List<Integer> values) {
            addCriterion("MoBanID not in", values, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidBetween(Integer value1, Integer value2) {
            addCriterion("MoBanID between", value1, value2, "mobanid");
            return (Criteria) this;
        }

        public Criteria andMobanidNotBetween(Integer value1, Integer value2) {
            addCriterion("MoBanID not between", value1, value2, "mobanid");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengIsNull() {
            addCriterion("XiangMuMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengIsNotNull() {
            addCriterion("XiangMuMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengEqualTo(String value) {
            addCriterion("XiangMuMingCheng =", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotEqualTo(String value) {
            addCriterion("XiangMuMingCheng <>", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengGreaterThan(String value) {
            addCriterion("XiangMuMingCheng >", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengGreaterThanOrEqualTo(String value) {
            addCriterion("XiangMuMingCheng >=", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLessThan(String value) {
            addCriterion("XiangMuMingCheng <", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLessThanOrEqualTo(String value) {
            addCriterion("XiangMuMingCheng <=", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengLike(String value) {
            addCriterion("XiangMuMingCheng like", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotLike(String value) {
            addCriterion("XiangMuMingCheng not like", value, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengIn(List<String> values) {
            addCriterion("XiangMuMingCheng in", values, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotIn(List<String> values) {
            addCriterion("XiangMuMingCheng not in", values, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengBetween(String value1, String value2) {
            addCriterion("XiangMuMingCheng between", value1, value2, "xiangmumingcheng");
            return (Criteria) this;
        }

        public Criteria andXiangmumingchengNotBetween(String value1, String value2) {
            addCriterion("XiangMuMingCheng not between", value1, value2, "xiangmumingcheng");
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

        public Criteria andShenbaokaishishijianIsNull() {
            addCriterion("ShenBaoKaiShiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianIsNotNull() {
            addCriterion("ShenBaoKaiShiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian =", value, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian <>", value, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianGreaterThan(Date value) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian >", value, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian >=", value, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianLessThan(Date value) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian <", value, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian <=", value, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianIn(List<Date> values) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian in", values, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian not in", values, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian between", value1, value2, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaokaishishijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShenBaoKaiShiShiJian not between", value1, value2, "shenbaokaishishijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianIsNull() {
            addCriterion("ShenBaoJieShuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianIsNotNull() {
            addCriterion("ShenBaoJieShuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian =", value, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian <>", value, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianGreaterThan(Date value) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian >", value, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian >=", value, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianLessThan(Date value) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian <", value, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian <=", value, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianIn(List<Date> values) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian in", values, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian not in", values, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian between", value1, value2, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenbaojieshushijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShenBaoJieShuShiJian not between", value1, value2, "shenbaojieshushijian");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiIsNull() {
            addCriterion("ShenHeZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiIsNotNull() {
            addCriterion("ShenHeZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiEqualTo(Integer value) {
            addCriterion("ShenHeZhuangTai =", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiNotEqualTo(Integer value) {
            addCriterion("ShenHeZhuangTai <>", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiGreaterThan(Integer value) {
            addCriterion("ShenHeZhuangTai >", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenHeZhuangTai >=", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiLessThan(Integer value) {
            addCriterion("ShenHeZhuangTai <", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("ShenHeZhuangTai <=", value, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiIn(List<Integer> values) {
            addCriterion("ShenHeZhuangTai in", values, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiNotIn(List<Integer> values) {
            addCriterion("ShenHeZhuangTai not in", values, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("ShenHeZhuangTai between", value1, value2, "shenhezhuangtai");
            return (Criteria) this;
        }

        public Criteria andShenhezhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenHeZhuangTai not between", value1, value2, "shenhezhuangtai");
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

        public Criteria andFaburiqiIsNull() {
            addCriterion("FaBuRiQi is null");
            return (Criteria) this;
        }

        public Criteria andFaburiqiIsNotNull() {
            addCriterion("FaBuRiQi is not null");
            return (Criteria) this;
        }

        public Criteria andFaburiqiEqualTo(Date value) {
            addCriterionForJDBCDate("FaBuRiQi =", value, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiNotEqualTo(Date value) {
            addCriterionForJDBCDate("FaBuRiQi <>", value, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiGreaterThan(Date value) {
            addCriterionForJDBCDate("FaBuRiQi >", value, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FaBuRiQi >=", value, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiLessThan(Date value) {
            addCriterionForJDBCDate("FaBuRiQi <", value, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FaBuRiQi <=", value, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiIn(List<Date> values) {
            addCriterionForJDBCDate("FaBuRiQi in", values, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiNotIn(List<Date> values) {
            addCriterionForJDBCDate("FaBuRiQi not in", values, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FaBuRiQi between", value1, value2, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andFaburiqiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FaBuRiQi not between", value1, value2, "faburiqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiIsNull() {
            addCriterion("ShenHeRiQi is null");
            return (Criteria) this;
        }

        public Criteria andShenheriqiIsNotNull() {
            addCriterion("ShenHeRiQi is not null");
            return (Criteria) this;
        }

        public Criteria andShenheriqiEqualTo(Date value) {
            addCriterionForJDBCDate("ShenHeRiQi =", value, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiNotEqualTo(Date value) {
            addCriterionForJDBCDate("ShenHeRiQi <>", value, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiGreaterThan(Date value) {
            addCriterionForJDBCDate("ShenHeRiQi >", value, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShenHeRiQi >=", value, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiLessThan(Date value) {
            addCriterionForJDBCDate("ShenHeRiQi <", value, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShenHeRiQi <=", value, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiIn(List<Date> values) {
            addCriterionForJDBCDate("ShenHeRiQi in", values, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiNotIn(List<Date> values) {
            addCriterionForJDBCDate("ShenHeRiQi not in", values, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShenHeRiQi between", value1, value2, "shenheriqi");
            return (Criteria) this;
        }

        public Criteria andShenheriqiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShenHeRiQi not between", value1, value2, "shenheriqi");
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