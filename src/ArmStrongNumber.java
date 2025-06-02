//Armstrong number
import java.util.Scanner;
public class ArmStrongNumber
{
    public static void main(String[] args)

    {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter a three digit number");

        int num=in.nextInt();

        int original=num;
        int sum=0;

        System.out.println("The original number is "+num);

        while(num>0)
        {
            int digit=num%10; //To get the last digit of a number
            sum=sum+(digit*digit*digit); //To find the digit of the each number
            num=num/10; //To remove the last digit

        }
        if(original==sum)
        {
            System.out.println("The number "+original+ " is a ArmStrong Number");
        }
        else
        {
            System.out.println("The number "+original+ " is not a ArmStrong Number");
        }

    }
}
