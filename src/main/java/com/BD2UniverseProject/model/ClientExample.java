package com.BD2UniverseProject.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
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

        public Criteria andCLIENT_IDIsNull() {
            addCriterion("CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDIsNotNull() {
            addCriterion("CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDEqualTo(BigDecimal value) {
            addCriterion("CLIENT_ID =", value, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDNotEqualTo(BigDecimal value) {
            addCriterion("CLIENT_ID <>", value, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDGreaterThan(BigDecimal value) {
            addCriterion("CLIENT_ID >", value, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENT_ID >=", value, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDLessThan(BigDecimal value) {
            addCriterion("CLIENT_ID <", value, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENT_ID <=", value, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDIn(List<BigDecimal> values) {
            addCriterion("CLIENT_ID in", values, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDNotIn(List<BigDecimal> values) {
            addCriterion("CLIENT_ID not in", values, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENT_ID between", value1, value2, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andCLIENT_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENT_ID not between", value1, value2, "CLIENT_ID");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMEIsNull() {
            addCriterion("FIRST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMEIsNotNull() {
            addCriterion("FIRST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMEEqualTo(String value) {
            addCriterion("FIRST_NAME =", value, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMENotEqualTo(String value) {
            addCriterion("FIRST_NAME <>", value, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMEGreaterThan(String value) {
            addCriterion("FIRST_NAME >", value, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME >=", value, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMELessThan(String value) {
            addCriterion("FIRST_NAME <", value, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMELessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME <=", value, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMELike(String value) {
            addCriterion("FIRST_NAME like", value, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMENotLike(String value) {
            addCriterion("FIRST_NAME not like", value, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMEIn(List<String> values) {
            addCriterion("FIRST_NAME in", values, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMENotIn(List<String> values) {
            addCriterion("FIRST_NAME not in", values, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMEBetween(String value1, String value2) {
            addCriterion("FIRST_NAME between", value1, value2, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_NAMENotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME not between", value1, value2, "FIRST_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMEIsNull() {
            addCriterion("SECOND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMEIsNotNull() {
            addCriterion("SECOND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMEEqualTo(String value) {
            addCriterion("SECOND_NAME =", value, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMENotEqualTo(String value) {
            addCriterion("SECOND_NAME <>", value, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMEGreaterThan(String value) {
            addCriterion("SECOND_NAME >", value, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_NAME >=", value, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMELessThan(String value) {
            addCriterion("SECOND_NAME <", value, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMELessThanOrEqualTo(String value) {
            addCriterion("SECOND_NAME <=", value, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMELike(String value) {
            addCriterion("SECOND_NAME like", value, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMENotLike(String value) {
            addCriterion("SECOND_NAME not like", value, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMEIn(List<String> values) {
            addCriterion("SECOND_NAME in", values, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMENotIn(List<String> values) {
            addCriterion("SECOND_NAME not in", values, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMEBetween(String value1, String value2) {
            addCriterion("SECOND_NAME between", value1, value2, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_NAMENotBetween(String value1, String value2) {
            addCriterion("SECOND_NAME not between", value1, value2, "SECOND_NAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMEIsNull() {
            addCriterion("FIRST_LASTNAME is null");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMEIsNotNull() {
            addCriterion("FIRST_LASTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMEEqualTo(String value) {
            addCriterion("FIRST_LASTNAME =", value, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMENotEqualTo(String value) {
            addCriterion("FIRST_LASTNAME <>", value, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMEGreaterThan(String value) {
            addCriterion("FIRST_LASTNAME >", value, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_LASTNAME >=", value, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMELessThan(String value) {
            addCriterion("FIRST_LASTNAME <", value, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMELessThanOrEqualTo(String value) {
            addCriterion("FIRST_LASTNAME <=", value, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMELike(String value) {
            addCriterion("FIRST_LASTNAME like", value, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMENotLike(String value) {
            addCriterion("FIRST_LASTNAME not like", value, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMEIn(List<String> values) {
            addCriterion("FIRST_LASTNAME in", values, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMENotIn(List<String> values) {
            addCriterion("FIRST_LASTNAME not in", values, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMEBetween(String value1, String value2) {
            addCriterion("FIRST_LASTNAME between", value1, value2, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andFIRST_LASTNAMENotBetween(String value1, String value2) {
            addCriterion("FIRST_LASTNAME not between", value1, value2, "FIRST_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMEIsNull() {
            addCriterion("SECOND_LASTNAME is null");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMEIsNotNull() {
            addCriterion("SECOND_LASTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMEEqualTo(String value) {
            addCriterion("SECOND_LASTNAME =", value, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMENotEqualTo(String value) {
            addCriterion("SECOND_LASTNAME <>", value, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMEGreaterThan(String value) {
            addCriterion("SECOND_LASTNAME >", value, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_LASTNAME >=", value, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMELessThan(String value) {
            addCriterion("SECOND_LASTNAME <", value, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMELessThanOrEqualTo(String value) {
            addCriterion("SECOND_LASTNAME <=", value, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMELike(String value) {
            addCriterion("SECOND_LASTNAME like", value, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMENotLike(String value) {
            addCriterion("SECOND_LASTNAME not like", value, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMEIn(List<String> values) {
            addCriterion("SECOND_LASTNAME in", values, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMENotIn(List<String> values) {
            addCriterion("SECOND_LASTNAME not in", values, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMEBetween(String value1, String value2) {
            addCriterion("SECOND_LASTNAME between", value1, value2, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andSECOND_LASTNAMENotBetween(String value1, String value2) {
            addCriterion("SECOND_LASTNAME not between", value1, value2, "SECOND_LASTNAME");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andADDRESSEqualTo(String value) {
            addCriterion("ADDRESS =", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThan(String value) {
            addCriterion("ADDRESS <", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLike(String value) {
            addCriterion("ADDRESS like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotLike(String value) {
            addCriterion("ADDRESS not like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSIn(List<String> values) {
            addCriterion("ADDRESS in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPHONEIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPHONEEqualTo(String value) {
            addCriterion("PHONE =", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotEqualTo(String value) {
            addCriterion("PHONE <>", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThan(String value) {
            addCriterion("PHONE >", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThan(String value) {
            addCriterion("PHONE <", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONELike(String value) {
            addCriterion("PHONE like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotLike(String value) {
            addCriterion("PHONE not like", value, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEIn(List<String> values) {
            addCriterion("PHONE in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotIn(List<String> values) {
            addCriterion("PHONE not in", values, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONEBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andPHONENotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "PHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONEIsNull() {
            addCriterion("CELLPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCELLPHONEIsNotNull() {
            addCriterion("CELLPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCELLPHONEEqualTo(String value) {
            addCriterion("CELLPHONE =", value, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONENotEqualTo(String value) {
            addCriterion("CELLPHONE <>", value, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONEGreaterThan(String value) {
            addCriterion("CELLPHONE >", value, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("CELLPHONE >=", value, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONELessThan(String value) {
            addCriterion("CELLPHONE <", value, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONELessThanOrEqualTo(String value) {
            addCriterion("CELLPHONE <=", value, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONELike(String value) {
            addCriterion("CELLPHONE like", value, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONENotLike(String value) {
            addCriterion("CELLPHONE not like", value, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONEIn(List<String> values) {
            addCriterion("CELLPHONE in", values, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONENotIn(List<String> values) {
            addCriterion("CELLPHONE not in", values, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONEBetween(String value1, String value2) {
            addCriterion("CELLPHONE between", value1, value2, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCELLPHONENotBetween(String value1, String value2) {
            addCriterion("CELLPHONE not between", value1, value2, "CELLPHONE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPEIsNull() {
            addCriterion("CLIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPEIsNotNull() {
            addCriterion("CLIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPEEqualTo(BigDecimal value) {
            addCriterion("CLIENT_TYPE =", value, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPENotEqualTo(BigDecimal value) {
            addCriterion("CLIENT_TYPE <>", value, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPEGreaterThan(BigDecimal value) {
            addCriterion("CLIENT_TYPE >", value, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENT_TYPE >=", value, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPELessThan(BigDecimal value) {
            addCriterion("CLIENT_TYPE <", value, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPELessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENT_TYPE <=", value, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPEIn(List<BigDecimal> values) {
            addCriterion("CLIENT_TYPE in", values, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPENotIn(List<BigDecimal> values) {
            addCriterion("CLIENT_TYPE not in", values, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENT_TYPE between", value1, value2, "CLIENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCLIENT_TYPENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENT_TYPE not between", value1, value2, "CLIENT_TYPE");
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