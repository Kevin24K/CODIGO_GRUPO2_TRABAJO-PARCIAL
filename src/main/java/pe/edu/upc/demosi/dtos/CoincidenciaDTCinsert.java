package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class CoincidenciaDTCinsert {

    private long idCoincidencia;

    @NotNull(message = "El ID del reporte perdido es obligatorio")
    private Long idReportePerdido;

    @NotNull(message = "El ID del reporte encontrado es obligatorio")
    private Long idReporteEncontrado;

    @NotNull(message = "El ID del estado es obligatorio")
    private Long idEstadoCoincidencia;

    @NotNull(message = "El porcentaje de similitud es obligatorio")
    private Double porcentajeSimilitud;

    @NotBlank(message = "El detalle de la coincidencia es obligatorio")
    private String detalleCoincidencia;

    @NotNull(message = "La fecha de generación es obligatoria")
    private LocalDateTime fechaGeneracionCoincidencia;

    public long getIdCoincidencia() {
        return idCoincidencia;
    }

    public void setIdCoincidencia(long idCoincidencia) {
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

    public LocalDateTime getFechaGeneracionCoincidencia() {
        return fechaGeneracionCoincidencia;
    }

    public void setFechaGeneracionCoincidencia(LocalDateTime fechaGeneracionCoincidencia) {
        this.fechaGeneracionCoincidencia = fechaGeneracionCoincidencia;
    }
}
