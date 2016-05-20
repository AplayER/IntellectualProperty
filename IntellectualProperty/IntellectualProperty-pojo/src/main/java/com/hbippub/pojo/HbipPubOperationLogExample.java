package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubOperationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubOperationLogExample() {
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

        public Criteria andRizhiidIsNull() {
            addCriterion("RiZhiID is null");
            return (Criteria) this;
        }

        public Criteria andRizhiidIsNotNull() {
            addCriterion("RiZhiID is not null");
            return (Criteria) this;
        }

        public Criteria andRizhiidEqualTo(Integer value) {
            addCriterion("RiZhiID =", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotEqualTo(Integer value) {
            addCriterion("RiZhiID <>", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidGreaterThan(Integer value) {
            addCriterion("RiZhiID >", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RiZhiID >=", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidLessThan(Integer value) {
            addCriterion("RiZhiID <", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidLessThanOrEqualTo(Integer value) {
            addCriterion("RiZhiID <=", value, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidIn(List<Integer> values) {
            addCriterion("RiZhiID in", values, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotIn(List<Integer> values) {
            addCriterion("RiZhiID not in", values, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidBetween(Integer value1, Integer value2) {
            addCriterion("RiZhiID between", value1, value2, "rizhiid");
            return (Criteria) this;
        }

        public Criteria andRizhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("RiZhiID not between", value1, value2, "rizhiid");
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

        public Criteria andMokuaiidIsNull() {
            addCriterion("MoKuaiID is null");
            return (Criteria) this;
        }

        public Criteria andMokuaiidIsNotNull() {
            addCriterion("MoKuaiID is not null");
            return (Criteria) this;
        }

        public Criteria andMokuaiidEqualTo(Integer value) {
            addCriterion("MoKuaiID =", value, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidNotEqualTo(Integer value) {
            addCriterion("MoKuaiID <>", value, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidGreaterThan(Integer value) {
            addCriterion("MoKuaiID >", value, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MoKuaiID >=", value, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidLessThan(Integer value) {
            addCriterion("MoKuaiID <", value, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidLessThanOrEqualTo(Integer value) {
            addCriterion("MoKuaiID <=", value, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidIn(List<Integer> values) {
            addCriterion("MoKuaiID in", values, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidNotIn(List<Integer> values) {
            addCriterion("MoKuaiID not in", values, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidBetween(Integer value1, Integer value2) {
            addCriterion("MoKuaiID between", value1, value2, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andMokuaiidNotBetween(Integer value1, Integer value2) {
            addCriterion("MoKuaiID not between", value1, value2, "mokuaiid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidIsNull() {
            addCriterion("CaoZuoRenID is null");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidIsNotNull() {
            addCriterion("CaoZuoRenID is not null");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidEqualTo(Integer value) {
            addCriterion("CaoZuoRenID =", value, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidNotEqualTo(Integer value) {
            addCriterion("CaoZuoRenID <>", value, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidGreaterThan(Integer value) {
            addCriterion("CaoZuoRenID >", value, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CaoZuoRenID >=", value, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidLessThan(Integer value) {
            addCriterion("CaoZuoRenID <", value, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidLessThanOrEqualTo(Integer value) {
            addCriterion("CaoZuoRenID <=", value, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidIn(List<Integer> values) {
            addCriterion("CaoZuoRenID in", values, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidNotIn(List<Integer> values) {
            addCriterion("CaoZuoRenID not in", values, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidBetween(Integer value1, Integer value2) {
            addCriterion("CaoZuoRenID between", value1, value2, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenidNotBetween(Integer value1, Integer value2) {
            addCriterion("CaoZuoRenID not between", value1, value2, "caozuorenid");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingIsNull() {
            addCriterion("CaoZuoRenMing is null");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingIsNotNull() {
            addCriterion("CaoZuoRenMing is not null");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingEqualTo(String value) {
            addCriterion("CaoZuoRenMing =", value, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingNotEqualTo(String value) {
            addCriterion("CaoZuoRenMing <>", value, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingGreaterThan(String value) {
            addCriterion("CaoZuoRenMing >", value, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingGreaterThanOrEqualTo(String value) {
            addCriterion("CaoZuoRenMing >=", value, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingLessThan(String value) {
            addCriterion("CaoZuoRenMing <", value, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingLessThanOrEqualTo(String value) {
            addCriterion("CaoZuoRenMing <=", value, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingLike(String value) {
            addCriterion("CaoZuoRenMing like", value, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingNotLike(String value) {
            addCriterion("CaoZuoRenMing not like", value, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingIn(List<String> values) {
            addCriterion("CaoZuoRenMing in", values, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingNotIn(List<String> values) {
            addCriterion("CaoZuoRenMing not in", values, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingBetween(String value1, String value2) {
            addCriterion("CaoZuoRenMing between", value1, value2, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andCaozuorenmingNotBetween(String value1, String value2) {
            addCriterion("CaoZuoRenMing not between", value1, value2, "caozuorenming");
            return (Criteria) this;
        }

        public Criteria andIpdizhiIsNull() {
            addCriterion("IPDiZhi is null");
            return (Criteria) this;
        }

        public Criteria andIpdizhiIsNotNull() {
            addCriterion("IPDiZhi is not null");
            return (Criteria) this;
        }

        public Criteria andIpdizhiEqualTo(String value) {
            addCriterion("IPDiZhi =", value, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiNotEqualTo(String value) {
            addCriterion("IPDiZhi <>", value, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiGreaterThan(String value) {
            addCriterion("IPDiZhi >", value, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiGreaterThanOrEqualTo(String value) {
            addCriterion("IPDiZhi >=", value, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiLessThan(String value) {
            addCriterion("IPDiZhi <", value, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiLessThanOrEqualTo(String value) {
            addCriterion("IPDiZhi <=", value, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiLike(String value) {
            addCriterion("IPDiZhi like", value, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiNotLike(String value) {
            addCriterion("IPDiZhi not like", value, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiIn(List<String> values) {
            addCriterion("IPDiZhi in", values, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiNotIn(List<String> values) {
            addCriterion("IPDiZhi not in", values, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiBetween(String value1, String value2) {
            addCriterion("IPDiZhi between", value1, value2, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andIpdizhiNotBetween(String value1, String value2) {
            addCriterion("IPDiZhi not between", value1, value2, "ipdizhi");
            return (Criteria) this;
        }

        public Criteria andMokuaimingIsNull() {
            addCriterion("MoKuaiMing is null");
            return (Criteria) this;
        }

        public Criteria andMokuaimingIsNotNull() {
            addCriterion("MoKuaiMing is not null");
            return (Criteria) this;
        }

        public Criteria andMokuaimingEqualTo(String value) {
            addCriterion("MoKuaiMing =", value, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingNotEqualTo(String value) {
            addCriterion("MoKuaiMing <>", value, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingGreaterThan(String value) {
            addCriterion("MoKuaiMing >", value, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingGreaterThanOrEqualTo(String value) {
            addCriterion("MoKuaiMing >=", value, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingLessThan(String value) {
            addCriterion("MoKuaiMing <", value, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingLessThanOrEqualTo(String value) {
            addCriterion("MoKuaiMing <=", value, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingLike(String value) {
            addCriterion("MoKuaiMing like", value, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingNotLike(String value) {
            addCriterion("MoKuaiMing not like", value, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingIn(List<String> values) {
            addCriterion("MoKuaiMing in", values, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingNotIn(List<String> values) {
            addCriterion("MoKuaiMing not in", values, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingBetween(String value1, String value2) {
            addCriterion("MoKuaiMing between", value1, value2, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andMokuaimingNotBetween(String value1, String value2) {
            addCriterion("MoKuaiMing not between", value1, value2, "mokuaiming");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongIsNull() {
            addCriterion("CaoZuoNeiRong is null");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongIsNotNull() {
            addCriterion("CaoZuoNeiRong is not null");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongEqualTo(String value) {
            addCriterion("CaoZuoNeiRong =", value, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongNotEqualTo(String value) {
            addCriterion("CaoZuoNeiRong <>", value, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongGreaterThan(String value) {
            addCriterion("CaoZuoNeiRong >", value, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongGreaterThanOrEqualTo(String value) {
            addCriterion("CaoZuoNeiRong >=", value, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongLessThan(String value) {
            addCriterion("CaoZuoNeiRong <", value, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongLessThanOrEqualTo(String value) {
            addCriterion("CaoZuoNeiRong <=", value, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongLike(String value) {
            addCriterion("CaoZuoNeiRong like", value, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongNotLike(String value) {
            addCriterion("CaoZuoNeiRong not like", value, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongIn(List<String> values) {
            addCriterion("CaoZuoNeiRong in", values, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongNotIn(List<String> values) {
            addCriterion("CaoZuoNeiRong not in", values, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongBetween(String value1, String value2) {
            addCriterion("CaoZuoNeiRong between", value1, value2, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andCaozuoneirongNotBetween(String value1, String value2) {
            addCriterion("CaoZuoNeiRong not between", value1, value2, "caozuoneirong");
            return (Criteria) this;
        }

        public Criteria andLeimingIsNull() {
            addCriterion("LeiMing is null");
            return (Criteria) this;
        }

        public Criteria andLeimingIsNotNull() {
            addCriterion("LeiMing is not null");
            return (Criteria) this;
        }

        public Criteria andLeimingEqualTo(String value) {
            addCriterion("LeiMing =", value, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingNotEqualTo(String value) {
            addCriterion("LeiMing <>", value, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingGreaterThan(String value) {
            addCriterion("LeiMing >", value, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingGreaterThanOrEqualTo(String value) {
            addCriterion("LeiMing >=", value, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingLessThan(String value) {
            addCriterion("LeiMing <", value, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingLessThanOrEqualTo(String value) {
            addCriterion("LeiMing <=", value, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingLike(String value) {
            addCriterion("LeiMing like", value, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingNotLike(String value) {
            addCriterion("LeiMing not like", value, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingIn(List<String> values) {
            addCriterion("LeiMing in", values, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingNotIn(List<String> values) {
            addCriterion("LeiMing not in", values, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingBetween(String value1, String value2) {
            addCriterion("LeiMing between", value1, value2, "leiming");
            return (Criteria) this;
        }

        public Criteria andLeimingNotBetween(String value1, String value2) {
            addCriterion("LeiMing not between", value1, value2, "leiming");
            return (Criteria) this;
        }

        public Criteria andFangfamingIsNull() {
            addCriterion("FangFaMing is null");
            return (Criteria) this;
        }

        public Criteria andFangfamingIsNotNull() {
            addCriterion("FangFaMing is not null");
            return (Criteria) this;
        }

        public Criteria andFangfamingEqualTo(String value) {
            addCriterion("FangFaMing =", value, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingNotEqualTo(String value) {
            addCriterion("FangFaMing <>", value, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingGreaterThan(String value) {
            addCriterion("FangFaMing >", value, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingGreaterThanOrEqualTo(String value) {
            addCriterion("FangFaMing >=", value, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingLessThan(String value) {
            addCriterion("FangFaMing <", value, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingLessThanOrEqualTo(String value) {
            addCriterion("FangFaMing <=", value, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingLike(String value) {
            addCriterion("FangFaMing like", value, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingNotLike(String value) {
            addCriterion("FangFaMing not like", value, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingIn(List<String> values) {
            addCriterion("FangFaMing in", values, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingNotIn(List<String> values) {
            addCriterion("FangFaMing not in", values, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingBetween(String value1, String value2) {
            addCriterion("FangFaMing between", value1, value2, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andFangfamingNotBetween(String value1, String value2) {
            addCriterion("FangFaMing not between", value1, value2, "fangfaming");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongIsNull() {
            addCriterion("ShiFouChengGong is null");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongIsNotNull() {
            addCriterion("ShiFouChengGong is not null");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongEqualTo(Integer value) {
            addCriterion("ShiFouChengGong =", value, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongNotEqualTo(Integer value) {
            addCriterion("ShiFouChengGong <>", value, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongGreaterThan(Integer value) {
            addCriterion("ShiFouChengGong >", value, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouChengGong >=", value, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongLessThan(Integer value) {
            addCriterion("ShiFouChengGong <", value, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouChengGong <=", value, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongIn(List<Integer> values) {
            addCriterion("ShiFouChengGong in", values, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongNotIn(List<Integer> values) {
            addCriterion("ShiFouChengGong not in", values, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouChengGong between", value1, value2, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andShifouchenggongNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouChengGong not between", value1, value2, "shifouchenggong");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianIsNull() {
            addCriterion("CaoZuoShiJian is null");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianIsNotNull() {
            addCriterion("CaoZuoShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianEqualTo(Date value) {
            addCriterion("CaoZuoShiJian =", value, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianNotEqualTo(Date value) {
            addCriterion("CaoZuoShiJian <>", value, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianGreaterThan(Date value) {
            addCriterion("CaoZuoShiJian >", value, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("CaoZuoShiJian >=", value, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianLessThan(Date value) {
            addCriterion("CaoZuoShiJian <", value, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianLessThanOrEqualTo(Date value) {
            addCriterion("CaoZuoShiJian <=", value, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianIn(List<Date> values) {
            addCriterion("CaoZuoShiJian in", values, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianNotIn(List<Date> values) {
            addCriterion("CaoZuoShiJian not in", values, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianBetween(Date value1, Date value2) {
            addCriterion("CaoZuoShiJian between", value1, value2, "caozuoshijian");
            return (Criteria) this;
        }

        public Criteria andCaozuoshijianNotBetween(Date value1, Date value2) {
            addCriterion("CaoZuoShiJian not between", value1, value2, "caozuoshijian");
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