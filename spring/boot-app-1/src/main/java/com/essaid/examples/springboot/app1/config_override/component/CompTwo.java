package com.essaid.examples.springboot.app1.config_override.component;

import org.springframework.stereotype.Component;

@Component
public class CompTwo {
    public CompTwo(){
        System.out.println("CompTwo constructor");
    }
}
