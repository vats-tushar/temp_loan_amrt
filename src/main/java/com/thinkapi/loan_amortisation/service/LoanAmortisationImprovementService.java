package com.thinkapi.loan_amortisation.service;


import com.thinkapi.loan_amortisation.client.CustomerManagementClient;
import com.thinkapi.loan_amortisation.model.customer_mgmt.CustomerHeader;
import com.thinkapi.loan_amortisation.model.customer_mgmt.GetCustomerResponse;
import com.thinkapi.loan_amortisation.model.loan_amortisation.ImproveLoanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanAmortisationImprovementService {

    @Autowired
    private CustomerManagementClient customerClient;

    public ImproveLoanResponse process(int customerId) {

        ImproveLoanResponse improveLoanResponse_obj = new ImproveLoanResponse();


        //Code to fetch Customer Details
        CustomerHeader header = new CustomerHeader();
        header.setUserId(101);
        header.setEntity("ABC");
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

        System.out.println("Customer API GET Response : " + customer);



        return improveLoanResponse_obj;
    }
}