package com.essaid.examples.springboot.app1.config_override.config;

import com.essaid.examples.springboot.app1.config_override.component.CompOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FirstConfiguration {

    private int count;

    @Bean
    public CompOne compOne() {
        CompOne c = new CompOne();
        c.setComment("From first configuration count: " + ++count);
        System.out.println("First configuration created: " + c);
        return c;
    }
}
