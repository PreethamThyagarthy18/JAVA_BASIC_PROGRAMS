import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b; // Remainder
            a = temp;
        }

        System.out.println("GCD is: " + a);
    }
}
