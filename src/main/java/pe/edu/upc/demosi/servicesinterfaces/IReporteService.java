package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.entities.Reporte;

import java.util.List;
import java.util.Optional;

public interface IReporteService {
    void insert(Reporte reporte);
    List<Reporte> list();
    void update(Long id, Reporte r);
    void delete(Long id);
    public Optional<Reporte> listId(Long id);
    List<Reporte> listarPorUsuario(long idUsuario);
    List<Reporte> listarPorEstado(long idEstadoReporte);
    public List<Reporte> listActivos();
}
