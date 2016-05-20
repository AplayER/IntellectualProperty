package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HbipPubReptileResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubReptileResultExample() {
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

        public Criteria andPaqujieguoidIsNull() {
            addCriterion("PaQuJieGuoID is null");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidIsNotNull() {
            addCriterion("PaQuJieGuoID is not null");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidEqualTo(Integer value) {
            addCriterion("PaQuJieGuoID =", value, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidNotEqualTo(Integer value) {
            addCriterion("PaQuJieGuoID <>", value, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidGreaterThan(Integer value) {
            addCriterion("PaQuJieGuoID >", value, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaQuJieGuoID >=", value, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidLessThan(Integer value) {
            addCriterion("PaQuJieGuoID <", value, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidLessThanOrEqualTo(Integer value) {
            addCriterion("PaQuJieGuoID <=", value, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidIn(List<Integer> values) {
            addCriterion("PaQuJieGuoID in", values, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidNotIn(List<Integer> values) {
            addCriterion("PaQuJieGuoID not in", values, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidBetween(Integer value1, Integer value2) {
            addCriterion("PaQuJieGuoID between", value1, value2, "paqujieguoid");
            return (Criteria) this;
        }

        public Criteria andPaqujieguoidNotBetween(Integer value1, Integer value2) {
            addCriterion("PaQuJieGuoID not between", value1, value2, "paqujieguoid");
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

        public Criteria andWangzhiIsNull() {
            addCriterion("WangZhi is null");
            return (Criteria) this;
        }

        public Criteria andWangzhiIsNotNull() {
            addCriterion("WangZhi is not null");
            return (Criteria) this;
        }

        public Criteria andWangzhiEqualTo(String value) {
            addCriterion("WangZhi =", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotEqualTo(String value) {
            addCriterion("WangZhi <>", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiGreaterThan(String value) {
            addCriterion("WangZhi >", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiGreaterThanOrEqualTo(String value) {
            addCriterion("WangZhi >=", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLessThan(String value) {
            addCriterion("WangZhi <", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLessThanOrEqualTo(String value) {
            addCriterion("WangZhi <=", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiLike(String value) {
            addCriterion("WangZhi like", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotLike(String value) {
            addCriterion("WangZhi not like", value, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiIn(List<String> values) {
            addCriterion("WangZhi in", values, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotIn(List<String> values) {
            addCriterion("WangZhi not in", values, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiBetween(String value1, String value2) {
            addCriterion("WangZhi between", value1, value2, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWangzhiNotBetween(String value1, String value2) {
            addCriterion("WangZhi not between", value1, value2, "wangzhi");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiIsNull() {
            addCriterion("WenZhangBiaoTi is null");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiIsNotNull() {
            addCriterion("WenZhangBiaoTi is not null");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiEqualTo(String value) {
            addCriterion("WenZhangBiaoTi =", value, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiNotEqualTo(String value) {
            addCriterion("WenZhangBiaoTi <>", value, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiGreaterThan(String value) {
            addCriterion("WenZhangBiaoTi >", value, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("WenZhangBiaoTi >=", value, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiLessThan(String value) {
            addCriterion("WenZhangBiaoTi <", value, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiLessThanOrEqualTo(String value) {
            addCriterion("WenZhangBiaoTi <=", value, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiLike(String value) {
            addCriterion("WenZhangBiaoTi like", value, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiNotLike(String value) {
            addCriterion("WenZhangBiaoTi not like", value, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiIn(List<String> values) {
            addCriterion("WenZhangBiaoTi in", values, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiNotIn(List<String> values) {
            addCriterion("WenZhangBiaoTi not in", values, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiBetween(String value1, String value2) {
            addCriterion("WenZhangBiaoTi between", value1, value2, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andWenzhangbiaotiNotBetween(String value1, String value2) {
            addCriterion("WenZhangBiaoTi not between", value1, value2, "wenzhangbiaoti");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianIsNull() {
            addCriterion("FaBiaoShiJian is null");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianIsNotNull() {
            addCriterion("FaBiaoShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianEqualTo(Date value) {
            addCriterion("FaBiaoShiJian =", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianNotEqualTo(Date value) {
            addCriterion("FaBiaoShiJian <>", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianGreaterThan(Date value) {
            addCriterion("FaBiaoShiJian >", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("FaBiaoShiJian >=", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianLessThan(Date value) {
            addCriterion("FaBiaoShiJian <", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianLessThanOrEqualTo(Date value) {
            addCriterion("FaBiaoShiJian <=", value, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianIn(List<Date> values) {
            addCriterion("FaBiaoShiJian in", values, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianNotIn(List<Date> values) {
            addCriterion("FaBiaoShiJian not in", values, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianBetween(Date value1, Date value2) {
            addCriterion("FaBiaoShiJian between", value1, value2, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andFabiaoshijianNotBetween(Date value1, Date value2) {
            addCriterion("FaBiaoShiJian not between", value1, value2, "fabiaoshijian");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingIsNull() {
            addCriterion("ZuoZheXingMing is null");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingIsNotNull() {
            addCriterion("ZuoZheXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingEqualTo(String value) {
            addCriterion("ZuoZheXingMing =", value, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingNotEqualTo(String value) {
            addCriterion("ZuoZheXingMing <>", value, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingGreaterThan(String value) {
            addCriterion("ZuoZheXingMing >", value, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingGreaterThanOrEqualTo(String value) {
            addCriterion("ZuoZheXingMing >=", value, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingLessThan(String value) {
            addCriterion("ZuoZheXingMing <", value, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingLessThanOrEqualTo(String value) {
            addCriterion("ZuoZheXingMing <=", value, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingLike(String value) {
            addCriterion("ZuoZheXingMing like", value, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingNotLike(String value) {
            addCriterion("ZuoZheXingMing not like", value, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingIn(List<String> values) {
            addCriterion("ZuoZheXingMing in", values, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingNotIn(List<String> values) {
            addCriterion("ZuoZheXingMing not in", values, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingBetween(String value1, String value2) {
            addCriterion("ZuoZheXingMing between", value1, value2, "zuozhexingming");
            return (Criteria) this;
        }

        public Criteria andZuozhexingmingNotBetween(String value1, String value2) {
            addCriterion("ZuoZheXingMing not between", value1, value2, "zuozhexingming");
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

        public Criteria andPaqushijianIsNull() {
            addCriterion("PaQuShiJian is null");
            return (Criteria) this;
        }

        public Criteria andPaqushijianIsNotNull() {
            addCriterion("PaQuShiJian is not null");
            return (Criteria) this;
        }

        public Criteria andPaqushijianEqualTo(Date value) {
            addCriterion("PaQuShiJian =", value, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianNotEqualTo(Date value) {
            addCriterion("PaQuShiJian <>", value, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianGreaterThan(Date value) {
            addCriterion("PaQuShiJian >", value, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("PaQuShiJian >=", value, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianLessThan(Date value) {
            addCriterion("PaQuShiJian <", value, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianLessThanOrEqualTo(Date value) {
            addCriterion("PaQuShiJian <=", value, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianIn(List<Date> values) {
            addCriterion("PaQuShiJian in", values, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianNotIn(List<Date> values) {
            addCriterion("PaQuShiJian not in", values, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianBetween(Date value1, Date value2) {
            addCriterion("PaQuShiJian between", value1, value2, "paqushijian");
            return (Criteria) this;
        }

        public Criteria andPaqushijianNotBetween(Date value1, Date value2) {
            addCriterion("PaQuShiJian not between", value1, value2, "paqushijian");
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