package pe.edu.upc.demosi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_reporte")
public class EstadoReporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadoReporte;

    @Column(name = "nombre", length = 30, nullable = false, unique = true)
    private String nombre;

    @Column(name = "descripcion", length = 150)
    private String descripcion;

    public EstadoReporte() {}
    public Long getIdEstadoReporte() { return idEstadoReporte; }
    public void setIdEstadoReporte(Long idEstadoReporte) { this.idEstadoReporte = idEstadoReporte; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
