//program to reverse a Number
//To find a Palindrome
import java.util.Scanner;
public class ReverseANumber
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter a Number");
        int num=in.nextInt();

        int original=num;
        int reversed=0;
        System.out.println("The original number is  "+original);

        while(num>0)
        {
            int digit=num%10; //To get the last digit
            reversed=reversed*10+digit; //To build the reversed number
            num=num/10;       //To remove the last digit
        }
        System.out.println("The reverse of a Number is "+reversed);
    }
}
/*
if(original==reversed)
{
sout("Palindrome")      //Same with the string also
}
*/