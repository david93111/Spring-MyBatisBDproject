package com.BD2UniverseProject.model;

import java.math.BigDecimal;

public class SaleStatus {
    private BigDecimal SALE_STATUS_ID;

    private String STATUS_NAME;

    private String STATUS_CODE;

    public BigDecimal getSALE_STATUS_ID() {
        return SALE_STATUS_ID;
    }

    public void setSALE_STATUS_ID(BigDecimal SALE_STATUS_ID) {
        this.SALE_STATUS_ID = SALE_STATUS_ID;
    }

    public String getSTATUS_NAME() {
        return STATUS_NAME;
    }

    public void setSTATUS_NAME(String STATUS_NAME) {
        this.STATUS_NAME = STATUS_NAME;
    }

    public String getSTATUS_CODE() {
        return STATUS_CODE;
    }

    public void setSTATUS_CODE(String STATUS_CODE) {
        this.STATUS_CODE = STATUS_CODE;
    }
}