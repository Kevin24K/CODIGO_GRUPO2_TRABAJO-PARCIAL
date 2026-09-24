package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Reporte;
import java.util.List;

public interface IReporteService {
    void insert(Reporte reporte);
    List<Reporte> list();
    public Reporte findById(long id);
    void delete(long id);
    List<Reporte> listarPorUsuario(long idUsuario);
    List<Reporte> listarPorEstado(long idEstadoReporte);
}
