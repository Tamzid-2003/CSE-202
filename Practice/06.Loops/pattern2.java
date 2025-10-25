import java.util.*;

public class pattern2 {

    public static void main(String[] args) {
        System.out.println("Enter a Number of row: ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.println("Enter a Number of column: ");
        int column = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}
