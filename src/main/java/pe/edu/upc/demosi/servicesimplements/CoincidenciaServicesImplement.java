package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.entities.Coincidencia;
import pe.edu.upc.demosi.entities.Rol;
import pe.edu.upc.demosi.exceptions.ResourceNotFoundException;
import pe.edu.upc.demosi.repositories.ICoincidenciaRepository;
import pe.edu.upc.demosi.servicesinterfaces.ICoincidenciaService;

import java.util.List;
import java.util.Optional;

@Service
public class CoincidenciaServicesImplement implements ICoincidenciaService {

    private final ICoincidenciaRepository cR;

    public CoincidenciaServicesImplement(ICoincidenciaRepository cR) {
        this.cR = cR;
    }

    @Override
    public List<Coincidencia> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Coincidencia coincidencia) {
        cR.save(coincidencia);
    }

    @Override
    public Optional<Coincidencia> listId(Long id) {
        return cR.findById(id);
    }

    @Override
    public void delete(Long id) {
        cR.deleteById(id);
    }

    @Override
    public void update(Long id, Coincidencia c) {
        Coincidencia coincidencia = listId(id).orElse(null);
        if (coincidencia != null) {
            coincidencia.setReportePerdido(c.getReportePerdido());
            coincidencia.setReporteEncontrado(c.getReporteEncontrado());
            coincidencia.setEstadoCoincidencia(c.getEstadoCoincidencia());
            coincidencia.setPorcentajeSimilitudC(c.getPorcentajeSimilitudC());
            coincidencia.setDetalleC(c.getDetalleC());

            cR.save(coincidencia);
        } else {
            throw new ResourceNotFoundException("No se encontró la coincidencia con el ID: " + id);
        }
    }
}
