package pe.edu.upc.demosi.controllers;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosi.entities.Reporte;
import pe.edu.upc.demosi.servicesinterfaces.IReporteService;
import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ControllerReporte {

    private final IReporteService rS;

    public ControllerReporte(IReporteService rS) {
        this.rS = rS;
    }

    @GetMapping
    public ResponseEntity<List<Reporte>> listar() {
        return ResponseEntity.ok(rS.list());
    }

    @GetMapping("/activos")
    public ResponseEntity<List<Reporte>> listarActivos() {
        return ResponseEntity.ok(rS.listActivos());
    }

    @GetMapping("/con-usuario-objeto")
    public ResponseEntity<List<Object[]>> listarConUsuarioYObjeto() {
        return ResponseEntity.ok(rS.listConUsuarioYObjeto());
    }

    @GetMapping("/con-categoria-estado")
    public ResponseEntity<List<Object[]>> listarConCategoriaYEstado() {
        return ResponseEntity.ok(rS.listConCategoriaYEstado());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id) {
        return rS.listById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Reporte> registrar(@Valid @RequestBody Reporte reporte) {
        return ResponseEntity.status(HttpStatus.CREATED).body(rS.insert(reporte));
    }
}
