package com.thinkapi.loan_amortisation.model.loan_reference;

class RepaymentEvent {
    private long penalPaid;
    private long installmentAmt;
    private String originalDueDt;
    private long principalPaid;
    private long projectedIntAmt;
    private String dueDt;
    private long interestDue;
    private long penalDueAmount;
    private String paidDt;
    private long principalAmt;
    private long loanId;
    private long interestPaid;
    private long expectedPrincipal;
    private long status;

    public long getPenalPaid() {
        return penalPaid;
    }

    public void setPenalPaid(long value) {
        this.penalPaid = value;
    }

    public long getInstallmentAmt() {
        return installmentAmt;
    }

    public void setInstallmentAmt(long value) {
        this.installmentAmt = value;
    }

    public String getOriginalDueDt() {
        return originalDueDt;
    }

    public void setOriginalDueDt(String value) {
        this.originalDueDt = value;
    }

    public long getPrincipalPaid() {
        return principalPaid;
    }

    public void setPrincipalPaid(long value) {
        this.principalPaid = value;
    }

    public long getProjectedIntAmt() {
        return projectedIntAmt;
    }

    public void setProjectedIntAmt(long value) {
        this.projectedIntAmt = value;
    }

    public String getDueDt() {
        return dueDt;
    }

    public void setDueDt(String value) {
        this.dueDt = value;
    }

    public long getInterestDue() {
        return interestDue;
    }

    public void setInterestDue(long value) {
        this.interestDue = value;
    }

    public long getPenalDueAmount() {
        return penalDueAmount;
    }

    public void setPenalDueAmount(long value) {
        this.penalDueAmount = value;
    }

    public String getPaidDt() {
        return paidDt;
    }

    public void setPaidDt(String value) {
        this.paidDt = value;
    }

    public long getPrincipalAmt() {
        return principalAmt;
    }

    public void setPrincipalAmt(long value) {
        this.principalAmt = value;
    }

    public long getLoanId() {
        return loanId;
    }

    public void setLoanId(long value) {
        this.loanId = value;
    }

    public long getInterestPaid() {
        return interestPaid;
    }

    public void setInterestPaid(long value) {
        this.interestPaid = value;
    }

    public long getExpectedPrincipal() {
        return expectedPrincipal;
    }

    public void setExpectedPrincipal(long value) {
        this.expectedPrincipal = value;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long value) {
        this.status = value;
    }
}
