package pe.edu.upc.demosi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosi.entities.Objeto;
import pe.edu.upc.demosi.servicesinterfaces.IObjetoService;
import java.util.List;

@RestController
@RequestMapping("/api/objetos")
public class ControllerObjeto {

    private final IObjetoService oS;

    public ControllerObjeto(IObjetoService oS) {
        this.oS = oS;
    }

    @GetMapping
    public ResponseEntity<List<Objeto>> listar() {
        return ResponseEntity.ok(oS.list());
    }

    @GetMapping("/activos")
    public ResponseEntity<List<Objeto>> listarActivos() {
        return ResponseEntity.ok(oS.listActivos());
    }

    @GetMapping("/con-categoria")
    public ResponseEntity<List<Object[]>> listarConCategoria() {
        return ResponseEntity.ok(oS.listConCategoria());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id) {
        return oS.listById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Objeto> registrar(@RequestBody Objeto objeto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(oS.insert(objeto));
    }
}
