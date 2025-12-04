package com.thinkapi.loan_amortisation.service;


import com.thinkapi.loan_amortisation.client.CustomerManagementClient;
import com.thinkapi.loan_amortisation.client.LoanReferenceClient;
import com.thinkapi.loan_amortisation.model.customer_mgmt.CustomerHeader;
import com.thinkapi.loan_amortisation.model.customer_mgmt.GetCustomerResponse;
import com.thinkapi.loan_amortisation.model.loan_amortisation.ImproveLoanResponse;
import com.thinkapi.loan_amortisation.model.loan_reference.LoanReferenceHeader;
import com.thinkapi.loan_amortisation.model.loan_reference.LoanReferenceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanAmortisationImprovementService {

    @Autowired
    private CustomerManagementClient customerClient;

    @Autowired
    private LoanReferenceClient loanReferenceClient;

    public GetCustomerResponse getCustomerDetails(int customerId){
        CustomerHeader header = new CustomerHeader();
        header.setUserId(1);
        header.setEntity("GPRDTTSTOU");
        header.setLanguageCode(1);
        header.setChannelType(2);
        header.setCoRelationId(12345);
        header.setUuidSeqNo(100001);
        header.setInitiatingSystem("LOAN_SYSTEM");
        header.setServiceMode(1);
        header.setReferenceId("REF123");
        header.setAccessToken("/home/marketplace/TCS_BaNCS_Marketplace/Bancs/gateway_files/azure/_app_keys.html.erb");

        GetCustomerResponse customer =
                customerClient.getCustomerDetails(customerId, 10, 1, header);
        return customer;
    }

    public LoanReferenceResponse getLoanReference(String loanReferenceId, int repayOption){
        LoanReferenceHeader loanReferenceHeader = new LoanReferenceHeader();
        loanReferenceHeader.setUserId(1);
        loanReferenceHeader.setEntity("GPRDTTSTOU");
        loanReferenceHeader.setLanguageCode(1);
        loanReferenceHeader.setChannelType(2);
        loanReferenceHeader.setCo_RelationId(12345);
        loanReferenceHeader.setUUIDSeqNo(100001);
        loanReferenceHeader.setInitiatingSystem("LOAN_SYSTEM");
        loanReferenceHeader.setServiceMode(1);
        loanReferenceHeader.setReferenceId("REF123");
        loanReferenceHeader.setAccesstoken("/home/marketplace/TCS_BaNCS_Marketplace/Bancs/gateway_files/azure/_app_keys.html.erb");

        LoanReferenceResponse loan_reference =
                loanReferenceClient.getLoanReferenceDetails(loanReferenceId, repayOption, 10, 1, loanReferenceHeader);

        return loan_reference;
    }
    public ImproveLoanResponse process(int customerId, String loanReference, int repayOption) {

        ImproveLoanResponse improveLoanResponse_obj = new ImproveLoanResponse();


        //Code to fetch Customer Details
        LoanReferenceResponse loan = getLoanReference(loanReference, repayOption);

        System.out.println("Customer API GET Response : " + loan);




        return improveLoanResponse_obj;
    }
}