package oops.absctraction.interfaces;

public class Car {
    public void brand(){
        System.out.println(getClass().getSimpleName());
    }
}
 class Main {
   public static void main(String []args)
   {

       Jeep jeep=new Jeep();
       Tata tata= new Tata();
       jeep.brand();
       jeep.color();
       jeep.type();
       CarFeatures.carBreak();
       tata.brand();
       tata.color();
       tata.musicSystem();
       CarFeatures.carBreak();
       System.out.println(CarFeatures.x);



   }
}