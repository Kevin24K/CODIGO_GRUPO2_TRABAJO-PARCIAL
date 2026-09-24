package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class EstadoCoincidenciaDTOinsert {

    private long idEstadoCoincidencia;

    @NotBlank(message = "El nombre del estado es obligatorio")
    private String nombre;

    @NotBlank(message = "La descripción no puede superar los 255 caracteres")
    private String descripcion;

    public long getIdEstadoCoincidencia() {
        return idEstadoCoincidencia;
    }

    public void setIdEstadoCoincidencia(long idEstadoCoincidencia) {
        this.idEstadoCoincidencia = idEstadoCoincidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
