package cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas = new ArrayList<>(48);
    private int index;

    /**
     * Constructor
     */
    public Mazo() {
        index = 0;
        for (Numero numeros : Numero.values()) {
            for (Palo palos : Palo.values()) {
                cartas.set(index, new Carta(numeros, palos));
                index ++;
            }
        }
    }

    /**
     * Saca una carta de un mazo de cartas mezclado. Las mismas no se repiten
     * luego de ser sacadas, ya que su valor pasa a ser null.
     *
     * @return carta del mazo.
     */
    public Carta pedirCarta() {
        //Si el indice es menor a cero, no devuelve ninguna carta.
        if(index < 0) {
            System.out.println("No hay mas cartas en el mazo.");
            return null;
        }
        //Mezcla las cartas.
        Collections.shuffle(cartas);

        //Guarda la ultima carta del mazo mezclado.
        Carta cartaPedida = cartas.get(index);

        //Pone su valor en null para que luego no se repita.
        cartas.set(index, null);
        index--;

        return cartaPedida;
    }
}
