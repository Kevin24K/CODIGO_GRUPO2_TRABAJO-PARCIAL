package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.EstadoReporte;
import java.util.List;

public interface IEstadoReporteService {
    void insert(EstadoReporte estadoReporte);
    List<EstadoReporte> list();
    public EstadoReporte findById(long id);
    void delete(long id);
}
