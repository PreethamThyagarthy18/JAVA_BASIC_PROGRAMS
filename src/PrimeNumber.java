//Program tom find wheteher the number is prime or not
import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        boolean isPrime=true;

        System.out.println("Enter the number");
        int num=in.nextInt();

        if(num<=1)
        {
            isPrime=false;
        }

        for( int i=2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("The number "+num+" is Prime");
        }
        else {
            System.out.println("The number "+num+" is not Prime");
        }
    }
}
