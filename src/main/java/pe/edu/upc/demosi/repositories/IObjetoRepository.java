package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Objeto;

import java.util.List;

@Repository
public interface IObjetoRepository extends JpaRepository<Objeto, Long> {
    // HU48: Listar objetos activos (JPQL)
    @Query("SELECT o FROM Objeto o WHERE o.activo = true")
    List<Objeto> findObjetosActivos();

    // HU49: Listar objetos con su categoría (Nativo SQL)
    @Query(value = "SELECT o.id_objeto, o.nombre, o.descripcion, c.nombre AS categoria " +
            "FROM objeto o JOIN categoria c ON o.id_categoria = c.id_categoria",
            nativeQuery = true)
    List<Object[]> findObjetosConCategoria();
}
