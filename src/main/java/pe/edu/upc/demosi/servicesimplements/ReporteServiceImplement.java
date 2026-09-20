package pe.edu.upc.demosi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Reporte;
import pe.edu.upc.demosi.repositories.IReporteRepository;
import pe.edu.upc.demosi.servicesinterfaces.IReporteService;
import java.util.List;
import java.util.Optional;

@Service
public class ReporteServiceImplement implements IReporteService {

    @Autowired
    private IReporteRepository reporteRepository;

    @Override
    public List<Reporte> list() {
        return reporteRepository.findAll();
    }

    @Override
    public Reporte insert(Reporte reporte) {
        return reporteRepository.save(reporte);
    }

    @Override
    public Optional<Reporte> listById(Long id) {
        return reporteRepository.findById(id);
    }

    @Override
    public List<Reporte> listActivos() {
        return reporteRepository.findReportesActivos();
    }

    @Override
    public List<Object[]> listConUsuarioYObjeto() {
        return reporteRepository.findReportesConUsuarioYObjeto();
    }

    @Override
    public List<Object[]> listConCategoriaYEstado() {
        return reporteRepository.findReportesConCategoriaYEstado();
    }
}
