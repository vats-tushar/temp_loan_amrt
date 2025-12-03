package com.thinkapi.loan_amortisation.model.customer_mgmt;

class RiskRatingDetail {
    private String validTill;
    private long ratingAgency;
    private long customerReference;
    private long rating;
    private String validFrom;
    private String extensibilityMap;

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String value) {
        this.validTill = value;
    }

    public long getRatingAgency() {
        return ratingAgency;
    }

    public void setRatingAgency(long value) {
        this.ratingAgency = value;
    }

    public long getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(long value) {
        this.customerReference = value;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long value) {
        this.rating = value;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    public String getExtensibilityMap() {
        return extensibilityMap;
    }

    public void setExtensibilityMap(String value) {
        this.extensibilityMap = value;
    }
}
