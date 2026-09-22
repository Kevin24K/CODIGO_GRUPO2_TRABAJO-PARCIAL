package pe.edu.upc.demosi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_coincidencia")
public class EstadoCoincidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadoCoincidencia;

    @Column(name = "nombre", length = 30, nullable = false, unique = true)
    private String nombre;

    @Column(name = "descripcion", length = 150)
    private String descripcion;

    public EstadoCoincidencia() {}
    public Long getIdEstadoCoincidencia() { return idEstadoCoincidencia; }
    public void setIdEstadoCoincidencia(Long idEstadoCoincidencia) { this.idEstadoCoincidencia = idEstadoCoincidencia; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
