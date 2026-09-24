package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class NotificacionDTCinsert {

    private long idNotificacion;

    @NotBlank(message = "El id de la coincidencia no puede ser nulo ni estar vacío")
    private Long idCoincidencia;

    @NotBlank(message = "El id del reporte perdido no puede ser nulo ni estar vacío")
    private Long idReportePerdido;

    @NotBlank(message = "El id del reporte encontrado no puede ser nulo ni estar vacío")
    private Long idReporteEncontrado;

    @NotBlank(message = "El id del estado de la coincidencia no puede ser nulo ni estar vacío")
    private Long idEstadoCoincidencia;

    @NotBlank(message = "El porcentaje de similitud no puede ser nulo ni estar vacío")
    private Double porcentajeSimilitud;

    @NotBlank(message = "El detalle de la coincidencia no puede ser nulo ni estar vacío")
    private String detalleCoincidencia;

    @NotBlank(message = "La fecha de generación no puede ser nula ni estar vacía")
    private LocalDateTime fechaGeneracion;

    public long getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Long getIdCoincidencia() {
        return idCoincidencia;
    }

    public void setIdCoincidencia(Long idCoincidencia) {
        this.idCoincidencia = idCoincidencia;
    }

    public Long getIdReportePerdido() {
        return idReportePerdido;
    }

    public void setIdReportePerdido(Long idReportePerdido) {
        this.idReportePerdido = idReportePerdido;
    }

    public Long getIdReporteEncontrado() {
        return idReporteEncontrado;
    }

    public void setIdReporteEncontrado(Long idReporteEncontrado) {
        this.idReporteEncontrado = idReporteEncontrado;
    }

    public Long getIdEstadoCoincidencia() {
        return idEstadoCoincidencia;
    }

    public void setIdEstadoCoincidencia(Long idEstadoCoincidencia) {
        this.idEstadoCoincidencia = idEstadoCoincidencia;
    }

    public Double getPorcentajeSimilitud() {
        return porcentajeSimilitud;
    }

    public void setPorcentajeSimilitud(Double porcentajeSimilitud) {
        this.porcentajeSimilitud = porcentajeSimilitud;
    }

    public String getDetalleCoincidencia() {
        return detalleCoincidencia;
    }

    public void setDetalleCoincidencia(String detalleCoincidencia) {
        this.detalleCoincidencia = detalleCoincidencia;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }
}
