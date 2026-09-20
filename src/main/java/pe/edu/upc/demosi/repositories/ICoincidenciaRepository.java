package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Coincidencia;
import java.util.List;

@Repository
public interface ICoincidenciaRepository extends JpaRepository<Coincidencia, Long> {

    // Query simple: Coincidencias pendientes
    @Query("SELECT c FROM Coincidencia c WHERE c.estadoCoincidencia.nombre = 'PENDIENTE'")
    List<Coincidencia> findCoincidenciasPendientes();

    // Query con JOIN: Coincidencias con detalle de reportes y usuarios
    @Query(value = "SELECT c.id_coincidencia, c.porcentaje_similitud, ec.nombre AS estado, " +
            "u1.nombre AS usuario_perdido, o1.nombre AS objeto_perdido, " +
            "u2.nombre AS usuario_encontrado, c.fecha_generacion " +
            "FROM coincidencia c " +
            "INNER JOIN reporte rp ON c.id_reporte_perdido = rp.id_reporte " +
            "INNER JOIN reporte re ON c.id_reporte_encontrado = re.id_reporte " +
            "INNER JOIN usuario u1 ON rp.id_usuario = u1.id_usuario " +
            "INNER JOIN usuario u2 ON re.id_usuario = u2.id_usuario " +
            "INNER JOIN objeto o1 ON rp.id_objeto = o1.id_objeto " +
            "INNER JOIN estado_coincidencia ec ON c.id_estado_coincidencia = ec.id_estado_coincidencia " +
            "ORDER BY c.porcentaje_similitud DESC", nativeQuery = true)
    List<Object[]> findCoincidenciasConDetalle();
}
