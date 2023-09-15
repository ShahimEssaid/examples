package examples.spring.boot.autoconfig;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({SpringBootApiSayHelloAutoconfigure.class})
public class SpringBootApp1Autoconfiguration {
}
