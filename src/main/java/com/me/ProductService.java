package com.me;

public class ProductService {
    private final ProductRepository repository;
    private String author;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "ProductService{" +
                "repository=" + repository +
                ", author='" + author + '\'' +
                '}';
    }
}

