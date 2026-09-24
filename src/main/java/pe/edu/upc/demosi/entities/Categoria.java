package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(mappedBy = "categoria")
    private List<Objeto> objetos;

    public Categoria() {
    }

    public Categoria(Long idCategoria, String nombreCategoria, String descripcionCategoria, boolean activoCategoria, List<Objeto> objetos) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.activoCategoria = activoCategoria;
        this.objetos = objetos;
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

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }
}
