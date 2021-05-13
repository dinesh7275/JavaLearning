package inheritence.hierarchical_Inheritance;

public class Truck extends Vehicle{
    private String truckName;

    public Truck(String mode, String name, int speed, String truckName) {
        super(mode, name, speed);
        this.truckName = truckName;
    }
    public void display(){
        super.vehicleDetail();
        System.out.println("This is sub class");
        System.out.println("Truck Name = " + truckName);

    }
}
