package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubSystemRemindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubSystemRemindExample() {
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

        public Criteria andTixingidIsNull() {
            addCriterion("TiXingID is null");
            return (Criteria) this;
        }

        public Criteria andTixingidIsNotNull() {
            addCriterion("TiXingID is not null");
            return (Criteria) this;
        }

        public Criteria andTixingidEqualTo(Integer value) {
            addCriterion("TiXingID =", value, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidNotEqualTo(Integer value) {
            addCriterion("TiXingID <>", value, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidGreaterThan(Integer value) {
            addCriterion("TiXingID >", value, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TiXingID >=", value, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidLessThan(Integer value) {
            addCriterion("TiXingID <", value, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidLessThanOrEqualTo(Integer value) {
            addCriterion("TiXingID <=", value, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidIn(List<Integer> values) {
            addCriterion("TiXingID in", values, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidNotIn(List<Integer> values) {
            addCriterion("TiXingID not in", values, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidBetween(Integer value1, Integer value2) {
            addCriterion("TiXingID between", value1, value2, "tixingid");
            return (Criteria) this;
        }

        public Criteria andTixingidNotBetween(Integer value1, Integer value2) {
            addCriterion("TiXingID not between", value1, value2, "tixingid");
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

        public Criteria andFasongzheidIsNull() {
            addCriterion("FaSongZheID is null");
            return (Criteria) this;
        }

        public Criteria andFasongzheidIsNotNull() {
            addCriterion("FaSongZheID is not null");
            return (Criteria) this;
        }

        public Criteria andFasongzheidEqualTo(Integer value) {
            addCriterion("FaSongZheID =", value, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidNotEqualTo(Integer value) {
            addCriterion("FaSongZheID <>", value, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidGreaterThan(Integer value) {
            addCriterion("FaSongZheID >", value, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FaSongZheID >=", value, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidLessThan(Integer value) {
            addCriterion("FaSongZheID <", value, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidLessThanOrEqualTo(Integer value) {
            addCriterion("FaSongZheID <=", value, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidIn(List<Integer> values) {
            addCriterion("FaSongZheID in", values, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidNotIn(List<Integer> values) {
            addCriterion("FaSongZheID not in", values, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidBetween(Integer value1, Integer value2) {
            addCriterion("FaSongZheID between", value1, value2, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andFasongzheidNotBetween(Integer value1, Integer value2) {
            addCriterion("FaSongZheID not between", value1, value2, "fasongzheid");
            return (Criteria) this;
        }

        public Criteria andTixingleibieIsNull() {
            addCriterion("TiXingLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andTixingleibieIsNotNull() {
            addCriterion("TiXingLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andTixingleibieEqualTo(Integer value) {
            addCriterion("TiXingLeiBie =", value, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieNotEqualTo(Integer value) {
            addCriterion("TiXingLeiBie <>", value, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieGreaterThan(Integer value) {
            addCriterion("TiXingLeiBie >", value, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieGreaterThanOrEqualTo(Integer value) {
            addCriterion("TiXingLeiBie >=", value, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieLessThan(Integer value) {
            addCriterion("TiXingLeiBie <", value, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieLessThanOrEqualTo(Integer value) {
            addCriterion("TiXingLeiBie <=", value, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieIn(List<Integer> values) {
            addCriterion("TiXingLeiBie in", values, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieNotIn(List<Integer> values) {
            addCriterion("TiXingLeiBie not in", values, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieBetween(Integer value1, Integer value2) {
            addCriterion("TiXingLeiBie between", value1, value2, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andTixingleibieNotBetween(Integer value1, Integer value2) {
            addCriterion("TiXingLeiBie not between", value1, value2, "tixingleibie");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongIsNull() {
            addCriterion("XiaoXiNeiRong is null");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongIsNotNull() {
            addCriterion("XiaoXiNeiRong is not null");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongEqualTo(String value) {
            addCriterion("XiaoXiNeiRong =", value, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongNotEqualTo(String value) {
            addCriterion("XiaoXiNeiRong <>", value, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongGreaterThan(String value) {
            addCriterion("XiaoXiNeiRong >", value, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongGreaterThanOrEqualTo(String value) {
            addCriterion("XiaoXiNeiRong >=", value, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongLessThan(String value) {
            addCriterion("XiaoXiNeiRong <", value, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongLessThanOrEqualTo(String value) {
            addCriterion("XiaoXiNeiRong <=", value, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongLike(String value) {
            addCriterion("XiaoXiNeiRong like", value, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongNotLike(String value) {
            addCriterion("XiaoXiNeiRong not like", value, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongIn(List<String> values) {
            addCriterion("XiaoXiNeiRong in", values, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongNotIn(List<String> values) {
            addCriterion("XiaoXiNeiRong not in", values, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongBetween(String value1, String value2) {
            addCriterion("XiaoXiNeiRong between", value1, value2, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andXiaoxineirongNotBetween(String value1, String value2) {
            addCriterion("XiaoXiNeiRong not between", value1, value2, "xiaoxineirong");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianIsNull() {
            addCriterion("JieShouShiJian is null");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianIsNotNull() {
            addCriterion("JieShouShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianEqualTo(Date value) {
            addCriterion("JieShouShiJian =", value, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianNotEqualTo(Date value) {
            addCriterion("JieShouShiJian <>", value, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianGreaterThan(Date value) {
            addCriterion("JieShouShiJian >", value, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("JieShouShiJian >=", value, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianLessThan(Date value) {
            addCriterion("JieShouShiJian <", value, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianLessThanOrEqualTo(Date value) {
            addCriterion("JieShouShiJian <=", value, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianIn(List<Date> values) {
            addCriterion("JieShouShiJian in", values, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianNotIn(List<Date> values) {
            addCriterion("JieShouShiJian not in", values, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianBetween(Date value1, Date value2) {
            addCriterion("JieShouShiJian between", value1, value2, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andJieshoushijianNotBetween(Date value1, Date value2) {
            addCriterion("JieShouShiJian not between", value1, value2, "jieshoushijian");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliIsNull() {
            addCriterion("ShiFouYiChuLi is null");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliIsNotNull() {
            addCriterion("ShiFouYiChuLi is not null");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliEqualTo(Integer value) {
            addCriterion("ShiFouYiChuLi =", value, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliNotEqualTo(Integer value) {
            addCriterion("ShiFouYiChuLi <>", value, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliGreaterThan(Integer value) {
            addCriterion("ShiFouYiChuLi >", value, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYiChuLi >=", value, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliLessThan(Integer value) {
            addCriterion("ShiFouYiChuLi <", value, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouYiChuLi <=", value, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliIn(List<Integer> values) {
            addCriterion("ShiFouYiChuLi in", values, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliNotIn(List<Integer> values) {
            addCriterion("ShiFouYiChuLi not in", values, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYiChuLi between", value1, value2, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andShifouyichuliNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouYiChuLi not between", value1, value2, "shifouyichuli");
            return (Criteria) this;
        }

        public Criteria andTupianurlIsNull() {
            addCriterion("TuPianURL is null");
            return (Criteria) this;
        }

        public Criteria andTupianurlIsNotNull() {
            addCriterion("TuPianURL is not null");
            return (Criteria) this;
        }

        public Criteria andTupianurlEqualTo(String value) {
            addCriterion("TuPianURL =", value, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlNotEqualTo(String value) {
            addCriterion("TuPianURL <>", value, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlGreaterThan(String value) {
            addCriterion("TuPianURL >", value, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlGreaterThanOrEqualTo(String value) {
            addCriterion("TuPianURL >=", value, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlLessThan(String value) {
            addCriterion("TuPianURL <", value, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlLessThanOrEqualTo(String value) {
            addCriterion("TuPianURL <=", value, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlLike(String value) {
            addCriterion("TuPianURL like", value, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlNotLike(String value) {
            addCriterion("TuPianURL not like", value, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlIn(List<String> values) {
            addCriterion("TuPianURL in", values, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlNotIn(List<String> values) {
            addCriterion("TuPianURL not in", values, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlBetween(String value1, String value2) {
            addCriterion("TuPianURL between", value1, value2, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andTupianurlNotBetween(String value1, String value2) {
            addCriterion("TuPianURL not between", value1, value2, "tupianurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlIsNull() {
            addCriterion("FaSongZheTouXiangURL is null");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlIsNotNull() {
            addCriterion("FaSongZheTouXiangURL is not null");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlEqualTo(String value) {
            addCriterion("FaSongZheTouXiangURL =", value, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlNotEqualTo(String value) {
            addCriterion("FaSongZheTouXiangURL <>", value, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlGreaterThan(String value) {
            addCriterion("FaSongZheTouXiangURL >", value, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlGreaterThanOrEqualTo(String value) {
            addCriterion("FaSongZheTouXiangURL >=", value, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlLessThan(String value) {
            addCriterion("FaSongZheTouXiangURL <", value, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlLessThanOrEqualTo(String value) {
            addCriterion("FaSongZheTouXiangURL <=", value, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlLike(String value) {
            addCriterion("FaSongZheTouXiangURL like", value, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlNotLike(String value) {
            addCriterion("FaSongZheTouXiangURL not like", value, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlIn(List<String> values) {
            addCriterion("FaSongZheTouXiangURL in", values, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlNotIn(List<String> values) {
            addCriterion("FaSongZheTouXiangURL not in", values, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlBetween(String value1, String value2) {
            addCriterion("FaSongZheTouXiangURL between", value1, value2, "fasongzhetouxiangurl");
            return (Criteria) this;
        }

        public Criteria andFasongzhetouxiangurlNotBetween(String value1, String value2) {
            addCriterion("FaSongZheTouXiangURL not between", value1, value2, "fasongzhetouxiangurl");
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