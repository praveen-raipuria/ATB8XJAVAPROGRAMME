package Task;

public class task20092024_Triangleclassifier {
    public static void main(String[] args) {
        int side1 = 11;
        int side2 = 10;
        int side3 = 13;

        if (side1 == side2 && side1 == side3 && side2==side3)
        {
            System.out.println("Triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2==side3)
        {
            System.out.println(" Triangle is isosceles");
        } else {
            System.out.println("Triangle is not equal");
    }
}}
