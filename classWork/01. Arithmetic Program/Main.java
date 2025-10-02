import java.util.Scanner;

public class Main {
    static int factorial(int num) {
        int fact = 1;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            fact *= i;
            sum += fact;

        }
        System.out.println("Factorial of " + num + " is: " + sum);
        return fact;
    }

    static void prime(int num) {
        if (num == 2) {
            System.out.println(num + " is a prime Number.");
        } else if (num > 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime Number.");
                } else {
                    System.out.println(num + " is a prime Number.");
                }
            }
        } else {
            System.out.println(num + "is not a prime Number.");
        }
    }

    static void perfect(int num) {
        int temp = 0;
        if (num > 0) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    temp += i;
                }
            }
            if (num == temp) {
                System.out.println(num + " is a perfect number.");
            } else {
                System.out.println(num + " is a not perfect number.");
            }
        } else {
            System.out.println(num + " is a not perfect number.");
        }
    }

    static void strong(int num) {
        int temp = 0;
        int i = num;

        while (i > 0) {
            temp += factorial(i % 10);
            i = i / 10;
        }
        if (num == temp) {
            System.out.println(num + " is a strong Number.");
        } else {
            System.out.println(num + " is not a strong Number.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean wrongInput = true;
        while (wrongInput) {
            System.out.print(
                    "Enter what operation you want to execute: \n1. Sum of a Factorial Number\n2. Determine a Prime Number\n3. Determine a Perfect Number\n4. Determine a Strong Number\nEnter (1 to 4 or 0 for Exit): ");
            input = scanner.nextInt();
            if (input >= 0 && input <= 4) {
                wrongInput = false;

            }
        }

        if (input == 0) {
            System.out.println("Exit.");
            System.exit(10);

        }

        switch (input) {
            case 1:
                System.out.println("To Determine the sum of a Factorial Number Enter a Number: ");
                input = scanner.nextInt();
                factorial(input);
                break;
            case 2:
                System.out.println("To Determine Prime Number Enter a Number: ");
                input = scanner.nextInt();
                prime(input);
                break;
            case 3:
                System.out.println("To Determine Perfect Number Enter a Number: ");
                input = scanner.nextInt();
                perfect(input);
                break;
            case 4:
                System.out.println("To Determine Strong Number Enter a Number: ");
                input = scanner.nextInt();
                strong(input);
                break;
            default:
                break;
        }

        scanner.close();
    }
}
