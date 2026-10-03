package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Objeto;

import java.util.List;

@Repository
public interface IObjetoRepository extends JpaRepository<Objeto, Long> {
    List<Objeto> findByCategoria_IdCategoria(Long idCategoria);

    // HU48: Consulta JPQL para buscar objetos en estado activo
    @Query("SELECT o FROM Objeto o WHERE o.activo = true")
    List<Objeto> findObjetosActivos();

    // HU49: Consulta nativa JOIN entre Objeto y Categoría
    @Query(value = "SELECT o.id_objeto, o.nombre, o.descripcion, c.nombre_categoria " +
            "FROM objetos o INNER JOIN categorias c ON o.id_categoria = c.id_categoria", nativeQuery = true)
    List<Object[]> findObjetosConCategoria();
}
