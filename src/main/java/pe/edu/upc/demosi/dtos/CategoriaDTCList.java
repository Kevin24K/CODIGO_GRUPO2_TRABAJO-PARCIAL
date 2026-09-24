package pe.edu.upc.demosi.dtos;

public class CategoriaDTCList {
    private Long idCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;
    private boolean activoCategoria;

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public boolean isActivoCategoria() {
        return activoCategoria;
    }

    public void setActivoCategoria(boolean activoCategoria) {
        this.activoCategoria = activoCategoria;
    }
}
