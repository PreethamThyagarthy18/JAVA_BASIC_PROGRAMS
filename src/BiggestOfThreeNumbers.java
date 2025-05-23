//Biggest of three numbers
import java.util.Scanner;
public class BiggestOfThreeNumbers
{
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1=in.nextInt();

        System.out.println("Enter the Second number");
        int num2=in.nextInt();

        System.out.println("Enter the Third number");
        int num3=in.nextInt();

        int largest;
        if(num1>num2 && num1>num3)
        {
            largest=num1;
        }
        else if( num2>num3)
        {
            largest=num2;
        }
        else {
            largest=num3;
        }
        System.out.println("The largest Number is "+largest);

    }
}
