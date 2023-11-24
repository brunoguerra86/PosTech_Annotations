@Repository


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Transactional
    public void createUsuario(Usuario usuario){
        repository.save(usuario);
        enderecoRepository.save(usuario.endereco)
    }
}

@Entity
public class Usuario {

}

@Query