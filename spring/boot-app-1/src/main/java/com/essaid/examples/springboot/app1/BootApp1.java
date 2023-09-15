package com.essaid.examples.springboot.app1;

import examples.spring.boot.SpringBootApiSayHello;
import examples.spring.boot.autoconfig.SpringBootApiSayHelloAutoconfigure;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class BootApp1 {

    private final SpringBootApiSayHello helloService;

    @Value("${value.one: default value one}")
    String value1;

    @Value("${value.two: default value one}")
    String value2;

    BootApp1(@Qualifier("helloService") Object helloService) {
        this.helloService = (SpringBootApiSayHello) helloService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BootApp1.class, args);
    }

    @PostConstruct
    void postInit() {
        System.out.println("=========== :" + value1);
        System.out.println();
        System.out.flush();

        System.out.println(helloService.hello());
        System.out.flush();

        SpringBootApiSayHelloAutoconfigure autoconfigure = new SpringBootApiSayHelloAutoconfigure();
        System.out.println(autoconfigure.hello());
        System.out.flush();
        System.out.println();
        System.out.println("=========== :" + value2);
        System.out.println("=========== :" + value2);
        System.out.println("=========== :" + value2);
        System.out.println("=========== :" + value2);
    }
}
