package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Coincidencia;
import java.util.List;

public interface ICoincidenciaService {
    void insert(Coincidencia coincidencia);
    List<Coincidencia> list();
    public Coincidencia findById(long id);
    void delete(long id);
}
