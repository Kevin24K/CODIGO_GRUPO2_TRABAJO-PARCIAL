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

    @Column(name = "tipo_reporte", length = 50, nullable = false)
    private String tipoReporte;

    @Column(name = "fechaEvento_reporte", nullable = false)
    private LocalDate fechaEvento_reporte;

    @Column(name = "hora_evento_reporte")
    private LocalTime hora_evento_reporte;

    @Column(name = "fecha_creacion_reporte", nullable = false)
    private LocalDateTime fecha_creacion_reporte;

    @Column(name = "fecha_actualizacion_reporte")
    private LocalDateTime fecha_actualizacion_reporte;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuarios usuario;

    @ManyToOne
    @JoinColumn(name = "id_objeto", nullable = false)
    private Objeto objeto;

    @ManyToOne
    @JoinColumn(name = "id_estado_reporte", nullable = false)
    private EstadoReporte estadoReporte;

    public Reporte() {
    }

    public Reporte(Long idReporte, String tipoReporte, LocalDate fechaEvento_reporte, LocalTime hora_evento_reporte, LocalDateTime fecha_creacion_reporte, LocalDateTime fecha_actualizacion_reporte, Usuarios usuario, Objeto objeto, EstadoReporte estadoReporte) {
        this.idReporte = idReporte;
        this.tipoReporte = tipoReporte;
        this.fechaEvento_reporte = fechaEvento_reporte;
        this.hora_evento_reporte = hora_evento_reporte;
        this.fecha_creacion_reporte = fecha_creacion_reporte;
        this.fecha_actualizacion_reporte = fecha_actualizacion_reporte;
        this.usuario = usuario;
        this.objeto = objeto;
        this.estadoReporte = estadoReporte;
    }

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

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public EstadoReporte getEstadoReporte() {
        return estadoReporte;
    }

    public void setEstadoReporte(EstadoReporte estadoReporte) {
        this.estadoReporte = estadoReporte;
    }
}
