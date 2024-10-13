package oct09102024_Polymorphism.methodoverloading;

public class lab132 {
    // Method Overloading
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        int result = m.add(3,4);
        System.out.println(result);


        String name = m.add("pramod","dutta");
        System.out.println(name);
    }

    }
