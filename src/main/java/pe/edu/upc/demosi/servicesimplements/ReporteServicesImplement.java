package pe.edu.upc.demosi.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Reporte;
import pe.edu.upc.demosi.repositories.IReporteRepository;
import pe.edu.upc.demosi.servicesinterfaces.IReporteService;

import java.util.List;
@Service
public class ReporteServicesImplement implements IReporteService {

    private final IReporteRepository rR;

    public ReporteServicesImplement(IReporteRepository rR) {
        this.rR = rR;
    }

    @Override
    public List<Reporte> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Reporte reporte) {
        rR.save(reporte);
    }

    @Override
    public Reporte findById(long id) {
        return rR.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        rR.deleteById(id);
    }
}
