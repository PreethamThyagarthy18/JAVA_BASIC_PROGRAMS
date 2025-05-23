import java.util.Scanner;
public class SwappingANumber
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the first Number");
        int num1=in.nextInt();

        System.out.println("Enter the Second Number");
        int num2=in.nextInt();

        System.out.println("Before Swapping :" +num1+ ", " +num2);

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After Swapping :" +num1+ ", " +num2);


    }
}
