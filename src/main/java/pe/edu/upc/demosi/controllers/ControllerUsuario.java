package pe.edu.upc.demosi.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upc.demosi.dtos.UsuarioDTCList;
import pe.edu.upc.demosi.dtos.UsuarioDTCinsert;
import pe.edu.upc.demosi.entities.Rol;
import pe.edu.upc.demosi.entities.Usuarios;
import pe.edu.upc.demosi.exceptions.ResourceNotFoundException;
import pe.edu.upc.demosi.servicesinterfaces.IRolService;
import pe.edu.upc.demosi.servicesinterfaces.IUsuarioService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/Usuarios")
public class ControllerUsuario {
    private final IUsuarioService uS;
    private final IRolService rS;
    private final ModelMapper modelMapper;

    public ControllerUsuario(IUsuarioService uS, IRolService rS, ModelMapper modelMapper) {
        this.uS = uS;
        this.rS = rS;
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
        // 1. Validamos y obtenemos el Rol
        Rol rol = rS.listId(dto.getIdRol())
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "No existe el rol con el id: " + dto.getIdRol()
                        ));
        // 3. SOLUCIÓN: Faltaba crear la variable 'act' y pasarle la contraseña y el rol
        Usuarios act = modelMapper.map(dto, Usuarios.class);
        act.setUcontrasenaHash(dto.getUcontrasenaHash());
        act.setRol(rol);

        // 3. Guardamos
        uS.insert(act);

        // 4. Mapeamos de vuelta al DTO para la respuesta
        UsuarioDTCinsert responseDTO = modelMapper.map(act, UsuarioDTCinsert.class);

        // 5. Generamos la URL y devolvemos la respuesta
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(act.getIdUsuario())
                .toUri();

        return ResponseEntity
                .created(location)
                .body(responseDTO);
    }
}
