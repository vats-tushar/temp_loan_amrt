package com.thinkapi.loan_amortisation.model.customer_mgmt;

class ContactDetails {
    private String firstTelephoneNumber;
    private String website;
    private String entityCode;
    private String secondTelephoneNumber;
    private String nationalNumber;
    private String primaryEmailId;
    private long customerId;
    private String secondaryEmailId;
    private long primaryContactIndicator;
    private long addressPurpose;

    public String getFirstTelephoneNumber() {
        return firstTelephoneNumber;
    }

    public void setFirstTelephoneNumber(String value) {
        this.firstTelephoneNumber = value;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String value) {
        this.website = value;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String value) {
        this.entityCode = value;
    }

    public String getSecondTelephoneNumber() {
        return secondTelephoneNumber;
    }

    public void setSecondTelephoneNumber(String value) {
        this.secondTelephoneNumber = value;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String value) {
        this.nationalNumber = value;
    }

    public String getPrimaryEmailId() {
        return primaryEmailId;
    }

    public void setPrimaryEmailId(String value) {
        this.primaryEmailId = value;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long value) {
        this.customerId = value;
    }

    public String getSecondaryEmailId() {
        return secondaryEmailId;
    }

    public void setSecondaryEmailId(String value) {
        this.secondaryEmailId = value;
    }

    public long getPrimaryContactIndicator() {
        return primaryContactIndicator;
    }

    public void setPrimaryContactIndicator(long value) {
        this.primaryContactIndicator = value;
    }

    public long getAddressPurpose() {
        return addressPurpose;
    }

    public void setAddressPurpose(long value) {
        this.addressPurpose = value;
    }
}
