package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.repositories.ICategoriaRepository;
import pe.edu.upc.demosi.servicesinterfaces.ICategoriaService;

import java.util.List;

@Service
public class CategoriaServicesImplement implements ICategoriaService {
    private final ICategoriaRepository cR;

    public CategoriaServicesImplement(ICategoriaRepository cR) {
        this.cR = cR;
    }

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public Categoria findById(long id) {
        return cR.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        cR.deleteById(id);
    }
}
