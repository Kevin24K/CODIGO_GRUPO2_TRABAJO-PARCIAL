package pe.edu.upc.demosi.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upc.demosi.dtos.*;
import pe.edu.upc.demosi.entities.Categoria;
import pe.edu.upc.demosi.entities.Coincidencia;
import pe.edu.upc.demosi.entities.EstadoCoincidencia;
import pe.edu.upc.demosi.exceptions.ResourceNotFoundException;
import pe.edu.upc.demosi.servicesinterfaces.ICoincidenciaService;
import pe.edu.upc.demosi.servicesinterfaces.IEstadoCoincidenciaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/Coincidencias")
public class ControllerCoincidencia {
    private final ICoincidenciaService cR;
    private final IEstadoCoincidenciaService eR;
    private final ModelMapper modelMapper;

    public ControllerCoincidencia(ICoincidenciaService cR, ModelMapper modelMapper, IEstadoCoincidenciaService eR) {
        this.cR = cR;
        this.eR = eR;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity<List<CoincidenciaDTCList>> listar() {

        List<CoincidenciaDTCList> lista = cR.list()
                .stream()
                .map(categoria -> modelMapper.map(categoria, CoincidenciaDTCList.class))
                .toList();

        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<CoincidenciaDTCinsert> registrar(
            @Valid @RequestBody CoincidenciaDTCinsert dto) {
        // 1. Validamos y obtenemos el Rol
        EstadoCoincidencia estado = eR.listId(dto.getIdEstadoCoincidencia())
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "No existe el estado coincidencia con id: " + dto.getIdEstadoCoincidencia()
                        ));
        // 3. SOLUCIÓN: Faltaba crear la variable 'act' y pasarle la contraseña y el rol
        Coincidencia Co = modelMapper.map(dto, Coincidencia.class);
        Co.setEstadoCoincidencia(estado);

        // 3. Guardamos
        cR.insert(Co);

        // 4. Mapeamos de vuelta al DTO para la respuesta
        CoincidenciaDTCinsert responseDTO = modelMapper.map(Co, CoincidenciaDTCinsert.class);

        // 5. Generamos la URL y devolvemos la respuesta
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(Co.getIdCoincidencia())
                .toUri();

        return ResponseEntity
                .created(location)
                .body(responseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        Coincidencia coincidencia = cR.listId(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "No existe una coincidencia con el id: " + id
                        )
                );
        cR.delete(coincidencia.getIdCoincidencia());
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<CoincidenciaDTODetail> actualizar(
            @PathVariable Long id,
            @Valid @RequestBody CoincidenciaDTOUpdate dto) {
        Coincidencia coincidencia = modelMapper.map(dto, Coincidencia.class);

        cR.update(id, coincidencia);

        CoincidenciaDTODetail responseDTO = modelMapper.map(cR.listId(id), CoincidenciaDTODetail.class);

        return ResponseEntity.ok(responseDTO);
    }
}
