package com.aistar.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public CouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
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

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayIsNull() {
            addCriterion("coupon_startday is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayIsNotNull() {
            addCriterion("coupon_startday is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayEqualTo(Date value) {
            addCriterion("coupon_startday =", value, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayNotEqualTo(Date value) {
            addCriterion("coupon_startday <>", value, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayGreaterThan(Date value) {
            addCriterion("coupon_startday >", value, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_startday >=", value, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayLessThan(Date value) {
            addCriterion("coupon_startday <", value, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayLessThanOrEqualTo(Date value) {
            addCriterion("coupon_startday <=", value, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayIn(List<Date> values) {
            addCriterion("coupon_startday in", values, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayNotIn(List<Date> values) {
            addCriterion("coupon_startday not in", values, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayBetween(Date value1, Date value2) {
            addCriterion("coupon_startday between", value1, value2, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponStartdayNotBetween(Date value1, Date value2) {
            addCriterion("coupon_startday not between", value1, value2, "couponStartday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayIsNull() {
            addCriterion("coupon_endday is null");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayIsNotNull() {
            addCriterion("coupon_endday is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayEqualTo(Date value) {
            addCriterion("coupon_endday =", value, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayNotEqualTo(Date value) {
            addCriterion("coupon_endday <>", value, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayGreaterThan(Date value) {
            addCriterion("coupon_endday >", value, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_endday >=", value, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayLessThan(Date value) {
            addCriterion("coupon_endday <", value, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayLessThanOrEqualTo(Date value) {
            addCriterion("coupon_endday <=", value, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayIn(List<Date> values) {
            addCriterion("coupon_endday in", values, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayNotIn(List<Date> values) {
            addCriterion("coupon_endday not in", values, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayBetween(Date value1, Date value2) {
            addCriterion("coupon_endday between", value1, value2, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponEnddayNotBetween(Date value1, Date value2) {
            addCriterion("coupon_endday not between", value1, value2, "couponEndday");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNull() {
            addCriterion("coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNotNull() {
            addCriterion("coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyEqualTo(Integer value) {
            addCriterion("coupon_money =", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotEqualTo(Integer value) {
            addCriterion("coupon_money <>", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThan(Integer value) {
            addCriterion("coupon_money >", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_money >=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThan(Integer value) {
            addCriterion("coupon_money <", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_money <=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIn(List<Integer> values) {
            addCriterion("coupon_money in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotIn(List<Integer> values) {
            addCriterion("coupon_money not in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyBetween(Integer value1, Integer value2) {
            addCriterion("coupon_money between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_money not between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponPointIsNull() {
            addCriterion("coupon_point is null");
            return (Criteria) this;
        }

        public Criteria andCouponPointIsNotNull() {
            addCriterion("coupon_point is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPointEqualTo(Integer value) {
            addCriterion("coupon_point =", value, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointNotEqualTo(Integer value) {
            addCriterion("coupon_point <>", value, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointGreaterThan(Integer value) {
            addCriterion("coupon_point >", value, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_point >=", value, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointLessThan(Integer value) {
            addCriterion("coupon_point <", value, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_point <=", value, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointIn(List<Integer> values) {
            addCriterion("coupon_point in", values, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointNotIn(List<Integer> values) {
            addCriterion("coupon_point not in", values, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointBetween(Integer value1, Integer value2) {
            addCriterion("coupon_point between", value1, value2, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andCouponPointNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_point not between", value1, value2, "couponPoint");
            return (Criteria) this;
        }

        public Criteria andFullMoneyIsNull() {
            addCriterion("full_money is null");
            return (Criteria) this;
        }

        public Criteria andFullMoneyIsNotNull() {
            addCriterion("full_money is not null");
            return (Criteria) this;
        }

        public Criteria andFullMoneyEqualTo(Integer value) {
            addCriterion("full_money =", value, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyNotEqualTo(Integer value) {
            addCriterion("full_money <>", value, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyGreaterThan(Integer value) {
            addCriterion("full_money >", value, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_money >=", value, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyLessThan(Integer value) {
            addCriterion("full_money <", value, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("full_money <=", value, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyIn(List<Integer> values) {
            addCriterion("full_money in", values, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyNotIn(List<Integer> values) {
            addCriterion("full_money not in", values, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyBetween(Integer value1, Integer value2) {
            addCriterion("full_money between", value1, value2, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andFullMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("full_money not between", value1, value2, "fullMoney");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkIsNull() {
            addCriterion("coupon_remark is null");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkIsNotNull() {
            addCriterion("coupon_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkEqualTo(String value) {
            addCriterion("coupon_remark =", value, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkNotEqualTo(String value) {
            addCriterion("coupon_remark <>", value, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkGreaterThan(String value) {
            addCriterion("coupon_remark >", value, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_remark >=", value, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkLessThan(String value) {
            addCriterion("coupon_remark <", value, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkLessThanOrEqualTo(String value) {
            addCriterion("coupon_remark <=", value, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkLike(String value) {
            addCriterion("coupon_remark like", value, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkNotLike(String value) {
            addCriterion("coupon_remark not like", value, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkIn(List<String> values) {
            addCriterion("coupon_remark in", values, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkNotIn(List<String> values) {
            addCriterion("coupon_remark not in", values, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkBetween(String value1, String value2) {
            addCriterion("coupon_remark between", value1, value2, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponRemarkNotBetween(String value1, String value2) {
            addCriterion("coupon_remark not between", value1, value2, "couponRemark");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNull() {
            addCriterion("coupon_status is null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNotNull() {
            addCriterion("coupon_status is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusEqualTo(String value) {
            addCriterion("coupon_status =", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotEqualTo(String value) {
            addCriterion("coupon_status <>", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThan(String value) {
            addCriterion("coupon_status >", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_status >=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThan(String value) {
            addCriterion("coupon_status <", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThanOrEqualTo(String value) {
            addCriterion("coupon_status <=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLike(String value) {
            addCriterion("coupon_status like", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotLike(String value) {
            addCriterion("coupon_status not like", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIn(List<String> values) {
            addCriterion("coupon_status in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotIn(List<String> values) {
            addCriterion("coupon_status not in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusBetween(String value1, String value2) {
            addCriterion("coupon_status between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotBetween(String value1, String value2) {
            addCriterion("coupon_status not between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponOther1IsNull() {
            addCriterion("coupon_other1 is null");
            return (Criteria) this;
        }

        public Criteria andCouponOther1IsNotNull() {
            addCriterion("coupon_other1 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponOther1EqualTo(String value) {
            addCriterion("coupon_other1 =", value, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1NotEqualTo(String value) {
            addCriterion("coupon_other1 <>", value, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1GreaterThan(String value) {
            addCriterion("coupon_other1 >", value, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1GreaterThanOrEqualTo(String value) {
            addCriterion("coupon_other1 >=", value, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1LessThan(String value) {
            addCriterion("coupon_other1 <", value, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1LessThanOrEqualTo(String value) {
            addCriterion("coupon_other1 <=", value, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1Like(String value) {
            addCriterion("coupon_other1 like", value, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1NotLike(String value) {
            addCriterion("coupon_other1 not like", value, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1In(List<String> values) {
            addCriterion("coupon_other1 in", values, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1NotIn(List<String> values) {
            addCriterion("coupon_other1 not in", values, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1Between(String value1, String value2) {
            addCriterion("coupon_other1 between", value1, value2, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther1NotBetween(String value1, String value2) {
            addCriterion("coupon_other1 not between", value1, value2, "couponOther1");
            return (Criteria) this;
        }

        public Criteria andCouponOther2IsNull() {
            addCriterion("coupon_other2 is null");
            return (Criteria) this;
        }

        public Criteria andCouponOther2IsNotNull() {
            addCriterion("coupon_other2 is not null");
            return (Criteria) this;
        }

        public Criteria andCouponOther2EqualTo(String value) {
            addCriterion("coupon_other2 =", value, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2NotEqualTo(String value) {
            addCriterion("coupon_other2 <>", value, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2GreaterThan(String value) {
            addCriterion("coupon_other2 >", value, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2GreaterThanOrEqualTo(String value) {
            addCriterion("coupon_other2 >=", value, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2LessThan(String value) {
            addCriterion("coupon_other2 <", value, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2LessThanOrEqualTo(String value) {
            addCriterion("coupon_other2 <=", value, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2Like(String value) {
            addCriterion("coupon_other2 like", value, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2NotLike(String value) {
            addCriterion("coupon_other2 not like", value, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2In(List<String> values) {
            addCriterion("coupon_other2 in", values, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2NotIn(List<String> values) {
            addCriterion("coupon_other2 not in", values, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2Between(String value1, String value2) {
            addCriterion("coupon_other2 between", value1, value2, "couponOther2");
            return (Criteria) this;
        }

        public Criteria andCouponOther2NotBetween(String value1, String value2) {
            addCriterion("coupon_other2 not between", value1, value2, "couponOther2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon
     *
     * @mbggenerated do_not_delete_during_merge Mon Sep 23 21:11:30 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coupon
     *
     * @mbggenerated Mon Sep 23 21:11:30 CST 2019
     */
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