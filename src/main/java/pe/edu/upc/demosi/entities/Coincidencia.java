package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Coincidencia")
public class Coincidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoincidencia;

    @Column(name = "porcentaje_similitud_Coincidencia")
    private Double porcentajeSimilitudCoincidencia;

    @Column(name = "detalle_coincidencia", columnDefinition = "TEXT")
    private String detalleCoincidencia;

    @Column(name = "fecha_generacion_Coincidencia", nullable = false)
    private LocalDateTime fechaGeneracionCoincidencia;

    @ManyToOne
    @JoinColumn(name = "id_reporte_perdido", nullable = false)
    private Reporte reportePerdido;

    // Conecta con el reporte del objeto que alguien encontró
    @ManyToOne
    @JoinColumn(name = "id_reporte_encontrado", nullable = false)
    private Reporte reporteEncontrado;

    // Conecta con el estado de esta coincidencia
    @ManyToOne
    @JoinColumn(name = "id_estado_coincidencia", nullable = false)
    private EstadoCoincidencia estadoCoincidencia;

    public Coincidencia() {
    }

    public Coincidencia(Long idCoincidencia, Double porcentajeSimilitudCoincidencia, String detalleCoincidencia, LocalDateTime fechaGeneracionCoincidencia, Reporte reportePerdido, Reporte reporteEncontrado, EstadoCoincidencia estadoCoincidencia) {
        this.idCoincidencia = idCoincidencia;
        this.porcentajeSimilitudCoincidencia = porcentajeSimilitudCoincidencia;
        this.detalleCoincidencia = detalleCoincidencia;
        this.fechaGeneracionCoincidencia = fechaGeneracionCoincidencia;
        this.reportePerdido = reportePerdido;
        this.reporteEncontrado = reporteEncontrado;
        this.estadoCoincidencia = estadoCoincidencia;
    }

    public Long getIdCoincidencia() {
        return idCoincidencia;
    }

    public void setIdCoincidencia(Long idCoincidencia) {
        this.idCoincidencia = idCoincidencia;
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

    public Reporte getReportePerdido() {
        return reportePerdido;
    }

    public void setReportePerdido(Reporte reportePerdido) {
        this.reportePerdido = reportePerdido;
    }

    public Reporte getReporteEncontrado() {
        return reporteEncontrado;
    }

    public void setReporteEncontrado(Reporte reporteEncontrado) {
        this.reporteEncontrado = reporteEncontrado;
    }

    public EstadoCoincidencia getEstadoCoincidencia() {
        return estadoCoincidencia;
    }

    public void setEstadoCoincidencia(EstadoCoincidencia estadoCoincidencia) {
        this.estadoCoincidencia = estadoCoincidencia;
    }
}
