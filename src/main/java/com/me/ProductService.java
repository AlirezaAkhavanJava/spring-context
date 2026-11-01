package com.me;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository repository;
    @Getter
    private String author;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
    @Value("MOORE")
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "ProductService{" +
                "repository=" + repository +
                ", author='" + author + '\'' +
                '}';
    }
}

