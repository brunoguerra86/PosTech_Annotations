@SpringBootApplication
@EnableDiscoveryClient
public class MyMicroServiceApplication{
    public static void main (String[] args){
        SpringApplication.run(MyMicroServiceApplication.class, args)
    }
}

@SpringBootApplication
@EnableFeignClients
public class MyMicroServiceApplication{
    public static void main (String[] args){
        SpringApplication.run(MyMicroServiceApplication.class, args)
    }
}

@SpringBootApplication
@EnableCircuitBreak
public class MyMicroServiceApplication{
    public static void main (String[] args){
        SpringApplication.run(MyMicroServiceApplication.class, args)
    }
}

@RestController
@RefreshScope
public class MyController{
    
    @value("${my.config.propriedade}")
    private String propriedade;
}