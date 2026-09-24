package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.EstadoCoincidencia;
import pe.edu.upc.demosi.repositories.IEstadoCoincidenciaRepository;
import pe.edu.upc.demosi.servicesinterfaces.IEstadoCoincidenciaService;

import java.util.List;

@Service
public class EstadoCoincidenciaServicesImplement implements IEstadoCoincidenciaService {

    private final IEstadoCoincidenciaRepository eR;

    public EstadoCoincidenciaServicesImplement(IEstadoCoincidenciaRepository eR) {
        this.eR = eR;
    }

    @Override
    public List<EstadoCoincidencia> list() {
        return eR.findAll();
    }

    @Override
    public void insert(EstadoCoincidencia estadoCoincidencia) {
        eR.save(estadoCoincidencia);
    }

    @Override
    public EstadoCoincidencia findById(long id) {
        return eR.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        eR.deleteById(id);
    }
}
