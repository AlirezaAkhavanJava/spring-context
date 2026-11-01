package com.me;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    private final ProductService service;
    private final String helper;

    public ProductController(ProductService service, @Value("Alireza") String helper) {
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
