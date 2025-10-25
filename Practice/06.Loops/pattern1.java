import java.util.*;

public class pattern1 {
    public static void main(String [] args) {
        System.out.println("Enter a Number of row: ");
        try (Scanner scanner = new Scanner(System.in)) {
			int row = scanner.nextInt();
			System.out.println("Enter a Number of column: ");
			int column = scanner.nextInt();
			
			for(int i = 1; i <= row; i++){
			    for(int j = 1; j <= column; j++){
			        System.out.print("* ");
			    }
			    System.out.print("\n");
			}
		}
        
        
    }
}
