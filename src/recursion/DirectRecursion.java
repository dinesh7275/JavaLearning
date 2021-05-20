package recursion;

public class DirectRecursion {
    public  int square(int n) {
        if (n == 0) {
            return 0;
        } else {
            return square(n - 1) + (2 * n) - 1;
        }
    }
    public static void main(String args[])
    {
        DirectRecursion dr=new DirectRecursion();
        System.out.println(dr.square(6));
    }
}

