package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UsuarioDTCinsert {

    private Long idUsuario;
    @NotBlank(message = "El nombre del usuario no puede ser nulo ni estar vacío")
    private String Uname;
    @NotBlank(message = "El apellido del usuario no puede ser nulo ni estar vacío")
    private String Uapellido;
    @NotBlank(message = "El correo del usuario no puede ser nulo ni estar vacío")
    private String Ucorreo;
    @NotBlank(message = "La contraseña del usuario no puede ser nulo ni estar vacío")
    private String UcontrasenaHash;
    @NotNull(message = "El fecha de registro del usuario no puede ser nulo ni estar vacío")
    private LocalDateTime UfechaRegistro;
    @NotNull(message = "El estado del usuario no puede ser nulo ni estar vacío")
    private boolean Uactivo;
    private Long idRol;

    public UsuarioDTCinsert() {
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

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }
}
