package com.eacuamba.dev.algafoodapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgafoodApiApplication {

    public static void main(String[] args)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        SpringApplication.run(AlgafoodApiApplication.class, args);
    }

}
