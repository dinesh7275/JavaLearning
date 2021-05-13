package polymorphism.overriding;

public class Shape {
    public double getArea()
    {
        return 0;
    }
}
class Rectangle extends Shape
{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
class Circle extends Shape
{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }
}
class Main{
    public  static void main(String args[])
    {
        Shape[] shape= new Shape[2];
        shape[0]=new Rectangle(12,10);
        shape[1]=new Circle(10);
        System.out.println("The area of the Rectangle = " + shape[0].getArea());
        System.out.println("The area of the Circle = " + shape[1].getArea());

//        Shape obj1=new Rectangle(5,4);
//        Shape obj2=new Circle(10);
//        System.out.println(obj1.getArea());
//        System.out.println(obj2.getArea());
    }
}