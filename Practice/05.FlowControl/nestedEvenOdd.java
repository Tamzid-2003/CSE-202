import java.util.Scanner;

public class nestedEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The Number is Positive Even.");
            } else {
                System.out.println("The Number is Positive Odd.");
            }
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println("The Number is Negative Even.");
            } else {
                System.out.println("The Number is Negative Odd.");
            }
        } else {
            System.out.println("0 can't be determine as Even Or Odd.");
        }
        scanner.close();
    }

}
