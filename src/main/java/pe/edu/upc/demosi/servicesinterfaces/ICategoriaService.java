package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.entities.Rol;

import java.util.List;

public interface ICategoriaService {
    void insert(Categoria categoria);
    public Categoria findById(long id);
    List<Categoria> list();
    void delete(long id);
}
