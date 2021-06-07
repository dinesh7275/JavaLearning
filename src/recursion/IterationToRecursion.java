package recursion;

public class IterationToRecursion {
    public static int num(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return 1 + num(n / 10);

        }
    }
    public static void main(String args[])
    {
//        int y =123456789;
//        int x= num(y);
     System.out.println(num(123456789));
    }
}
