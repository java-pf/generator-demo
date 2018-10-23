package com.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityAwardsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityAwardsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Long value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Long value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Long value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Long value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Long value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Long> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Long> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Long value1, Long value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Long value1, Long value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIsNull() {
            addCriterion("awards_type is null");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIsNotNull() {
            addCriterion("awards_type is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeEqualTo(Byte value) {
            addCriterion("awards_type =", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotEqualTo(Byte value) {
            addCriterion("awards_type <>", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeGreaterThan(Byte value) {
            addCriterion("awards_type >", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("awards_type >=", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeLessThan(Byte value) {
            addCriterion("awards_type <", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeLessThanOrEqualTo(Byte value) {
            addCriterion("awards_type <=", value, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeIn(List<Byte> values) {
            addCriterion("awards_type in", values, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotIn(List<Byte> values) {
            addCriterion("awards_type not in", values, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeBetween(Byte value1, Byte value2) {
            addCriterion("awards_type between", value1, value2, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("awards_type not between", value1, value2, "awardsType");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingIsNull() {
            addCriterion("awards_setting is null");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingIsNotNull() {
            addCriterion("awards_setting is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingEqualTo(String value) {
            addCriterion("awards_setting =", value, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingNotEqualTo(String value) {
            addCriterion("awards_setting <>", value, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingGreaterThan(String value) {
            addCriterion("awards_setting >", value, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingGreaterThanOrEqualTo(String value) {
            addCriterion("awards_setting >=", value, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingLessThan(String value) {
            addCriterion("awards_setting <", value, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingLessThanOrEqualTo(String value) {
            addCriterion("awards_setting <=", value, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingLike(String value) {
            addCriterion("awards_setting like", value, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingNotLike(String value) {
            addCriterion("awards_setting not like", value, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingIn(List<String> values) {
            addCriterion("awards_setting in", values, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingNotIn(List<String> values) {
            addCriterion("awards_setting not in", values, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingBetween(String value1, String value2) {
            addCriterion("awards_setting between", value1, value2, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andAwardsSettingNotBetween(String value1, String value2) {
            addCriterion("awards_setting not between", value1, value2, "awardsSetting");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberIsNull() {
            addCriterion("prize_number is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberIsNotNull() {
            addCriterion("prize_number is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberEqualTo(Integer value) {
            addCriterion("prize_number =", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberNotEqualTo(Integer value) {
            addCriterion("prize_number <>", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberGreaterThan(Integer value) {
            addCriterion("prize_number >", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_number >=", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberLessThan(Integer value) {
            addCriterion("prize_number <", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("prize_number <=", value, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberIn(List<Integer> values) {
            addCriterion("prize_number in", values, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberNotIn(List<Integer> values) {
            addCriterion("prize_number not in", values, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberBetween(Integer value1, Integer value2) {
            addCriterion("prize_number between", value1, value2, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_number not between", value1, value2, "prizeNumber");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionIsNull() {
            addCriterion("special_version is null");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionIsNotNull() {
            addCriterion("special_version is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionEqualTo(String value) {
            addCriterion("special_version =", value, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionNotEqualTo(String value) {
            addCriterion("special_version <>", value, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionGreaterThan(String value) {
            addCriterion("special_version >", value, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionGreaterThanOrEqualTo(String value) {
            addCriterion("special_version >=", value, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionLessThan(String value) {
            addCriterion("special_version <", value, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionLessThanOrEqualTo(String value) {
            addCriterion("special_version <=", value, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionLike(String value) {
            addCriterion("special_version like", value, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionNotLike(String value) {
            addCriterion("special_version not like", value, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionIn(List<String> values) {
            addCriterion("special_version in", values, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionNotIn(List<String> values) {
            addCriterion("special_version not in", values, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionBetween(String value1, String value2) {
            addCriterion("special_version between", value1, value2, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andSpecialVersionNotBetween(String value1, String value2) {
            addCriterion("special_version not between", value1, value2, "specialVersion");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberIsNull() {
            addCriterion("the_winning_number is null");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberIsNotNull() {
            addCriterion("the_winning_number is not null");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberEqualTo(Integer value) {
            addCriterion("the_winning_number =", value, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberNotEqualTo(Integer value) {
            addCriterion("the_winning_number <>", value, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberGreaterThan(Integer value) {
            addCriterion("the_winning_number >", value, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("the_winning_number >=", value, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberLessThan(Integer value) {
            addCriterion("the_winning_number <", value, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberLessThanOrEqualTo(Integer value) {
            addCriterion("the_winning_number <=", value, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberIn(List<Integer> values) {
            addCriterion("the_winning_number in", values, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberNotIn(List<Integer> values) {
            addCriterion("the_winning_number not in", values, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberBetween(Integer value1, Integer value2) {
            addCriterion("the_winning_number between", value1, value2, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andTheWinningNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("the_winning_number not between", value1, value2, "theWinningNumber");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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