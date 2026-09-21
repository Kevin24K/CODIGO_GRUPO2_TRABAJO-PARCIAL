package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(name = "nombreCategoria", length = 100, nullable = false)
    private String nombreCategoria;

    @Column(name = "descripcionCategoria", length = 255)
    private String descripcionCategoria;

    @Column(name = "activoCategoria", nullable = false)
    private boolean activoCategoria;

    public Categoria() {
    }

    public Categoria(Long idCategoria, String nombreCategoria, String descripcionCategoria, boolean activoCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.activoCategoria = activoCategoria;
    }

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
