package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Notificacion;
import pe.edu.upc.demosi.repositories.INotificacionRepository;
import pe.edu.upc.demosi.servicesinterfaces.INotificacionService;

import java.util.List;

@Service
public class NotificacionServicesImplement implements INotificacionService {

    private final INotificacionRepository nR;

    public NotificacionServicesImplement(INotificacionRepository nR) {
        this.nR = nR;
    }

    @Override
    public List<Notificacion> list() {
        return nR.findAll();
    }

    @Override
    public void insert(Notificacion notificacion) {
        nR.save(notificacion);
    }

    @Override
    public Notificacion findById(long id) {
        return nR.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        nR.deleteById(id);
    }
}
