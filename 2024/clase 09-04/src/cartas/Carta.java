package cartas;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Hacer un juego de cartas en el que, al pedir una carta, si se saca del mazo,
 * no se pueda volver a sacar una igual.
 * Funcionalidades:
 * 1) Pedir cartas
 * 2) Comparar
 */

public class Carta {
    private int numero;
    private Palo palo;

    /**
     * Default constructor.
     */
    public Carta() {
    }

    /**
     * Constructor con dos argumentos.
     * @param numero: numero de la carta (del 1 al 12).
     * @param palo: palo de la carta (Copa, Basto, Espada, Oro).
     */
    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * Función que genera el mazo de cartas (sin comodines),
     * combinando los 12 numeros con los 4 palos.
     * @return mazo de 48 cartas.
     */
    public Carta [] generarMazo() {
        //Array de los 4 tipos de palos.
        Palo[] palos = Palo.values();
        //Array vacio donde se almacenarán las 48 cartas.
        Carta [] mazo = new Carta[48];
        //Indice para almacenar las cartas en el mazo.
        int index = 0;

        for(int i = 0; i < 12; i++) {
            for (Palo value : palos) {
                mazo[index] = new Carta(i + 1, value);
                index++;
            }
        }
        return mazo;
    }

    /**
     * Función que transforma la carta combinada entre un número y un palo,
     * transformándola en un String.
     *
     * @return String de la carta
     */
    public String cartaToString() {
        return numero + " de " + palo.toString();
    }

    /**
     * Función que elije un indice aleatorio para sacar una carta del mazo,
     * y luego la pone en null para evitar que se repitan.
     *
     * @param mazo: array de 48 cartas.
     * @return carta aleatoria.
     */
    public Carta pedirCarta (Carta [] mazo) {
        int randomIndex;
        Carta carta;
        do {
            randomIndex = ThreadLocalRandom.current().nextInt(0, 48);
        } while (mazo[randomIndex] == null);
        carta = mazo[randomIndex];
        mazo[randomIndex] = null;
        return carta;
    }
}
