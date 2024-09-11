package cartas;

import java.util.Scanner;

/**
 * Hacer un juego de cartas en el que, al pedir una carta, si se saca del mazo,
 * no se pueda volver a sacar una igual.
 * Funcionalidades:
 * 1) Pedir cartas
 * 2) Comparar
 */

public class Main {
    public static void main(String[] args) {
        Mazo mazo1 = new Mazo();
        Mazo mazo2 = new Mazo();
        Carta carta1, carta2;
        char option;    // Opcion para acceder o reintentar el juego.
        int equalCounter;   // Contador para informar cuantas cartas iguales se encontraron.
        Scanner input = new Scanner(System.in);

        // Mensaje de introduccion al juego.
        System.out.print("El juego consiste en tomar dos cartas aleatorias de dos mazos" +
                "distintos y compararlas. Esta listo para comenzar? [Y/N]: ");
        option = Character.toLowerCase(input.next().charAt(0));
        equalCounter = 0;

        if (option == 'y') {
            do { // Se piden el par de cartas de los dos mazos diferentes.
                carta1 = mazo1.pedirCarta();
                carta2 = mazo2.pedirCarta();
                // Se informa y sale del juego si no hay mas cartas en el mazo.
                if ((carta1 == null) || (carta2 == null)) {
                    System.out.println("No hay mas cartas en el mazo.");
                    break;
                } // Compara las dos cartas y muestra su resultado.
                if (carta1.equals(carta2)) {
                    System.out.println("Felicitaciones! Ambas son " + carta1.showCarta());
                    equalCounter ++;
                } else
                    System.out.println(carta1.showCarta() + " /= " + carta2.showCarta());
                // Prompt para realizar otra comparacion de cartas.
                System.out.print("Desea sacar otro par de cartas? [Y/N]: ");
                option = Character.toLowerCase(input.next().charAt(0));
            } while (option == 'y');
        }
        // Mensaje del total de cartas iguales y de despedida.
        System.out.println("Usted ha encontrado " + equalCounter + " cartas iguales.");
        System.out.println("Hasta luego!");
    }
}