package com.thinkapi.loan_amortisation.model.customer_mgmt;

class CorporateDetails {
    private String bsrOrganizationCode;
    private long shareHolderDeclaration;
    private long tdsOnCashExempt;
    private long secondarySector;
    private String countryOfActivity;
    private long sizeOfFirm;
    private String netWorth;
    private long relationshipManager;
    private String countryOfIncorp;
    private long legalForm;
    private String extensibilityMap;
    private long primarySector;

    public String getBsrOrganizationCode() {
        return bsrOrganizationCode;
    }

    public void setBsrOrganizationCode(String value) {
        this.bsrOrganizationCode = value;
    }

    public long getShareHolderDeclaration() {
        return shareHolderDeclaration;
    }

    public void setShareHolderDeclaration(long value) {
        this.shareHolderDeclaration = value;
    }

    public long getTdsOnCashExempt() {
        return tdsOnCashExempt;
    }

    public void setTdsOnCashExempt(long value) {
        this.tdsOnCashExempt = value;
    }

    public long getSecondarySector() {
        return secondarySector;
    }

    public void setSecondarySector(long value) {
        this.secondarySector = value;
    }

    public String getCountryOfActivity() {
        return countryOfActivity;
    }

    public void setCountryOfActivity(String value) {
        this.countryOfActivity = value;
    }

    public long getSizeOfFirm() {
        return sizeOfFirm;
    }

    public void setSizeOfFirm(long value) {
        this.sizeOfFirm = value;
    }

    public String getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(String value) {
        this.netWorth = value;
    }

    public long getRelationshipManager() {
        return relationshipManager;
    }

    public void setRelationshipManager(long value) {
        this.relationshipManager = value;
    }

    public String getCountryOfIncorp() {
        return countryOfIncorp;
    }

    public void setCountryOfIncorp(String value) {
        this.countryOfIncorp = value;
    }

    public long getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(long value) {
        this.legalForm = value;
    }

    public String getExtensibilityMap() {
        return extensibilityMap;
    }

    public void setExtensibilityMap(String value) {
        this.extensibilityMap = value;
    }

    public long getPrimarySector() {
        return primarySector;
    }

    public void setPrimarySector(long value) {
        this.primarySector = value;
    }
}
