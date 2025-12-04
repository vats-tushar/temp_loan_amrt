// LoanReferenceResponse.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

package com.thinkapi.loan_amortisation.model.loan_reference;
import java.util.List;

public class LoanReferenceResponse {
    private long noOfPages;
    private LoanDetails loanDetails;
    private long totalNoOfRecords;
    private long pageSize;
    private String hasNext;
    private List<RepaymentEvent> repaymentEvents;
    private long pageNum;

    public long getNoOfPages() { return noOfPages; }
    public void setNoOfPages(long value) { this.noOfPages = value; }

    public LoanDetails getLoanDetails() { return loanDetails; }
    public void setLoanDetails(LoanDetails value) { this.loanDetails = value; }

    public long getTotalNoOfRecords() { return totalNoOfRecords; }
    public void setTotalNoOfRecords(long value) { this.totalNoOfRecords = value; }

    public long getPageSize() { return pageSize; }
    public void setPageSize(long value) { this.pageSize = value; }

    public String getHasNext() { return hasNext; }
    public void setHasNext(String value) { this.hasNext = value; }

    public List<RepaymentEvent> getRepaymentEvents() { return repaymentEvents; }
    public void setRepaymentEvents(List<RepaymentEvent> value) { this.repaymentEvents = value; }

    public long getPageNum() { return pageNum; }
    public void setPageNum(long value) { this.pageNum = value; }
}

// LoanDetails.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

// RepaymentEvent.java

// YApi QuickType插件生成，具体参考文档:https://plugins.jetbrains.com/plugin/18847-yapi-quicktype/documentation

