package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Objeto;
import pe.edu.upc.demosi.entities.Rol;

import java.util.List;
public interface IObjetoService {
    void insert(Objeto objeto);
    List<Objeto> list();
    public Objeto findById(long id);
    void delete(long id);
    List<Objeto> listarPorCategoria(long idCategoria);
}
