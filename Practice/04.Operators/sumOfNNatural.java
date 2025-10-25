import java.util.Scanner;

public class sumOfNNatural {
    public static void main(String[] args) {
        System.out.println("Enter a Natural Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        if (num < 1) {
            System.out.println("You Entered Wrong Number.");
        } else {
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("You Entered " + num + ",  The sum of all Natural Number of " + num + " is " + sum);
        }
        scanner.close();
    }
}
