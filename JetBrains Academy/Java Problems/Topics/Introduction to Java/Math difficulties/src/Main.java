import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scanner.nextInt();
        System.out.println("Input second number: ");
        int b = scanner.nextInt();
        System.out.println("Result: " + (a - b));
    }
}