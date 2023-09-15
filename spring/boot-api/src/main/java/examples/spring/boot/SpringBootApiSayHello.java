package examples.spring.boot;

public interface SpringBootApiSayHello {

    default  String hello(){
        return "Hello from API";
    }
}
