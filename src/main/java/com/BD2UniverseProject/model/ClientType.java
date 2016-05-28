package com.BD2UniverseProject.model;

import java.math.BigDecimal;

public class ClientType {
    private BigDecimal CLIENT_TYPE_ID;

    private String TYPE_NAME;

    private String TYPE_CODE;

    public BigDecimal getCLIENT_TYPE_ID() {
        return CLIENT_TYPE_ID;
    }

    public void setCLIENT_TYPE_ID(BigDecimal CLIENT_TYPE_ID) {
        this.CLIENT_TYPE_ID = CLIENT_TYPE_ID;
    }

    public String getTYPE_NAME() {
        return TYPE_NAME;
    }

    public void setTYPE_NAME(String TYPE_NAME) {
        this.TYPE_NAME = TYPE_NAME;
    }

    public String getTYPE_CODE() {
        return TYPE_CODE;
    }

    public void setTYPE_CODE(String TYPE_CODE) {
        this.TYPE_CODE = TYPE_CODE;
    }
}