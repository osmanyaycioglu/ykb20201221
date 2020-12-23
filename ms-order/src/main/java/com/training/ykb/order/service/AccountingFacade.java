package com.training.ykb.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.ykb.order.model.Order;
import com.training.ykb.order.model.PaymentRequest;

@Service
public class AccountingFacade {

    @Autowired
    private RestTemplate rt;

    public String charge(final Order order) {
        PaymentRequest pr = new PaymentRequest();
        pr.setCustomerId(order.getCustomerId());
        pr.setAmount(100);
        String responseLoc = this.rt.postForObject("http://ACCOUNTING/payment/charge",
                                                   pr,
                                                   String.class);
        return responseLoc;
    }

}
