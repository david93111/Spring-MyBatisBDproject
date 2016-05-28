package com.BD2UniverseProject.model;

import java.math.BigDecimal;
import java.util.Date;

public class Sale {
    private BigDecimal SALE_ID;

    private BigDecimal TOTAL_PRICE;

    private Date SALE_DATE;

    private String SALE_ADDRESS;

    private BigDecimal SALE_STATUS;

    private BigDecimal CLIENT_ID;

    public BigDecimal getSALE_ID() {
        return SALE_ID;
    }

    public void setSALE_ID(BigDecimal SALE_ID) {
        this.SALE_ID = SALE_ID;
    }

    public BigDecimal getTOTAL_PRICE() {
        return TOTAL_PRICE;
    }

    public void setTOTAL_PRICE(BigDecimal TOTAL_PRICE) {
        this.TOTAL_PRICE = TOTAL_PRICE;
    }

    public Date getSALE_DATE() {
        return SALE_DATE;
    }

    public void setSALE_DATE(Date SALE_DATE) {
        this.SALE_DATE = SALE_DATE;
    }

    public String getSALE_ADDRESS() {
        return SALE_ADDRESS;
    }

    public void setSALE_ADDRESS(String SALE_ADDRESS) {
        this.SALE_ADDRESS = SALE_ADDRESS;
    }

    public BigDecimal getSALE_STATUS() {
        return SALE_STATUS;
    }

    public void setSALE_STATUS(BigDecimal SALE_STATUS) {
        this.SALE_STATUS = SALE_STATUS;
    }

    public BigDecimal getCLIENT_ID() {
        return CLIENT_ID;
    }

    public void setCLIENT_ID(BigDecimal CLIENT_ID) {
        this.CLIENT_ID = CLIENT_ID;
    }
}