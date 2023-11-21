public class Pessoa {
    private String name;

    @Required
    public void setName(String name){
        this.name = name;
    }
}

@Service
public class UsuarioService{
    // implementação
}

@Controller
public class UsuarioController{
    @Autowired
    private UsuarioService service;
}

@Component
public class BeanB1 implements BeanInterface {
    // implementação
}

@Component
public class BeanB2 implements BeanInterface {
    // implementação
}

@Controller
public class BeanController {
    
    @Autowired
    @Qualifier("beanB2")
    private BeanInterface dependencia;
}

@Configuration
public class DatabaseConfiguration {
    // implementação   
}

