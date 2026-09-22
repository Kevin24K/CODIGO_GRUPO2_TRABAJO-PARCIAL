package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Notificacion;
import java.util.List;

@Repository
public interface INotificacionRepository extends JpaRepository<Notificacion, Long> {

    // Query simple: Notificaciones no leidas
    @Query("SELECT n FROM Notificacion n WHERE n.leida = false")
    List<Notificacion> findNotificacionesNoLeidas();

    // Query con JOIN: Notificaciones con usuario y coincidencia
    @Query(value = "SELECT n.id_notificacion, u.nombre, u.apellido, n.titulo, n.mensaje, " +
            "n.tipo, n.leida, c.porcentaje_similitud " +
            "FROM notificacion n " +
            "INNER JOIN usuario u ON n.id_usuario = u.id_usuario " +
            "LEFT JOIN coincidencia c ON n.id_coincidencia = c.id_coincidencia " +
            "ORDER BY n.fecha_creacion DESC", nativeQuery = true)
    List<Object[]> findNotificacionesConDetalle();
}
