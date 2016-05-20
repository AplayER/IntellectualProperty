package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubTalentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubTalentExample() {
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

        public Criteria andRencaiidIsNull() {
            addCriterion("RenCaiID is null");
            return (Criteria) this;
        }

        public Criteria andRencaiidIsNotNull() {
            addCriterion("RenCaiID is not null");
            return (Criteria) this;
        }

        public Criteria andRencaiidEqualTo(Integer value) {
            addCriterion("RenCaiID =", value, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidNotEqualTo(Integer value) {
            addCriterion("RenCaiID <>", value, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidGreaterThan(Integer value) {
            addCriterion("RenCaiID >", value, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RenCaiID >=", value, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidLessThan(Integer value) {
            addCriterion("RenCaiID <", value, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidLessThanOrEqualTo(Integer value) {
            addCriterion("RenCaiID <=", value, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidIn(List<Integer> values) {
            addCriterion("RenCaiID in", values, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidNotIn(List<Integer> values) {
            addCriterion("RenCaiID not in", values, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidBetween(Integer value1, Integer value2) {
            addCriterion("RenCaiID between", value1, value2, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andRencaiidNotBetween(Integer value1, Integer value2) {
            addCriterion("RenCaiID not between", value1, value2, "rencaiid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidIsNull() {
            addCriterion("SuoShuKuBieID is null");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidIsNotNull() {
            addCriterion("SuoShuKuBieID is not null");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidEqualTo(Integer value) {
            addCriterion("SuoShuKuBieID =", value, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidNotEqualTo(Integer value) {
            addCriterion("SuoShuKuBieID <>", value, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidGreaterThan(Integer value) {
            addCriterion("SuoShuKuBieID >", value, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SuoShuKuBieID >=", value, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidLessThan(Integer value) {
            addCriterion("SuoShuKuBieID <", value, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidLessThanOrEqualTo(Integer value) {
            addCriterion("SuoShuKuBieID <=", value, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidIn(List<Integer> values) {
            addCriterion("SuoShuKuBieID in", values, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidNotIn(List<Integer> values) {
            addCriterion("SuoShuKuBieID not in", values, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidBetween(Integer value1, Integer value2) {
            addCriterion("SuoShuKuBieID between", value1, value2, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieidNotBetween(Integer value1, Integer value2) {
            addCriterion("SuoShuKuBieID not between", value1, value2, "suoshukubieid");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieIsNull() {
            addCriterion("SuoShuKuBie is null");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieIsNotNull() {
            addCriterion("SuoShuKuBie is not null");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieEqualTo(String value) {
            addCriterion("SuoShuKuBie =", value, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieNotEqualTo(String value) {
            addCriterion("SuoShuKuBie <>", value, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieGreaterThan(String value) {
            addCriterion("SuoShuKuBie >", value, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieGreaterThanOrEqualTo(String value) {
            addCriterion("SuoShuKuBie >=", value, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieLessThan(String value) {
            addCriterion("SuoShuKuBie <", value, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieLessThanOrEqualTo(String value) {
            addCriterion("SuoShuKuBie <=", value, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieLike(String value) {
            addCriterion("SuoShuKuBie like", value, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieNotLike(String value) {
            addCriterion("SuoShuKuBie not like", value, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieIn(List<String> values) {
            addCriterion("SuoShuKuBie in", values, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieNotIn(List<String> values) {
            addCriterion("SuoShuKuBie not in", values, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieBetween(String value1, String value2) {
            addCriterion("SuoShuKuBie between", value1, value2, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuoshukubieNotBetween(String value1, String value2) {
            addCriterion("SuoShuKuBie not between", value1, value2, "suoshukubie");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidIsNull() {
            addCriterion("SuoZaiShengShiID is null");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidIsNotNull() {
            addCriterion("SuoZaiShengShiID is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidEqualTo(Integer value) {
            addCriterion("SuoZaiShengShiID =", value, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidNotEqualTo(Integer value) {
            addCriterion("SuoZaiShengShiID <>", value, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidGreaterThan(Integer value) {
            addCriterion("SuoZaiShengShiID >", value, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SuoZaiShengShiID >=", value, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidLessThan(Integer value) {
            addCriterion("SuoZaiShengShiID <", value, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidLessThanOrEqualTo(Integer value) {
            addCriterion("SuoZaiShengShiID <=", value, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidIn(List<Integer> values) {
            addCriterion("SuoZaiShengShiID in", values, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidNotIn(List<Integer> values) {
            addCriterion("SuoZaiShengShiID not in", values, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidBetween(Integer value1, Integer value2) {
            addCriterion("SuoZaiShengShiID between", value1, value2, "suozaishengshiid");
            return (Criteria) this;
        }

        public Criteria andSuozaishengshiidNotBetween(Integer value1, Integer value2) {
            addCriterion("SuoZaiShengShiID not between", value1, value2, "suozaishengshiid");
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

        public Criteria andZuigaoxueliidIsNull() {
            addCriterion("ZuiGaoXueLiID is null");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidIsNotNull() {
            addCriterion("ZuiGaoXueLiID is not null");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidEqualTo(Integer value) {
            addCriterion("ZuiGaoXueLiID =", value, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidNotEqualTo(Integer value) {
            addCriterion("ZuiGaoXueLiID <>", value, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidGreaterThan(Integer value) {
            addCriterion("ZuiGaoXueLiID >", value, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZuiGaoXueLiID >=", value, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidLessThan(Integer value) {
            addCriterion("ZuiGaoXueLiID <", value, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidLessThanOrEqualTo(Integer value) {
            addCriterion("ZuiGaoXueLiID <=", value, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidIn(List<Integer> values) {
            addCriterion("ZuiGaoXueLiID in", values, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidNotIn(List<Integer> values) {
            addCriterion("ZuiGaoXueLiID not in", values, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidBetween(Integer value1, Integer value2) {
            addCriterion("ZuiGaoXueLiID between", value1, value2, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZuiGaoXueLiID not between", value1, value2, "zuigaoxueliid");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliIsNull() {
            addCriterion("ZuiGaoXueLi is null");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliIsNotNull() {
            addCriterion("ZuiGaoXueLi is not null");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliEqualTo(String value) {
            addCriterion("ZuiGaoXueLi =", value, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliNotEqualTo(String value) {
            addCriterion("ZuiGaoXueLi <>", value, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliGreaterThan(String value) {
            addCriterion("ZuiGaoXueLi >", value, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliGreaterThanOrEqualTo(String value) {
            addCriterion("ZuiGaoXueLi >=", value, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliLessThan(String value) {
            addCriterion("ZuiGaoXueLi <", value, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliLessThanOrEqualTo(String value) {
            addCriterion("ZuiGaoXueLi <=", value, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliLike(String value) {
            addCriterion("ZuiGaoXueLi like", value, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliNotLike(String value) {
            addCriterion("ZuiGaoXueLi not like", value, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliIn(List<String> values) {
            addCriterion("ZuiGaoXueLi in", values, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliNotIn(List<String> values) {
            addCriterion("ZuiGaoXueLi not in", values, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliBetween(String value1, String value2) {
            addCriterion("ZuiGaoXueLi between", value1, value2, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andZuigaoxueliNotBetween(String value1, String value2) {
            addCriterion("ZuiGaoXueLi not between", value1, value2, "zuigaoxueli");
            return (Criteria) this;
        }

        public Criteria andSuozaishengIsNull() {
            addCriterion("SuoZaiSheng is null");
            return (Criteria) this;
        }

        public Criteria andSuozaishengIsNotNull() {
            addCriterion("SuoZaiSheng is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaishengEqualTo(String value) {
            addCriterion("SuoZaiSheng =", value, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengNotEqualTo(String value) {
            addCriterion("SuoZaiSheng <>", value, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengGreaterThan(String value) {
            addCriterion("SuoZaiSheng >", value, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengGreaterThanOrEqualTo(String value) {
            addCriterion("SuoZaiSheng >=", value, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengLessThan(String value) {
            addCriterion("SuoZaiSheng <", value, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengLessThanOrEqualTo(String value) {
            addCriterion("SuoZaiSheng <=", value, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengLike(String value) {
            addCriterion("SuoZaiSheng like", value, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengNotLike(String value) {
            addCriterion("SuoZaiSheng not like", value, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengIn(List<String> values) {
            addCriterion("SuoZaiSheng in", values, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengNotIn(List<String> values) {
            addCriterion("SuoZaiSheng not in", values, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengBetween(String value1, String value2) {
            addCriterion("SuoZaiSheng between", value1, value2, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishengNotBetween(String value1, String value2) {
            addCriterion("SuoZaiSheng not between", value1, value2, "suozaisheng");
            return (Criteria) this;
        }

        public Criteria andSuozaishiIsNull() {
            addCriterion("SuoZaiShi is null");
            return (Criteria) this;
        }

        public Criteria andSuozaishiIsNotNull() {
            addCriterion("SuoZaiShi is not null");
            return (Criteria) this;
        }

        public Criteria andSuozaishiEqualTo(String value) {
            addCriterion("SuoZaiShi =", value, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiNotEqualTo(String value) {
            addCriterion("SuoZaiShi <>", value, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiGreaterThan(String value) {
            addCriterion("SuoZaiShi >", value, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiGreaterThanOrEqualTo(String value) {
            addCriterion("SuoZaiShi >=", value, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiLessThan(String value) {
            addCriterion("SuoZaiShi <", value, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiLessThanOrEqualTo(String value) {
            addCriterion("SuoZaiShi <=", value, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiLike(String value) {
            addCriterion("SuoZaiShi like", value, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiNotLike(String value) {
            addCriterion("SuoZaiShi not like", value, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiIn(List<String> values) {
            addCriterion("SuoZaiShi in", values, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiNotIn(List<String> values) {
            addCriterion("SuoZaiShi not in", values, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiBetween(String value1, String value2) {
            addCriterion("SuoZaiShi between", value1, value2, "suozaishi");
            return (Criteria) this;
        }

        public Criteria andSuozaishiNotBetween(String value1, String value2) {
            addCriterion("SuoZaiShi not between", value1, value2, "suozaishi");
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

        public Criteria andGongzuodanweiIsNull() {
            addCriterion("GongZuoDanWei is null");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiIsNotNull() {
            addCriterion("GongZuoDanWei is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiEqualTo(String value) {
            addCriterion("GongZuoDanWei =", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiNotEqualTo(String value) {
            addCriterion("GongZuoDanWei <>", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiGreaterThan(String value) {
            addCriterion("GongZuoDanWei >", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiGreaterThanOrEqualTo(String value) {
            addCriterion("GongZuoDanWei >=", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiLessThan(String value) {
            addCriterion("GongZuoDanWei <", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiLessThanOrEqualTo(String value) {
            addCriterion("GongZuoDanWei <=", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiLike(String value) {
            addCriterion("GongZuoDanWei like", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiNotLike(String value) {
            addCriterion("GongZuoDanWei not like", value, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiIn(List<String> values) {
            addCriterion("GongZuoDanWei in", values, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiNotIn(List<String> values) {
            addCriterion("GongZuoDanWei not in", values, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiBetween(String value1, String value2) {
            addCriterion("GongZuoDanWei between", value1, value2, "gongzuodanwei");
            return (Criteria) this;
        }

        public Criteria andGongzuodanweiNotBetween(String value1, String value2) {
            addCriterion("GongZuoDanWei not between", value1, value2, "gongzuodanwei");
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

        public Criteria andZhiwuIsNull() {
            addCriterion("ZhiWu is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNotNull() {
            addCriterion("ZhiWu is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuEqualTo(String value) {
            addCriterion("ZhiWu =", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotEqualTo(String value) {
            addCriterion("ZhiWu <>", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThan(String value) {
            addCriterion("ZhiWu >", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("ZhiWu >=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThan(String value) {
            addCriterion("ZhiWu <", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThanOrEqualTo(String value) {
            addCriterion("ZhiWu <=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLike(String value) {
            addCriterion("ZhiWu like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotLike(String value) {
            addCriterion("ZhiWu not like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuIn(List<String> values) {
            addCriterion("ZhiWu in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotIn(List<String> values) {
            addCriterion("ZhiWu not in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuBetween(String value1, String value2) {
            addCriterion("ZhiWu between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotBetween(String value1, String value2) {
            addCriterion("ZhiWu not between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuIsNull() {
            addCriterion("YanJiuLingYu is null");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuIsNotNull() {
            addCriterion("YanJiuLingYu is not null");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuEqualTo(String value) {
            addCriterion("YanJiuLingYu =", value, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuNotEqualTo(String value) {
            addCriterion("YanJiuLingYu <>", value, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuGreaterThan(String value) {
            addCriterion("YanJiuLingYu >", value, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuGreaterThanOrEqualTo(String value) {
            addCriterion("YanJiuLingYu >=", value, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuLessThan(String value) {
            addCriterion("YanJiuLingYu <", value, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuLessThanOrEqualTo(String value) {
            addCriterion("YanJiuLingYu <=", value, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuLike(String value) {
            addCriterion("YanJiuLingYu like", value, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuNotLike(String value) {
            addCriterion("YanJiuLingYu not like", value, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuIn(List<String> values) {
            addCriterion("YanJiuLingYu in", values, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuNotIn(List<String> values) {
            addCriterion("YanJiuLingYu not in", values, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuBetween(String value1, String value2) {
            addCriterion("YanJiuLingYu between", value1, value2, "yanjiulingyu");
            return (Criteria) this;
        }

        public Criteria andYanjiulingyuNotBetween(String value1, String value2) {
            addCriterion("YanJiuLingYu not between", value1, value2, "yanjiulingyu");
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