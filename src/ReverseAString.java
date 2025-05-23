//program to reverse a String
//To find a Palindrome
import java.util.Scanner;
public class ReverseAString
{
    public static void main(String[] args)
    {
     Scanner in=new Scanner(System.in);

        System.out.println("Enter a String");
        String string=in.nextLine();

        String original=string;
        String reversed="";

        System.out.println("The original String is "+string);

        for(int i=original.length()-1;i>=0;i--)
        {
            reversed=reversed+original.charAt(i);
        }
        System.out.println("The reversed String is "+reversed);

    }
}
