package pe.edu.upc.demosi.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class EstadoCoincidenciaDTOList {

    private Long idEstadoCoincidencia;
    private String nombreEC;
    private String descripcionEC;

    public Long getIdEstadoCoincidencia() {
        return idEstadoCoincidencia;
    }

    public void setIdEstadoCoincidencia(Long idEstadoCoincidencia) {
        this.idEstadoCoincidencia = idEstadoCoincidencia;
    }

    public String getNombreEC() {
        return nombreEC;
    }

    public void setNombreEC(String nombreEC) {
        this.nombreEC = nombreEC;
    }

    public String getDescripcionEC() {
        return descripcionEC;
    }

    public void setDescripcionEC(String descripcionEC) {
        this.descripcionEC = descripcionEC;
    }
}
