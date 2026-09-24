package pe.edu.upc.demosi.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Rol;
import pe.edu.upc.demosi.repositories.IRolRepository;
import pe.edu.upc.demosi.servicesinterfaces.IRolService;

import java.util.List;

@Service
public class RolServicesImplement implements IRolService {
    private final IRolRepository rR;

    public RolServicesImplement(IRolRepository rR) {
        this.rR = rR;
    }

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Rol rol) {
        rR.save(rol);
    }

    @Override
    public Rol findById(long id) {
        return rR.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        rR.deleteById(id);
    }
}
