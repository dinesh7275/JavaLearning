package oops.inheritence.hierarchical_Inheritance;

public class Vehicle {
    private String mode;
    private  String name;
    private int speed;

    public Vehicle(String mode, String name, int speed) {
        this.mode = mode;
        this.name = name;
        this.speed = speed;
    }
    public void vehicleDetail(){
        System.out.println("This is super class");
        System.out.println("Mode = " + mode);
        System.out.println("Name = " + name);
        System.out.println("Speed = "+ speed);
    }
}
