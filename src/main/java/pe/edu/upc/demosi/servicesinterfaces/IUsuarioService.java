package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Usuarios;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    void insert(Usuarios u);
    List<Usuarios> list();
    public Optional<Usuarios> listId(Long id);

}
