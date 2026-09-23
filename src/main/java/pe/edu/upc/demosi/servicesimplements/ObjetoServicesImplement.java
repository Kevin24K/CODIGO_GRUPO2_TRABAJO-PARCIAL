package pe.edu.upc.demosi.servicesimplements;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Objeto;
import pe.edu.upc.demosi.repositories.IObjetoRepository;
import pe.edu.upc.demosi.servicesinterfaces.IObjetoService;

import java.util.List;

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
    public Objeto findById(long id) {
        return oR.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        oR.deleteById(id);
    }

    @Override
    public List<Objeto> listarPorCategoria(long idCategoria) {
        return oR.findByCategoria_IdCategoria(idCategoria);
    }

}
