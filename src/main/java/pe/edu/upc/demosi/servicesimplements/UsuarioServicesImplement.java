package pe.edu.upc.demosi.servicesimplements;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Usuario;
import pe.edu.upc.demosi.repositories.IUsuarioRepository;
import pe.edu.upc.demosi.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicesImplement implements IUsuarioService, UserDetailsService {

    private final IUsuarioRepository uR;

    public UsuarioServicesImplement(IUsuarioRepository uR) {
        this.uR = uR;
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public List<Usuario> listarActivos() {
        return uR.findByActivoTrue();
    }

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public Optional<Usuario> listId(Long id) {
        return uR.findById(id);
    }

    // Spring Security busca al usuario por correo al hacer login
    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        return uR.findByCorreo(correo)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + correo));
    }
}