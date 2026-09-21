package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
@Entity
@Table(name = "Reporte")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporte;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "id_objeto", nullable = false)
    private Long idObjeto;

    @Column(name = "id_estado_reporte", nullable = false)
    private Long idEstadoReporte;

    @Column(name = "tipo_reporte", length = 50, nullable = false)
    private String tipoReporte;

    @Column(name = "hora_evento_reporte", nullable = false)
    private LocalDate fechaEvento_reporte;

    @Column(name = "hora_evento_reporte")
    private LocalTime hora_evento_reporte;

    @Column(name = "fecha_creacion_reporte", nullable = false)
    private LocalDateTime fecha_creacion_reporte;

    @Column(name = "fecha_actualizacion_reporte")
    private LocalDateTime fecha_actualizacion_reporte;

    public Reporte() {
    }

    public Reporte(Long idReporte, Long idUsuario, Long idObjeto, Long idEstadoReporte, String tipoReporte, LocalDate fechaEvento, LocalTime hora_evento_reporte, LocalDateTime fecha_creacion_reporte, LocalDateTime fecha_actualizacion_reporte) {
        this.idReporte = idReporte;
        this.idUsuario = idUsuario;
        this.idObjeto = idObjeto;
        this.idEstadoReporte = idEstadoReporte;
        this.tipoReporte = tipoReporte;
        this.fechaEvento_reporte = fechaEvento;
        this.hora_evento_reporte = hora_evento_reporte;
        this.fecha_creacion_reporte = fecha_creacion_reporte;
        this.fecha_actualizacion_reporte = fecha_actualizacion_reporte;
    }

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

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public LocalDate getFechaEvento_reporte() {
            return fechaEvento_reporte;
    }

    public void setFechaEvento_reporte(LocalDate fechaEvento_reporte) {
        this.fechaEvento_reporte = fechaEvento_reporte;
    }

    public LocalTime getHora_evento_reporte() {
        return hora_evento_reporte;
    }

    public void setHora_evento_reporte(LocalTime hora_evento_reporte) {
        this.hora_evento_reporte = hora_evento_reporte;
    }

    public LocalDateTime getFecha_creacion_reporte() {
        return fecha_creacion_reporte;
    }

    public void setFecha_creacion_reporte(LocalDateTime fecha_creacion_reporte) {
        this.fecha_creacion_reporte = fecha_creacion_reporte;
    }

    public LocalDateTime getFecha_actualizacion_reporte() {
        return fecha_actualizacion_reporte;
    }

    public void setFecha_actualizacion_reporte(LocalDateTime fecha_actualizacion_reporte) {
        this.fecha_actualizacion_reporte = fecha_actualizacion_reporte;
    }
}
