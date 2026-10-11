package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.entities.Notificacion;

import java.util.List;
import java.util.Optional;

public interface INotificacionService {
    void insert(Notificacion notificacion);
    List<Notificacion> list();
    public Optional<Notificacion> listId(Long id);
    void update(Long id, Notificacion n);
    void delete(Long id);
    List<Notificacion> listarPorUsuario(long idUsuario);
}
