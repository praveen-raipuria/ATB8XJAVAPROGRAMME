package Task.oct;

public class task21102024_Reverse_of_a_String {
    //  Reverse the String without using the any functions. (for loop)
    public static void main(String[] args) {

        String str="Praveen";
        String nstr="";
        char ch;

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Original Word = " + str);
        System.out.println("Reversed Word = " + nstr);


    }
}

