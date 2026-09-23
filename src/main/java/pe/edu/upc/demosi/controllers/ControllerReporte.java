package pe.edu.upc.demosi.controllers;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upc.demosi.dtos.ReporteDTCList;
import pe.edu.upc.demosi.dtos.ReporteDTCinsert;
import pe.edu.upc.demosi.entities.Reporte;
import pe.edu.upc.demosi.servicesinterfaces.IReporteService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/Reportes")
public class ControllerReporte {
    private final IReporteService rS;
    private final ModelMapper modelMapper;

    public ControllerReporte(IReporteService rS, ModelMapper modelMapper) {
        this.rS = rS;
        this.modelMapper = modelMapper;
    }

    // 1. MÉTODO PARA LISTAR (Usa el DTCList)
    @GetMapping
    public ResponseEntity<List<ReporteDTCList>> listar() {

        List<ReporteDTCList> lista = rS.list()
                .stream()
                .map(reporte -> modelMapper.map(reporte, ReporteDTCList.class))
                .toList();

        return ResponseEntity.ok(lista);
    }

    // 2. MÉTODO PARA CREAR (Usa el DTCinsert)
    @PostMapping
    public ResponseEntity<ReporteDTCinsert> registrar(
            @Valid @RequestBody ReporteDTCinsert dto) {

        Reporte reporte = modelMapper.map(dto, Reporte.class);

        rS.insert(reporte);

        ReporteDTCinsert responseDTO =
                modelMapper.map(reporte, ReporteDTCinsert.class);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(reporte.getIdReporte())
                .toUri();

        return ResponseEntity
                .created(location)
                .body(responseDTO);
    }
}
