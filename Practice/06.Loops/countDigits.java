import java.util.*;

public class countDigits {
    public static void main(String [] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digits = 0;
        
        while(num != 0){
            num = num / 10;
            digits++;
        }
        System.out.println("There are " + digits + " digits in this Number.");
        scanner.close();
    }
}