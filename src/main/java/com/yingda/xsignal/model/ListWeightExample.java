package com.yingda.xsignal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListWeightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ListWeightExample() {
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

        public Criteria andProfitFactorIsNull() {
            addCriterion("profit_factor is null");
            return (Criteria) this;
        }

        public Criteria andProfitFactorIsNotNull() {
            addCriterion("profit_factor is not null");
            return (Criteria) this;
        }

        public Criteria andProfitFactorEqualTo(Float value) {
            addCriterion("profit_factor =", value, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorNotEqualTo(Float value) {
            addCriterion("profit_factor <>", value, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorGreaterThan(Float value) {
            addCriterion("profit_factor >", value, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorGreaterThanOrEqualTo(Float value) {
            addCriterion("profit_factor >=", value, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorLessThan(Float value) {
            addCriterion("profit_factor <", value, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorLessThanOrEqualTo(Float value) {
            addCriterion("profit_factor <=", value, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorIn(List<Float> values) {
            addCriterion("profit_factor in", values, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorNotIn(List<Float> values) {
            addCriterion("profit_factor not in", values, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorBetween(Float value1, Float value2) {
            addCriterion("profit_factor between", value1, value2, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andProfitFactorNotBetween(Float value1, Float value2) {
            addCriterion("profit_factor not between", value1, value2, "profitFactor");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIsNull() {
            addCriterion("transaction_number is null");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIsNotNull() {
            addCriterion("transaction_number is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberEqualTo(Float value) {
            addCriterion("transaction_number =", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotEqualTo(Float value) {
            addCriterion("transaction_number <>", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberGreaterThan(Float value) {
            addCriterion("transaction_number >", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberGreaterThanOrEqualTo(Float value) {
            addCriterion("transaction_number >=", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLessThan(Float value) {
            addCriterion("transaction_number <", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberLessThanOrEqualTo(Float value) {
            addCriterion("transaction_number <=", value, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberIn(List<Float> values) {
            addCriterion("transaction_number in", values, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotIn(List<Float> values) {
            addCriterion("transaction_number not in", values, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberBetween(Float value1, Float value2) {
            addCriterion("transaction_number between", value1, value2, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andTransactionNumberNotBetween(Float value1, Float value2) {
            addCriterion("transaction_number not between", value1, value2, "transactionNumber");
            return (Criteria) this;
        }

        public Criteria andWeightExplainIsNull() {
            addCriterion("weight_explain is null");
            return (Criteria) this;
        }

        public Criteria andWeightExplainIsNotNull() {
            addCriterion("weight_explain is not null");
            return (Criteria) this;
        }

        public Criteria andWeightExplainEqualTo(String value) {
            addCriterion("weight_explain =", value, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainNotEqualTo(String value) {
            addCriterion("weight_explain <>", value, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainGreaterThan(String value) {
            addCriterion("weight_explain >", value, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainGreaterThanOrEqualTo(String value) {
            addCriterion("weight_explain >=", value, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainLessThan(String value) {
            addCriterion("weight_explain <", value, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainLessThanOrEqualTo(String value) {
            addCriterion("weight_explain <=", value, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainLike(String value) {
            addCriterion("weight_explain like", value, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainNotLike(String value) {
            addCriterion("weight_explain not like", value, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainIn(List<String> values) {
            addCriterion("weight_explain in", values, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainNotIn(List<String> values) {
            addCriterion("weight_explain not in", values, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainBetween(String value1, String value2) {
            addCriterion("weight_explain between", value1, value2, "weightExplain");
            return (Criteria) this;
        }

        public Criteria andWeightExplainNotBetween(String value1, String value2) {
            addCriterion("weight_explain not between", value1, value2, "weightExplain");
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