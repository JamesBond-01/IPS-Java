import java.util.Random;

public class Mazo {
    private final Carta [] cartas = new Carta[48];
    private int index;

    /**
     * Constructor
     */
    public Mazo() {
        index = 0;
        // Genera el mazo con cada palo y número declarado en los Enum.
        for (Numero numeros : Numero.values()) {
            for (Palo palos : Palo.values()) {
                cartas[index] = new Carta(numeros,palos);
                index ++;
            }
        }
    }

    /**
     * Funcion que selecciona una posicion aleatoria del mazo de cartas y devuelve la carta
     * en dicha posicion. Luego, ese lugar se pone en null, para evitar que la carta vuelva
     * a salir.
     *
     * @return carta del mazo.
     */
    public Carta pedirCarta() {
        // Carta que se va a retornar.
        Carta cartaPedida;
        // Generador del numero aleatorio.
        Random randomNumber = new Random();
        // Índice aleatorio en el que va a estar la carta.
        int randomIndex;
        //Si el índice es cero menor a cero, no devuelve ninguna carta.
        index--;
        if(index <= 0) {
            return null;
        }
        // Toma un valor aleatorio de la carta y la almacena para retornar,
        // siempre y cuando esa carta no tenga valor null.
        do {
            randomIndex = randomNumber.nextInt(0, 47);
            cartaPedida = cartas[randomIndex];
        } while (cartas[randomIndex] == null);
        // Pone su valor en null para que luego no se repita.
        cartas[randomIndex] = null;
        // Retorna la carta del mazo.
        return cartaPedida;
    }
}
