package com.thinkapi.loan_amortisation.model.customer_mgmt;

public class CustomerHeader {

    private int userId;
    private String entity;
    private int languageCode;
    private int channelType;
    private int coRelationId;
    private int uuidSeqNo;
    private String initiatingSystem;
    private int serviceMode;
    private String referenceId;
    private String accessToken;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;

    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public int getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(int languageCode) {
        this.languageCode = languageCode;
    }

    public int getChannelType() {
        return channelType;
    }

    public void setChannelType(int channelType) {
        this.channelType = channelType;
    }

    public int getCoRelationId() {
        return coRelationId;
    }

    public void setCoRelationId(int coRelationId) {
        this.coRelationId = coRelationId;
    }

    public int getUuidSeqNo() {
        return uuidSeqNo;
    }

    public void setUuidSeqNo(int uuidSeqNo) {
        this.uuidSeqNo = uuidSeqNo;
    }

    public String getInitiatingSystem() {
        return initiatingSystem;
    }

    public void setInitiatingSystem(String initiatingSystem) {
        this.initiatingSystem = initiatingSystem;
    }

    public int getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(int serviceMode) {
        this.serviceMode = serviceMode;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
