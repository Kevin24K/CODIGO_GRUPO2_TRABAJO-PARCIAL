package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Reporte;
import java.util.List;
import java.util.Optional;

public interface IReporteService {
    List<Reporte> list();
    Reporte insert(Reporte reporte);
    Optional<Reporte> listById(Long id);
    List<Reporte> listActivos();
    List<Object[]> listConUsuarioYObjeto();
    List<Object[]> listConCategoriaYEstado();
}
