package com.thinkapi.loan_amortisation.client;

import com.thinkapi.loan_amortisation.model.loan_reference.LoanReferenceHeader;
import com.thinkapi.loan_amortisation.model.loan_reference.LoanReferenceResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

;


@Component
public class LoanReferenceClient {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${loanReference.api.base.url}")
    private String baseUrl;
    /*public CustomerManagementClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }
*/
    public LoanReferenceResponse getLoanReferenceDetails(
            String loanReference,
            int repayOption,
            int pageSize,
            int pageNum,
            LoanReferenceHeader header
    ) {

        String url = baseUrl
                + "/repaymentSchedule"
                + "/" + loanReference
                + "?repayOption=" + repayOption
                + "&pageSize=" + pageSize
                + "&pageNum=" + pageNum;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Accept", "application/json");
        httpHeaders.set("userId", String.valueOf(header.getUserId()));
        httpHeaders.set("entity", header.getEntity());
        httpHeaders.set("languageCode", String.valueOf(header.getLanguageCode()));
        httpHeaders.set("ChannelType", String.valueOf(header.getChannelType()));
        httpHeaders.set("Co-RelationId", String.valueOf(header.getCo_RelationId()));
        httpHeaders.set("UUIDSeqNo", String.valueOf(header.getUUIDSeqNo()));
        httpHeaders.set("InitiatingSystem", header.getInitiatingSystem());
        httpHeaders.set("ServiceMode", String.valueOf(header.getServiceMode()));
        httpHeaders.set("referenceId", header.getReferenceId());
        httpHeaders.set("Accesstoken", header.getAccesstoken());

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        System.out.println("Requested url=" +url);
        ResponseEntity<LoanReferenceResponse> response =
                restTemplate.exchange(
                        url,
                        HttpMethod.GET,
                        entity,
                        LoanReferenceResponse.class
                );
        System.out.println(response);
        return response.getBody();
    }
}
