//Program to find a number is even or add
import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
    Scanner in= new Scanner(System.in);



        System.out.println("Enter a Number");
        int num=in.nextInt();

        if( num%2==0)
        {
            System.out.println("The number "+num+ " is Even");
        }
        else {
            System.out.println("The number "+num+ " is Odd");
        }


}
}