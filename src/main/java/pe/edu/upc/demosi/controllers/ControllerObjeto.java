package pe.edu.upc.demosi.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upc.demosi.dtos.ObjetoDTCinsert;
import pe.edu.upc.demosi.dtos.ObjetoDTCList;
import pe.edu.upc.demosi.entities.Objeto;
import pe.edu.upc.demosi.servicesinterfaces.IObjetoService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/Objetos")
public class ControllerObjeto {
    private final IObjetoService oS;
    private final ModelMapper modelMapper;

    public ControllerObjeto(IObjetoService oS, ModelMapper modelMapper) {
        this.oS = oS;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity<List<ObjetoDTCList>> listar() {

        List<ObjetoDTCList> lista = oS.list()
                .stream()
                .map(objeto -> modelMapper.map(objeto, ObjetoDTCList.class))
                .toList();

        return ResponseEntity.ok(lista);
    }
    @PostMapping
    public ResponseEntity<ObjetoDTCinsert> registrar(
            @Valid @RequestBody ObjetoDTCinsert dto) {

        Objeto objeto = modelMapper.map(dto, Objeto.class);

        oS.insert(objeto);

        ObjetoDTCinsert responseDTO =
                modelMapper.map(objeto, ObjetoDTCinsert.class);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(objeto.getIdObjeto())
                .toUri();

        return ResponseEntity
                .created(location)
                .body(responseDTO);
    }
}
