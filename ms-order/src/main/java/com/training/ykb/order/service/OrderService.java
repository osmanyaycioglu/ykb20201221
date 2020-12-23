package com.training.ykb.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.ykb.order.model.Order;

@Service
public class OrderService {

    @Autowired
    private AccountingFacade af;

    public String orderPlace(final Order order) {
        return this.af.charge(order);
    }

    public String orderPlace2(final Order order) {
        return this.af.charge2(order);
    }

}
