package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.EstadoReporte;
import pe.edu.upc.demosi.repositories.IEstadoReporteRepository;
import pe.edu.upc.demosi.servicesinterfaces.IEstadoReporteService;

import java.util.List;

@Service
public class EstadoReporteServicesImplement implements IEstadoReporteService {
    private final IEstadoReporteRepository eR;

    public EstadoReporteServicesImplement(IEstadoReporteRepository eR) {
        this.eR = eR;
    }

    @Override
    public List<EstadoReporte> list() {
        return eR.findAll();
    }

    @Override
    public void insert(EstadoReporte estadoReporte) {
        eR.save(estadoReporte);
    }

    @Override
    public EstadoReporte findById(long id) {
        return eR.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        eR.deleteById(id);
    }
}
