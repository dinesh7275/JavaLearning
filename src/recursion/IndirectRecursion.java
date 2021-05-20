package recursion;

public class IndirectRecursion {
    public static int n=0;
    public void ir1() {
        if (n <= 20) {
            System.out.print(n + " ");
            n++;
            ir2();
        } else {
            return;
        }
    }

    public void ir2() {
        if(n<=20) {
            System.out.print(n + " ");
            n++;
            ir1();
        }
        else {
            return;
        }
    }
    public static void main(String args[])
    {
        IndirectRecursion ir= new IndirectRecursion();
        ir.ir1();
    }
}

