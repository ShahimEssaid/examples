package com.essaid.examples.springboot.app1.impl;

import examples.spring.boot.SpringBootApiSayHello;
import org.springframework.stereotype.Component;

@Component("helloService")
public class SpringBootApiSayHelloApp1 implements SpringBootApiSayHello {

    @Override
    public String hello() {
        return "Hello from BootApp1";
    }
}
