import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1 > 0) {
            System.out.println((num2 <= 0) && (num3 <= 0));
        } else if(num2 > 0) {
            System.out.println(num3 <= 0);
        } else
            System.out.println(true);
    }
}