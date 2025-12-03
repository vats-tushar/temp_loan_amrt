package com.thinkapi.loan_amortisation.model.customer_mgmt;

class ConsentInformation {
    private long providedBy;
    private long consentPurpose;
    private String consentProvidedDate;
    private String withdrawalDate;
    private long consentNumber;
    private long purposeStatus;
    private long customerId;
    private String remarks;

    public long getProvidedBy() {
        return providedBy;
    }

    public void setProvidedBy(long value) {
        this.providedBy = value;
    }

    public long getConsentPurpose() {
        return consentPurpose;
    }

    public void setConsentPurpose(long value) {
        this.consentPurpose = value;
    }

    public String getConsentProvidedDate() {
        return consentProvidedDate;
    }

    public void setConsentProvidedDate(String value) {
        this.consentProvidedDate = value;
    }

    public String getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(String value) {
        this.withdrawalDate = value;
    }

    public long getConsentNumber() {
        return consentNumber;
    }

    public void setConsentNumber(long value) {
        this.consentNumber = value;
    }

    public long getPurposeStatus() {
        return purposeStatus;
    }

    public void setPurposeStatus(long value) {
        this.purposeStatus = value;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long value) {
        this.customerId = value;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String value) {
        this.remarks = value;
    }
}
