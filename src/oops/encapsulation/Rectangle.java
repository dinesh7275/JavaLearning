package oops.encapsulation;

// Rectangle Class
class Rectangle {

    private int length;
    private int width;


    // Write Fields Here


    public Rectangle() {

        // Write your code here
        this.length= 0;
        this.width=0;
    }

    public Rectangle(int length, int width) {

        // Write your code here
        this.length =length;
        this.width = width;

    }

    public int getArea() {

        // Write your code here

        return this.length *this.width;
    }

}
class Main{
    public static void main(String args[])
    {
        Rectangle obj = new Rectangle(10,4);

        System.out.println(obj.getArea());
    }
}