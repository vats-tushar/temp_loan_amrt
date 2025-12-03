package com.thinkapi.loan_amortisation.model.customer_mgmt;

class DocumentDetail {
    private long documentCode;
    private long documentSubmittedId;
    private long documentLevel;
    private long customerId;
    private long documentPurpose;
    private long documentStatus;
    private long documentTransactionNumber;
    private String issueDate;
    private String receivedDate;
    private String remarks;

    public long getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(long value) {
        this.documentCode = value;
    }

    public long getDocumentSubmittedId() {
        return documentSubmittedId;
    }

    public void setDocumentSubmittedId(long value) {
        this.documentSubmittedId = value;
    }

    public long getDocumentLevel() {
        return documentLevel;
    }

    public void setDocumentLevel(long value) {
        this.documentLevel = value;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long value) {
        this.customerId = value;
    }

    public long getDocumentPurpose() {
        return documentPurpose;
    }

    public void setDocumentPurpose(long value) {
        this.documentPurpose = value;
    }

    public long getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(long value) {
        this.documentStatus = value;
    }

    public long getDocumentTransactionNumber() {
        return documentTransactionNumber;
    }

    public void setDocumentTransactionNumber(long value) {
        this.documentTransactionNumber = value;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String value) {
        this.receivedDate = value;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String value) {
        this.remarks = value;
    }
}
