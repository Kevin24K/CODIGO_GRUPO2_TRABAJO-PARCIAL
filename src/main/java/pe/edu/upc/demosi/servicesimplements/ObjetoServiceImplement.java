package pe.edu.upc.demosi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Objeto;
import pe.edu.upc.demosi.repositories.IObjetoRepository;
import pe.edu.upc.demosi.servicesinterfaces.IObjetoService;
import java.util.List;
import java.util.Optional;

@Service
public class ObjetoServiceImplement implements IObjetoService {

    @Autowired
    private IObjetoRepository objetoRepository;

    @Override
    public List<Objeto> list() {
        return objetoRepository.findAll();
    }

    @Override
    public Objeto insert(Objeto objeto) {
        return objetoRepository.save(objeto);
    }

    @Override
    public Optional<Objeto> listById(Long id) {
        return objetoRepository.findById(id);
    }

    @Override
    public List<Objeto> listActivos() {
        return objetoRepository.findObjetosActivos();
    }

    @Override
    public List<Object[]> listConCategoria() {
        return objetoRepository.findObjetosConCategoria();
    }
}
