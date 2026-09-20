package pe.edu.upc.demosi.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "coincidencia")
public class Coincidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoincidencia;

    @ManyToOne
    @JoinColumn(name = "id_reporte_perdido", nullable = false)
    private Reporte reportePerdido;

    @ManyToOne
    @JoinColumn(name = "id_reporte_encontrado", nullable = false)
    private Reporte reporteEncontrado;

    @ManyToOne
    @JoinColumn(name = "id_estado_coincidencia", nullable = false)
    private EstadoCoincidencia estadoCoincidencia;

    @Column(name = "porcentaje_similitud", nullable = false)
    private BigDecimal porcentajeSimilitud;

    @Column(name = "detalle_coincidencia")
    private String detalleCoincidencia;

    @Column(name = "fecha_generacion", nullable = false)
    private LocalDateTime fechaGeneracion;

    public Coincidencia() {}
    public Long getIdCoincidencia() { return idCoincidencia; }
    public void setIdCoincidencia(Long idCoincidencia) { this.idCoincidencia = idCoincidencia; }
    public Reporte getReportePerdido() { return reportePerdido; }
    public void setReportePerdido(Reporte reportePerdido) { this.reportePerdido = reportePerdido; }
    public Reporte getReporteEncontrado() { return reporteEncontrado; }
    public void setReporteEncontrado(Reporte reporteEncontrado) { this.reporteEncontrado = reporteEncontrado; }
    public EstadoCoincidencia getEstadoCoincidencia() { return estadoCoincidencia; }
    public void setEstadoCoincidencia(EstadoCoincidencia estadoCoincidencia) { this.estadoCoincidencia = estadoCoincidencia; }
    public BigDecimal getPorcentajeSimilitud() { return porcentajeSimilitud; }
    public void setPorcentajeSimilitud(BigDecimal porcentajeSimilitud) { this.porcentajeSimilitud = porcentajeSimilitud; }
    public String getDetalleCoincidencia() { return detalleCoincidencia; }
    public void setDetalleCoincidencia(String detalleCoincidencia) { this.detalleCoincidencia = detalleCoincidencia; }
    public LocalDateTime getFechaGeneracion() { return fechaGeneracion; }
    public void setFechaGeneracion(LocalDateTime fechaGeneracion) { this.fechaGeneracion = fechaGeneracion; }
}
