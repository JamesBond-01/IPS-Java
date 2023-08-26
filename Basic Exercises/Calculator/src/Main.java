import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operation;
        char restart;
        Scanner input = new Scanner(System.in);

        do {
            operation = selecOperation(input);
            if(operation < 1 || operation > 6) {
                System.out.println("La operacion seleccionada no corresponde a ninguna opcion.");
            } else {
                calculator(operation, input);
            }
            System.out.print("Desea reintentar? [Y/N]: ");
            restart = Character.toLowerCase(input.next().charAt(0));
        } while(restart == 'y');
    }

    static int selecOperation(Scanner input) {
        int option;

        System.out.println("Ingrese:");
        System.out.println("\t1. Sumar.");
        System.out.println("\t2. Restar.");
        System.out.println("\t3. Multiplicar.");
        System.out.println("\t4. Dividir.");
        System.out.println("\t5. Potencia.");
        System.out.println("\t6. Raiz cuadrada.");
        System.out.print("\t>>> ");
        option = input.nextInt();

        return option;
    }

    static void calculator(int operation, Scanner input) {
        int num1, num2;

        if(operation == 6) {
            System.out.print("Ingrese el numero: ");
            num1 = input.nextInt();
            System.out.println("Sqrt(" + num1 + ") = " + Math.sqrt(num1));
            return;
        } else {
            System.out.print("Ingrese el primer numero: ");
            num1 = input.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = input.nextInt();

        }
        switch (operation) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
                break;
            case 4:
                System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
                break;
            case 5:
                System.out.println(num1 + "^" + num2 + " = " + Math.pow(num1,num2));
                break;
            default:
                break;
        }
    }
}

