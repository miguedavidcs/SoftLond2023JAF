package softlond.juegoCartas.mazos.interfaces;

import softlond.juegoCartas.cartas.interfaces.Carta;

public interface Mazo {
    Carta sacarCarta();
    Carta sacarCartaAlAzar();
    void revolverCartas();
}
