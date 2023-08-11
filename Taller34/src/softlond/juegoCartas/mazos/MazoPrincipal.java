package softlond.juegoCartas.mazos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import softlond.juegoCartas.cartas.CartasPrincipales;
import softlond.juegoCartas.cartas.enumedor.Palo;
import softlond.juegoCartas.cartas.enumedor.Valor;
import softlond.juegoCartas.cartas.interfaces.Carta;
import softlond.juegoCartas.mazos.interfaces.Mazo;

public class MazoPrincipal implements Mazo {
    private List<Carta> cartas;
    private Random random;
    public MazoPrincipal(boolean revolver){
        cartas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                // agregamos eso ala lista
                cartas.add(new CartasPrincipales(valor, palo));
            }            
        }if(revolver){
            revolverCartas();
        } random = new Random();
    }

    public void revolverCartas() {
        // random de listas shuffle
        Collections.shuffle(cartas);
    }

    @Override
    public Carta sacarCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);            
        }
        return null;
    }
    public Carta sacarCartaAlAzar() {
        if (!cartas.isEmpty()) {
            int index = random.nextInt(cartas.size());
            return cartas.remove(index);
        }
        return null;
    }
    
}
