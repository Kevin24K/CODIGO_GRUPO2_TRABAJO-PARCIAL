package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Objeto;

import java.util.List;

@Repository
public interface IObjetoRepository extends JpaRepository<Objeto, Long> {
    List<Objeto> findByCategoria_IdCategoria(Long idCategoria);
}
