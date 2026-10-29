package com.me;

public class Product {

    private final Customer customer;

    public Product(Customer customer) {
        this.customer = customer;
    }

    public void sendMessage() {
        System.out.println("Customer : " + customer.toString().toUpperCase());
    }
}
