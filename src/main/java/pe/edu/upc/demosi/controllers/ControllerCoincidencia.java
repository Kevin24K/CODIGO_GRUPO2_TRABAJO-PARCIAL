package pe.edu.upc.demosi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosi.entities.Coincidencia;
import pe.edu.upc.demosi.servicesinterfaces.ICoincidenciaService;
import java.util.List;

@RestController
@RequestMapping("/api/coincidencias")
public class ControllerCoincidencia {

    private final ICoincidenciaService cS;

    public ControllerCoincidencia(ICoincidenciaService cS) {
        this.cS = cS;
    }

    @GetMapping
    public ResponseEntity<List<Coincidencia>> listar() {
        return ResponseEntity.ok(cS.list());
    }

    @GetMapping("/pendientes")
    public ResponseEntity<List<Coincidencia>> listarPendientes() {
        return ResponseEntity.ok(cS.listPendientes());
    }

    @GetMapping("/con-detalle")
    public ResponseEntity<List<Object[]>> listarConDetalle() {
        return ResponseEntity.ok(cS.listConDetalle());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id) {
        return cS.listById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Coincidencia> registrar(@RequestBody Coincidencia coincidencia) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cS.insert(coincidencia));
    }
}
