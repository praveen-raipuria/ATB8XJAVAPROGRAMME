package oct09102024_Polymorphism.methodoveriding.real;

public class Lab134 {
    public static void main(String[] args) {
        Praveen p = new Praveen();
        p.home();

        Father f  = new Father();
        f.home();
//

        // Dynamic Dispatch
        Father object = new Praveen();
        object.home();

        // WebDriver driver = new ChromeDriver();

        // Not possible
        // Pramod object = new Father();

    }}
