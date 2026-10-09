package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Coincidencia;
import pe.edu.upc.demosi.entities.EstadoCoincidencia;

import java.util.List;

@Repository
public interface ICoincidenciaRepository extends JpaRepository<Coincidencia, Long> {
}
