package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Rol;

import java.util.List;

public interface IRolService {
    void insert(Rol rol);
    List<Rol> list();
    public Rol findById(long id);
    void delete(long id);
}
