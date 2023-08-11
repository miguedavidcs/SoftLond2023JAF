package softlon.canales;

import softlon.notificacion.CanalNotificacion;

public class CorreoElectronico extends CanalNotificacion{
       

    private String dirreccionCorreo;

    
    public CorreoElectronico(String nombreCanal,String dirreccionCorreo) {
        super(nombreCanal);
        this.dirreccionCorreo= dirreccionCorreo;
        
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando mail " + dirreccionCorreo);

    }

    
    
}
