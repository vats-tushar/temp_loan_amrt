package com.thinkapi.loan_amortisation.model.customer_mgmt;

class IdentificationDetail {
    private String validTill;
    private String entityCode;
    private String identifierValue;
    private long customerId;
    private long selfRegistration;
    private String issueCountry;
    private long identifierType;
    private String issueDate;
    private String issueAuthority;
    private String idIssuePlace;

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String value) {
        this.validTill = value;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String value) {
        this.entityCode = value;
    }

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String value) {
        this.identifierValue = value;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long value) {
        this.customerId = value;
    }

    public long getSelfRegistration() {
        return selfRegistration;
    }

    public void setSelfRegistration(long value) {
        this.selfRegistration = value;
    }

    public String getIssueCountry() {
        return issueCountry;
    }

    public void setIssueCountry(String value) {
        this.issueCountry = value;
    }

    public long getIdentifierType() {
        return identifierType;
    }

    public void setIdentifierType(long value) {
        this.identifierType = value;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    public String getIssueAuthority() {
        return issueAuthority;
    }

    public void setIssueAuthority(String value) {
        this.issueAuthority = value;
    }

    public String getidIssuePlace() {
        return idIssuePlace;
    }

    public void setidIssuePlace(String value) {
        this.idIssuePlace = value;
    }
}
