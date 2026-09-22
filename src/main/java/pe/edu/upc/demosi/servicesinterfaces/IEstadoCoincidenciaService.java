package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.EstadoCoincidencia;
import java.util.List;

public interface IEstadoCoincidenciaService {
    void insert(EstadoCoincidencia estadoCoincidencia);
    List<EstadoCoincidencia> list();
    public EstadoCoincidencia findById(long id);
    void delete(long id);
}
