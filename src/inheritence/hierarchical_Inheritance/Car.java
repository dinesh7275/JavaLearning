package inheritence.hierarchical_Inheritance;

public class Car extends Vehicle{
    private String modelName;
    public Car(String mode, String name, int speed, String modelName) {
        super(mode, name, speed);
        this.modelName=modelName;
    }
    public void show()
    {
        super.vehicleDetail();
        System.out.println("This is sub class");

        System.out.println("Model Name = " + modelName);
    }
}
