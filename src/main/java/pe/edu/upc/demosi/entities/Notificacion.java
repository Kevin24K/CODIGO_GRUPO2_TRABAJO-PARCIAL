package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotificacion;

    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "id_coincidencia")
    private Long idCoincidencia;

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

    public Notificacion() {
    }

    public Notificacion(Long idNotificacion, Long idUsuario, Long idCoincidencia, String tituloNotificacion, String mensajeNotificacion, String tipoNotificacion, boolean leidaNotificacion, LocalDateTime fechaCreacionNotificacion) {
        this.idNotificacion = idNotificacion;
        this.idUsuario = idUsuario;
        this.idCoincidencia = idCoincidencia;
        this.tituloNotificacion = tituloNotificacion;
        this.mensajeNotificacion = mensajeNotificacion;
        this.tipoNotificacion = tipoNotificacion;
        this.leidaNotificacion = leidaNotificacion;
        this.fechaCreacionNotificacion = fechaCreacionNotificacion;
    }

    public Long getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(Long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdCoincidencia() {
        return idCoincidencia;
    }

    public void setIdCoincidencia(Long idCoincidencia) {
        this.idCoincidencia = idCoincidencia;
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
}
