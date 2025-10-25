import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 1;
        while (input > 0) {
            sum = sum * input;
            input--;
        }
        System.out.println(sum);
        scanner.close();
    }
}
