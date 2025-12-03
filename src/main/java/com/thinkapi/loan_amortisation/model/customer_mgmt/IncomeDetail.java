package com.thinkapi.loan_amortisation.model.customer_mgmt;

class IncomeDetail {
    private long incomeType;
    private long paymentMode;
    private long sequenceId;
    private String extensibilityMap;
    private long proofOfIncome;
    private long frequency;
    private long monthlyIncome;

    public long getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(long value) {
        this.incomeType = value;
    }

    public long getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(long value) {
        this.paymentMode = value;
    }

    public long getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(long value) {
        this.sequenceId = value;
    }

    public String getExtensibilityMap() {
        return extensibilityMap;
    }

    public void setExtensibilityMap(String value) {
        this.extensibilityMap = value;
    }

    public long getProofOfIncome() {
        return proofOfIncome;
    }

    public void setProofOfIncome(long value) {
        this.proofOfIncome = value;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long value) {
        this.frequency = value;
    }

    public long getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(long value) {
        this.monthlyIncome = value;
    }
}
