package com.essaid.examples.springboot.app1.config_override.app;

import com.essaid.examples.springboot.app1.config_override.component.CompOne;
import com.essaid.examples.springboot.app1.config_override.config.FirstConfiguration;
import com.essaid.examples.springboot.app1.config_override.config.SecondConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication()
@Import({FirstConfiguration.class, SecondConfiguration.class})
public class ConfigOverrideApplication {
    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(ConfigOverrideApplication.class);
        ConfigurableApplicationContext context = application.run(args);

        CompOne bean = context.getBean(CompOne.class);
        System.out.println("Actual bean: " + bean);

        FirstConfiguration firstConfig = context.getBean(FirstConfiguration.class);
        System.out.println("Bean obtained from first configuration: "+ firstConfig.compOne());

    }
}
