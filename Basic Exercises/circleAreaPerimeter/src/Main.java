import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double radius;

        System.out.print("Ingrese el radio del circulo: ");
        radius = reader.nextDouble();

        System.out.println("Area: " + (Math.PI * Math.pow(radius, 2)));
        System.out.println("Perimetro: " + (2 * Math.PI * radius));
    }
}