import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = 1;
        int x = Math.min(a, b);

        for (int i = 1; i <= x; i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
