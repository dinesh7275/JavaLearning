package recursion;



import org.w3c.dom.Node;

import java.util.LinkedList;

public class RecursionProblem {

    public static int listNo(Node head)
    {
        if (head == null) {
            return 0;
        }
        else {
            return 1 + listNo(head.getNextSibling());
        }
    }
    public static void main( String args[])
    {
        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);

        System.out.println("\n "+ ll.size());
    }
}