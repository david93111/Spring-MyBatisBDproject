package com.BD2UniverseProject.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaleStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleStatusExample() {
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

        public Criteria andSALE_STATUS_IDIsNull() {
            addCriterion("SALE_STATUS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDIsNotNull() {
            addCriterion("SALE_STATUS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDEqualTo(BigDecimal value) {
            addCriterion("SALE_STATUS_ID =", value, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDNotEqualTo(BigDecimal value) {
            addCriterion("SALE_STATUS_ID <>", value, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDGreaterThan(BigDecimal value) {
            addCriterion("SALE_STATUS_ID >", value, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_STATUS_ID >=", value, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDLessThan(BigDecimal value) {
            addCriterion("SALE_STATUS_ID <", value, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_STATUS_ID <=", value, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDIn(List<BigDecimal> values) {
            addCriterion("SALE_STATUS_ID in", values, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDNotIn(List<BigDecimal> values) {
            addCriterion("SALE_STATUS_ID not in", values, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_STATUS_ID between", value1, value2, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUS_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_STATUS_ID not between", value1, value2, "SALE_STATUS_ID");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMEIsNull() {
            addCriterion("STATUS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMEIsNotNull() {
            addCriterion("STATUS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMEEqualTo(String value) {
            addCriterion("STATUS_NAME =", value, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMENotEqualTo(String value) {
            addCriterion("STATUS_NAME <>", value, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMEGreaterThan(String value) {
            addCriterion("STATUS_NAME >", value, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_NAME >=", value, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMELessThan(String value) {
            addCriterion("STATUS_NAME <", value, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMELessThanOrEqualTo(String value) {
            addCriterion("STATUS_NAME <=", value, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMELike(String value) {
            addCriterion("STATUS_NAME like", value, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMENotLike(String value) {
            addCriterion("STATUS_NAME not like", value, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMEIn(List<String> values) {
            addCriterion("STATUS_NAME in", values, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMENotIn(List<String> values) {
            addCriterion("STATUS_NAME not in", values, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMEBetween(String value1, String value2) {
            addCriterion("STATUS_NAME between", value1, value2, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_NAMENotBetween(String value1, String value2) {
            addCriterion("STATUS_NAME not between", value1, value2, "STATUS_NAME");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODEIsNull() {
            addCriterion("STATUS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODEIsNotNull() {
            addCriterion("STATUS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODEEqualTo(String value) {
            addCriterion("STATUS_CODE =", value, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODENotEqualTo(String value) {
            addCriterion("STATUS_CODE <>", value, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODEGreaterThan(String value) {
            addCriterion("STATUS_CODE >", value, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_CODE >=", value, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODELessThan(String value) {
            addCriterion("STATUS_CODE <", value, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODELessThanOrEqualTo(String value) {
            addCriterion("STATUS_CODE <=", value, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODELike(String value) {
            addCriterion("STATUS_CODE like", value, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODENotLike(String value) {
            addCriterion("STATUS_CODE not like", value, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODEIn(List<String> values) {
            addCriterion("STATUS_CODE in", values, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODENotIn(List<String> values) {
            addCriterion("STATUS_CODE not in", values, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODEBetween(String value1, String value2) {
            addCriterion("STATUS_CODE between", value1, value2, "STATUS_CODE");
            return (Criteria) this;
        }

        public Criteria andSTATUS_CODENotBetween(String value1, String value2) {
            addCriterion("STATUS_CODE not between", value1, value2, "STATUS_CODE");
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