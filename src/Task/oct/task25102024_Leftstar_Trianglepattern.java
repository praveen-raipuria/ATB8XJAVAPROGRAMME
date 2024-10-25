package Task.oct;

public class task25102024_Leftstar_Trianglepattern {
    public static void main(String[] args) {
        /* write code to print below pattern
//        Important Pattern
         *****
         ****
         ***
         **
         *


         */
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


