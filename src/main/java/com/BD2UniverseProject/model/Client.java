package com.BD2UniverseProject.model;

import java.math.BigDecimal;

public class Client {
    private BigDecimal CLIENT_ID;

    private String FIRST_NAME;

    private String SECOND_NAME;

    private String FIRST_LASTNAME;

    private String SECOND_LASTNAME;

    private String ADDRESS;

    private String PHONE;

    private String CELLPHONE;

    private BigDecimal CLIENT_TYPE;

    public BigDecimal getCLIENT_ID() {
        return CLIENT_ID;
    }

    public void setCLIENT_ID(BigDecimal CLIENT_ID) {
        this.CLIENT_ID = CLIENT_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getSECOND_NAME() {
        return SECOND_NAME;
    }

    public void setSECOND_NAME(String SECOND_NAME) {
        this.SECOND_NAME = SECOND_NAME;
    }

    public String getFIRST_LASTNAME() {
        return FIRST_LASTNAME;
    }

    public void setFIRST_LASTNAME(String FIRST_LASTNAME) {
        this.FIRST_LASTNAME = FIRST_LASTNAME;
    }

    public String getSECOND_LASTNAME() {
        return SECOND_LASTNAME;
    }

    public void setSECOND_LASTNAME(String SECOND_LASTNAME) {
        this.SECOND_LASTNAME = SECOND_LASTNAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getCELLPHONE() {
        return CELLPHONE;
    }

    public void setCELLPHONE(String CELLPHONE) {
        this.CELLPHONE = CELLPHONE;
    }

    public BigDecimal getCLIENT_TYPE() {
        return CLIENT_TYPE;
    }

    public void setCLIENT_TYPE(BigDecimal CLIENT_TYPE) {
        this.CLIENT_TYPE = CLIENT_TYPE;
    }
}