import java.util.Scanner;

public class pyramidPattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int i = 1;
    while (i <= n) {
      int j = 1;
      while (j <= (n - 1)) {
        System.out.print(" ");
        j++;
      }
      int k = 1;
      while (k <= (2 * (i - 1))) {
        System.out.print("*");
        k++;
      }
      i++;
      System.out.println();
    }
    scanner.close();
  }
}
