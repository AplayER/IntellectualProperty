package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubMailContactPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubMailContactPersonExample() {
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

        public Criteria andBianhaoidIsNull() {
            addCriterion("BianHaoID is null");
            return (Criteria) this;
        }

        public Criteria andBianhaoidIsNotNull() {
            addCriterion("BianHaoID is not null");
            return (Criteria) this;
        }

        public Criteria andBianhaoidEqualTo(Integer value) {
            addCriterion("BianHaoID =", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotEqualTo(Integer value) {
            addCriterion("BianHaoID <>", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidGreaterThan(Integer value) {
            addCriterion("BianHaoID >", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BianHaoID >=", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidLessThan(Integer value) {
            addCriterion("BianHaoID <", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidLessThanOrEqualTo(Integer value) {
            addCriterion("BianHaoID <=", value, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidIn(List<Integer> values) {
            addCriterion("BianHaoID in", values, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotIn(List<Integer> values) {
            addCriterion("BianHaoID not in", values, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidBetween(Integer value1, Integer value2) {
            addCriterion("BianHaoID between", value1, value2, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andBianhaoidNotBetween(Integer value1, Integer value2) {
            addCriterion("BianHaoID not between", value1, value2, "bianhaoid");
            return (Criteria) this;
        }

        public Criteria andFenzuidIsNull() {
            addCriterion("FenZuID is null");
            return (Criteria) this;
        }

        public Criteria andFenzuidIsNotNull() {
            addCriterion("FenZuID is not null");
            return (Criteria) this;
        }

        public Criteria andFenzuidEqualTo(Integer value) {
            addCriterion("FenZuID =", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidNotEqualTo(Integer value) {
            addCriterion("FenZuID <>", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidGreaterThan(Integer value) {
            addCriterion("FenZuID >", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FenZuID >=", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidLessThan(Integer value) {
            addCriterion("FenZuID <", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidLessThanOrEqualTo(Integer value) {
            addCriterion("FenZuID <=", value, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidIn(List<Integer> values) {
            addCriterion("FenZuID in", values, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidNotIn(List<Integer> values) {
            addCriterion("FenZuID not in", values, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidBetween(Integer value1, Integer value2) {
            addCriterion("FenZuID between", value1, value2, "fenzuid");
            return (Criteria) this;
        }

        public Criteria andFenzuidNotBetween(Integer value1, Integer value2) {
            addCriterion("FenZuID not between", value1, value2, "fenzuid");
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

        public Criteria andLianxirenidIsNull() {
            addCriterion("LianXiRenID is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenidIsNotNull() {
            addCriterion("LianXiRenID is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenidEqualTo(Integer value) {
            addCriterion("LianXiRenID =", value, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidNotEqualTo(Integer value) {
            addCriterion("LianXiRenID <>", value, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidGreaterThan(Integer value) {
            addCriterion("LianXiRenID >", value, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LianXiRenID >=", value, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidLessThan(Integer value) {
            addCriterion("LianXiRenID <", value, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidLessThanOrEqualTo(Integer value) {
            addCriterion("LianXiRenID <=", value, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidIn(List<Integer> values) {
            addCriterion("LianXiRenID in", values, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidNotIn(List<Integer> values) {
            addCriterion("LianXiRenID not in", values, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidBetween(Integer value1, Integer value2) {
            addCriterion("LianXiRenID between", value1, value2, "lianxirenid");
            return (Criteria) this;
        }

        public Criteria andLianxirenidNotBetween(Integer value1, Integer value2) {
            addCriterion("LianXiRenID not between", value1, value2, "lianxirenid");
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

        public Criteria andYouxiangdizhiIsNull() {
            addCriterion("YouXiangDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiIsNotNull() {
            addCriterion("YouXiangDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiEqualTo(String value) {
            addCriterion("YouXiangDiZhi =", value, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiNotEqualTo(String value) {
            addCriterion("YouXiangDiZhi <>", value, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiGreaterThan(String value) {
            addCriterion("YouXiangDiZhi >", value, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiGreaterThanOrEqualTo(String value) {
            addCriterion("YouXiangDiZhi >=", value, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiLessThan(String value) {
            addCriterion("YouXiangDiZhi <", value, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiLessThanOrEqualTo(String value) {
            addCriterion("YouXiangDiZhi <=", value, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiLike(String value) {
            addCriterion("YouXiangDiZhi like", value, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiNotLike(String value) {
            addCriterion("YouXiangDiZhi not like", value, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiIn(List<String> values) {
            addCriterion("YouXiangDiZhi in", values, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiNotIn(List<String> values) {
            addCriterion("YouXiangDiZhi not in", values, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiBetween(String value1, String value2) {
            addCriterion("YouXiangDiZhi between", value1, value2, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andYouxiangdizhiNotBetween(String value1, String value2) {
            addCriterion("YouXiangDiZhi not between", value1, value2, "youxiangdizhi");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaIsNull() {
            addCriterion("DianHuaHaoMa is null");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaIsNotNull() {
            addCriterion("DianHuaHaoMa is not null");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaEqualTo(String value) {
            addCriterion("DianHuaHaoMa =", value, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaNotEqualTo(String value) {
            addCriterion("DianHuaHaoMa <>", value, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaGreaterThan(String value) {
            addCriterion("DianHuaHaoMa >", value, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaGreaterThanOrEqualTo(String value) {
            addCriterion("DianHuaHaoMa >=", value, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaLessThan(String value) {
            addCriterion("DianHuaHaoMa <", value, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaLessThanOrEqualTo(String value) {
            addCriterion("DianHuaHaoMa <=", value, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaLike(String value) {
            addCriterion("DianHuaHaoMa like", value, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaNotLike(String value) {
            addCriterion("DianHuaHaoMa not like", value, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaIn(List<String> values) {
            addCriterion("DianHuaHaoMa in", values, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaNotIn(List<String> values) {
            addCriterion("DianHuaHaoMa not in", values, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaBetween(String value1, String value2) {
            addCriterion("DianHuaHaoMa between", value1, value2, "dianhuahaoma");
            return (Criteria) this;
        }

        public Criteria andDianhuahaomaNotBetween(String value1, String value2) {
            addCriterion("DianHuaHaoMa not between", value1, value2, "dianhuahaoma");
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

        public Criteria andLianxirenbeizhuIsNull() {
            addCriterion("LianXiRenBeiZhu is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuIsNotNull() {
            addCriterion("LianXiRenBeiZhu is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuEqualTo(String value) {
            addCriterion("LianXiRenBeiZhu =", value, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuNotEqualTo(String value) {
            addCriterion("LianXiRenBeiZhu <>", value, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuGreaterThan(String value) {
            addCriterion("LianXiRenBeiZhu >", value, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("LianXiRenBeiZhu >=", value, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuLessThan(String value) {
            addCriterion("LianXiRenBeiZhu <", value, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuLessThanOrEqualTo(String value) {
            addCriterion("LianXiRenBeiZhu <=", value, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuLike(String value) {
            addCriterion("LianXiRenBeiZhu like", value, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuNotLike(String value) {
            addCriterion("LianXiRenBeiZhu not like", value, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuIn(List<String> values) {
            addCriterion("LianXiRenBeiZhu in", values, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuNotIn(List<String> values) {
            addCriterion("LianXiRenBeiZhu not in", values, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuBetween(String value1, String value2) {
            addCriterion("LianXiRenBeiZhu between", value1, value2, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andLianxirenbeizhuNotBetween(String value1, String value2) {
            addCriterion("LianXiRenBeiZhu not between", value1, value2, "lianxirenbeizhu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIsNull() {
            addCriterion("ShiFouShanChu is null");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIsNotNull() {
            addCriterion("ShiFouShanChu is not null");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuEqualTo(Integer value) {
            addCriterion("ShiFouShanChu =", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotEqualTo(Integer value) {
            addCriterion("ShiFouShanChu <>", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuGreaterThan(Integer value) {
            addCriterion("ShiFouShanChu >", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouShanChu >=", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuLessThan(Integer value) {
            addCriterion("ShiFouShanChu <", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouShanChu <=", value, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuIn(List<Integer> values) {
            addCriterion("ShiFouShanChu in", values, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotIn(List<Integer> values) {
            addCriterion("ShiFouShanChu not in", values, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouShanChu between", value1, value2, "shifoushanchu");
            return (Criteria) this;
        }

        public Criteria andShifoushanchuNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouShanChu not between", value1, value2, "shifoushanchu");
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