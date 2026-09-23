package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Estado_Reporte")
public class EstadoReporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadoReporte;

    @Column(name = "nombreEReporte", length = 50, nullable = false)
    private String nombreEReporte;

    @Column(name = "descripcionEReporte", length = 255)
    private String descripcionEReporte;

    @OneToMany(mappedBy = "estadoReporte")
    private List<Reporte> reportes;

    public EstadoReporte() {
    }

    public EstadoReporte(Long idEstadoReporte, String nombreEReporte, String descripcionEReporte, List<Reporte> reportes) {
        this.idEstadoReporte = idEstadoReporte;
        this.nombreEReporte = nombreEReporte;
        this.descripcionEReporte = descripcionEReporte;
        this.reportes = reportes;
    }

    public Long getIdEstadoReporte() {
        return idEstadoReporte;
    }

    public void setIdEstadoReporte(Long idEstadoReporte) {
        this.idEstadoReporte = idEstadoReporte;
    }

    public String getNombreEReporte() {
        return nombreEReporte;
    }

    public void setNombreEReporte(String nombreEReporte) {
        this.nombreEReporte = nombreEReporte;
    }

    public String getDescripcionEReporte() {
        return descripcionEReporte;
    }

    public void setDescripcionEReporte(String descripcionEReporte) {
        this.descripcionEReporte = descripcionEReporte;
    }

    public List<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(List<Reporte> reportes) {
        this.reportes = reportes;
    }
}
