package oops.inheritence;

public class TransportMultiLevel {
    private int speed;

    public TransportMultiLevel(int speed) {
        this.speed = speed;
    }
    public void show()
    {
        System.out.println("This is the super class ");
    }
}
class Jeep extends TransportMultiLevel
{
private String name;
    public Jeep(int speed, String name) {
        super(speed);
        this.name=name;
    }
    public void show(){
        super.show();
        System.out.println("this is the sub class of TransportMultilevel");
    }
}
class Thar extends Jeep{
     private String model;
    public Thar(int speed, String name, String model) {
        super(speed, name);
        this.model=model;
    }
    public void print()
    {
        super.show();
      //  System.out.println("This is the sub class of jeep");
    }
}

class Execute{
    public  static void  main(String args[]){
        Thar th= new Thar(70,"Dinesh","XYZ");
        th.print();
    }
}