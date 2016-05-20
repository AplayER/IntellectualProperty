package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.List;

public class HbipPubMailboxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubMailboxExample() {
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

        public Criteria andYouxiangidIsNull() {
            addCriterion("YouXiangID is null");
            return (Criteria) this;
        }

        public Criteria andYouxiangidIsNotNull() {
            addCriterion("YouXiangID is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiangidEqualTo(Integer value) {
            addCriterion("YouXiangID =", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidNotEqualTo(Integer value) {
            addCriterion("YouXiangID <>", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidGreaterThan(Integer value) {
            addCriterion("YouXiangID >", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidGreaterThanOrEqualTo(Integer value) {
            addCriterion("YouXiangID >=", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidLessThan(Integer value) {
            addCriterion("YouXiangID <", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidLessThanOrEqualTo(Integer value) {
            addCriterion("YouXiangID <=", value, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidIn(List<Integer> values) {
            addCriterion("YouXiangID in", values, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidNotIn(List<Integer> values) {
            addCriterion("YouXiangID not in", values, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidBetween(Integer value1, Integer value2) {
            addCriterion("YouXiangID between", value1, value2, "youxiangid");
            return (Criteria) this;
        }

        public Criteria andYouxiangidNotBetween(Integer value1, Integer value2) {
            addCriterion("YouXiangID not between", value1, value2, "youxiangid");
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

        public Criteria andYouxiangmimaIsNull() {
            addCriterion("YouXiangMiMa is null");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaIsNotNull() {
            addCriterion("YouXiangMiMa is not null");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaEqualTo(String value) {
            addCriterion("YouXiangMiMa =", value, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaNotEqualTo(String value) {
            addCriterion("YouXiangMiMa <>", value, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaGreaterThan(String value) {
            addCriterion("YouXiangMiMa >", value, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaGreaterThanOrEqualTo(String value) {
            addCriterion("YouXiangMiMa >=", value, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaLessThan(String value) {
            addCriterion("YouXiangMiMa <", value, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaLessThanOrEqualTo(String value) {
            addCriterion("YouXiangMiMa <=", value, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaLike(String value) {
            addCriterion("YouXiangMiMa like", value, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaNotLike(String value) {
            addCriterion("YouXiangMiMa not like", value, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaIn(List<String> values) {
            addCriterion("YouXiangMiMa in", values, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaNotIn(List<String> values) {
            addCriterion("YouXiangMiMa not in", values, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaBetween(String value1, String value2) {
            addCriterion("YouXiangMiMa between", value1, value2, "youxiangmima");
            return (Criteria) this;
        }

        public Criteria andYouxiangmimaNotBetween(String value1, String value2) {
            addCriterion("YouXiangMiMa not between", value1, value2, "youxiangmima");
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

        public Criteria andDuankouIsNull() {
            addCriterion("DuanKou is null");
            return (Criteria) this;
        }

        public Criteria andDuankouIsNotNull() {
            addCriterion("DuanKou is not null");
            return (Criteria) this;
        }

        public Criteria andDuankouEqualTo(Integer value) {
            addCriterion("DuanKou =", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouNotEqualTo(Integer value) {
            addCriterion("DuanKou <>", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouGreaterThan(Integer value) {
            addCriterion("DuanKou >", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouGreaterThanOrEqualTo(Integer value) {
            addCriterion("DuanKou >=", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouLessThan(Integer value) {
            addCriterion("DuanKou <", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouLessThanOrEqualTo(Integer value) {
            addCriterion("DuanKou <=", value, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouIn(List<Integer> values) {
            addCriterion("DuanKou in", values, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouNotIn(List<Integer> values) {
            addCriterion("DuanKou not in", values, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouBetween(Integer value1, Integer value2) {
            addCriterion("DuanKou between", value1, value2, "duankou");
            return (Criteria) this;
        }

        public Criteria andDuankouNotBetween(Integer value1, Integer value2) {
            addCriterion("DuanKou not between", value1, value2, "duankou");
            return (Criteria) this;
        }

        public Criteria andXieyiIsNull() {
            addCriterion("XieYi is null");
            return (Criteria) this;
        }

        public Criteria andXieyiIsNotNull() {
            addCriterion("XieYi is not null");
            return (Criteria) this;
        }

        public Criteria andXieyiEqualTo(String value) {
            addCriterion("XieYi =", value, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiNotEqualTo(String value) {
            addCriterion("XieYi <>", value, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiGreaterThan(String value) {
            addCriterion("XieYi >", value, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiGreaterThanOrEqualTo(String value) {
            addCriterion("XieYi >=", value, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiLessThan(String value) {
            addCriterion("XieYi <", value, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiLessThanOrEqualTo(String value) {
            addCriterion("XieYi <=", value, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiLike(String value) {
            addCriterion("XieYi like", value, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiNotLike(String value) {
            addCriterion("XieYi not like", value, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiIn(List<String> values) {
            addCriterion("XieYi in", values, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiNotIn(List<String> values) {
            addCriterion("XieYi not in", values, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiBetween(String value1, String value2) {
            addCriterion("XieYi between", value1, value2, "xieyi");
            return (Criteria) this;
        }

        public Criteria andXieyiNotBetween(String value1, String value2) {
            addCriterion("XieYi not between", value1, value2, "xieyi");
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