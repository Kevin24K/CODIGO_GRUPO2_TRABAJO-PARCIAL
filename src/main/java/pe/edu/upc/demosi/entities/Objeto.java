package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Objeto")
public class Objeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObjeto;

    @Column(name = "id_categoria", nullable = false)
    private Long idCategoria;

    @Column(name = "nombreObjeto", length = 100, nullable = false)
    private String nombreObjeto;

    @Column(name = "descripcionObjeto", columnDefinition = "TEXT")
    private String descripcionObjeto;

    @Column(name = "colorObjeto", length = 50)
    private String colorObjeto;

    @Column(name = "marcaObjeto", length = 100)
    private String marcaObjeto;

    @Column(name = "activoObjeto", nullable = false)
    private boolean activoObjeto;

    public Objeto() {
    }

    public Objeto(Long idObjeto, Long idCategoria, String nombreObjeto, String descripcionObjeto, String colorObjeto, String marcaObjeto, boolean activoObjeto) {
        this.idObjeto = idObjeto;
        this.idCategoria = idCategoria;
        this.nombreObjeto = nombreObjeto;
        this.descripcionObjeto = descripcionObjeto;
        this.colorObjeto = colorObjeto;
        this.marcaObjeto = marcaObjeto;
        this.activoObjeto = activoObjeto;
    }

    public Long getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(Long idObjeto) {
        this.idObjeto = idObjeto;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getDescripcionObjeto() {
        return descripcionObjeto;
    }

    public void setDescripcionObjeto(String descripcionObjeto) {
        this.descripcionObjeto = descripcionObjeto;
    }

    public String getColorObjeto() {
        return colorObjeto;
    }

    public void setColorObjeto(String colorObjeto) {
        this.colorObjeto = colorObjeto;
    }

    public String getMarcaObjeto() {
        return marcaObjeto;
    }

    public void setMarcaObjeto(String marcaObjeto) {
        this.marcaObjeto = marcaObjeto;
    }

    public boolean isActivoObjeto() {
        return activoObjeto;
    }

    public void setActivoObjeto(boolean activoObjeto) {
        this.activoObjeto = activoObjeto;
    }
}
