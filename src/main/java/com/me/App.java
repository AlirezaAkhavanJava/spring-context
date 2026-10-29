package com.me;


import com.me.Configuration.MyBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyBeanFactory.class);
        Product product = context.getBean(Product.class);
        System.out.println(product);


    }
}
