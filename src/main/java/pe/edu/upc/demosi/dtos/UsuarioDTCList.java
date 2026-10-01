package pe.edu.upc.demosi.dtos;

import pe.edu.upc.demosi.entities.Rol;

import java.time.LocalDateTime;

public class UsuarioDTCList {

    private Long idUsuario;
    private String nameUsuario;
    private String apellidoUsuario;
    private String correoUsuario;
    private String ucontrasenaHash;
    private LocalDateTime FechaRegistroUsuario;
    private Boolean activoUsuarios;
    private Rol rol;

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
        return FechaRegistroUsuario;
    }

    public void setFechaRegistroUsuario(LocalDateTime fechaRegistroUsuario) {
        FechaRegistroUsuario = fechaRegistroUsuario;
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
