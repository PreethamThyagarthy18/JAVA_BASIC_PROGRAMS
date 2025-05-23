//Program to find the Fibonacci of a series
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = in.nextInt();

        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }
}
