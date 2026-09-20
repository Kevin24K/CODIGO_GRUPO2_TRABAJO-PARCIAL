package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Objeto;
import java.util.List;

@Repository
public interface IObjetoRepository extends JpaRepository<Objeto, Long> {

    // Query simple: Objetos activos
    @Query("SELECT o FROM Objeto o WHERE o.activo = true")
    List<Objeto> findObjetosActivos();

    // Query con JOIN: Objetos con categoria
    @Query(value = "SELECT o.id_objeto, o.nombre, o.descripcion, o.color, o.marca, c.nombre AS categoria " +
            "FROM objeto o " +
            "INNER JOIN categoria c ON o.id_categoria = c.id_categoria " +
            "WHERE o.activo = true", nativeQuery = true)
    List<Object[]> findObjetosConCategoria();
}
