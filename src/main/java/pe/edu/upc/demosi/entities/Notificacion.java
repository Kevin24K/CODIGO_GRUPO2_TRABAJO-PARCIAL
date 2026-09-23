package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotificacion;

    @Column(name = "tituloNotificacion", length = 100, nullable = false)
    private String tituloNotificacion;

    @Column(name = "mensajeNotificacion", length = 255, nullable = false)
    private String mensajeNotificacion;

    @Column(name = "tipoNotificacion", length = 50)
    private String tipoNotificacion;

    @Column(name = "leidaNotificacion", nullable = false)
    private boolean leidaNotificacion;

    @Column(name = "fecha_creacion_Notificacion", nullable = false)
    private LocalDateTime fechaCreacionNotificacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuarios usuario;

    @ManyToOne
    @JoinColumn(name = "id_coincidencia") // Puede ser nullable si hay notificaciones genéricas del sistema
    private Coincidencia coincidencia;

    public Notificacion() {
    }

    public Notificacion(Long idNotificacion, String tituloNotificacion, String mensajeNotificacion, String tipoNotificacion, boolean leidaNotificacion, LocalDateTime fechaCreacionNotificacion, Usuarios usuario, Coincidencia coincidencia) {
        this.idNotificacion = idNotificacion;
        this.tituloNotificacion = tituloNotificacion;
        this.mensajeNotificacion = mensajeNotificacion;
        this.tipoNotificacion = tipoNotificacion;
        this.leidaNotificacion = leidaNotificacion;
        this.fechaCreacionNotificacion = fechaCreacionNotificacion;
        this.usuario = usuario;
        this.coincidencia = coincidencia;
    }

    public Long getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getTituloNotificacion() {
        return tituloNotificacion;
    }

    public void setTituloNotificacion(String tituloNotificacion) {
        this.tituloNotificacion = tituloNotificacion;
    }

    public String getMensajeNotificacion() {
        return mensajeNotificacion;
    }

    public void setMensajeNotificacion(String mensajeNotificacion) {
        this.mensajeNotificacion = mensajeNotificacion;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public boolean isLeidaNotificacion() {
        return leidaNotificacion;
    }

    public void setLeidaNotificacion(boolean leidaNotificacion) {
        this.leidaNotificacion = leidaNotificacion;
    }

    public LocalDateTime getFechaCreacionNotificacion() {
        return fechaCreacionNotificacion;
    }

    public void setFechaCreacionNotificacion(LocalDateTime fechaCreacionNotificacion) {
        this.fechaCreacionNotificacion = fechaCreacionNotificacion;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Coincidencia getCoincidencia() {
        return coincidencia;
    }

    public void setCoincidencia(Coincidencia coincidencia) {
        this.coincidencia = coincidencia;
    }
}
