package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Objeto;
import java.util.List;
import java.util.Optional;

public interface IObjetoService {
    List<Objeto> list();
    Objeto insert(Objeto objeto);
    Optional<Objeto> listById(Long id);
    List<Objeto> listActivos();
    List<Object[]> listConCategoria();
}
