package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.EstadoReporte;
import pe.edu.upc.demosi.entities.Rol;
import pe.edu.upc.demosi.exceptions.ResourceNotFoundException;
import pe.edu.upc.demosi.repositories.IEstadoReporteRepository;
import pe.edu.upc.demosi.servicesinterfaces.IEstadoReporteService;

import java.util.List;
import java.util.Optional;

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
    public Optional<EstadoReporte> listId(Long id) {
        return eR.findById(id);
    }
    @Override
    public void delete(Long id) {
        eR.deleteById(id);
    }

    @Override
    public void update(Long id, EstadoReporte e) {
        EstadoReporte estador = listId(id).orElse(null);
        if (estador != null) {
            estador.setNombreEReporte(e.getNombreEReporte());
            estador.setDescripcionEReporte(e.getDescripcionEReporte());
            estador.setActivo(e.getActivo());
            eR.save(estador);
        } else {
            throw new ResourceNotFoundException("No se encontró el estado de reporte con el ID: " + id);
        }
    }

}
