package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Coincidencia")
public class Coincidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoincidencia;

    @Column(name = "id_reporte_perdido", nullable = false)
    private Long idReportePerdido;

    @Column(name = "id_reporte_encontrado", nullable = false)
    private Long idReporteEncontrado;

    @Column(name = "id_estado_coincidencia", nullable = false)
    private Long idEstadoCoincidencia;

    @Column(name = "porcentaje_similitud_Coincidencia")
    private Double porcentajeSimilitudCoincidencia;

    @Column(name = "detalle_coincidencia", columnDefinition = "TEXT")
    private String detalleCoincidencia;

    @Column(name = "fecha_generacion_Coincidencia", nullable = false)
    private LocalDateTime fechaGeneracionCoincidencia;

    public Coincidencia(Long idCoincidencia, Long idReportePerdido, Long idReporteEncontrado, Long idEstadoCoincidencia, Double porcentajeSimilitudCoincidencia, String detalleCoincidencia, LocalDateTime fechaGeneracionCoincidencia) {
        this.idCoincidencia = idCoincidencia;
        this.idReportePerdido = idReportePerdido;
        this.idReporteEncontrado = idReporteEncontrado;
        this.idEstadoCoincidencia = idEstadoCoincidencia;
        this.porcentajeSimilitudCoincidencia = porcentajeSimilitudCoincidencia;
        this.detalleCoincidencia = detalleCoincidencia;
        this.fechaGeneracionCoincidencia = fechaGeneracionCoincidencia;
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

    public Double getPorcentajeSimilitudCoincidencia() {
        return porcentajeSimilitudCoincidencia;
    }

    public void setPorcentajeSimilitudCoincidencia(Double porcentajeSimilitudCoincidencia) {
        this.porcentajeSimilitudCoincidencia = porcentajeSimilitudCoincidencia;
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
