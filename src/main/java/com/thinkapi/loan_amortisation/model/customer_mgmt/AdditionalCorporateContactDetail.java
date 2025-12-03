package com.thinkapi.loan_amortisation.model.customer_mgmt;

class AdditionalCorporateContactDetail {
    private String number;
    private long contactExtension;
    private long smsRequired;
    private long corporateSequence;
    private long countryCode;
    private long contactType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String value) {
        this.number = value;
    }

    public long getContactExtension() {
        return contactExtension;
    }

    public void setContactExtension(long value) {
        this.contactExtension = value;
    }

    public long getsmsRequired() {
        return smsRequired;
    }

    public void setsmsRequired(long value) {
        this.smsRequired = value;
    }

    public long getCorporateSequence() {
        return corporateSequence;
    }

    public void setCorporateSequence(long value) {
        this.corporateSequence = value;
    }

    public long getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(long value) {
        this.countryCode = value;
    }

    public long getContactType() {
        return contactType;
    }

    public void setContactType(long value) {
        this.contactType = value;
    }
}
