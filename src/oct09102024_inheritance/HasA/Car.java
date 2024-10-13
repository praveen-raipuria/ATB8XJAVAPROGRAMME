package oct09102024_inheritance.HasA;

public class Car {
    // Car Has-A Engine, Tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();}}




