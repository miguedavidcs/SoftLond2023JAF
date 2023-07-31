package com.practicepersonal.softlond.model;
/**
 * Representacion una persona
 * @author Miguel David Castaño Salgado
 * @version 1.0.0
 */
public class Persona {
    //Variables
    private Integer id;
    private String nombre;
    /**
     * Constructor vacio
     */
    public Persona() {
    }
    /**
     * Constructor
     * @param id id de la persona
     * @param nombre nombre de la persona
     */
    public Persona(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    // los metodos Getter and Setter
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodos HashCode/equals
     * Solo id, considero dos objetos 
     * de tipo persona son iguales 
     * si su id coninciden
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    /**  Mostrara los valores de los miembros
    * del objeto de tipo persona
    */
    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + "]";
    }
    
    
    
    
    
}
