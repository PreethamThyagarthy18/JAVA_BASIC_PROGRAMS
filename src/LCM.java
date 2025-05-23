import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int originalA = a;
        int originalB = b;

        // GCD using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (originalA * originalB) / gcd;

        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);

    }
}
