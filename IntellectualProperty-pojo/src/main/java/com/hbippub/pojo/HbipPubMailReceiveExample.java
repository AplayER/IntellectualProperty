package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubMailReceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubMailReceiveExample() {
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

        public Criteria andJieshourenidIsNull() {
            addCriterion("JieShouRenID is null");
            return (Criteria) this;
        }

        public Criteria andJieshourenidIsNotNull() {
            addCriterion("JieShouRenID is not null");
            return (Criteria) this;
        }

        public Criteria andJieshourenidEqualTo(Integer value) {
            addCriterion("JieShouRenID =", value, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidNotEqualTo(Integer value) {
            addCriterion("JieShouRenID <>", value, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidGreaterThan(Integer value) {
            addCriterion("JieShouRenID >", value, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JieShouRenID >=", value, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidLessThan(Integer value) {
            addCriterion("JieShouRenID <", value, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidLessThanOrEqualTo(Integer value) {
            addCriterion("JieShouRenID <=", value, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidIn(List<Integer> values) {
            addCriterion("JieShouRenID in", values, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidNotIn(List<Integer> values) {
            addCriterion("JieShouRenID not in", values, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidBetween(Integer value1, Integer value2) {
            addCriterion("JieShouRenID between", value1, value2, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenidNotBetween(Integer value1, Integer value2) {
            addCriterion("JieShouRenID not between", value1, value2, "jieshourenid");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingIsNull() {
            addCriterion("JieShouRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingIsNotNull() {
            addCriterion("JieShouRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingEqualTo(String value) {
            addCriterion("JieShouRenXingMing =", value, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingNotEqualTo(String value) {
            addCriterion("JieShouRenXingMing <>", value, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingGreaterThan(String value) {
            addCriterion("JieShouRenXingMing >", value, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("JieShouRenXingMing >=", value, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingLessThan(String value) {
            addCriterion("JieShouRenXingMing <", value, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingLessThanOrEqualTo(String value) {
            addCriterion("JieShouRenXingMing <=", value, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingLike(String value) {
            addCriterion("JieShouRenXingMing like", value, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingNotLike(String value) {
            addCriterion("JieShouRenXingMing not like", value, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingIn(List<String> values) {
            addCriterion("JieShouRenXingMing in", values, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingNotIn(List<String> values) {
            addCriterion("JieShouRenXingMing not in", values, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingBetween(String value1, String value2) {
            addCriterion("JieShouRenXingMing between", value1, value2, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andJieshourenxingmingNotBetween(String value1, String value2) {
            addCriterion("JieShouRenXingMing not between", value1, value2, "jieshourenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingIsNull() {
            addCriterion("FaJianRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingIsNotNull() {
            addCriterion("FaJianRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingEqualTo(String value) {
            addCriterion("FaJianRenXingMing =", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingNotEqualTo(String value) {
            addCriterion("FaJianRenXingMing <>", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingGreaterThan(String value) {
            addCriterion("FaJianRenXingMing >", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FaJianRenXingMing >=", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingLessThan(String value) {
            addCriterion("FaJianRenXingMing <", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingLessThanOrEqualTo(String value) {
            addCriterion("FaJianRenXingMing <=", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingLike(String value) {
            addCriterion("FaJianRenXingMing like", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingNotLike(String value) {
            addCriterion("FaJianRenXingMing not like", value, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingIn(List<String> values) {
            addCriterion("FaJianRenXingMing in", values, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingNotIn(List<String> values) {
            addCriterion("FaJianRenXingMing not in", values, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingBetween(String value1, String value2) {
            addCriterion("FaJianRenXingMing between", value1, value2, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andFajianrenxingmingNotBetween(String value1, String value2) {
            addCriterion("FaJianRenXingMing not between", value1, value2, "fajianrenxingming");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiIsNull() {
            addCriterion("YouJianZhuTi is null");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiIsNotNull() {
            addCriterion("YouJianZhuTi is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiEqualTo(String value) {
            addCriterion("YouJianZhuTi =", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiNotEqualTo(String value) {
            addCriterion("YouJianZhuTi <>", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiGreaterThan(String value) {
            addCriterion("YouJianZhuTi >", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiGreaterThanOrEqualTo(String value) {
            addCriterion("YouJianZhuTi >=", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiLessThan(String value) {
            addCriterion("YouJianZhuTi <", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiLessThanOrEqualTo(String value) {
            addCriterion("YouJianZhuTi <=", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiLike(String value) {
            addCriterion("YouJianZhuTi like", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiNotLike(String value) {
            addCriterion("YouJianZhuTi not like", value, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiIn(List<String> values) {
            addCriterion("YouJianZhuTi in", values, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiNotIn(List<String> values) {
            addCriterion("YouJianZhuTi not in", values, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiBetween(String value1, String value2) {
            addCriterion("YouJianZhuTi between", value1, value2, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianzhutiNotBetween(String value1, String value2) {
            addCriterion("YouJianZhuTi not between", value1, value2, "youjianzhuti");
            return (Criteria) this;
        }

        public Criteria andYoujianidIsNull() {
            addCriterion("YouJianID is null");
            return (Criteria) this;
        }

        public Criteria andYoujianidIsNotNull() {
            addCriterion("YouJianID is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianidEqualTo(Integer value) {
            addCriterion("YouJianID =", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotEqualTo(Integer value) {
            addCriterion("YouJianID <>", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidGreaterThan(Integer value) {
            addCriterion("YouJianID >", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouJianID >=", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidLessThan(Integer value) {
            addCriterion("YouJianID <", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidLessThanOrEqualTo(Integer value) {
            addCriterion("YouJianID <=", value, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidIn(List<Integer> values) {
            addCriterion("YouJianID in", values, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotIn(List<Integer> values) {
            addCriterion("YouJianID not in", values, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidBetween(Integer value1, Integer value2) {
            addCriterion("YouJianID between", value1, value2, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianidNotBetween(Integer value1, Integer value2) {
            addCriterion("YouJianID not between", value1, value2, "youjianid");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingIsNull() {
            addCriterion("YouJianLeiXing is null");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingIsNotNull() {
            addCriterion("YouJianLeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingEqualTo(Integer value) {
            addCriterion("YouJianLeiXing =", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingNotEqualTo(Integer value) {
            addCriterion("YouJianLeiXing <>", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingGreaterThan(Integer value) {
            addCriterion("YouJianLeiXing >", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouJianLeiXing >=", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingLessThan(Integer value) {
            addCriterion("YouJianLeiXing <", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingLessThanOrEqualTo(Integer value) {
            addCriterion("YouJianLeiXing <=", value, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingIn(List<Integer> values) {
            addCriterion("YouJianLeiXing in", values, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingNotIn(List<Integer> values) {
            addCriterion("YouJianLeiXing not in", values, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingBetween(Integer value1, Integer value2) {
            addCriterion("YouJianLeiXing between", value1, value2, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianleixingNotBetween(Integer value1, Integer value2) {
            addCriterion("YouJianLeiXing not between", value1, value2, "youjianleixing");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiIsNull() {
            addCriterion("YouJianZhuangTai is null");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiIsNotNull() {
            addCriterion("YouJianZhuangTai is not null");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiEqualTo(Integer value) {
            addCriterion("YouJianZhuangTai =", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiNotEqualTo(Integer value) {
            addCriterion("YouJianZhuangTai <>", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiGreaterThan(Integer value) {
            addCriterion("YouJianZhuangTai >", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouJianZhuangTai >=", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiLessThan(Integer value) {
            addCriterion("YouJianZhuangTai <", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("YouJianZhuangTai <=", value, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiIn(List<Integer> values) {
            addCriterion("YouJianZhuangTai in", values, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiNotIn(List<Integer> values) {
            addCriterion("YouJianZhuangTai not in", values, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("YouJianZhuangTai between", value1, value2, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andYoujianzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("YouJianZhuangTai not between", value1, value2, "youjianzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongIsNull() {
            addCriterion("ShiFouChaoSong is null");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongIsNotNull() {
            addCriterion("ShiFouChaoSong is not null");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongEqualTo(Integer value) {
            addCriterion("ShiFouChaoSong =", value, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongNotEqualTo(Integer value) {
            addCriterion("ShiFouChaoSong <>", value, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongGreaterThan(Integer value) {
            addCriterion("ShiFouChaoSong >", value, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouChaoSong >=", value, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongLessThan(Integer value) {
            addCriterion("ShiFouChaoSong <", value, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouChaoSong <=", value, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongIn(List<Integer> values) {
            addCriterion("ShiFouChaoSong in", values, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongNotIn(List<Integer> values) {
            addCriterion("ShiFouChaoSong not in", values, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouChaoSong between", value1, value2, "shifouchaosong");
            return (Criteria) this;
        }

        public Criteria andShifouchaosongNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouChaoSong not between", value1, value2, "shifouchaosong");
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

        public Criteria andShijianIsNull() {
            addCriterion("ShiJian is null");
            return (Criteria) this;
        }

        public Criteria andShijianIsNotNull() {
            addCriterion("ShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andShijianEqualTo(Date value) {
            addCriterion("ShiJian =", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotEqualTo(Date value) {
            addCriterion("ShiJian <>", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThan(Date value) {
            addCriterion("ShiJian >", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThanOrEqualTo(Date value) {
            addCriterion("ShiJian >=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThan(Date value) {
            addCriterion("ShiJian <", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThanOrEqualTo(Date value) {
            addCriterion("ShiJian <=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianIn(List<Date> values) {
            addCriterion("ShiJian in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotIn(List<Date> values) {
            addCriterion("ShiJian not in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianBetween(Date value1, Date value2) {
            addCriterion("ShiJian between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotBetween(Date value1, Date value2) {
            addCriterion("ShiJian not between", value1, value2, "shijian");
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