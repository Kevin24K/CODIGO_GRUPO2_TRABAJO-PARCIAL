package pe.edu.upc.demosi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
public class CropDTCInsert {

    @NotBlank(message = "El nombre del cultivo no puede ser nulo ni estar vacío")
    private String nameCrop;

    @NotBlank(message = "El tipo de cultivo no puede ser nulo ni estar vacío")
    private String typeCrop;

    @NotNull(message = "La fecha de siembra es obligatoria")
    private LocalDate plantingDate;

    @NotNull(message = "La fecha estimada de cosecha es obligatoria")
    private LocalDate estimatedHarvestDate;

    @NotNull(message = "El estado del cultivo es obligatorio")
    private Boolean statusCrop;

    public String getTypeCrop() {
        return typeCrop;
    }

    public void setTypeCrop(String typeCrop) {
        this.typeCrop = typeCrop;
    }

    public LocalDate getPlantingDate() {
        return plantingDate;
    }

    public void setPlantingDate(LocalDate plantingDate) {
        this.plantingDate = plantingDate;
    }

    public LocalDate getEstimatedHarvestDate() {
        return estimatedHarvestDate;
    }

    public void setEstimatedHarvestDate(LocalDate estimatedHarvestDate) {
        this.estimatedHarvestDate = estimatedHarvestDate;
    }

    public Boolean getStatusCrop() {
        return statusCrop;
    }

    public void setStatusCrop(Boolean statusCrop) {
        this.statusCrop = statusCrop;
    }

    public String getNameCrop() {
        return nameCrop;
    }

    public void setNameCrop(String nameCrop) {
        this.nameCrop = nameCrop;
    }

    // ... (generar el resto de getters y setters)

}
