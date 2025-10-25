import java.util.*;

public class tableOfaNumber {

    public static void main(String[] args) {
        System.out.println("Enter a Number to get the table: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit = 0;

        for (int i = 1; i <= 10; i++) {
            digit = num * i;
            System.out.print(digit + " ");
        }
        scanner.close();
    }
}
