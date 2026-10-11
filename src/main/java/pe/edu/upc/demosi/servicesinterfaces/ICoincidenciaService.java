package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.entities.Coincidencia;

import java.util.List;
import java.util.Optional;

public interface ICoincidenciaService {
    void insert(Coincidencia coincidencia);
    List<Coincidencia> list();
    public Optional<Coincidencia> listId(Long id);
    void update(Long id, Coincidencia c);
    void delete(Long id);
}
