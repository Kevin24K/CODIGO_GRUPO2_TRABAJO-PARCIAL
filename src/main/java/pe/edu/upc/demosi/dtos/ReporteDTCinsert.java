package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ReporteDTCinsert {

    private Long idReporte;

    @NotBlank(message = "El tipo de reporte no puede ser nulo ni estar vacío")
    private String tipoReporte;

    @NotBlank(message = "La fecha del evento no puede ser nula ni estar vacía")
    private LocalDate fechaEventoReporte;

    @NotBlank(message = "La hora del evento no puede ser nula ni estar vacía")
    private LocalTime horaEventoReporte;

    @NotBlank(message = "La fecha de creación no puede ser nula ni estar vacía")
    private LocalDateTime fechaCreacionReporte;

    @NotBlank(message = "La fecha de actualización no puede ser nula ni estar vacía")
    private LocalDateTime fechaActualizacionReporte;

    @NotNull(message = "El Id del Usuario es obligatorio.")
    private Long idUsuario;

    @NotNull(message = "El Id del Objeto es obligatorio.")
    private Long idObjeto;

    @NotNull(message = "El Id del Estado del Reporte es obligatorio.")
    private Long idEstadoReporte;

    public Long getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Long idReporte) {
        this.idReporte = idReporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public LocalDate getFechaEventoReporte() {
        return fechaEventoReporte;
    }

    public void setFechaEventoReporte(LocalDate fechaEventoReporte) {
        this.fechaEventoReporte = fechaEventoReporte;
    }

    public LocalTime getHoraEventoReporte() {
        return horaEventoReporte;
    }

    public void setHoraEventoReporte(LocalTime horaEventoReporte) {
        this.horaEventoReporte = horaEventoReporte;
    }

    public LocalDateTime getFechaCreacionReporte() {
        return fechaCreacionReporte;
    }

    public void setFechaCreacionReporte(LocalDateTime fechaCreacionReporte) {
        this.fechaCreacionReporte = fechaCreacionReporte;
    }

    public LocalDateTime getFechaActualizacionReporte() {
        return fechaActualizacionReporte;
    }

    public void setFechaActualizacionReporte(LocalDateTime fechaActualizacionReporte) {
        this.fechaActualizacionReporte = fechaActualizacionReporte;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(Long idObjeto) {
        this.idObjeto = idObjeto;
    }

    public Long getIdEstadoReporte() {
        return idEstadoReporte;
    }

    public void setIdEstadoReporte(Long idEstadoReporte) {
        this.idEstadoReporte = idEstadoReporte;
    }
}
