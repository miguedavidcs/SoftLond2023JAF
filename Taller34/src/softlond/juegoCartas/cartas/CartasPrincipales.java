package softlond.juegoCartas.cartas;

import softlond.juegoCartas.cartas.enumedor.Valor;
import softlond.juegoCartas.cartas.enumedor.Palo;
import softlond.juegoCartas.cartas.interfaces.Carta;

public class CartasPrincipales implements Carta {
    private Valor valor;
    private Palo palo;
    
    public CartasPrincipales(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }
    @Override
    public Valor obtenerValor() {
        return valor;
    }
    @Override
    public Palo obtenerPalo() {
        return palo;
    }
    
    
}
