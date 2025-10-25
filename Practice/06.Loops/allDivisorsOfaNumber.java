import java.util.Scanner;

public class allDivisorsOfaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 1;
        while (i <= input) {
            if (input % i == 0) {
                System.out.print(i + " ");
                }
            i++;
        }
        scanner.close();
    }
}
