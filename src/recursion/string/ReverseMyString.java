package recursion.string;
class ReverseMyString {

    public static String reverseString(String myStr) {

        // Base case
        if (myStr.isEmpty()) {
            return myStr;
        }
        // Recursive case
        else {
            return reverseString(myStr.substring(1)) + myStr.charAt(0);
            // example= Reverse
            // 1st= everse + R;
            // 2nd= verse  +e + R;
            // 3rd= erse   +v +e +R;
            // 4th= rse    +e +v +e +R;
            // 5th= se     +r +e +v +e +R;
            // 6th= e      +s +r +e +v +e +R;
            //   base case condition true;
            // 7th= e +s +r +e +v +e +R;
            // after base case is satisfied stack  starting the pop function  with LIFO(Last in first Out)
            // e
            // es        e+s
            // esr       es+r
            // esre      esr +e
            // esrev     esre +v
            // eserve    eserv +e
            // eserveR;  eserve +R
        }
    }

    public static void main( String args[] ) {

        String string2 = "Reverse";

        System.out.println( "The Original String is: ");
        System.out.println(string2 );

        String resultStr = reverseString(string2);

        System.out.println("String after reversal: ");
        System.out.println(resultStr);
    }

}