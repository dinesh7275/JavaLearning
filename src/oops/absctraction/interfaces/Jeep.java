package oops.absctraction.interfaces;

public class Jeep extends Car implements  CarFeatures,Vehicle{
    @Override
    public void musicSystem() {
        System.out.println("JBL System");


    }

    @Override
    public void color() {
        System.out.println("Red");
    }

    @Override
    public void type() {
        System.out.println("This is interface Vehicle");
    }
}
