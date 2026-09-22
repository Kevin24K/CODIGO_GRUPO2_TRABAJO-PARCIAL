package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Usuario;
import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<Usuario> list();
    Usuario insert(Usuario usuario);
    Optional<Usuario> listById(Long id);
    List<Usuario> listActivos();
    List<Object[]> listActivosConRol();
}
