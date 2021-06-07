package recursion;

public class Fibonacci {
    public static int fibonacciSeries(int n) {

        if (n <= 1) {
            return n;
        } else {
            return (fibonacciSeries(n - 1) + fibonacciSeries(n - 2));
        }

    }

    public static void main(String args[])
    {

        int input= 20;
        int i=0;
        while(i< input)
        {
            System.out.print(fibonacciSeries(i) + " ");
            i++;
        }

    }
}

