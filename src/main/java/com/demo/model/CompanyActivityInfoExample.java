package com.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyActivityInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyActivityInfoExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("activity_type like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("activity_type not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeIsNull() {
            addCriterion("apply_start_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeIsNotNull() {
            addCriterion("apply_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeEqualTo(Date value) {
            addCriterion("apply_start_time =", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeNotEqualTo(Date value) {
            addCriterion("apply_start_time <>", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeGreaterThan(Date value) {
            addCriterion("apply_start_time >", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_start_time >=", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeLessThan(Date value) {
            addCriterion("apply_start_time <", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_start_time <=", value, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeIn(List<Date> values) {
            addCriterion("apply_start_time in", values, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeNotIn(List<Date> values) {
            addCriterion("apply_start_time not in", values, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeBetween(Date value1, Date value2) {
            addCriterion("apply_start_time between", value1, value2, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_start_time not between", value1, value2, "applyStartTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIsNull() {
            addCriterion("apply_end_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIsNotNull() {
            addCriterion("apply_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeEqualTo(Date value) {
            addCriterion("apply_end_time =", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotEqualTo(Date value) {
            addCriterion("apply_end_time <>", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeGreaterThan(Date value) {
            addCriterion("apply_end_time >", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_end_time >=", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeLessThan(Date value) {
            addCriterion("apply_end_time <", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_end_time <=", value, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeIn(List<Date> values) {
            addCriterion("apply_end_time in", values, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotIn(List<Date> values) {
            addCriterion("apply_end_time not in", values, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeBetween(Date value1, Date value2) {
            addCriterion("apply_end_time between", value1, value2, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andApplyEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_end_time not between", value1, value2, "applyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeIsNull() {
            addCriterion("competition_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeIsNotNull() {
            addCriterion("competition_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeEqualTo(Date value) {
            addCriterion("competition_start_time =", value, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeNotEqualTo(Date value) {
            addCriterion("competition_start_time <>", value, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeGreaterThan(Date value) {
            addCriterion("competition_start_time >", value, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("competition_start_time >=", value, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeLessThan(Date value) {
            addCriterion("competition_start_time <", value, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("competition_start_time <=", value, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeIn(List<Date> values) {
            addCriterion("competition_start_time in", values, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeNotIn(List<Date> values) {
            addCriterion("competition_start_time not in", values, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeBetween(Date value1, Date value2) {
            addCriterion("competition_start_time between", value1, value2, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("competition_start_time not between", value1, value2, "competitionStartTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeIsNull() {
            addCriterion("competition_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeIsNotNull() {
            addCriterion("competition_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeEqualTo(Date value) {
            addCriterion("competition_end_time =", value, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeNotEqualTo(Date value) {
            addCriterion("competition_end_time <>", value, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeGreaterThan(Date value) {
            addCriterion("competition_end_time >", value, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("competition_end_time >=", value, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeLessThan(Date value) {
            addCriterion("competition_end_time <", value, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("competition_end_time <=", value, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeIn(List<Date> values) {
            addCriterion("competition_end_time in", values, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeNotIn(List<Date> values) {
            addCriterion("competition_end_time not in", values, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeBetween(Date value1, Date value2) {
            addCriterion("competition_end_time between", value1, value2, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andCompetitionEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("competition_end_time not between", value1, value2, "competitionEndTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(Long value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(Long value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(Long value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(Long value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(Long value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(Long value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<Long> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<Long> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(Long value1, Long value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(Long value1, Long value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andParticipantIsNull() {
            addCriterion("participant is null");
            return (Criteria) this;
        }

        public Criteria andParticipantIsNotNull() {
            addCriterion("participant is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantEqualTo(Long value) {
            addCriterion("participant =", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotEqualTo(Long value) {
            addCriterion("participant <>", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantGreaterThan(Long value) {
            addCriterion("participant >", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantGreaterThanOrEqualTo(Long value) {
            addCriterion("participant >=", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantLessThan(Long value) {
            addCriterion("participant <", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantLessThanOrEqualTo(Long value) {
            addCriterion("participant <=", value, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantIn(List<Long> values) {
            addCriterion("participant in", values, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotIn(List<Long> values) {
            addCriterion("participant not in", values, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantBetween(Long value1, Long value2) {
            addCriterion("participant between", value1, value2, "participant");
            return (Criteria) this;
        }

        public Criteria andParticipantNotBetween(Long value1, Long value2) {
            addCriterion("participant not between", value1, value2, "participant");
            return (Criteria) this;
        }

        public Criteria andVirtualIsNull() {
            addCriterion("virtual is null");
            return (Criteria) this;
        }

        public Criteria andVirtualIsNotNull() {
            addCriterion("virtual is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualEqualTo(Long value) {
            addCriterion("virtual =", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotEqualTo(Long value) {
            addCriterion("virtual <>", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualGreaterThan(Long value) {
            addCriterion("virtual >", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualGreaterThanOrEqualTo(Long value) {
            addCriterion("virtual >=", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualLessThan(Long value) {
            addCriterion("virtual <", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualLessThanOrEqualTo(Long value) {
            addCriterion("virtual <=", value, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualIn(List<Long> values) {
            addCriterion("virtual in", values, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotIn(List<Long> values) {
            addCriterion("virtual not in", values, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualBetween(Long value1, Long value2) {
            addCriterion("virtual between", value1, value2, "virtual");
            return (Criteria) this;
        }

        public Criteria andVirtualNotBetween(Long value1, Long value2) {
            addCriterion("virtual not between", value1, value2, "virtual");
            return (Criteria) this;
        }

        public Criteria andActivityLinkIsNull() {
            addCriterion("activity_link is null");
            return (Criteria) this;
        }

        public Criteria andActivityLinkIsNotNull() {
            addCriterion("activity_link is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLinkEqualTo(String value) {
            addCriterion("activity_link =", value, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkNotEqualTo(String value) {
            addCriterion("activity_link <>", value, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkGreaterThan(String value) {
            addCriterion("activity_link >", value, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkGreaterThanOrEqualTo(String value) {
            addCriterion("activity_link >=", value, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkLessThan(String value) {
            addCriterion("activity_link <", value, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkLessThanOrEqualTo(String value) {
            addCriterion("activity_link <=", value, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkLike(String value) {
            addCriterion("activity_link like", value, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkNotLike(String value) {
            addCriterion("activity_link not like", value, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkIn(List<String> values) {
            addCriterion("activity_link in", values, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkNotIn(List<String> values) {
            addCriterion("activity_link not in", values, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkBetween(String value1, String value2) {
            addCriterion("activity_link between", value1, value2, "activityLink");
            return (Criteria) this;
        }

        public Criteria andActivityLinkNotBetween(String value1, String value2) {
            addCriterion("activity_link not between", value1, value2, "activityLink");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerIsNull() {
            addCriterion("risk_and_disclaimer is null");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerIsNotNull() {
            addCriterion("risk_and_disclaimer is not null");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerEqualTo(String value) {
            addCriterion("risk_and_disclaimer =", value, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerNotEqualTo(String value) {
            addCriterion("risk_and_disclaimer <>", value, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerGreaterThan(String value) {
            addCriterion("risk_and_disclaimer >", value, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerGreaterThanOrEqualTo(String value) {
            addCriterion("risk_and_disclaimer >=", value, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerLessThan(String value) {
            addCriterion("risk_and_disclaimer <", value, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerLessThanOrEqualTo(String value) {
            addCriterion("risk_and_disclaimer <=", value, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerLike(String value) {
            addCriterion("risk_and_disclaimer like", value, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerNotLike(String value) {
            addCriterion("risk_and_disclaimer not like", value, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerIn(List<String> values) {
            addCriterion("risk_and_disclaimer in", values, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerNotIn(List<String> values) {
            addCriterion("risk_and_disclaimer not in", values, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerBetween(String value1, String value2) {
            addCriterion("risk_and_disclaimer between", value1, value2, "riskAndDisclaimer");
            return (Criteria) this;
        }

        public Criteria andRiskAndDisclaimerNotBetween(String value1, String value2) {
            addCriterion("risk_and_disclaimer not between", value1, value2, "riskAndDisclaimer");
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