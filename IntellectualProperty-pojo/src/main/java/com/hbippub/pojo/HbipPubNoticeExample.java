package com.hbippub.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HbipPubNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HbipPubNoticeExample() {
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

        public Criteria andLiulancishuIsNull() {
            addCriterion("LiuLanCiShu is null");
            return (Criteria) this;
        }

        public Criteria andLiulancishuIsNotNull() {
            addCriterion("LiuLanCiShu is not null");
            return (Criteria) this;
        }

        public Criteria andLiulancishuEqualTo(Integer value) {
            addCriterion("LiuLanCiShu =", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuNotEqualTo(Integer value) {
            addCriterion("LiuLanCiShu <>", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuGreaterThan(Integer value) {
            addCriterion("LiuLanCiShu >", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("LiuLanCiShu >=", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuLessThan(Integer value) {
            addCriterion("LiuLanCiShu <", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuLessThanOrEqualTo(Integer value) {
            addCriterion("LiuLanCiShu <=", value, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuIn(List<Integer> values) {
            addCriterion("LiuLanCiShu in", values, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuNotIn(List<Integer> values) {
            addCriterion("LiuLanCiShu not in", values, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuBetween(Integer value1, Integer value2) {
            addCriterion("LiuLanCiShu between", value1, value2, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andLiulancishuNotBetween(Integer value1, Integer value2) {
            addCriterion("LiuLanCiShu not between", value1, value2, "liulancishu");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiIsNull() {
            addCriterion("ShiFouXiangMuTongZhi is null");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiIsNotNull() {
            addCriterion("ShiFouXiangMuTongZhi is not null");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiEqualTo(Integer value) {
            addCriterion("ShiFouXiangMuTongZhi =", value, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiNotEqualTo(Integer value) {
            addCriterion("ShiFouXiangMuTongZhi <>", value, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiGreaterThan(Integer value) {
            addCriterion("ShiFouXiangMuTongZhi >", value, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShiFouXiangMuTongZhi >=", value, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiLessThan(Integer value) {
            addCriterion("ShiFouXiangMuTongZhi <", value, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiLessThanOrEqualTo(Integer value) {
            addCriterion("ShiFouXiangMuTongZhi <=", value, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiIn(List<Integer> values) {
            addCriterion("ShiFouXiangMuTongZhi in", values, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiNotIn(List<Integer> values) {
            addCriterion("ShiFouXiangMuTongZhi not in", values, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouXiangMuTongZhi between", value1, value2, "shifouxiangmutongzhi");
            return (Criteria) this;
        }

        public Criteria andShifouxiangmutongzhiNotBetween(Integer value1, Integer value2) {
            addCriterion("ShiFouXiangMuTongZhi not between", value1, value2, "shifouxiangmutongzhi");
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

        public Criteria andTongzhileibieIsNull() {
            addCriterion("TongZhiLeiBie is null");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieIsNotNull() {
            addCriterion("TongZhiLeiBie is not null");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieEqualTo(Integer value) {
            addCriterion("TongZhiLeiBie =", value, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieNotEqualTo(Integer value) {
            addCriterion("TongZhiLeiBie <>", value, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieGreaterThan(Integer value) {
            addCriterion("TongZhiLeiBie >", value, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieGreaterThanOrEqualTo(Integer value) {
            addCriterion("TongZhiLeiBie >=", value, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieLessThan(Integer value) {
            addCriterion("TongZhiLeiBie <", value, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieLessThanOrEqualTo(Integer value) {
            addCriterion("TongZhiLeiBie <=", value, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieIn(List<Integer> values) {
            addCriterion("TongZhiLeiBie in", values, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieNotIn(List<Integer> values) {
            addCriterion("TongZhiLeiBie not in", values, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieBetween(Integer value1, Integer value2) {
            addCriterion("TongZhiLeiBie between", value1, value2, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhileibieNotBetween(Integer value1, Integer value2) {
            addCriterion("TongZhiLeiBie not between", value1, value2, "tongzhileibie");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiIsNull() {
            addCriterion("TongZhiBiaoTi is null");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiIsNotNull() {
            addCriterion("TongZhiBiaoTi is not null");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiEqualTo(String value) {
            addCriterion("TongZhiBiaoTi =", value, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiNotEqualTo(String value) {
            addCriterion("TongZhiBiaoTi <>", value, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiGreaterThan(String value) {
            addCriterion("TongZhiBiaoTi >", value, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("TongZhiBiaoTi >=", value, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiLessThan(String value) {
            addCriterion("TongZhiBiaoTi <", value, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiLessThanOrEqualTo(String value) {
            addCriterion("TongZhiBiaoTi <=", value, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiLike(String value) {
            addCriterion("TongZhiBiaoTi like", value, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiNotLike(String value) {
            addCriterion("TongZhiBiaoTi not like", value, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiIn(List<String> values) {
            addCriterion("TongZhiBiaoTi in", values, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiNotIn(List<String> values) {
            addCriterion("TongZhiBiaoTi not in", values, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiBetween(String value1, String value2) {
            addCriterion("TongZhiBiaoTi between", value1, value2, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andTongzhibiaotiNotBetween(String value1, String value2) {
            addCriterion("TongZhiBiaoTi not between", value1, value2, "tongzhibiaoti");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingIsNull() {
            addCriterion("FaBuRenXingMing is null");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingIsNotNull() {
            addCriterion("FaBuRenXingMing is not null");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingEqualTo(String value) {
            addCriterion("FaBuRenXingMing =", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingNotEqualTo(String value) {
            addCriterion("FaBuRenXingMing <>", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingGreaterThan(String value) {
            addCriterion("FaBuRenXingMing >", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("FaBuRenXingMing >=", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingLessThan(String value) {
            addCriterion("FaBuRenXingMing <", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingLessThanOrEqualTo(String value) {
            addCriterion("FaBuRenXingMing <=", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingLike(String value) {
            addCriterion("FaBuRenXingMing like", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingNotLike(String value) {
            addCriterion("FaBuRenXingMing not like", value, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingIn(List<String> values) {
            addCriterion("FaBuRenXingMing in", values, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingNotIn(List<String> values) {
            addCriterion("FaBuRenXingMing not in", values, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingBetween(String value1, String value2) {
            addCriterion("FaBuRenXingMing between", value1, value2, "faburenxingming");
            return (Criteria) this;
        }

        public Criteria andFaburenxingmingNotBetween(String value1, String value2) {
            addCriterion("FaBuRenXingMing not between", value1, value2, "faburenxingming");
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

        public Criteria andTongzhixiangqingIsNull() {
            addCriterion("TongZhiXiangQing is null");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingIsNotNull() {
            addCriterion("TongZhiXiangQing is not null");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingEqualTo(String value) {
            addCriterion("TongZhiXiangQing =", value, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingNotEqualTo(String value) {
            addCriterion("TongZhiXiangQing <>", value, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingGreaterThan(String value) {
            addCriterion("TongZhiXiangQing >", value, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingGreaterThanOrEqualTo(String value) {
            addCriterion("TongZhiXiangQing >=", value, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingLessThan(String value) {
            addCriterion("TongZhiXiangQing <", value, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingLessThanOrEqualTo(String value) {
            addCriterion("TongZhiXiangQing <=", value, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingLike(String value) {
            addCriterion("TongZhiXiangQing like", value, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingNotLike(String value) {
            addCriterion("TongZhiXiangQing not like", value, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingIn(List<String> values) {
            addCriterion("TongZhiXiangQing in", values, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingNotIn(List<String> values) {
            addCriterion("TongZhiXiangQing not in", values, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingBetween(String value1, String value2) {
            addCriterion("TongZhiXiangQing between", value1, value2, "tongzhixiangqing");
            return (Criteria) this;
        }

        public Criteria andTongzhixiangqingNotBetween(String value1, String value2) {
            addCriterion("TongZhiXiangQing not between", value1, value2, "tongzhixiangqing");
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