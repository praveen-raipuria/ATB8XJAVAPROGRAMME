package Task.oct;
import java.util.Scanner;

public class task21102024_Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter your String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev + str.charAt(i);
        }

        if ((str.equals(rev)))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

