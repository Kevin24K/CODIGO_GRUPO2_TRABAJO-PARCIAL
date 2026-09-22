package pe.edu.upc.demosi.servicesinterfaces;

import pe.edu.upc.demosi.entities.Coincidencia;
import java.util.List;
import java.util.Optional;

public interface ICoincidenciaService {
    List<Coincidencia> list();
    Coincidencia insert(Coincidencia coincidencia);
    Optional<Coincidencia> listById(Long id);
    List<Coincidencia> listPendientes();
    List<Object[]> listConDetalle();
}
