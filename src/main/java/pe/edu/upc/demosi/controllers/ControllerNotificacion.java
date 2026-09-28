package pe.edu.upc.demosi.controllers;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upc.demosi.dtos.NotificacionDTCinsert;
import pe.edu.upc.demosi.dtos.NotificacionDTCList;
import pe.edu.upc.demosi.entities.Coincidencia;
import pe.edu.upc.demosi.entities.Notificacion;
import pe.edu.upc.demosi.entities.Usuarios;
import pe.edu.upc.demosi.exceptions.ResourceNotFoundException;
import pe.edu.upc.demosi.servicesinterfaces.ICoincidenciaService;
import pe.edu.upc.demosi.servicesinterfaces.INotificacionService;
import pe.edu.upc.demosi.servicesinterfaces.IUsuarioService;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/Notificaciones")
public class ControllerNotificacion {
    private final INotificacionService nS;
    private final IUsuarioService uS;
    private final ICoincidenciaService cS;
    private final ModelMapper modelMapper;

    public ControllerNotificacion(INotificacionService nS, IUsuarioService uS,ICoincidenciaService cS, ModelMapper modelMapper) {
        this.nS = nS;
        this.uS = uS;
        this.cS = cS;
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
        // 1. Validamos y obtenemos el Usuario desde la base de datos
        Usuarios usuario = uS.listId(dto.getIdUsuario())
                .orElseThrow(() -> new ResourceNotFoundException(
                        "No existe el usuario con el id: " + dto.getIdUsuario()
                ));

        // 2. Validamos y obtenemos la Coincidencia desde la base de datos
        Coincidencia coincidencia = cS.listId(dto.getIdCoincidencia())
                .orElseThrow(() -> new ResourceNotFoundException(
                        "No existe la coincidencia con el id: " + dto.getIdCoincidencia()
                ));

        // 3. Mapeamos de DTO a Entidad y le asignamos las foráneas encontradas
        Notificacion noti = modelMapper.map(dto, Notificacion.class);
        noti.setUsuario(usuario);
        noti.setCoincidencia(coincidencia);

        // 4. Asignación manual de fecha de creación (si no usas @PrePersist en la entidad)
        noti.setFechaCreacionN(LocalDateTime.now()); // Asegúrate de que el metodo coincida con noti

        // 5. Guardamos en la base de datos
        nS.insert(noti);

        // 6. Mapeamos de vuelta al DTO para armar la respuesta e inyectamos los IDs
        NotificacionDTCinsert responseDTO = modelMapper.map(noti, NotificacionDTCinsert.class);

        // 7. Generamos la URL y devolvemos el código 201 Created
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(noti.getIdNotificacion()) // Asegúrate de que el getter coincida con el de tu entidad Notificacion
                .toUri();

        return ResponseEntity
                .created(location)
                .body(responseDTO);
    }
}
