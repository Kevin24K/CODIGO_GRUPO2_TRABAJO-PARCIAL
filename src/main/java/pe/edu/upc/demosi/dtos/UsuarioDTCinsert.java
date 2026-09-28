package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsuarioDTCinsert {

    private Long idUsuario;

    @NotBlank(message = "El nombre del usuario no puede ser nulo ni estar vacío")
    private String nameUsuario;

    @NotBlank(message = "El apellido del usuario no puede ser nulo ni estar vacío")
    private String apellidoUsuario;

    @NotBlank(message = "El correo del usuario no puede ser nulo ni estar vacío")
    private String correoUsuario;

    @NotBlank(message = "La contraseña del usuario no puede ser nulo ni estar vacío")
    private String ucontrasenaHash;

    @NotNull(message = "El rol del usuario no puede ser nulo ni estar vacío")
    private LocalDateTime fechaRegistroUsuario;

    @NotNull(message = "El estado del usuario es obligatorio")
    private Boolean activoUsuarios;

    @NotNull(message = "El Id del Rol es obligatorio.")
    private Long idRol;

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

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
}
