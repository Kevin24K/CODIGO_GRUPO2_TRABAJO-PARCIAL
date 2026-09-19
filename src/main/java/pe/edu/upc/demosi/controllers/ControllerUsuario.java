package pe.edu.upc.demosi.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upc.demosi.dtos.UsuarioDTCList;
import pe.edu.upc.demosi.dtos.UsuarioDTCinsert;
import pe.edu.upc.demosi.entities.Usuarios;
import pe.edu.upc.demosi.servicesinterfaces.IUsuarioService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/Usuarios")
public class ControllerUsuario {
    private final IUsuarioService uS;
    private final ModelMapper modelMapper;

    public ControllerUsuario(IUsuarioService uS, ModelMapper modelMapper) {
        this.uS = uS;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTCList>> listar() {

        List<UsuarioDTCList> lista = uS.list()
                .stream()
                .map(usuarios -> modelMapper.map(usuarios, UsuarioDTCList.class))
                .toList();

        return ResponseEntity.ok(lista);
    }
    @PostMapping
    public ResponseEntity<UsuarioDTCinsert> registrar(
            @Valid @RequestBody UsuarioDTCinsert dto) {

        Usuarios usuarios = modelMapper.map(dto, Usuarios.class);

        uS.insert(usuarios);

        UsuarioDTCinsert responseDTO =
                modelMapper.map(usuarios, UsuarioDTCinsert.class);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuarios.getIdUsuario())
                .toUri();

        return ResponseEntity
                .created(location)
                .body(responseDTO);
    }
}
