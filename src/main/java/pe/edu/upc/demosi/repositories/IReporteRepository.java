package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Reporte;
import java.util.List;

@Repository
public interface IReporteRepository extends JpaRepository<Reporte, Long> {

    // Query simple 1: Listar reportes activos
    @Query("SELECT r FROM Reporte r WHERE r.estadoReporte.nombre = 'ACTIVO'")
    List<Reporte> findReportesActivos();

    // Query simple 2: Listar reportes por tipo
    @Query("SELECT r FROM Reporte r WHERE r.tipoReporte = :tipo")
    List<Reporte> findByTipoReporte(String tipo);

    // Query con JOIN 1: Reportes con datos del usuario y objeto
    @Query(value = "SELECT r.id_reporte, u.nombre, u.apellido, u.correo, " +
            "o.nombre AS objeto, o.descripcion, r.tipo_reporte, r.fecha_evento " +
            "FROM reporte r " +
            "INNER JOIN usuario u ON r.id_usuario = u.id_usuario " +
            "INNER JOIN objeto o ON r.id_objeto = o.id_objeto " +
            "ORDER BY r.fecha_creacion DESC", nativeQuery = true)
    List<Object[]> findReportesConUsuarioYObjeto();

    // Query con JOIN 2: Reportes con categoria del objeto
    @Query(value = "SELECT r.id_reporte, r.tipo_reporte, o.nombre AS objeto, " +
            "c.nombre AS categoria, r.fecha_evento, er.nombre AS estado " +
            "FROM reporte r " +
            "INNER JOIN objeto o ON r.id_objeto = o.id_objeto " +
            "INNER JOIN categoria c ON o.id_categoria = c.id_categoria " +
            "INNER JOIN estado_reporte er ON r.id_estado_reporte = er.id_estado_reporte",
            nativeQuery = true)
    List<Object[]> findReportesConCategoriaYEstado();
}
