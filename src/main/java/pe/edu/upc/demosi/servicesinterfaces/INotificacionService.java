package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Notificacion;
import java.util.List;

public interface INotificacionService {
    void insert(Notificacion notificacion);
    List<Notificacion> list();
    public Notificacion findById(long id);
    void delete(long id);
    List<Notificacion> listarPorUsuario(long idUsuario);
}
