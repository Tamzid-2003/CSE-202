import java.util.Scanner;

class inputs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("You Entered String " + s);
        int num = scan.nextInt();
        System.out.println("You Entered Integer " + num);
        float f = scan.nextFloat();
        System.out.println("You Entered Float " + f);
        scan.close();
    }
}
