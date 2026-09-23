package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Usuarios;

import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Long> {
    public Usuarios findById(long id);;
}
