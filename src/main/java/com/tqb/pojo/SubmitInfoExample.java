package com.tqb.pojo;

import java.util.ArrayList;
import java.util.List;

public class SubmitInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubmitInfoExample() {
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

        public Criteria andSiIdIsNull() {
            addCriterion("si_id is null");
            return (Criteria) this;
        }

        public Criteria andSiIdIsNotNull() {
            addCriterion("si_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiIdEqualTo(Integer value) {
            addCriterion("si_id =", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotEqualTo(Integer value) {
            addCriterion("si_id <>", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThan(Integer value) {
            addCriterion("si_id >", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("si_id >=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThan(Integer value) {
            addCriterion("si_id <", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdLessThanOrEqualTo(Integer value) {
            addCriterion("si_id <=", value, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdIn(List<Integer> values) {
            addCriterion("si_id in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotIn(List<Integer> values) {
            addCriterion("si_id not in", values, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdBetween(Integer value1, Integer value2) {
            addCriterion("si_id between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("si_id not between", value1, value2, "siId");
            return (Criteria) this;
        }

        public Criteria andSiIpIsNull() {
            addCriterion("si_ip is null");
            return (Criteria) this;
        }

        public Criteria andSiIpIsNotNull() {
            addCriterion("si_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSiIpEqualTo(String value) {
            addCriterion("si_ip =", value, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpNotEqualTo(String value) {
            addCriterion("si_ip <>", value, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpGreaterThan(String value) {
            addCriterion("si_ip >", value, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpGreaterThanOrEqualTo(String value) {
            addCriterion("si_ip >=", value, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpLessThan(String value) {
            addCriterion("si_ip <", value, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpLessThanOrEqualTo(String value) {
            addCriterion("si_ip <=", value, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpLike(String value) {
            addCriterion("si_ip like", value, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpNotLike(String value) {
            addCriterion("si_ip not like", value, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpIn(List<String> values) {
            addCriterion("si_ip in", values, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpNotIn(List<String> values) {
            addCriterion("si_ip not in", values, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpBetween(String value1, String value2) {
            addCriterion("si_ip between", value1, value2, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiIpNotBetween(String value1, String value2) {
            addCriterion("si_ip not between", value1, value2, "siIp");
            return (Criteria) this;
        }

        public Criteria andSiLocationIsNull() {
            addCriterion("si_location is null");
            return (Criteria) this;
        }

        public Criteria andSiLocationIsNotNull() {
            addCriterion("si_location is not null");
            return (Criteria) this;
        }

        public Criteria andSiLocationEqualTo(String value) {
            addCriterion("si_location =", value, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationNotEqualTo(String value) {
            addCriterion("si_location <>", value, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationGreaterThan(String value) {
            addCriterion("si_location >", value, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationGreaterThanOrEqualTo(String value) {
            addCriterion("si_location >=", value, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationLessThan(String value) {
            addCriterion("si_location <", value, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationLessThanOrEqualTo(String value) {
            addCriterion("si_location <=", value, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationLike(String value) {
            addCriterion("si_location like", value, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationNotLike(String value) {
            addCriterion("si_location not like", value, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationIn(List<String> values) {
            addCriterion("si_location in", values, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationNotIn(List<String> values) {
            addCriterion("si_location not in", values, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationBetween(String value1, String value2) {
            addCriterion("si_location between", value1, value2, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiLocationNotBetween(String value1, String value2) {
            addCriterion("si_location not between", value1, value2, "siLocation");
            return (Criteria) this;
        }

        public Criteria andSiDateIsNull() {
            addCriterion("si_date is null");
            return (Criteria) this;
        }

        public Criteria andSiDateIsNotNull() {
            addCriterion("si_date is not null");
            return (Criteria) this;
        }

        public Criteria andSiDateEqualTo(String value) {
            addCriterion("si_date =", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotEqualTo(String value) {
            addCriterion("si_date <>", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateGreaterThan(String value) {
            addCriterion("si_date >", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateGreaterThanOrEqualTo(String value) {
            addCriterion("si_date >=", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateLessThan(String value) {
            addCriterion("si_date <", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateLessThanOrEqualTo(String value) {
            addCriterion("si_date <=", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateLike(String value) {
            addCriterion("si_date like", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotLike(String value) {
            addCriterion("si_date not like", value, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateIn(List<String> values) {
            addCriterion("si_date in", values, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotIn(List<String> values) {
            addCriterion("si_date not in", values, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateBetween(String value1, String value2) {
            addCriterion("si_date between", value1, value2, "siDate");
            return (Criteria) this;
        }

        public Criteria andSiDateNotBetween(String value1, String value2) {
            addCriterion("si_date not between", value1, value2, "siDate");
            return (Criteria) this;
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