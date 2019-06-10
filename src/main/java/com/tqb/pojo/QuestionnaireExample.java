package com.tqb.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuestionnaireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionnaireExample() {
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

        public Criteria andQIdIsNull() {
            addCriterion("q_id is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("q_id is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(String value) {
            addCriterion("q_id =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(String value) {
            addCriterion("q_id <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(String value) {
            addCriterion("q_id >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(String value) {
            addCriterion("q_id >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(String value) {
            addCriterion("q_id <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(String value) {
            addCriterion("q_id <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLike(String value) {
            addCriterion("q_id like", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotLike(String value) {
            addCriterion("q_id not like", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<String> values) {
            addCriterion("q_id in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<String> values) {
            addCriterion("q_id not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(String value1, String value2) {
            addCriterion("q_id between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(String value1, String value2) {
            addCriterion("q_id not between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQNameIsNull() {
            addCriterion("q_name is null");
            return (Criteria) this;
        }

        public Criteria andQNameIsNotNull() {
            addCriterion("q_name is not null");
            return (Criteria) this;
        }

        public Criteria andQNameEqualTo(String value) {
            addCriterion("q_name =", value, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameNotEqualTo(String value) {
            addCriterion("q_name <>", value, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameGreaterThan(String value) {
            addCriterion("q_name >", value, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameGreaterThanOrEqualTo(String value) {
            addCriterion("q_name >=", value, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameLessThan(String value) {
            addCriterion("q_name <", value, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameLessThanOrEqualTo(String value) {
            addCriterion("q_name <=", value, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameLike(String value) {
            addCriterion("q_name like", value, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameNotLike(String value) {
            addCriterion("q_name not like", value, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameIn(List<String> values) {
            addCriterion("q_name in", values, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameNotIn(List<String> values) {
            addCriterion("q_name not in", values, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameBetween(String value1, String value2) {
            addCriterion("q_name between", value1, value2, "qName");
            return (Criteria) this;
        }

        public Criteria andQNameNotBetween(String value1, String value2) {
            addCriterion("q_name not between", value1, value2, "qName");
            return (Criteria) this;
        }

        public Criteria andQCreatedateIsNull() {
            addCriterion("q_createDate is null");
            return (Criteria) this;
        }

        public Criteria andQCreatedateIsNotNull() {
            addCriterion("q_createDate is not null");
            return (Criteria) this;
        }

        public Criteria andQCreatedateEqualTo(String value) {
            addCriterion("q_createDate =", value, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateNotEqualTo(String value) {
            addCriterion("q_createDate <>", value, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateGreaterThan(String value) {
            addCriterion("q_createDate >", value, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateGreaterThanOrEqualTo(String value) {
            addCriterion("q_createDate >=", value, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateLessThan(String value) {
            addCriterion("q_createDate <", value, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateLessThanOrEqualTo(String value) {
            addCriterion("q_createDate <=", value, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateLike(String value) {
            addCriterion("q_createDate like", value, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateNotLike(String value) {
            addCriterion("q_createDate not like", value, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateIn(List<String> values) {
            addCriterion("q_createDate in", values, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateNotIn(List<String> values) {
            addCriterion("q_createDate not in", values, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateBetween(String value1, String value2) {
            addCriterion("q_createDate between", value1, value2, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQCreatedateNotBetween(String value1, String value2) {
            addCriterion("q_createDate not between", value1, value2, "qCreatedate");
            return (Criteria) this;
        }

        public Criteria andQStateIsNull() {
            addCriterion("q_state is null");
            return (Criteria) this;
        }

        public Criteria andQStateIsNotNull() {
            addCriterion("q_state is not null");
            return (Criteria) this;
        }

        public Criteria andQStateEqualTo(Boolean value) {
            addCriterion("q_state =", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateNotEqualTo(Boolean value) {
            addCriterion("q_state <>", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateGreaterThan(Boolean value) {
            addCriterion("q_state >", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("q_state >=", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateLessThan(Boolean value) {
            addCriterion("q_state <", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateLessThanOrEqualTo(Boolean value) {
            addCriterion("q_state <=", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateIn(List<Boolean> values) {
            addCriterion("q_state in", values, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateNotIn(List<Boolean> values) {
            addCriterion("q_state not in", values, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateBetween(Boolean value1, Boolean value2) {
            addCriterion("q_state between", value1, value2, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("q_state not between", value1, value2, "qState");
            return (Criteria) this;
        }

        public Criteria andQCountIsNull() {
            addCriterion("q_count is null");
            return (Criteria) this;
        }

        public Criteria andQCountIsNotNull() {
            addCriterion("q_count is not null");
            return (Criteria) this;
        }

        public Criteria andQCountEqualTo(Integer value) {
            addCriterion("q_count =", value, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountNotEqualTo(Integer value) {
            addCriterion("q_count <>", value, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountGreaterThan(Integer value) {
            addCriterion("q_count >", value, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_count >=", value, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountLessThan(Integer value) {
            addCriterion("q_count <", value, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountLessThanOrEqualTo(Integer value) {
            addCriterion("q_count <=", value, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountIn(List<Integer> values) {
            addCriterion("q_count in", values, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountNotIn(List<Integer> values) {
            addCriterion("q_count not in", values, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountBetween(Integer value1, Integer value2) {
            addCriterion("q_count between", value1, value2, "qCount");
            return (Criteria) this;
        }

        public Criteria andQCountNotBetween(Integer value1, Integer value2) {
            addCriterion("q_count not between", value1, value2, "qCount");
            return (Criteria) this;
        }

        public Criteria andQRemarkIsNull() {
            addCriterion("q_remark is null");
            return (Criteria) this;
        }

        public Criteria andQRemarkIsNotNull() {
            addCriterion("q_remark is not null");
            return (Criteria) this;
        }

        public Criteria andQRemarkEqualTo(String value) {
            addCriterion("q_remark =", value, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkNotEqualTo(String value) {
            addCriterion("q_remark <>", value, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkGreaterThan(String value) {
            addCriterion("q_remark >", value, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("q_remark >=", value, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkLessThan(String value) {
            addCriterion("q_remark <", value, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkLessThanOrEqualTo(String value) {
            addCriterion("q_remark <=", value, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkLike(String value) {
            addCriterion("q_remark like", value, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkNotLike(String value) {
            addCriterion("q_remark not like", value, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkIn(List<String> values) {
            addCriterion("q_remark in", values, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkNotIn(List<String> values) {
            addCriterion("q_remark not in", values, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkBetween(String value1, String value2) {
            addCriterion("q_remark between", value1, value2, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQRemarkNotBetween(String value1, String value2) {
            addCriterion("q_remark not between", value1, value2, "qRemark");
            return (Criteria) this;
        }

        public Criteria andQTimeIsNull() {
            addCriterion("q_time is null");
            return (Criteria) this;
        }

        public Criteria andQTimeIsNotNull() {
            addCriterion("q_time is not null");
            return (Criteria) this;
        }

        public Criteria andQTimeEqualTo(Integer value) {
            addCriterion("q_time =", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotEqualTo(Integer value) {
            addCriterion("q_time <>", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeGreaterThan(Integer value) {
            addCriterion("q_time >", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_time >=", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeLessThan(Integer value) {
            addCriterion("q_time <", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeLessThanOrEqualTo(Integer value) {
            addCriterion("q_time <=", value, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeIn(List<Integer> values) {
            addCriterion("q_time in", values, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotIn(List<Integer> values) {
            addCriterion("q_time not in", values, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeBetween(Integer value1, Integer value2) {
            addCriterion("q_time between", value1, value2, "qTime");
            return (Criteria) this;
        }

        public Criteria andQTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("q_time not between", value1, value2, "qTime");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("u_id like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("u_id not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("u_id not between", value1, value2, "uId");
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