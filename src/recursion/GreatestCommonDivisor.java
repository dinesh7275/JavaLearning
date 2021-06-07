package recursion;

public class GreatestCommonDivisor {
    public static void main(String args[])
    {
        System.out.println(gcd(50,20));
    }
    static int gcd(int x ,int y)
    {
        if (x==0 || y==0)
            return 0;
        if (x==y)
            return x;

        if (x>y)
            return gcd(x-y,y);
        else
            return gcd(y-x,x);

    }
}
