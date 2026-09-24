package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Usuarios;

import java.util.List;

public interface IUsuarioService {
    void insert(Usuarios u);
    List<Usuarios> list();
    public Usuarios findById(long id);

}
