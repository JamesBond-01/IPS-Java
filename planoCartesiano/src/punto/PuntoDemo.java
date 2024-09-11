package punto;

import java.util.Scanner;

public class PuntoDemo {
    public static void main(String[] args) {
        // Crea el objeto para obtenener el input.
        Scanner input = new Scanner(System.in);
        //Arma el array con la cantidad que elige el usuario.
        System.out.print("Cuantos puntos desea ingresar?: ");
        int cantPuntos = input.nextInt();
        Punto[] puntos = new Punto[cantPuntos];
        //Pide los valores de cada punto.
        for (int i = 0; i < cantPuntos; i++) {
            puntos[i] = new Punto();
            System.out.println("\npunto.Punto " + (i + 1));
            System.out.print("Ingrese el valor de x: ");
            puntos[i].setX(input.nextDouble());
            System.out.print("Ingrese el valor de y: ");
            puntos[i].setY(input.nextDouble());
        }
        //Muestra todos los puntos.
        System.out.println("\nPunto ingresados:");
        for (int i = 0; i < cantPuntos; i++) {
            System.out.println("punto.Punto " + (i + 1) + " = (" + puntos[i].getX() + ", " + puntos[i].getY() + ")");
        }
        //Calcula la distancia entre dos puntos.
        System.out.print("\nEntre qué puntos desea calcular la distancia? [1 - " + cantPuntos + "]\n" +
                "Punto 1: ");
        int selecPunto1 = input.nextInt();
        System.out.print("Punto 2: ");
        int selecPunto2 = input.nextInt();
        if(selecPunto1 > cantPuntos) {
            do {
                System.out.println("Seleccione un valor válido [1 - " + cantPuntos + "]");
                selecPunto1 = input.nextInt();
            } while (selecPunto1 > cantPuntos);
        } else if (selecPunto2 > cantPuntos) {
            do {
                System.out.println("Seleccione un valor válido [1 - " + cantPuntos + "]");
                selecPunto2 = input.nextInt();
            } while (selecPunto2> cantPuntos);
        } else {
            System.out.println("Distancia entre punto " + selecPunto1 + " y " + selecPunto2 + " = " +
                    puntos[selecPunto1 - 1].distance(puntos[selecPunto2 - 1]));
        }
    }
}