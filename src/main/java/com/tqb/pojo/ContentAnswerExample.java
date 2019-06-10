package com.tqb.pojo;

import java.util.ArrayList;
import java.util.List;

public class ContentAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentAnswerExample() {
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

        public Criteria andCaIdIsNull() {
            addCriterion("ca_id is null");
            return (Criteria) this;
        }

        public Criteria andCaIdIsNotNull() {
            addCriterion("ca_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaIdEqualTo(Integer value) {
            addCriterion("ca_id =", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotEqualTo(Integer value) {
            addCriterion("ca_id <>", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThan(Integer value) {
            addCriterion("ca_id >", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ca_id >=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThan(Integer value) {
            addCriterion("ca_id <", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ca_id <=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdIn(List<Integer> values) {
            addCriterion("ca_id in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotIn(List<Integer> values) {
            addCriterion("ca_id not in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdBetween(Integer value1, Integer value2) {
            addCriterion("ca_id between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ca_id not between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaAnswerIsNull() {
            addCriterion("ca_answer is null");
            return (Criteria) this;
        }

        public Criteria andCaAnswerIsNotNull() {
            addCriterion("ca_answer is not null");
            return (Criteria) this;
        }

        public Criteria andCaAnswerEqualTo(String value) {
            addCriterion("ca_answer =", value, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerNotEqualTo(String value) {
            addCriterion("ca_answer <>", value, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerGreaterThan(String value) {
            addCriterion("ca_answer >", value, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("ca_answer >=", value, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerLessThan(String value) {
            addCriterion("ca_answer <", value, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerLessThanOrEqualTo(String value) {
            addCriterion("ca_answer <=", value, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerLike(String value) {
            addCriterion("ca_answer like", value, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerNotLike(String value) {
            addCriterion("ca_answer not like", value, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerIn(List<String> values) {
            addCriterion("ca_answer in", values, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerNotIn(List<String> values) {
            addCriterion("ca_answer not in", values, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerBetween(String value1, String value2) {
            addCriterion("ca_answer between", value1, value2, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCaAnswerNotBetween(String value1, String value2) {
            addCriterion("ca_answer not between", value1, value2, "caAnswer");
            return (Criteria) this;
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
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