package pe.edu.upc.demosi.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "Uname",length = 100,nullable = false)
    private String Uname;

    @Column(name = "Uapellido",length = 100,nullable = false)
    private String Uapellido;

    @Column(name = "Ucorreo",length = 100,nullable = false)
    private String Ucorreo;

    @Column(name = "UcontrasenaHash",length = 255,nullable = false)
    private String UcontrasenaHash;

    @Column(name = "UfechaRegistro",nullable = false)
    private LocalDateTime UfechaRegistro;

    @Column(name = "Uactivo", nullable = false)
    private boolean Uactivo;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Notificacion> notificaciones;

    public Usuarios() {
    }

    public Usuarios(Long idUsuario, String uname, String uapellido, String ucorreo, String ucontrasenaHash, LocalDateTime ufechaRegistro, boolean uactivo, Rol rol, List<Notificacion> notificaciones) {
        this.idUsuario = idUsuario;
        Uname = uname;
        Uapellido = uapellido;
        Ucorreo = ucorreo;
        UcontrasenaHash = ucontrasenaHash;
        UfechaRegistro = ufechaRegistro;
        Uactivo = uactivo;
        this.rol = rol;
        this.notificaciones = notificaciones;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getUapellido() {
        return Uapellido;
    }

    public void setUapellido(String uapellido) {
        Uapellido = uapellido;
    }

    public String getUcorreo() {
        return Ucorreo;
    }

    public void setUcorreo(String ucorreo) {
        Ucorreo = ucorreo;
    }

    public String getUcontrasenaHash() {
        return UcontrasenaHash;
    }

    public void setUcontrasenaHash(String ucontrasenaHash) {
        UcontrasenaHash = ucontrasenaHash;
    }

    public LocalDateTime getUfechaRegistro() {
        return UfechaRegistro;
    }

    public void setUfechaRegistro(LocalDateTime ufechaRegistro) {
        UfechaRegistro = ufechaRegistro;
    }

    public boolean isUactivo() {
        return Uactivo;
    }

    public void setUactivo(boolean uactivo) {
        Uactivo = uactivo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }
}
