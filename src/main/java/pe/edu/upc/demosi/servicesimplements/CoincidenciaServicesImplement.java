package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Coincidencia;
import pe.edu.upc.demosi.repositories.ICoincidenciaRepository;
import pe.edu.upc.demosi.servicesinterfaces.ICoincidenciaService;

import java.util.List;

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
    public Coincidencia findById(long id) {
        return cR.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        cR.deleteById(id);
    }
}
