package cartas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Carta [] mazo = new Carta().generarMazo();

        for (Carta carta : mazo) {
            System.out.println(carta.cartaToString());
        }
    }
}
