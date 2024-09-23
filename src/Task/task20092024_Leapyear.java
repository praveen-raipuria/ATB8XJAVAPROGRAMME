package Task;

public class task20092024_Leapyear {
    public static void main(String[] args) {
        int year=2024;
        boolean leap_year=false;
        if((year%4==0 && year%100 !=0) || (year%400==0)){
            leap_year= true;
        }
        if(leap_year){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
