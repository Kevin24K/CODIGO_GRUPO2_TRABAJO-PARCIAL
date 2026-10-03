package pe.edu.upc.demosi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi.entities.Usuario;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByCorreo(String correo);

    // HU46: Consulta JPQL para filtrar usuarios con estado activo
    @Query("SELECT u FROM Usuario u WHERE u.activo = true")
    List<Usuario> findUsuariosActivos();

    // HU47: Consulta SQL nativa con JOIN entre Usuario y Rol para usuarios activos
    @Query(value = "SELECT u.id_usuario, u.nombre, u.apellido, u.correo, r.nombre_rol " +
            "FROM usuarios u INNER JOIN roles r ON u.id_rol = r.id_rol " +
            "WHERE u.activo = true", nativeQuery = true)
    List<Object[]> findUsuariosActivosConRol();
}