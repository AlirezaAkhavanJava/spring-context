package com.me.Configuration;

import com.me.Customer;
import com.me.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeanFactory {

    @Bean
    public Product product(Customer customer) {
        return new Product(customer);
    }

    @Bean
    public Customer customer() {
        return new Customer();
    }
}
