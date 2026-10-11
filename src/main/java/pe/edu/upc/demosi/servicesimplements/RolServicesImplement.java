package pe.edu.upc.demosi.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Rol;
import pe.edu.upc.demosi.entities.Usuario;
import pe.edu.upc.demosi.exceptions.ResourceNotFoundException;
import pe.edu.upc.demosi.repositories.IRolRepository;
import pe.edu.upc.demosi.servicesinterfaces.IRolService;

import java.util.List;
import java.util.Optional;

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
    public Optional<Rol> listId(Long id) {
        return rR.findById(id);
    }

    @Override
    public void delete(Long id) {
        rR.deleteById(id);
    }

    @Override
    public void update(Long id,Rol r) {
        Rol rol = listId(id).orElse(null);
        if (rol != null) {
            rol.setNombreRol(r.getNombreRol());
            rol.setDescripcionRol(r.getDescripcionRol());
            rR.save(rol);
        } else {
            throw new ResourceNotFoundException("No se encontró el rol con el ID: " + id);
        }
    }
}
