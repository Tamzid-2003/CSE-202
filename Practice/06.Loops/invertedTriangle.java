import java.util.*;

public class invertedTriangle{
    public static void main(String [] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        for(int i = 1; i <= num; i++){
            
            for(int j = num -i; j > 0; j--){
                System.out.print(" ");
            }
            
            for(int k = 1; k <=i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
