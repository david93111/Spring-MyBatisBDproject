package com.BD2UniverseProject.model;

import java.math.BigDecimal;

public class Product {
    private BigDecimal PRODUCT_ID;

    private String PRODUCT_NAME;

    private String PRODUCT_CODE;

    private BigDecimal PRODUCT_PRICE;

    private BigDecimal PRODUCT_COST;

    private String PRODUCT_DESCRIPTION;

    private BigDecimal INVENTORY;

    private BigDecimal PROVIDER_ID;

    public BigDecimal getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(BigDecimal PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.PRODUCT_NAME = PRODUCT_NAME;
    }

    public String getPRODUCT_CODE() {
        return PRODUCT_CODE;
    }

    public void setPRODUCT_CODE(String PRODUCT_CODE) {
        this.PRODUCT_CODE = PRODUCT_CODE;
    }

    public BigDecimal getPRODUCT_PRICE() {
        return PRODUCT_PRICE;
    }

    public void setPRODUCT_PRICE(BigDecimal PRODUCT_PRICE) {
        this.PRODUCT_PRICE = PRODUCT_PRICE;
    }

    public BigDecimal getPRODUCT_COST() {
        return PRODUCT_COST;
    }

    public void setPRODUCT_COST(BigDecimal PRODUCT_COST) {
        this.PRODUCT_COST = PRODUCT_COST;
    }

    public String getPRODUCT_DESCRIPTION() {
        return PRODUCT_DESCRIPTION;
    }

    public void setPRODUCT_DESCRIPTION(String PRODUCT_DESCRIPTION) {
        this.PRODUCT_DESCRIPTION = PRODUCT_DESCRIPTION;
    }

    public BigDecimal getINVENTORY() {
        return INVENTORY;
    }

    public void setINVENTORY(BigDecimal INVENTORY) {
        this.INVENTORY = INVENTORY;
    }

    public BigDecimal getPROVIDER_ID() {
        return PROVIDER_ID;
    }

    public void setPROVIDER_ID(BigDecimal PROVIDER_ID) {
        this.PROVIDER_ID = PROVIDER_ID;
    }
}