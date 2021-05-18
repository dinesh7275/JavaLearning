package oops.absctraction.interfaces;

public interface CarFeatures {
    public static final  int x=10;

    public abstract void musicSystem();
    public static void carBreak(){
        System.out.println("The breaks are active");
        demo();
    }
    public  void color();
    private static void demo()
    {
        System.out.println("This is private method");
    }
}
