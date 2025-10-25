import java.util.Scanner;

public class nthTermofAP {
    public static void main(String[] args) {

        System.out.println("Enter the Number from where the arithmetic progression Start: ");
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();

        System.out.println("Enter the difference Number of progression: ");
        int diffNumber = scanner.nextInt();

        System.out.println("Enter the Nth term to Progress: ");
        int nthNumber = scanner.nextInt();

        for (int i = 1; i < nthNumber; i++) {
            startNumber += diffNumber;
        }
        System.out.println("The arithmetic Progression is " + startNumber);

        scanner.close();
    }
}
