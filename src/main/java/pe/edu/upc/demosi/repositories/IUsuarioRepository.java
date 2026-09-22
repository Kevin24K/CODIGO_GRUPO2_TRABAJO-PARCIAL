package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Usuario;
import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    // Query simple: Usuarios activos
    @Query("SELECT u FROM Usuario u WHERE u.activo = true")
    List<Usuario> findUsuariosActivos();

    // Query con JOIN: Usuarios con su rol
    @Query(value = "SELECT u.id_usuario, u.nombre, u.apellido, u.correo, r.nombre AS rol " +
            "FROM usuario u " +
            "INNER JOIN rol r ON u.id_rol = r.id_rol " +
            "WHERE u.activo = true", nativeQuery = true)
    List<Object[]> findUsuariosActivosConRol();
}
