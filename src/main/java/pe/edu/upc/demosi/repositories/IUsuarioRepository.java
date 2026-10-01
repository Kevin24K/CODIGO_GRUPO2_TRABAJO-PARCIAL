package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Usuarios;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Long> {
    // HU46: Listar usuarios activos (JPQL)
    @Query("SELECT u FROM Usuario u WHERE u.activo = true")
    List<Usuarios> findUsuariosActivos();

    // HU47: Listar usuarios activos con su rol (Nativo SQL)
    @Query(value = "SELECT u.id_usuario, u.nombre, u.apellido, u.correo, r.nombre AS rol " +
            "FROM usuario u JOIN rol r ON u.id_rol = r.id_rol WHERE u.activo = true",
            nativeQuery = true)
    List<Object[]> findUsuariosActivosConRol();

    // Método auxiliar para el Login (HU56)
    Usuarios findByCorreo(String correo);
}
