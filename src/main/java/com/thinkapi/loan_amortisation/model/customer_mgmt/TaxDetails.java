package com.thinkapi.loan_amortisation.model.customer_mgmt;

class TaxDetails {
    private String exemptionCode;
    private String tdsExcemptRemarks;
    private String entityCode;
    private long tdsExcemption;
    private long customerId;
    private String tdsAmount;
    private String taxCountry;
    private long paysTaxesInUs;
    private long taxType;
    private long taxCategory;

    public String getExemptionCode() {
        return exemptionCode;
    }

    public void setExemptionCode(String value) {
        this.exemptionCode = value;
    }

    public String getTdsExcemptRemarks() {
        return tdsExcemptRemarks;
    }

    public void setTdsExcemptRemarks(String value) {
        this.tdsExcemptRemarks = value;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String value) {
        this.entityCode = value;
    }

    public long getTdsExcemption() {
        return tdsExcemption;
    }

    public void setTdsExcemption(long value) {
        this.tdsExcemption = value;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long value) {
        this.customerId = value;
    }

    public String getTdsAmount() {
        return tdsAmount;
    }

    public void setTdsAmount(String value) {
        this.tdsAmount = value;
    }

    public String getTaxCountry() {
        return taxCountry;
    }

    public void setTaxCountry(String value) {
        this.taxCountry = value;
    }

    public long getPaysTaxesInUs() {
        return paysTaxesInUs;
    }

    public void setPaysTaxesInUs(long value) {
        this.paysTaxesInUs = value;
    }

    public long getTaxType() {
        return taxType;
    }

    public void setTaxType(long value) {
        this.taxType = value;
    }

    public long getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(long value) {
        this.taxCategory = value;
    }
}
