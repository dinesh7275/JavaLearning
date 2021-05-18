package oops.inheritence;

public class Vehicle {
    private String make;
    private String color;
    private int year;
    private String model;

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }
    public void printDetails()
    {
        System.out.println("Manufacturer =" + make);
        System.out.println("Color ="+color);
        System.out.println("Year ="+ year);
        System.out.println("Model =" + model);
    }
}
class Car extends Vehicle{
    private String bodyStyle;

    public Car(String make, String color, int year, String model,String bodyStyle ) {
        super(make, color, year, model);
        this.bodyStyle=bodyStyle;

    }

    public void show()
    {
       super.printDetails();
       // printDetails();
        System.out.println("BodyStyle =" + bodyStyle);
    }
}
class Main{
    public static void main(String args[]){
        Car x=new Car("Hyundai", "Red", 2019, "Elantra", "Sedan");
      //  x.printDetails();
        x.show();
    }
}