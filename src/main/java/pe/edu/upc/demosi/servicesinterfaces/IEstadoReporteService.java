package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.entities.EstadoReporte;


import java.util.List;
import java.util.Optional;

public interface IEstadoReporteService {
    void insert(EstadoReporte estadoReporte);
    List<EstadoReporte> list();
    void delete(Long id);
    void update(Long id,EstadoReporte er);
    public Optional<EstadoReporte> listId(Long id);
}
