package recursion;

import static recursion.Factorial.factorial;

public class Factorial {
    public static double factorial(double n) {
        if (n == 1)
        return n;
        else{
            return (n* factorial(n-1));
    }
    }


    public static void main(String args[])
    {
        double fact= factorial(5);
        System.out.println(fact);

    }
}
