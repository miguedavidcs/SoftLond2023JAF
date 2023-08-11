package softlon.notificacion;

public abstract class CanalNotificacion implements Notificacion{
    private String nombreCanal;

    public CanalNotificacion(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }
    

    
}
