package com.tqb.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminUnameIsNull() {
            addCriterion("admin_uname is null");
            return (Criteria) this;
        }

        public Criteria andAdminUnameIsNotNull() {
            addCriterion("admin_uname is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUnameEqualTo(String value) {
            addCriterion("admin_uname =", value, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameNotEqualTo(String value) {
            addCriterion("admin_uname <>", value, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameGreaterThan(String value) {
            addCriterion("admin_uname >", value, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_uname >=", value, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameLessThan(String value) {
            addCriterion("admin_uname <", value, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameLessThanOrEqualTo(String value) {
            addCriterion("admin_uname <=", value, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameLike(String value) {
            addCriterion("admin_uname like", value, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameNotLike(String value) {
            addCriterion("admin_uname not like", value, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameIn(List<String> values) {
            addCriterion("admin_uname in", values, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameNotIn(List<String> values) {
            addCriterion("admin_uname not in", values, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameBetween(String value1, String value2) {
            addCriterion("admin_uname between", value1, value2, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminUnameNotBetween(String value1, String value2) {
            addCriterion("admin_uname not between", value1, value2, "adminUname");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIsNull() {
            addCriterion("admin_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIsNotNull() {
            addCriterion("admin_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPwdEqualTo(String value) {
            addCriterion("admin_pwd =", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotEqualTo(String value) {
            addCriterion("admin_pwd <>", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdGreaterThan(String value) {
            addCriterion("admin_pwd >", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_pwd >=", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLessThan(String value) {
            addCriterion("admin_pwd <", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLessThanOrEqualTo(String value) {
            addCriterion("admin_pwd <=", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdLike(String value) {
            addCriterion("admin_pwd like", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotLike(String value) {
            addCriterion("admin_pwd not like", value, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdIn(List<String> values) {
            addCriterion("admin_pwd in", values, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotIn(List<String> values) {
            addCriterion("admin_pwd not in", values, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdBetween(String value1, String value2) {
            addCriterion("admin_pwd between", value1, value2, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPwdNotBetween(String value1, String value2) {
            addCriterion("admin_pwd not between", value1, value2, "adminPwd");
            return (Criteria) this;
        }

        public Criteria andAdminPowerIsNull() {
            addCriterion("admin_power is null");
            return (Criteria) this;
        }

        public Criteria andAdminPowerIsNotNull() {
            addCriterion("admin_power is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPowerEqualTo(Integer value) {
            addCriterion("admin_power =", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerNotEqualTo(Integer value) {
            addCriterion("admin_power <>", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerGreaterThan(Integer value) {
            addCriterion("admin_power >", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_power >=", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerLessThan(Integer value) {
            addCriterion("admin_power <", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerLessThanOrEqualTo(Integer value) {
            addCriterion("admin_power <=", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerIn(List<Integer> values) {
            addCriterion("admin_power in", values, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerNotIn(List<Integer> values) {
            addCriterion("admin_power not in", values, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerBetween(Integer value1, Integer value2) {
            addCriterion("admin_power between", value1, value2, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_power not between", value1, value2, "adminPower");
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