import java.util.Scanner;

public class nthTermOfGP {
    public static void main(String[] args) {

        System.out.println("Enter the Number from where the Geometric progression Start: ");
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();

        System.out.println("Enter the difference Number of progression: ");
        int diffNumber = scanner.nextInt();

        System.out.println("Enter the Nth term to Progress: ");
        int nthNumber = scanner.nextInt();

        startNumber = startNumber * (int) Math.pow(diffNumber, nthNumber - 1);

        System.out.println("The Geometric Progression is " + startNumber);
        scanner.close();
    }
}
