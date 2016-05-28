package com.BD2UniverseProject.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaleDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleDetailExample() {
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

        public Criteria andSALE_DETAIL_IDIsNull() {
            addCriterion("SALE_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDIsNotNull() {
            addCriterion("SALE_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDEqualTo(BigDecimal value) {
            addCriterion("SALE_DETAIL_ID =", value, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDNotEqualTo(BigDecimal value) {
            addCriterion("SALE_DETAIL_ID <>", value, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDGreaterThan(BigDecimal value) {
            addCriterion("SALE_DETAIL_ID >", value, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_DETAIL_ID >=", value, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDLessThan(BigDecimal value) {
            addCriterion("SALE_DETAIL_ID <", value, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALE_DETAIL_ID <=", value, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDIn(List<BigDecimal> values) {
            addCriterion("SALE_DETAIL_ID in", values, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDNotIn(List<BigDecimal> values) {
            addCriterion("SALE_DETAIL_ID not in", values, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_DETAIL_ID between", value1, value2, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andSALE_DETAIL_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALE_DETAIL_ID not between", value1, value2, "SALE_DETAIL_ID");
            return (Criteria) this;
        }

        public Criteria andPRICEIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPRICEIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPRICEEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICENotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICEGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICELessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICELessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICEIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICENotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "PRICE");
            return (Criteria) this;
        }

        public Criteria andPRICENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "PRICE");
            return (Criteria) this;
        }

        public Criteria andCOSTIsNull() {
            addCriterion("COST is null");
            return (Criteria) this;
        }

        public Criteria andCOSTIsNotNull() {
            addCriterion("COST is not null");
            return (Criteria) this;
        }

        public Criteria andCOSTEqualTo(BigDecimal value) {
            addCriterion("COST =", value, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTNotEqualTo(BigDecimal value) {
            addCriterion("COST <>", value, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTGreaterThan(BigDecimal value) {
            addCriterion("COST >", value, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST >=", value, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTLessThan(BigDecimal value) {
            addCriterion("COST <", value, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST <=", value, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTIn(List<BigDecimal> values) {
            addCriterion("COST in", values, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTNotIn(List<BigDecimal> values) {
            addCriterion("COST not in", values, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST between", value1, value2, "COST");
            return (Criteria) this;
        }

        public Criteria andCOSTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST not between", value1, value2, "COST");
            return (Criteria) this;
        }

        public Criteria andQUANTITYIsNull() {
            addCriterion("QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andQUANTITYIsNotNull() {
            addCriterion("QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andQUANTITYEqualTo(BigDecimal value) {
            addCriterion("QUANTITY =", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYNotEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <>", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYGreaterThan(BigDecimal value) {
            addCriterion("QUANTITY >", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY >=", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYLessThan(BigDecimal value) {
            addCriterion("QUANTITY <", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUANTITY <=", value, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYIn(List<BigDecimal> values) {
            addCriterion("QUANTITY in", values, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYNotIn(List<BigDecimal> values) {
            addCriterion("QUANTITY not in", values, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY between", value1, value2, "QUANTITY");
            return (Criteria) this;
        }

        public Criteria andQUANTITYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUANTITY not between", value1, value2, "QUANTITY");
            return (Criteria) this;
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

        public Criteria andPRODUCT_IDIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID =", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID <>", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_ID >", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID >=", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDLessThan(BigDecimal value) {
            addCriterion("PRODUCT_ID <", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_ID <=", value, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_ID in", values, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_ID not in", values, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "PRODUCT_ID");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "PRODUCT_ID");
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