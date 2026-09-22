package pe.edu.upc.demosi.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "EstadoCoincidencia")
public class EstadoCoincidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadoCoincidencia;

    @Column(name = "nombreEstadoCoincidencia", length = 50, nullable = false)
    private String nombreEstadoCoincidencia;

    @Column(name = "descripcionEstadoCoincidencia", length = 255)
    private String descripcionEstadoCoincidencia;

    public EstadoCoincidencia() {
    }

    public EstadoCoincidencia(Long idEstadoCoincidencia, String nombreEstadoCoincidencia, String descripcionEstadoCoincidencia) {
        this.idEstadoCoincidencia = idEstadoCoincidencia;
        this.nombreEstadoCoincidencia = nombreEstadoCoincidencia;
        this.descripcionEstadoCoincidencia = descripcionEstadoCoincidencia;
    }

    public Long getIdEstadoCoincidencia() {
        return idEstadoCoincidencia;
    }

    public void setIdEstadoCoincidencia(Long idEstadoCoincidencia) {
        this.idEstadoCoincidencia = idEstadoCoincidencia;
    }

    public String getNombreEstadoCoincidencia() {
        return nombreEstadoCoincidencia;
    }

    public void setNombreEstadoCoincidencia(String nombreEstadoCoincidencia) {
        this.nombreEstadoCoincidencia = nombreEstadoCoincidencia;
    }

    public String getDescripcionEstadoCoincidencia() {
        return descripcionEstadoCoincidencia;
    }

    public void setDescripcionEstadoCoincidencia(String descripcionEstadoCoincidencia) {
        this.descripcionEstadoCoincidencia = descripcionEstadoCoincidencia;
    }
}
