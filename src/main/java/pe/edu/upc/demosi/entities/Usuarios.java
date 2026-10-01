package pe.edu.upc.demosi.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

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

    @Column(name = "ucontrasena_hash", length = 255, nullable = false)
    private String ucontrasenaHash;

    @Column(name = "fecha_registro_usuario",nullable = false)
    private LocalDateTime fechaRegistroUsuario;

    @Column(name = "activoUsuarios", nullable = false)
    private Boolean activoUsuarios;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

    public Usuarios() {
    }

    public Usuarios(Long idUsuario, String nameUsuario, String apellidoUsuario, String correoUsuario, String ucontrasenaHash, LocalDateTime fechaRegistroUsuario, Boolean activoUsuarios, Rol rol) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correoUsuario = correoUsuario;
        this.ucontrasenaHash = ucontrasenaHash;
        this.fechaRegistroUsuario = fechaRegistroUsuario;
        this.activoUsuarios = activoUsuarios;
        this.rol = rol;
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

    public String getUcontrasenaHash() {
        return ucontrasenaHash;
    }

    public void setUcontrasenaHash(String ucontrasenaHash) {
        this.ucontrasenaHash = ucontrasenaHash;
    }

    public LocalDateTime getFechaRegistroUsuario() {
        return fechaRegistroUsuario;
    }

    public void setFechaRegistroUsuario(LocalDateTime fechaRegistroUsuario) {
        this.fechaRegistroUsuario = fechaRegistroUsuario;
    }

    public Boolean getActivoUsuarios() {
        return activoUsuarios;
    }

    public void setActivoUsuarios(Boolean activoUsuarios) {
        this.activoUsuarios = activoUsuarios;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
