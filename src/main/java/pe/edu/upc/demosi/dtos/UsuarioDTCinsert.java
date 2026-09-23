package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsuarioDTCinsert {

    private Long idUsuario;

    @NotBlank(message = "El nombre del usuario no puede ser nulo ni estar vacío")
    private String nombreUsuario;

    @NotBlank(message = "El apellido del usuario no puede ser nulo ni estar vacío")
    private String apellidoUsuario;

    @NotBlank(message = "El correo del usuario no puede ser nulo ni estar vacío")
    private String correoUsuairo;

    @NotBlank(message = "La contraseña del usuario no puede ser nulo ni estar vacío")
    private String contrasenaHashUsuario;

    @NotBlank(message = "El rol del usuario no puede ser nulo ni estar vacío")
    private LocalDateTime fechaRegistroUsuario;

    @NotBlank(message = "El estado del usuario es obligatorio")
    private boolean activo;

    @NotNull(message = "El Id del Rol es obligatorio.")
    private Long idRol;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoUsuairo() {
        return correoUsuairo;
    }

    public void setCorreoUsuairo(String correoUsuairo) {
        this.correoUsuairo = correoUsuairo;
    }

    public String getContrasenaHashUsuario() {
        return contrasenaHashUsuario;
    }

    public void setContrasenaHashUsuario(String contrasenaHashUsuario) {
        this.contrasenaHashUsuario = contrasenaHashUsuario;
    }

    public LocalDateTime getFechaRegistroUsuario() {
        return fechaRegistroUsuario;
    }

    public void setFechaRegistroUsuario(LocalDateTime fechaRegistroUsuario) {
        this.fechaRegistroUsuario = fechaRegistroUsuario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
}
