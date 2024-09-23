package Task;

public class task23092024_simplecalculator_using_switch {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;
        char ch = '*';
        switch (ch) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operation not mentioned");
    }
}}
