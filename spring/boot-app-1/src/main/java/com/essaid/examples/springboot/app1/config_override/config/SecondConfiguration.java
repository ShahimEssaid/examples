package com.essaid.examples.springboot.app1.config_override.config;

import com.essaid.examples.springboot.app1.config_override.component.CompOne;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecondConfiguration {

    private final FirstConfiguration firstConfiguration;
    private final ConfigurableApplicationContext context;

    private int count;

    SecondConfiguration(FirstConfiguration firstConfiguration, ConfigurableApplicationContext context) {
        this.firstConfiguration = firstConfiguration;
        this.context = context;
    }

    @Bean
    public CompOne compOne() {
        CompOne compOne1 = firstConfiguration.compOne();
        CompOne compOne2 = firstConfiguration.compOne();


        CompOne c = new CompOne();
        c.setComment("From second configuration count: " + ++count);
        System.out.println("Second configuration created: " + c);
        return c;
    }
}
