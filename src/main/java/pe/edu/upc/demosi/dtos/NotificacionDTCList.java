package pe.edu.upc.demosi.dtos;

public class NotificacionDTCList {

    private long idNotificacion;
    private String nombreNotificacion;
    private String descripcionNotificacion;
    private boolean activoNotificacion;

    public long getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(long idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getNombreNotificacion() {
        return nombreNotificacion;
    }

    public void setNombreNotificacion(String nombreNotificacion) {
        this.nombreNotificacion = nombreNotificacion;
    }

    public String getDescripcionNotificacion() {
        return descripcionNotificacion;
    }

    public void setDescripcionNotificacion(String descripcionNotificacion) {
        this.descripcionNotificacion = descripcionNotificacion;
    }

    public boolean isActivoNotificacion() {
        return activoNotificacion;
    }

    public void setActivoNotificacion(boolean activoNotificacion) {
        this.activoNotificacion = activoNotificacion;
    }
}
