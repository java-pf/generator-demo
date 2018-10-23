package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TableTestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableTestExample() {
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

        public Criteria andTestidIsNull() {
            addCriterion("testId is null");
            return (Criteria) this;
        }

        public Criteria andTestidIsNotNull() {
            addCriterion("testId is not null");
            return (Criteria) this;
        }

        public Criteria andTestidEqualTo(Integer value) {
            addCriterion("testId =", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotEqualTo(Integer value) {
            addCriterion("testId <>", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThan(Integer value) {
            addCriterion("testId >", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("testId >=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThan(Integer value) {
            addCriterion("testId <", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThanOrEqualTo(Integer value) {
            addCriterion("testId <=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidIn(List<Integer> values) {
            addCriterion("testId in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotIn(List<Integer> values) {
            addCriterion("testId not in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidBetween(Integer value1, Integer value2) {
            addCriterion("testId between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotBetween(Integer value1, Integer value2) {
            addCriterion("testId not between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTestnameIsNull() {
            addCriterion("testName is null");
            return (Criteria) this;
        }

        public Criteria andTestnameIsNotNull() {
            addCriterion("testName is not null");
            return (Criteria) this;
        }

        public Criteria andTestnameEqualTo(String value) {
            addCriterion("testName =", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameNotEqualTo(String value) {
            addCriterion("testName <>", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameGreaterThan(String value) {
            addCriterion("testName >", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameGreaterThanOrEqualTo(String value) {
            addCriterion("testName >=", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameLessThan(String value) {
            addCriterion("testName <", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameLessThanOrEqualTo(String value) {
            addCriterion("testName <=", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameLike(String value) {
            addCriterion("testName like", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameNotLike(String value) {
            addCriterion("testName not like", value, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameIn(List<String> values) {
            addCriterion("testName in", values, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameNotIn(List<String> values) {
            addCriterion("testName not in", values, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameBetween(String value1, String value2) {
            addCriterion("testName between", value1, value2, "testname");
            return (Criteria) this;
        }

        public Criteria andTestnameNotBetween(String value1, String value2) {
            addCriterion("testName not between", value1, value2, "testname");
            return (Criteria) this;
        }

        public Criteria andTestageIsNull() {
            addCriterion("testAge is null");
            return (Criteria) this;
        }

        public Criteria andTestageIsNotNull() {
            addCriterion("testAge is not null");
            return (Criteria) this;
        }

        public Criteria andTestageEqualTo(String value) {
            addCriterion("testAge =", value, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageNotEqualTo(String value) {
            addCriterion("testAge <>", value, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageGreaterThan(String value) {
            addCriterion("testAge >", value, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageGreaterThanOrEqualTo(String value) {
            addCriterion("testAge >=", value, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageLessThan(String value) {
            addCriterion("testAge <", value, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageLessThanOrEqualTo(String value) {
            addCriterion("testAge <=", value, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageLike(String value) {
            addCriterion("testAge like", value, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageNotLike(String value) {
            addCriterion("testAge not like", value, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageIn(List<String> values) {
            addCriterion("testAge in", values, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageNotIn(List<String> values) {
            addCriterion("testAge not in", values, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageBetween(String value1, String value2) {
            addCriterion("testAge between", value1, value2, "testage");
            return (Criteria) this;
        }

        public Criteria andTestageNotBetween(String value1, String value2) {
            addCriterion("testAge not between", value1, value2, "testage");
            return (Criteria) this;
        }

        public Criteria andTestsexIsNull() {
            addCriterion("testSex is null");
            return (Criteria) this;
        }

        public Criteria andTestsexIsNotNull() {
            addCriterion("testSex is not null");
            return (Criteria) this;
        }

        public Criteria andTestsexEqualTo(String value) {
            addCriterion("testSex =", value, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexNotEqualTo(String value) {
            addCriterion("testSex <>", value, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexGreaterThan(String value) {
            addCriterion("testSex >", value, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexGreaterThanOrEqualTo(String value) {
            addCriterion("testSex >=", value, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexLessThan(String value) {
            addCriterion("testSex <", value, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexLessThanOrEqualTo(String value) {
            addCriterion("testSex <=", value, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexLike(String value) {
            addCriterion("testSex like", value, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexNotLike(String value) {
            addCriterion("testSex not like", value, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexIn(List<String> values) {
            addCriterion("testSex in", values, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexNotIn(List<String> values) {
            addCriterion("testSex not in", values, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexBetween(String value1, String value2) {
            addCriterion("testSex between", value1, value2, "testsex");
            return (Criteria) this;
        }

        public Criteria andTestsexNotBetween(String value1, String value2) {
            addCriterion("testSex not between", value1, value2, "testsex");
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