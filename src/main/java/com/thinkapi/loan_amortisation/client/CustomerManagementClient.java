package com.thinkapi.loan_amortisation.client;

import com.thinkapi.loan_amortisation.model.customer_mgmt.CustomerHeader;
import com.thinkapi.loan_amortisation.model.customer_mgmt.GetCustomerResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CustomerManagementClient {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${customer.api.base.url}")
    private String baseUrl;
    /*public CustomerManagementClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }
*/
    public GetCustomerResponse getCustomerDetails(
            int customerId,
            int pageSize,
            int pageNum,
            CustomerHeader header
    ) {

        String url = baseUrl
                + "/customerManagement/customer/viewDetails"
                + "?CustomerID=" + customerId
                + "&pageSize=" + pageSize
                + "&pageNum=" + pageNum;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("userId", String.valueOf(header.getUserId()));
        httpHeaders.set("entity", header.getEntity());
        httpHeaders.set("languageCode", String.valueOf(header.getLanguageCode()));
        httpHeaders.set("ChannelType", String.valueOf(header.getChannelType()));
        httpHeaders.set("Co-RelationId", String.valueOf(header.getCoRelationId()));
        httpHeaders.set("UUIDSeqNo", String.valueOf(header.getUuidSeqNo()));
        httpHeaders.set("InitiatingSystem", header.getInitiatingSystem());
        httpHeaders.set("ServiceMode", String.valueOf(header.getServiceMode()));
        httpHeaders.set("referenceId", header.getReferenceId());
        httpHeaders.set("Accesstoken", header.getAccessToken());

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<GetCustomerResponse> response =
                restTemplate.exchange(
                        url,
                        HttpMethod.GET,
                        entity,
                        GetCustomerResponse.class
                );

        return response.getBody();
    }
}
