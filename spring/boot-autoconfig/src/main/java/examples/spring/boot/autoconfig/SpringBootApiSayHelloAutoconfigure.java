package examples.spring.boot.autoconfig;

import examples.spring.boot.SpringBootApiSayHello;
import org.springframework.stereotype.Component;

@Component("helloService")
public class SpringBootApiSayHelloAutoconfigure implements SpringBootApiSayHello {
    @Override
    public String hello() {
        return "Hello from Autoconfigure";
    }
}
