package com.me;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {

    private final Customer customer;

    @Autowired
    public Product(Customer customer) {
        this.customer = customer;
    }

    public void sendMessage() {
        System.out.println("Customer : " + customer.toString().toUpperCase());
    }
}
