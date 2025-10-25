import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num = Math.abs(num);

        if (num == 0) {
            System.out.println(num + " is not a Even Odd number.");
        } else if (num % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }
        scanner.close();

    }
}
