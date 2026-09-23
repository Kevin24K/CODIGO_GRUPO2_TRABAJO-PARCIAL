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

    @Column(name = "nameUsuario",length = 100,nullable = false)
    private String nameUsuario;

    @Column(name = "apellidoUsuario",length = 100,nullable = false)
    private String apellidoUsuario;

    @Column(name = "correoUsuario",length = 100,nullable = false)
    private String correoUsuario;

    @Column(name = "contraseñaHashUsuario",length = 255,nullable = false)
    private String contraseñaHashUsuario;

    @Column(name = "FechaRegistroUsuario",nullable = false)
    private LocalDateTime FechaRegistroUsuario;

    @Column(name = "activoUsuarios", nullable = false)
    private boolean activoUsuarios;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Notificacion> notificaciones;

    public Usuarios() {
    }

    public Usuarios(Long idUsuario, String nameUsuario, String apellidoUsuario, String correoUsuario, String contraseñaHashUsuario, LocalDateTime fechaRegistroUsuario, boolean activoUsuarios, Rol rol, List<Notificacion> notificaciones) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correoUsuario = correoUsuario;
        this.contraseñaHashUsuario = contraseñaHashUsuario;
        FechaRegistroUsuario = fechaRegistroUsuario;
        this.activoUsuarios = activoUsuarios;
        this.rol = rol;
        this.notificaciones = notificaciones;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContraseñaHashUsuario() {
        return contraseñaHashUsuario;
    }

    public void setContraseñaHashUsuario(String contraseñaHashUsuario) {
        this.contraseñaHashUsuario = contraseñaHashUsuario;
    }

    public LocalDateTime getFechaRegistroUsuario() {
        return FechaRegistroUsuario;
    }

    public void setFechaRegistroUsuario(LocalDateTime fechaRegistroUsuario) {
        FechaRegistroUsuario = fechaRegistroUsuario;
    }

    public boolean isActivoUsuarios() {
        return activoUsuarios;
    }

    public void setActivoUsuarios(boolean activoUsuarios) {
        this.activoUsuarios = activoUsuarios;
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
