package Task;

public class task18092024 {
    public static void main(String[] args) {

            /* Q1: Give some another example of Widening with Implicit and Explicit,
               Narrowing with implicit and explicit.
        */
        //Narrowing
        int ch1 = 97878;
        // char ch2 = ch1;  // Implicit type -> Invalid as it can't be converted by JVM


       char ch2 = (char)ch1; //Explicit type ->without any data loss
        System.out.println(ch2);

        //Widening
        char ch3 = '^';
        int ch4 = ch3; //Implicit type -> valid as it is converted by JVM
        System.out.println(ch4);
        ch4 = (int)ch3; //Explicit type
        System.out.println(ch4);

        /* Q2: Find the output of
               int a = 10;
               System.out.println(  --a + a --  + a--);
               System.out.println(a);
           Ans: Expression = --10 + 9-- + 8-- = 9 + 9 + 8 = 26
                a = --10 -> 9-- -> 8-- = 7
         */
        int a = 10;
        System.out.println(--a + a -- + a--);
        System.out.println(a);

        /* Q3: Find the output of
               int b = 10;
               System.out.println(--b + b++ + b--);
               System.out.println(b);
           Ans: Expression = --10 + 9++ + 10-- = 9 + 9 + 10 = 28
                b = --10 -> 9++ -> 10-- = 9
         */
        int b = 10;
        System.out.println(--b + b++ + b--);
        System.out.println(b);

        /* Q4: Find the output of
               int c = 10;
               System.out.println(c-- + c-- + c--);
               System.out.println(c);
           Ans: Expression = 10-- + 9-- + 8-- = 10 + 9 + 8 = 27
                c = 10-- -> 9-- -> 8-- = 7
         */
        int c = 10;
        System.out.println(c-- + c-- + c--);
        System.out.println(c);
    }
}
/*
     // Examples of Widening and Narrowing


        // Widening - Implicit
        byte b = 50;
        int a = b;

        //Widening - Explicit
        int a1 = (int)b;   // Valid - Explicit Casting - JVM - line 11 and line 12 are same

        // Narrowing - Implicit
        int val = 500;
        //byte b1 = val;    // Invalid - Implicit casting - JVM

        //Narrowing - Explicit
        byte b2 = (byte) val;  // Explicit casting - Loss of data - The data will be stored to byte howmuchever it can hold, rest of the data will not be stored
        System.out.println(b2);  // -12 as only the last 8 bits of the 32 bits of 500 are stored which has the value -12



public class Task002 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a-- + a--);
        System.out.println(a);
        // A = --a = 10-1=9
        // B = a-- = 9-1=8
        // C = a-- = 8-1=7
        // line no. / a  / ep
        //5         / 10/ NA
        //6         /9+9+8=26
        //7         /7

        output1 -26
        output2-7


public class Task003 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + a--);
        System.out.println(a);
        // A = --a = 9
        // B = a++ = 9+1=10
        // C = a-- = 10-1=9
        //line no / a / exp
        //5       / 10 / NA
        //6       / 9+9+10=28
        //7       / 9
    }


}

Output : 28, 9

public class Task004 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a-- + a--+ a--);
        System.out.println(a);
        // A = a-- = 10-1=9
        // B = a-- = 9-1=8
        //C = a-- = 8-1=7
        // line no. / a / expression
        // 5        / 10 / NA
        // 6        / 10+9+8=27
        // 7        / 7

    }
}

Output: 27, 7




    }

}









 */