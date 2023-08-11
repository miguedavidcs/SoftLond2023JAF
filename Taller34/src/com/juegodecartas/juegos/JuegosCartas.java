package com.juegodecartas.juegos;

import softlond.juegoCartas.cartas.interfaces.Carta;
import softlond.juegoCartas.mazos.interfaces.Mazo;

public class JuegosCartas {
    private Mazo mazo;

    public JuegosCartas(Mazo mazo) {
        this.mazo = mazo;
    }

    public void jugar() {
        Carta cartaUsuario = mazo.sacarCartaAlAzar();
        Carta cartaMaquina = mazo.sacarCartaAlAzar();

        if (cartaUsuario == null || cartaMaquina == null) {
            System.out.println("No quedan cartas en el mazo.");
            return;
        }

        System.out.println("Tu carta: " + cartaUsuario.obtenerValor() + " de " + cartaUsuario.obtenerPalo());
        System.out.println("Carta de la máquina: " + cartaMaquina.obtenerValor() + " de " + cartaMaquina.obtenerPalo());

        // Implementa la lógica de comparación y muestra el resultado del juego
        int resultado = cartaUsuario.obtenerValor().compareTo(cartaMaquina.obtenerValor());
        if (resultado > 0) {
            System.out.println("Ganaste!");
        } else if (resultado < 0) {
            System.out.println("Perdiste...");
        } else {
            System.out.println("Es un empate.");
        }
    }
}
