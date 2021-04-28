package class_object;

public class ObjDemo {
    int a=10;
    String s= "Hello EveryOne !!";
    public void showDemo() {
        System.out.println(s);

        System.out.println(a);
    }
    public static void  main(String args [])
    {
        ObjDemo obj= new ObjDemo();
        System.out.println(obj.a);
        System.out.println(obj.s);
        obj.showDemo();
    }
}
