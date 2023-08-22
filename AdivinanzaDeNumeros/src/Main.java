import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double generatedNumber = Math.random() ;
        int randNumber = (int) (1 + generatedNumber * 100);
        Scanner input = new Scanner(System.in); //Buffer
        int inputNumber;
        int reps = 0;

        System.out.print("Ingrese un numero entre 1 y 100: ");
        inputNumber = input.nextInt();
        if(inputNumber != randNumber) {
            do {
                if(inputNumber < randNumber) {
                    System.out.print("El numero es mayor. Ingrese un nuevo valor: ");
                } else {
                    System.out.print("El numero es menor. Ingrese un nuevo valor: ");
                }
                inputNumber = input.nextInt();
                reps ++;
            } while (inputNumber != randNumber);
        }
        reps ++;
        System.out.println("Ganaste en " + reps + " intentos!");
    }
}