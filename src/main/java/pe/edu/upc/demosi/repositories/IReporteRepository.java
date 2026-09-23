package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Reporte;

import java.util.List;

@Repository
public interface IReporteRepository extends JpaRepository<Reporte, Long> {
    List<Reporte> findByUsuario_IdUsuario(Long idUsuario);
    List<Reporte> findByEstadoReporte_IdEstadoReporte(Long idEstadoReporte);
}
