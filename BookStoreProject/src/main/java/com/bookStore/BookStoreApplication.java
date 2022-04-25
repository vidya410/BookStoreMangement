package com.bookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class BookStoreApplication {
    public static void  main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BookStoreApplication.class, args);
        System.out.println("Hello World!");

    }

}