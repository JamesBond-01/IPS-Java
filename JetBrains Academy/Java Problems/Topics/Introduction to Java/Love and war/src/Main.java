import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre: ");
        String name1 = scanner.next();
        System.out.println("Ingrese el primer nombre: ");
        String name2 = scanner.next();
        System.out.println("All's fair in " + name1 + " and " + name2 + ".");
    }
}