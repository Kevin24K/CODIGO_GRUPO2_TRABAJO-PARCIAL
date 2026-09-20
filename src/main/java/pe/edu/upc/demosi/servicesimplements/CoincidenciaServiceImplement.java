package pe.edu.upc.demosi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Coincidencia;
import pe.edu.upc.demosi.repositories.ICoincidenciaRepository;
import pe.edu.upc.demosi.servicesinterfaces.ICoincidenciaService;
import java.util.List;
import java.util.Optional;

@Service
public class CoincidenciaServiceImplement implements ICoincidenciaService {

    @Autowired
    private ICoincidenciaRepository coincidenciaRepository;

    @Override
    public List<Coincidencia> list() {
        return coincidenciaRepository.findAll();
    }

    @Override
    public Coincidencia insert(Coincidencia coincidencia) {
        return coincidenciaRepository.save(coincidencia);
    }

    @Override
    public Optional<Coincidencia> listById(Long id) {
        return coincidenciaRepository.findById(id);
    }

    @Override
    public List<Coincidencia> listPendientes() {
        return coincidenciaRepository.findCoincidenciasPendientes();
    }

    @Override
    public List<Object[]> listConDetalle() {
        return coincidenciaRepository.findCoincidenciasConDetalle();
    }
}
