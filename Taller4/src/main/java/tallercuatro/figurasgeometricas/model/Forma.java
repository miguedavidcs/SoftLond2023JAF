package main.java.tallercuatro.figurasgeometricas.model;

public abstract class Forma {
    private int dimension;
    
    public Forma(int dimension){
        this.dimension=dimension;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    public abstract void Definicion(int dimension);
    
    
}
