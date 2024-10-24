package oct18102024_Strings;

public class Lab165 {

}
class Super {

    private int a;

    protected Super(int a) {
        this.a = a;
    }
    Super(){

    }

}

class Sub extends Super {

    public Sub(int a) {
        super(a);
    }

    public Sub() {
        super();
    }

}