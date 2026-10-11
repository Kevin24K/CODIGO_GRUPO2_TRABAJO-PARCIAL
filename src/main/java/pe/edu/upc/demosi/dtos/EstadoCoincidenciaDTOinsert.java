package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;

public class EstadoCoincidenciaDTOinsert {

    @NotBlank(message = "El nombre del estado es obligatorio")
    private String nombreEC;

    @NotBlank(message = "La descripción no puede superar los 255 caracteres")
    private String descripcionEC;

    public String getNombreEC() {
        return nombreEC;
    }

    public void setNombreEC(String nombreEC) {
        this.nombreEC = nombreEC;
    }

    public String getDescripcionEC() {
        return descripcionEC;
    }

    public void setDescripcionEC(String descripcionEC) {
        this.descripcionEC = descripcionEC;
    }
}
