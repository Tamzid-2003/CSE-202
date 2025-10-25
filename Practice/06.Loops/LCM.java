import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int x = Math.max(a, b);
    int y = a * b;
    int ans = x;
     
    
    for (int i = x; i <= y; i++) {
      if (i % a == 0 && i % b == 0) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
    scanner.close();
  }
}
