import java.util.ArrayList;
import java.util.List;

import softlon.notificacion.CanalNotificacion;

public class Usuario {
    private String nombre;
    private List<CanalNotificacion> canalesSuscritos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.canalesSuscritos = new ArrayList<>();
    }

    public void suscribirse(CanalNotificacion canal) {
        canalesSuscritos.add(canal);
        System.out.println(nombre + " se ha suscrito a " + canal.getNombreCanal());
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println(nombre + " ha recibido una notificación: " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CanalNotificacion> getCanalesSuscritos() {
        return canalesSuscritos;
    }

    public void setCanalesSuscritos(List<CanalNotificacion> canalesSuscritos) {
        this.canalesSuscritos = canalesSuscritos;
    }
    
    
}
