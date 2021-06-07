package recursion;

class RecursionUnderstanding {

    private static void printNum(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Recursive case
        printNum(n-1); //   printNum(2-1) printNum(3-1) printNUm(4-1) printNum(5-1) printNum(6-1) printNum(6)


        // after the execution of entire recursion case  print statement execute from the rop of the stack
        // output = 1 2 3 4 5 6   if n =6
        System.out.print(n + " ");
    }

    public static void main( String args[] ) {
        // Recursive method called here

        printNum(6);
    }
}