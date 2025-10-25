import java.util.Scanner;

public class lastDigit {

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 0;
        int i = 10;
        // for positive number
        if (num > temp) {
            if (i < num) {
                temp = num % i;
            } else {
                temp = num;
            }
        } else {
            if (i > num) {
                temp = num % i;
                temp = Math.abs(temp);
            } else {
                temp = num;
                temp = Math.abs(temp);
            }
        }
        System.out.println("The last Number is " + temp);
        scanner.close();
    }
}
