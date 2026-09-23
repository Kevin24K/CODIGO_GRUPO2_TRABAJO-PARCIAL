package pe.edu.upc.demosi.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.demosi.entities.Usuarios;
import pe.edu.upc.demosi.servicesinterfaces.IUsuarioService;
import pe.edu.upc.demosi.repositories.IUsuarioRepository;

import java.util.List;

@Service
public class UsuarioServicesImplement implements IUsuarioService {

    private final IUsuarioRepository uR;

    public UsuarioServicesImplement(IUsuarioRepository uR) {
        this.uR = uR;
    }

    @Override
    public List<Usuarios> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Usuarios u) {
        uR.save(u);
    }

    @Override
    public Usuarios findById(long id) {
        return uR.findById(id);
    }
}
