package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Objeto;

import pe.edu.upc.demosi.repositories.IObjetoRepository;
import pe.edu.upc.demosi.servicesinterfaces.IObjetoService;

import java.util.List;
import java.util.Optional;

@Service
public class ObjetoServicesImplement implements IObjetoService {
    private final IObjetoRepository oR;

    public ObjetoServicesImplement(IObjetoRepository oR) {
        this.oR = oR;
    }

    @Override
    public List<Objeto> list() {
        return oR.findAll();
    }

    @Override
    public void insert(Objeto objeto) {
        oR.save(objeto);
    }

    @Override
    public void delete(long id) {
        oR.deleteById(id);
    }

    @Override
    public Optional<Objeto> listId(Long id) {
        return oR.findById(id);
    }

    @Override
    public List<Objeto> listActivos() {
        return oR.findObjetosActivos();
    }

    @Override
    public List<Object[]> listConCategoria() {
        return oR.findObjetosConCategoria();
    }

    @Override
    public List<Objeto> listarPorCategoria(long idCategoria) {
        return oR.findByCategoria_IdCategoria(idCategoria);
    }

}
