package pe.edu.upc.demosi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "objeto")
public class Objeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObjeto;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "marca", length = 80)
    private String marca;

    @Column(name = "activo", nullable = false)
    private boolean activo;

    public Objeto() {}
    public Long getIdObjeto() { return idObjeto; }
    public void setIdObjeto(Long idObjeto) { this.idObjeto = idObjeto; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}
