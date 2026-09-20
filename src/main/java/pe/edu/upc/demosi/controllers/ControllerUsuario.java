package pe.edu.upc.demosi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosi.entities.Usuario;
import pe.edu.upc.demosi.servicesinterfaces.IUsuarioService;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class ControllerUsuario {

    private final IUsuarioService uS;

    public ControllerUsuario(IUsuarioService uS) {
        this.uS = uS;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listar() {
        return ResponseEntity.ok(uS.list());
    }

    @GetMapping("/activos")
    public ResponseEntity<List<Usuario>> listarActivos() {
        return ResponseEntity.ok(uS.listActivos());
    }

    @GetMapping("/activos-con-rol")
    public ResponseEntity<List<Object[]>> listarActivosConRol() {
        return ResponseEntity.ok(uS.listActivosConRol());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id) {
        return uS.listById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(uS.insert(usuario));
    }
}
