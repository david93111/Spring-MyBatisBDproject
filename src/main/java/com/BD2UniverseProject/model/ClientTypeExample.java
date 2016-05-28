package com.BD2UniverseProject.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ClientTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientTypeExample() {
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

        public Criteria andCLIENT_TYPE_IDIsNull() {
            addCriterion("CLIENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDIsNotNull() {
            addCriterion("CLIENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDEqualTo(BigDecimal value) {
            addCriterion("CLIENT_TYPE_ID =", value, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDNotEqualTo(BigDecimal value) {
            addCriterion("CLIENT_TYPE_ID <>", value, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDGreaterThan(BigDecimal value) {
            addCriterion("CLIENT_TYPE_ID >", value, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENT_TYPE_ID >=", value, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDLessThan(BigDecimal value) {
            addCriterion("CLIENT_TYPE_ID <", value, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENT_TYPE_ID <=", value, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDIn(List<BigDecimal> values) {
            addCriterion("CLIENT_TYPE_ID in", values, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDNotIn(List<BigDecimal> values) {
            addCriterion("CLIENT_TYPE_ID not in", values, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENT_TYPE_ID between", value1, value2, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPE_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENT_TYPE_ID not between", value1, value2, "CLIENT_TYPE_ID");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMEIsNull() {
            addCriterion("TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMEIsNotNull() {
            addCriterion("TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMEEqualTo(String value) {
            addCriterion("TYPE_NAME =", value, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMENotEqualTo(String value) {
            addCriterion("TYPE_NAME <>", value, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMEGreaterThan(String value) {
            addCriterion("TYPE_NAME >", value, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME >=", value, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMELessThan(String value) {
            addCriterion("TYPE_NAME <", value, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMELessThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME <=", value, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMELike(String value) {
            addCriterion("TYPE_NAME like", value, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMENotLike(String value) {
            addCriterion("TYPE_NAME not like", value, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMEIn(List<String> values) {
            addCriterion("TYPE_NAME in", values, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMENotIn(List<String> values) {
            addCriterion("TYPE_NAME not in", values, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMEBetween(String value1, String value2) {
            addCriterion("TYPE_NAME between", value1, value2, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_NAMENotBetween(String value1, String value2) {
            addCriterion("TYPE_NAME not between", value1, value2, "TYPE_NAME");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODEIsNull() {
            addCriterion("TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODEIsNotNull() {
            addCriterion("TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODEEqualTo(String value) {
            addCriterion("TYPE_CODE =", value, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODENotEqualTo(String value) {
            addCriterion("TYPE_CODE <>", value, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODEGreaterThan(String value) {
            addCriterion("TYPE_CODE >", value, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_CODE >=", value, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODELessThan(String value) {
            addCriterion("TYPE_CODE <", value, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODELessThanOrEqualTo(String value) {
            addCriterion("TYPE_CODE <=", value, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODELike(String value) {
            addCriterion("TYPE_CODE like", value, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODENotLike(String value) {
            addCriterion("TYPE_CODE not like", value, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODEIn(List<String> values) {
            addCriterion("TYPE_CODE in", values, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODENotIn(List<String> values) {
            addCriterion("TYPE_CODE not in", values, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODEBetween(String value1, String value2) {
            addCriterion("TYPE_CODE between", value1, value2, "TYPE_CODE");
            return (Criteria) this;
        }

        public Criteria andTYPE_CODENotBetween(String value1, String value2) {
            addCriterion("TYPE_CODE not between", value1, value2, "TYPE_CODE");
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