package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.entities.Rol;

import java.util.List;
import java.util.Optional;

public interface IRolService {
    void insert(Rol rol);
    List<Rol> list();
    void update(Long id,Rol r);
    public Optional<Rol> listId(Long id);
    void delete(Long id);
}
