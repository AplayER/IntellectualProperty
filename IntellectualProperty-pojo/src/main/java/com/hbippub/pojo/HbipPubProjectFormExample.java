package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubProjectFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubProjectFormExample() {
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

        public Criteria andShenqingbiaoidIsNull() {
            addCriterion("ShenQingBiaoID is null");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidIsNotNull() {
            addCriterion("ShenQingBiaoID is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidEqualTo(Integer value) {
            addCriterion("ShenQingBiaoID =", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidNotEqualTo(Integer value) {
            addCriterion("ShenQingBiaoID <>", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidGreaterThan(Integer value) {
            addCriterion("ShenQingBiaoID >", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShenQingBiaoID >=", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidLessThan(Integer value) {
            addCriterion("ShenQingBiaoID <", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidLessThanOrEqualTo(Integer value) {
            addCriterion("ShenQingBiaoID <=", value, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidIn(List<Integer> values) {
            addCriterion("ShenQingBiaoID in", values, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidNotIn(List<Integer> values) {
            addCriterion("ShenQingBiaoID not in", values, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingBiaoID between", value1, value2, "shenqingbiaoid");
            return (Criteria) this;
        }

        public Criteria andShenqingbiaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShenQingBiaoID not between", value1, value2, "shenqingbiaoid");
            return (Criteria) this;
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

        public Criteria andShenbaomingchengIsNull() {
            addCriterion("ShenBaoMingCheng is null");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengIsNotNull() {
            addCriterion("ShenBaoMingCheng is not null");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengEqualTo(String value) {
            addCriterion("ShenBaoMingCheng =", value, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengNotEqualTo(String value) {
            addCriterion("ShenBaoMingCheng <>", value, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengGreaterThan(String value) {
            addCriterion("ShenBaoMingCheng >", value, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengGreaterThanOrEqualTo(String value) {
            addCriterion("ShenBaoMingCheng >=", value, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengLessThan(String value) {
            addCriterion("ShenBaoMingCheng <", value, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengLessThanOrEqualTo(String value) {
            addCriterion("ShenBaoMingCheng <=", value, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengLike(String value) {
            addCriterion("ShenBaoMingCheng like", value, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengNotLike(String value) {
            addCriterion("ShenBaoMingCheng not like", value, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengIn(List<String> values) {
            addCriterion("ShenBaoMingCheng in", values, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengNotIn(List<String> values) {
            addCriterion("ShenBaoMingCheng not in", values, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengBetween(String value1, String value2) {
            addCriterion("ShenBaoMingCheng between", value1, value2, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaomingchengNotBetween(String value1, String value2) {
            addCriterion("ShenBaoMingCheng not between", value1, value2, "shenbaomingcheng");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingIsNull() {
            addCriterion("ShenBaoRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingIsNotNull() {
            addCriterion("ShenBaoRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingEqualTo(String value) {
            addCriterion("ShenBaoRenXingMing =", value, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingNotEqualTo(String value) {
            addCriterion("ShenBaoRenXingMing <>", value, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingGreaterThan(String value) {
            addCriterion("ShenBaoRenXingMing >", value, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ShenBaoRenXingMing >=", value, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingLessThan(String value) {
            addCriterion("ShenBaoRenXingMing <", value, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingLessThanOrEqualTo(String value) {
            addCriterion("ShenBaoRenXingMing <=", value, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingLike(String value) {
            addCriterion("ShenBaoRenXingMing like", value, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingNotLike(String value) {
            addCriterion("ShenBaoRenXingMing not like", value, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingIn(List<String> values) {
            addCriterion("ShenBaoRenXingMing in", values, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingNotIn(List<String> values) {
            addCriterion("ShenBaoRenXingMing not in", values, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingBetween(String value1, String value2) {
            addCriterion("ShenBaoRenXingMing between", value1, value2, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaorenxingmingNotBetween(String value1, String value2) {
            addCriterion("ShenBaoRenXingMing not between", value1, value2, "shenbaorenxingming");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiIsNull() {
            addCriterion("ShenBaoRiQi is null");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiIsNotNull() {
            addCriterion("ShenBaoRiQi is not null");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoRiQi =", value, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiNotEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoRiQi <>", value, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiGreaterThan(Date value) {
            addCriterionForJDBCDate("ShenBaoRiQi >", value, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoRiQi >=", value, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiLessThan(Date value) {
            addCriterionForJDBCDate("ShenBaoRiQi <", value, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ShenBaoRiQi <=", value, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiIn(List<Date> values) {
            addCriterionForJDBCDate("ShenBaoRiQi in", values, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiNotIn(List<Date> values) {
            addCriterionForJDBCDate("ShenBaoRiQi not in", values, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShenBaoRiQi between", value1, value2, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andShenbaoriqiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ShenBaoRiQi not between", value1, value2, "shenbaoriqi");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianIsNull() {
            addCriterion("XiangMuKaiShiShiJian is null");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianIsNotNull() {
            addCriterion("XiangMuKaiShiShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianEqualTo(Date value) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian =", value, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian <>", value, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianGreaterThan(Date value) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian >", value, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian >=", value, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianLessThan(Date value) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian <", value, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian <=", value, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianIn(List<Date> values) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian in", values, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian not in", values, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian between", value1, value2, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmukaishishijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XiangMuKaiShiShiJian not between", value1, value2, "xiangmukaishishijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianIsNull() {
            addCriterion("XiangMuJieShuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianIsNotNull() {
            addCriterion("XiangMuJieShuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianEqualTo(Date value) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian =", value, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian <>", value, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianGreaterThan(Date value) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian >", value, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian >=", value, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianLessThan(Date value) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian <", value, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian <=", value, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianIn(List<Date> values) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian in", values, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian not in", values, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian between", value1, value2, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andXiangmujieshushijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XiangMuJieShuShiJian not between", value1, value2, "xiangmujieshushijian");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuIsNull() {
            addCriterion("ZhuanFaCiShu is null");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuIsNotNull() {
            addCriterion("ZhuanFaCiShu is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuEqualTo(Integer value) {
            addCriterion("ZhuanFaCiShu =", value, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuNotEqualTo(Integer value) {
            addCriterion("ZhuanFaCiShu <>", value, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuGreaterThan(Integer value) {
            addCriterion("ZhuanFaCiShu >", value, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZhuanFaCiShu >=", value, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuLessThan(Integer value) {
            addCriterion("ZhuanFaCiShu <", value, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuLessThanOrEqualTo(Integer value) {
            addCriterion("ZhuanFaCiShu <=", value, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuIn(List<Integer> values) {
            addCriterion("ZhuanFaCiShu in", values, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuNotIn(List<Integer> values) {
            addCriterion("ZhuanFaCiShu not in", values, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuBetween(Integer value1, Integer value2) {
            addCriterion("ZhuanFaCiShu between", value1, value2, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andZhuanfacishuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZhuanFaCiShu not between", value1, value2, "zhuanfacishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuIsNull() {
            addCriterion("YiShenCiShu is null");
            return (Criteria) this;
        }

        public Criteria andYishencishuIsNotNull() {
            addCriterion("YiShenCiShu is not null");
            return (Criteria) this;
        }

        public Criteria andYishencishuEqualTo(Integer value) {
            addCriterion("YiShenCiShu =", value, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuNotEqualTo(Integer value) {
            addCriterion("YiShenCiShu <>", value, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuGreaterThan(Integer value) {
            addCriterion("YiShenCiShu >", value, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("YiShenCiShu >=", value, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuLessThan(Integer value) {
            addCriterion("YiShenCiShu <", value, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuLessThanOrEqualTo(Integer value) {
            addCriterion("YiShenCiShu <=", value, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuIn(List<Integer> values) {
            addCriterion("YiShenCiShu in", values, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuNotIn(List<Integer> values) {
            addCriterion("YiShenCiShu not in", values, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuBetween(Integer value1, Integer value2) {
            addCriterion("YiShenCiShu between", value1, value2, "yishencishu");
            return (Criteria) this;
        }

        public Criteria andYishencishuNotBetween(Integer value1, Integer value2) {
            addCriterion("YiShenCiShu not between", value1, value2, "yishencishu");
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

        public Criteria andShenbaorendianhuaIsNull() {
            addCriterion("ShenBaoRenDianHua is null");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaIsNotNull() {
            addCriterion("ShenBaoRenDianHua is not null");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaEqualTo(String value) {
            addCriterion("ShenBaoRenDianHua =", value, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaNotEqualTo(String value) {
            addCriterion("ShenBaoRenDianHua <>", value, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaGreaterThan(String value) {
            addCriterion("ShenBaoRenDianHua >", value, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("ShenBaoRenDianHua >=", value, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaLessThan(String value) {
            addCriterion("ShenBaoRenDianHua <", value, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaLessThanOrEqualTo(String value) {
            addCriterion("ShenBaoRenDianHua <=", value, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaLike(String value) {
            addCriterion("ShenBaoRenDianHua like", value, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaNotLike(String value) {
            addCriterion("ShenBaoRenDianHua not like", value, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaIn(List<String> values) {
            addCriterion("ShenBaoRenDianHua in", values, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaNotIn(List<String> values) {
            addCriterion("ShenBaoRenDianHua not in", values, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaBetween(String value1, String value2) {
            addCriterion("ShenBaoRenDianHua between", value1, value2, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorendianhuaNotBetween(String value1, String value2) {
            addCriterion("ShenBaoRenDianHua not between", value1, value2, "shenbaorendianhua");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiIsNull() {
            addCriterion("ShenBaoRenTongXunDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiIsNotNull() {
            addCriterion("ShenBaoRenTongXunDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiEqualTo(String value) {
            addCriterion("ShenBaoRenTongXunDiZhi =", value, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiNotEqualTo(String value) {
            addCriterion("ShenBaoRenTongXunDiZhi <>", value, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiGreaterThan(String value) {
            addCriterion("ShenBaoRenTongXunDiZhi >", value, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiGreaterThanOrEqualTo(String value) {
            addCriterion("ShenBaoRenTongXunDiZhi >=", value, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiLessThan(String value) {
            addCriterion("ShenBaoRenTongXunDiZhi <", value, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiLessThanOrEqualTo(String value) {
            addCriterion("ShenBaoRenTongXunDiZhi <=", value, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiLike(String value) {
            addCriterion("ShenBaoRenTongXunDiZhi like", value, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiNotLike(String value) {
            addCriterion("ShenBaoRenTongXunDiZhi not like", value, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiIn(List<String> values) {
            addCriterion("ShenBaoRenTongXunDiZhi in", values, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiNotIn(List<String> values) {
            addCriterion("ShenBaoRenTongXunDiZhi not in", values, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiBetween(String value1, String value2) {
            addCriterion("ShenBaoRenTongXunDiZhi between", value1, value2, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorentongxundizhiNotBetween(String value1, String value2) {
            addCriterion("ShenBaoRenTongXunDiZhi not between", value1, value2, "shenbaorentongxundizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiIsNull() {
            addCriterion("ShenBaoRenYouJianDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiIsNotNull() {
            addCriterion("ShenBaoRenYouJianDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiEqualTo(String value) {
            addCriterion("ShenBaoRenYouJianDiZhi =", value, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiNotEqualTo(String value) {
            addCriterion("ShenBaoRenYouJianDiZhi <>", value, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiGreaterThan(String value) {
            addCriterion("ShenBaoRenYouJianDiZhi >", value, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiGreaterThanOrEqualTo(String value) {
            addCriterion("ShenBaoRenYouJianDiZhi >=", value, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiLessThan(String value) {
            addCriterion("ShenBaoRenYouJianDiZhi <", value, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiLessThanOrEqualTo(String value) {
            addCriterion("ShenBaoRenYouJianDiZhi <=", value, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiLike(String value) {
            addCriterion("ShenBaoRenYouJianDiZhi like", value, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiNotLike(String value) {
            addCriterion("ShenBaoRenYouJianDiZhi not like", value, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiIn(List<String> values) {
            addCriterion("ShenBaoRenYouJianDiZhi in", values, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiNotIn(List<String> values) {
            addCriterion("ShenBaoRenYouJianDiZhi not in", values, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiBetween(String value1, String value2) {
            addCriterion("ShenBaoRenYouJianDiZhi between", value1, value2, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andShenbaorenyoujiandizhiNotBetween(String value1, String value2) {
            addCriterion("ShenBaoRenYouJianDiZhi not between", value1, value2, "shenbaorenyoujiandizhi");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieIsNull() {
            addCriterion("XiangMuJianJie is null");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieIsNotNull() {
            addCriterion("XiangMuJianJie is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieEqualTo(String value) {
            addCriterion("XiangMuJianJie =", value, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieNotEqualTo(String value) {
            addCriterion("XiangMuJianJie <>", value, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieGreaterThan(String value) {
            addCriterion("XiangMuJianJie >", value, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieGreaterThanOrEqualTo(String value) {
            addCriterion("XiangMuJianJie >=", value, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieLessThan(String value) {
            addCriterion("XiangMuJianJie <", value, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieLessThanOrEqualTo(String value) {
            addCriterion("XiangMuJianJie <=", value, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieLike(String value) {
            addCriterion("XiangMuJianJie like", value, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieNotLike(String value) {
            addCriterion("XiangMuJianJie not like", value, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieIn(List<String> values) {
            addCriterion("XiangMuJianJie in", values, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieNotIn(List<String> values) {
            addCriterion("XiangMuJianJie not in", values, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieBetween(String value1, String value2) {
            addCriterion("XiangMuJianJie between", value1, value2, "xiangmujianjie");
            return (Criteria) this;
        }

        public Criteria andXiangmujianjieNotBetween(String value1, String value2) {
            addCriterion("XiangMuJianJie not between", value1, value2, "xiangmujianjie");
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

        public Criteria andXiangmufaqirenidIsNull() {
            addCriterion("XiangMuFaQiRenID is null");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidIsNotNull() {
            addCriterion("XiangMuFaQiRenID is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidEqualTo(Integer value) {
            addCriterion("XiangMuFaQiRenID =", value, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidNotEqualTo(Integer value) {
            addCriterion("XiangMuFaQiRenID <>", value, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidGreaterThan(Integer value) {
            addCriterion("XiangMuFaQiRenID >", value, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("XiangMuFaQiRenID >=", value, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidLessThan(Integer value) {
            addCriterion("XiangMuFaQiRenID <", value, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidLessThanOrEqualTo(Integer value) {
            addCriterion("XiangMuFaQiRenID <=", value, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidIn(List<Integer> values) {
            addCriterion("XiangMuFaQiRenID in", values, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidNotIn(List<Integer> values) {
            addCriterion("XiangMuFaQiRenID not in", values, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidBetween(Integer value1, Integer value2) {
            addCriterion("XiangMuFaQiRenID between", value1, value2, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenidNotBetween(Integer value1, Integer value2) {
            addCriterion("XiangMuFaQiRenID not between", value1, value2, "xiangmufaqirenid");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiIsNull() {
            addCriterion("FuZeRenDanWei is null");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiIsNotNull() {
            addCriterion("FuZeRenDanWei is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiEqualTo(String value) {
            addCriterion("FuZeRenDanWei =", value, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiNotEqualTo(String value) {
            addCriterion("FuZeRenDanWei <>", value, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiGreaterThan(String value) {
            addCriterion("FuZeRenDanWei >", value, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiGreaterThanOrEqualTo(String value) {
            addCriterion("FuZeRenDanWei >=", value, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiLessThan(String value) {
            addCriterion("FuZeRenDanWei <", value, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiLessThanOrEqualTo(String value) {
            addCriterion("FuZeRenDanWei <=", value, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiLike(String value) {
            addCriterion("FuZeRenDanWei like", value, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiNotLike(String value) {
            addCriterion("FuZeRenDanWei not like", value, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiIn(List<String> values) {
            addCriterion("FuZeRenDanWei in", values, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiNotIn(List<String> values) {
            addCriterion("FuZeRenDanWei not in", values, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiBetween(String value1, String value2) {
            addCriterion("FuZeRenDanWei between", value1, value2, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andFuzerendanweiNotBetween(String value1, String value2) {
            addCriterion("FuZeRenDanWei not between", value1, value2, "fuzerendanwei");
            return (Criteria) this;
        }

        public Criteria andShenheyijianIsNull() {
            addCriterion("ShenHeYiJian is null");
            return (Criteria) this;
        }

        public Criteria andShenheyijianIsNotNull() {
            addCriterion("ShenHeYiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShenheyijianEqualTo(String value) {
            addCriterion("ShenHeYiJian =", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianNotEqualTo(String value) {
            addCriterion("ShenHeYiJian <>", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianGreaterThan(String value) {
            addCriterion("ShenHeYiJian >", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianGreaterThanOrEqualTo(String value) {
            addCriterion("ShenHeYiJian >=", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianLessThan(String value) {
            addCriterion("ShenHeYiJian <", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianLessThanOrEqualTo(String value) {
            addCriterion("ShenHeYiJian <=", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianLike(String value) {
            addCriterion("ShenHeYiJian like", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianNotLike(String value) {
            addCriterion("ShenHeYiJian not like", value, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianIn(List<String> values) {
            addCriterion("ShenHeYiJian in", values, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianNotIn(List<String> values) {
            addCriterion("ShenHeYiJian not in", values, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianBetween(String value1, String value2) {
            addCriterion("ShenHeYiJian between", value1, value2, "shenheyijian");
            return (Criteria) this;
        }

        public Criteria andShenheyijianNotBetween(String value1, String value2) {
            addCriterion("ShenHeYiJian not between", value1, value2, "shenheyijian");
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

        public Criteria andXiangmufaqirenxingmingIsNull() {
            addCriterion("XiangMuFaQiRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingIsNotNull() {
            addCriterion("XiangMuFaQiRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingEqualTo(String value) {
            addCriterion("XiangMuFaQiRenXingMing =", value, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingNotEqualTo(String value) {
            addCriterion("XiangMuFaQiRenXingMing <>", value, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingGreaterThan(String value) {
            addCriterion("XiangMuFaQiRenXingMing >", value, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("XiangMuFaQiRenXingMing >=", value, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingLessThan(String value) {
            addCriterion("XiangMuFaQiRenXingMing <", value, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingLessThanOrEqualTo(String value) {
            addCriterion("XiangMuFaQiRenXingMing <=", value, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingLike(String value) {
            addCriterion("XiangMuFaQiRenXingMing like", value, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingNotLike(String value) {
            addCriterion("XiangMuFaQiRenXingMing not like", value, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingIn(List<String> values) {
            addCriterion("XiangMuFaQiRenXingMing in", values, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingNotIn(List<String> values) {
            addCriterion("XiangMuFaQiRenXingMing not in", values, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingBetween(String value1, String value2) {
            addCriterion("XiangMuFaQiRenXingMing between", value1, value2, "xiangmufaqirenxingming");
            return (Criteria) this;
        }

        public Criteria andXiangmufaqirenxingmingNotBetween(String value1, String value2) {
            addCriterion("XiangMuFaQiRenXingMing not between", value1, value2, "xiangmufaqirenxingming");
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