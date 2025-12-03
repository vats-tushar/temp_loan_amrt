package com.thinkapi.loan_amortisation.model.customer_mgmt;

class CustomerRelationshipDetail {
    private String relationshipEndDate;
    private long relationType;
    private String entityCode;
    private String accountReference;
    private long relationStatus;
    private String purpose;
    private String validFrom;
    private long percentageofOwnerShip;
    private long relationshipCustomerId;
    private long signatureRight;
    private long levelType;
    private long customerReference;
    private String relationshipCustomerName;

    public String getRelationshipEndDate() {
        return relationshipEndDate;
    }

    public void setRelationshipEndDate(String value) {
        this.relationshipEndDate = value;
    }

    public long getRelationType() {
        return relationType;
    }

    public void setRelationType(long value) {
        this.relationType = value;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String value) {
        this.entityCode = value;
    }

    public String getAccountReference() {
        return accountReference;
    }

    public void setAccountReference(String value) {
        this.accountReference = value;
    }

    public long getRelationStatus() {
        return relationStatus;
    }

    public void setRelationStatus(long value) {
        this.relationStatus = value;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String value) {
        this.purpose = value;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    public long getPercentageofOwnerShip() {
        return percentageofOwnerShip;
    }

    public void setPercentageofOwnerShip(long value) {
        this.percentageofOwnerShip = value;
    }

    public long getRelationshipCustomerId() {
        return relationshipCustomerId;
    }

    public void setRelationshipCustomerId(long value) {
        this.relationshipCustomerId = value;
    }

    public long getSignatureRight() {
        return signatureRight;
    }

    public void setSignatureRight(long value) {
        this.signatureRight = value;
    }

    public long getLevelType() {
        return levelType;
    }

    public void setLevelType(long value) {
        this.levelType = value;
    }

    public long getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(long value) {
        this.customerReference = value;
    }

    public String getRelationshipCustomerName() {
        return relationshipCustomerName;
    }

    public void setRelationshipCustomerName(String value) {
        this.relationshipCustomerName = value;
    }
}
