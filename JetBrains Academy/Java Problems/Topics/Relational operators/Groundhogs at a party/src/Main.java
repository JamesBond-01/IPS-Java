import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pbcQuantity = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if((pbcQuantity >= 15) && (pbcQuantity <= 20)) {
            System.out.println(true);
        } else if((pbcQuantity < 10) || (pbcQuantity > 25)) {
            System.out.println(false);
        } else {
            if((isWeekend)) {
                System.out.println(pbcQuantity >= 15);
            } else {
                System.out.println(pbcQuantity <= 20);
            }
        }
    }
}