package com.BD2UniverseProject.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleExample() {
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

        public Criteria andSALE_IDIsNull() {
            addCriterion("SALE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSALE_IDIsNotNull() {
            addCriterion("SALE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSALE_IDEqualTo(BigDecimal value) {
            addCriterion("SALE_ID =", value, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDNotEqualTo(BigDecimal value) {
            addCriterion("SALE_ID <>", value, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDGreaterThan(BigDecimal value) {
            addCriterion("SALE_ID >", value, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_ID >=", value, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDLessThan(BigDecimal value) {
            addCriterion("SALE_ID <", value, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_ID <=", value, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDIn(List<BigDecimal> values) {
            addCriterion("SALE_ID in", values, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDNotIn(List<BigDecimal> values) {
            addCriterion("SALE_ID not in", values, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_ID between", value1, value2, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_ID not between", value1, value2, "SALE_ID");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICEIsNull() {
            addCriterion("TOTAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICEIsNotNull() {
            addCriterion("TOTAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICEEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PRICE =", value, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICENotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PRICE <>", value, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICEGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_PRICE >", value, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PRICE >=", value, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICELessThan(BigDecimal value) {
            addCriterion("TOTAL_PRICE <", value, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICELessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PRICE <=", value, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICEIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PRICE in", values, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICENotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PRICE not in", values, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PRICE between", value1, value2, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andTOTAL_PRICENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PRICE not between", value1, value2, "TOTAL_PRICE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATEIsNull() {
            addCriterion("SALE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSALE_DATEIsNotNull() {
            addCriterion("SALE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSALE_DATEEqualTo(Date value) {
            addCriterion("SALE_DATE =", value, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATENotEqualTo(Date value) {
            addCriterion("SALE_DATE <>", value, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATEGreaterThan(Date value) {
            addCriterion("SALE_DATE >", value, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATEGreaterThanOrEqualTo(Date value) {
            addCriterion("SALE_DATE >=", value, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATELessThan(Date value) {
            addCriterion("SALE_DATE <", value, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATELessThanOrEqualTo(Date value) {
            addCriterion("SALE_DATE <=", value, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATEIn(List<Date> values) {
            addCriterion("SALE_DATE in", values, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATENotIn(List<Date> values) {
            addCriterion("SALE_DATE not in", values, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATEBetween(Date value1, Date value2) {
            addCriterion("SALE_DATE between", value1, value2, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_DATENotBetween(Date value1, Date value2) {
            addCriterion("SALE_DATE not between", value1, value2, "SALE_DATE");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSIsNull() {
            addCriterion("SALE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSIsNotNull() {
            addCriterion("SALE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSEqualTo(String value) {
            addCriterion("SALE_ADDRESS =", value, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSNotEqualTo(String value) {
            addCriterion("SALE_ADDRESS <>", value, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSGreaterThan(String value) {
            addCriterion("SALE_ADDRESS >", value, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_ADDRESS >=", value, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSLessThan(String value) {
            addCriterion("SALE_ADDRESS <", value, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("SALE_ADDRESS <=", value, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSLike(String value) {
            addCriterion("SALE_ADDRESS like", value, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSNotLike(String value) {
            addCriterion("SALE_ADDRESS not like", value, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSIn(List<String> values) {
            addCriterion("SALE_ADDRESS in", values, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSNotIn(List<String> values) {
            addCriterion("SALE_ADDRESS not in", values, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSBetween(String value1, String value2) {
            addCriterion("SALE_ADDRESS between", value1, value2, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("SALE_ADDRESS not between", value1, value2, "SALE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSIsNull() {
            addCriterion("SALE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSIsNotNull() {
            addCriterion("SALE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSEqualTo(BigDecimal value) {
            addCriterion("SALE_STATUS =", value, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSNotEqualTo(BigDecimal value) {
            addCriterion("SALE_STATUS <>", value, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSGreaterThan(BigDecimal value) {
            addCriterion("SALE_STATUS >", value, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_STATUS >=", value, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSLessThan(BigDecimal value) {
            addCriterion("SALE_STATUS <", value, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_STATUS <=", value, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSIn(List<BigDecimal> values) {
            addCriterion("SALE_STATUS in", values, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSNotIn(List<BigDecimal> values) {
            addCriterion("SALE_STATUS not in", values, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_STATUS between", value1, value2, "SALE_STATUS");
            return (Criteria) this;
        }

        public Criteria andSALE_STATUSNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_STATUS not between", value1, value2, "SALE_STATUS");
            return (Criteria) this;
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