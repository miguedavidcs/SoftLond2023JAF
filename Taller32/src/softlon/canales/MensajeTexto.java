package softlon.canales;

import softlon.notificacion.CanalNotificacion;

public class MensajeTexto extends CanalNotificacion{
    private String numeroDestino;

    public MensajeTexto(String nombreCanal, String numeroDestino) {
        super(nombreCanal);
        this.numeroDestino = numeroDestino;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando msm al número " + numeroDestino);
    }
    
}
