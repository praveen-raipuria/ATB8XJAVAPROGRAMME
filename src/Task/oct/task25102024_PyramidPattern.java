package Task.oct;

public class task25102024_PyramidPattern {
    public static void main(String[] args) {
        /* write code to print below pattern
//        Important Pattern

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *

         */
        for (int i = 1; i < 9; i++)
        {
            for (int k = (9 - i); k >= 1; k--)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

