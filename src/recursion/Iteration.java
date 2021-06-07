package recursion;

public class Iteration {
    public int count =0;
    public int number(int n)
    {
        for(count=0; n>0; count++){
            n=n/10;
        }
//        while(n>0)
//        {
//            n=n/10;
//            count++;
//        }
       return count;


    }
    public static void main(String args[])
    {
        Iteration it= new Iteration();
                it.number(123456789);
        System.out.println(it.count);


    }
}
