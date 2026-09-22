package pe.edu.upc.demosi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Usuario;
import pe.edu.upc.demosi.repositories.IUsuarioRepository;
import pe.edu.upc.demosi.servicesinterfaces.IUsuarioService;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> list() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario insert(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> listById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> listActivos() {
        return usuarioRepository.findUsuariosActivos();
    }

    @Override
    public List<Object[]> listActivosConRol() {
        return usuarioRepository.findUsuariosActivosConRol();
    }
}
