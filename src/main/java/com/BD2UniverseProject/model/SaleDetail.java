package com.BD2UniverseProject.model;

import java.math.BigDecimal;

public class SaleDetail {
    private BigDecimal SALE_DETAIL_ID;

    private BigDecimal PRICE;

    private BigDecimal COST;

    private BigDecimal QUANTITY;

    private BigDecimal SALE_ID;

    private BigDecimal PRODUCT_ID;

    public BigDecimal getSALE_DETAIL_ID() {
        return SALE_DETAIL_ID;
    }

    public void setSALE_DETAIL_ID(BigDecimal SALE_DETAIL_ID) {
        this.SALE_DETAIL_ID = SALE_DETAIL_ID;
    }

    public BigDecimal getPRICE() {
        return PRICE;
    }

    public void setPRICE(BigDecimal PRICE) {
        this.PRICE = PRICE;
    }

    public BigDecimal getCOST() {
        return COST;
    }

    public void setCOST(BigDecimal COST) {
        this.COST = COST;
    }

    public BigDecimal getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(BigDecimal QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public BigDecimal getSALE_ID() {
        return SALE_ID;
    }

    public void setSALE_ID(BigDecimal SALE_ID) {
        this.SALE_ID = SALE_ID;
    }

    public BigDecimal getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(BigDecimal PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }
}