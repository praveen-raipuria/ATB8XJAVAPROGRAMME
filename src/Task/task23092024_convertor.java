package Task;
/* Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit)
based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c
*/

public class task23092024_convertor {
    public static void main(String[] args) {
        //LET user inputs be 1-km to m, 2-m to km, 3-C to F, 4-F to C
        int choice =3;
        float number = 90;
        switch(choice){
            case 1:
                System.out.println("Input number " + number + " km");
                System.out.println("Kilometer to Metre Conversion");
                float output_m = number * 1000;
                System.out.printf("After Conversion " + output_m + " m" );
                break;
            case 2:
                System.out.println("Input number " + number + " m");
                System.out.println("Metres to Kilometer Conversion");
                float output_km = number/1000;
                System.out.printf("After Conversion " + output_km + " km");
                break;
            case 3:
                System.out.println("Input number " + number + " C");
                System.out.println("Celsius to Fahrenheit Conversion");
                float output_F = (number * (float)9/5 + 32);
                System.out.printf("After Conversion " + output_F + " F" );
                break;
            case 4:
                System.out.println("Input number " + number + " F");
                System.out.println("Fahrenheit to Celsius Conversion");
                float output_C =(number-32) * (float)5/9;
                System.out.printf("After Conversion " + output_C + " C");
                break;
            default:
                System.out.printf("Invalid Input");
                break;
    }
}}
