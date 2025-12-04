package com.thinkapi.loan_amortisation.model.loan_reference;

public class LoanReferenceHeader {

    private int userId;
    private String entity;
    private int languageCode;
    private int ChannelType;
    private int Co_RelationId;
    private int UUIDSeqNo;
    private String InitiatingSystem;
    private int ServiceMode;
    private String Accesstoken;
    private String referenceId;

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
        return ChannelType;
    }

    public void setChannelType(int channelType) {
        ChannelType = channelType;
    }

    public int getCo_RelationId() {
        return Co_RelationId;
    }

    public void setCo_RelationId(int co_RelationId) {
        Co_RelationId = co_RelationId;
    }

    public int getUUIDSeqNo() {
        return UUIDSeqNo;
    }

    public void setUUIDSeqNo(int UUIDSeqNo) {
        this.UUIDSeqNo = UUIDSeqNo;
    }

    public String getInitiatingSystem() {
        return InitiatingSystem;
    }

    public void setInitiatingSystem(String InitiatingSystem) {
        InitiatingSystem = InitiatingSystem;
    }

    public int getServiceMode() {
        return ServiceMode;
    }

    public void setServiceMode(int serviceMode) {
        ServiceMode = serviceMode;
    }

    public String getAccesstoken() {
        return Accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        Accesstoken = accesstoken;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
}
