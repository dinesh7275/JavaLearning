package oops.polymorphism.challange;
class Shape{
    private String name;
    public String getName(){
        return this.name;
    }
}
// Derived Class
class XShape extends Shape {

    private String name;

    public XShape(String name) { // Default Constructor
        this.name = name;
    }

    // Overridden Method
    public String getName() {
        // write your code here
        System.out.println("Shape," + name);
        return this.name;
    }
    public static void main(String args[])
    {
        Shape circle= new XShape("Circle");
        circle.getName();
    }

}