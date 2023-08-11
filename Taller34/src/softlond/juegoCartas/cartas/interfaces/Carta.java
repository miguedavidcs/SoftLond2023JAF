package softlond.juegoCartas.cartas.interfaces;

import softlond.juegoCartas.cartas.enumedor.Palo;
import softlond.juegoCartas.cartas.enumedor.Valor;

public interface Carta {
    Valor obtenerValor();
    Palo obtenerPalo();
}
