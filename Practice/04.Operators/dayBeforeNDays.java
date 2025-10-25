import java.util.Scanner;

public class dayBeforeNDays {
    public static void main(String[] args) {
        System.out.println("Enter the current Day in Number(ex.1 = Sunday | 7 = Saturday): ");
        Scanner scanner = new Scanner(System.in);
        int currentDay = scanner.nextInt();
        System.out.println("Enter the Nth Previous day: ");
        int previousDay = scanner.nextInt();

        currentDay = Math.abs(currentDay % 7) - 1;
        previousDay = Math.abs(previousDay % 7);
        // For current days
        switch (currentDay) {
            case 0:
                System.out.println("Current Days is Sunday");
                break;
            case 1:
                System.out.println("Current Days is Monday");
                break;
            case 2:
                System.out.println("Current Days is Tuesday");
                break;
            case 3:
                System.out.println("Current Days is Wednesday");
                break;
            case 4:
                System.out.println("Current Days is Thursday");
                break;
            case 5:
                System.out.println("Current Days is Friday");
                break;
            case 6:
                System.out.println("Current Days is Saturday");
                break;
            default:
                System.out.println("0 can't be a Current Day.");
                break;
        }
        // For previous Days
        switch (currentDay - previousDay) {
            case 0:
                System.out.println("Current Days is Sunday");
                break;
            case 1:
                System.out.println("Current Days is Monday");
                break;
            case 2:
                System.out.println("Current Days is Tuesday");
                break;
            case 3:
                System.out.println("Current Days is Wednesday");
                break;
            case 4:
                System.out.println("Current Days is Thursday");
                break;
            case 5:
                System.out.println("Current Days is Friday");
                break;
            case 6:
                System.out.println("Current Days is Saturday");
                break;
            default:
                break;
        }
        scanner.close();
    }
}
