package com.BD2UniverseProject.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPRODUCT_NAMEIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMELike(String value) {
            addCriterion("PRODUCT_NAME like", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMEBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_NAMENotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "PRODUCT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODENotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODELessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODELessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODELike(String value) {
            addCriterion("PRODUCT_CODE like", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODENotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODENotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODEBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_CODENotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "PRODUCT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICEIsNull() {
            addCriterion("PRODUCT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICEIsNotNull() {
            addCriterion("PRODUCT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICEEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE =", value, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICENotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <>", value, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICEGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_PRICE >", value, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE >=", value, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICELessThan(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <", value, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICELessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PRICE <=", value, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICEIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PRICE in", values, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICENotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PRICE not in", values, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PRICE between", value1, value2, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_PRICENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PRICE not between", value1, value2, "PRODUCT_PRICE");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTIsNull() {
            addCriterion("PRODUCT_COST is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTIsNotNull() {
            addCriterion("PRODUCT_COST is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_COST =", value, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_COST <>", value, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_COST >", value, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_COST >=", value, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTLessThan(BigDecimal value) {
            addCriterion("PRODUCT_COST <", value, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_COST <=", value, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_COST in", values, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_COST not in", values, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_COST between", value1, value2, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_COSTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_COST not between", value1, value2, "PRODUCT_COST");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONIsNull() {
            addCriterion("PRODUCT_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONIsNotNull() {
            addCriterion("PRODUCT_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION =", value, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONNotEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION <>", value, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONGreaterThan(String value) {
            addCriterion("PRODUCT_DESCRIPTION >", value, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION >=", value, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONLessThan(String value) {
            addCriterion("PRODUCT_DESCRIPTION <", value, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESCRIPTION <=", value, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONLike(String value) {
            addCriterion("PRODUCT_DESCRIPTION like", value, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONNotLike(String value) {
            addCriterion("PRODUCT_DESCRIPTION not like", value, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONIn(List<String> values) {
            addCriterion("PRODUCT_DESCRIPTION in", values, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONNotIn(List<String> values) {
            addCriterion("PRODUCT_DESCRIPTION not in", values, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESCRIPTION between", value1, value2, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andPRODUCT_DESCRIPTIONNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESCRIPTION not between", value1, value2, "PRODUCT_DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andINVENTORYIsNull() {
            addCriterion("INVENTORY is null");
            return (Criteria) this;
        }

        public Criteria andINVENTORYIsNotNull() {
            addCriterion("INVENTORY is not null");
            return (Criteria) this;
        }

        public Criteria andINVENTORYEqualTo(BigDecimal value) {
            addCriterion("INVENTORY =", value, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYNotEqualTo(BigDecimal value) {
            addCriterion("INVENTORY <>", value, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYGreaterThan(BigDecimal value) {
            addCriterion("INVENTORY >", value, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVENTORY >=", value, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYLessThan(BigDecimal value) {
            addCriterion("INVENTORY <", value, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVENTORY <=", value, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYIn(List<BigDecimal> values) {
            addCriterion("INVENTORY in", values, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYNotIn(List<BigDecimal> values) {
            addCriterion("INVENTORY not in", values, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVENTORY between", value1, value2, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andINVENTORYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVENTORY not between", value1, value2, "INVENTORY");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDIsNull() {
            addCriterion("PROVIDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDIsNotNull() {
            addCriterion("PROVIDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDEqualTo(BigDecimal value) {
            addCriterion("PROVIDER_ID =", value, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDNotEqualTo(BigDecimal value) {
            addCriterion("PROVIDER_ID <>", value, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDGreaterThan(BigDecimal value) {
            addCriterion("PROVIDER_ID >", value, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROVIDER_ID >=", value, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDLessThan(BigDecimal value) {
            addCriterion("PROVIDER_ID <", value, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROVIDER_ID <=", value, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDIn(List<BigDecimal> values) {
            addCriterion("PROVIDER_ID in", values, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDNotIn(List<BigDecimal> values) {
            addCriterion("PROVIDER_ID not in", values, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROVIDER_ID between", value1, value2, "PROVIDER_ID");
            return (Criteria) this;
        }

        public Criteria andPROVIDER_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROVIDER_ID not between", value1, value2, "PROVIDER_ID");
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