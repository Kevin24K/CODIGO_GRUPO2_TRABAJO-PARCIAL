package pe.edu.upc.demosi.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ReporteDTCList {
    private Long idReporte;
    private Long idUsuario;
    private Long idObjeto;
    private Long idEstadoReporte;
    private String tipoReporteReporte;
    private LocalDate fechaEventoReporte;
    private LocalTime horaEventoReporte;
    private LocalDateTime fechaCreacionReporte;
    private LocalDateTime fechaActualizacionReporte;

    public Long getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Long idReporte) {
        this.idReporte = idReporte;
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

    public String getTipoReporteReporte() {
        return tipoReporteReporte;
    }

    public void setTipoReporteReporte(String tipoReporteReporte) {
        this.tipoReporteReporte = tipoReporteReporte;
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
}
