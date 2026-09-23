package pe.edu.upc.demosi.controllers;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upc.demosi.dtos.NotificacionDTCinsert;
import pe.edu.upc.demosi.dtos.NotificacionDTCList;
import pe.edu.upc.demosi.entities.Notificacion;
import pe.edu.upc.demosi.servicesinterfaces.INotificacionService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/Notificaciones")
public class ControllerNotificacion {
    private final INotificacionService nS;
    private final ModelMapper modelMapper;

    public ControllerNotificacion(INotificacionService nS, ModelMapper modelMapper) {
        this.nS = nS;
        this.modelMapper = modelMapper;
    }

    // 1. MÉTODO PARA LISTAR (Usa el DTCList)
    @GetMapping
    public ResponseEntity<List<NotificacionDTCList>> listar() {

        List<NotificacionDTCList> lista = nS.list()
                .stream()
                .map(notificacion -> modelMapper.map(notificacion, NotificacionDTCList.class))
                .toList();

        return ResponseEntity.ok(lista);
    }
    // 2. MÉTODO PARA CREAR (Usa el DTCinsert)
    @PostMapping
    public ResponseEntity<NotificacionDTCinsert> registrar(
            @Valid @RequestBody NotificacionDTCinsert dto) {

        Notificacion notificacion = modelMapper.map(dto, Notificacion.class);

        nS.insert(notificacion);

        NotificacionDTCinsert responseDTO =
                modelMapper.map(notificacion, NotificacionDTCinsert.class);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(notificacion.getIdNotificacion())
                .toUri();

        return ResponseEntity
                .created(location)
                .body(responseDTO);
    }
}
