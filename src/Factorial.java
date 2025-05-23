//Program to find a factorial of a number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter a number");
        int num=in.nextInt();

        if(num<=0)
        {
            System.out.println("Cannot find the factorial for a negative number");
        }
        long fact=1;
        for( int i=1; i<=num; i++)
        {
          fact*=i;
        }
        System.out.println("The factorial of a number is "+fact);
    }
}
