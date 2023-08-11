package softlon.canales;

import softlon.notificacion.CanalNotificacion;

public class NotificacionPush extends CanalNotificacion {

    private String notificacionPush;
    public NotificacionPush(String nombreCanal,String notificacionPush) {
        super(nombreCanal);
        this.notificacionPush=notificacionPush;
        
    }
    @Override
    public void enviar() {
    System.out.println("Enviando notificacion tipo push "+notificacionPush);
    }
    
}
