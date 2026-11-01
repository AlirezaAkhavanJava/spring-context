package com.me;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static void main(String[] args) {

        // =================CONTAINER==================
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService service = (ProductService) context.getBean("productService");
        System.out.println(service.getAuthor());
        ProductController controller = context.getBean(ProductController.class);
        System.out.println(controller);
    }
}
