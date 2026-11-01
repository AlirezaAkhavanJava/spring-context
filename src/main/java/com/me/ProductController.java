package com.me;

public class ProductController {
    private final ProductService service;
    private final String helper;

    public ProductController(ProductService service, String helper) {
        this.service = service;
        this.helper = helper;
    }

    @Override
    public String toString() {
        return "ProductController{" +
                "service=" + service.toString() +
                ", helper='" + helper + '\'' +
                '}';
    }
}
