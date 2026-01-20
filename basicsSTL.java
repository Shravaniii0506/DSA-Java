import java.util.LinkedList;
import java.util.Queue;

public class basicsSTL {
    public static void main(String[] args){

        // creating a Queue using LinkedList (STL implementation)
        Queue<Integer> q = new LinkedList<>();

        // Checks- if queue is empty (initially true)
        System.out.println(q.isEmpty());   // true

        // adding elements to the queue
        q.add(1);

        // now queue is not empty
        System.out.println(q.isEmpty());   // false

        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // prints the size of queue
        System.out.println(q.size());      // 5

        System.out.println(q);             // [1, 2, 3, 4, 5]

        // remove() removes front element (1)
        q.remove();

        // size after removal
        System.out.println(q.size());      // 4
        System.out.println(q);             // [2, 3, 4, 5]

        // poll() also removes front element (2)
        q.poll();

        // printing queue after the poll
        System.out.println(q);             // [3, 4, 5]

        System.out.println(q.size());      // 3
    }
}




// import java.util.ArrayDeque;
// import java.util.ArrayList;
// import java.util.Queue;
// import java.util.Stack;

// public class basicsSTL{
//      public static void main(String[] args) {

//          ArrayList<Integer> al = new ArrayList<>(); 
                   /* creates a dynamic array and it can be grow/shrink in size
                    allows random access and used when we need fast access using index */

//          Stack<Integer> st = new Stack<>();
                   /* implements LIFO (Last In First Out)
                    Operations:
                       push()
                       pop()
                       peek()
                       used in recursion, undo/redo, expression evaluation */

//          Queue<Integer> q = new ArrayDeque<>();
                   /* implements FIFO (First In First Out) which is faster than LinkedList for queue operations
                    common methods:
                        add(), offer()
                        remove(), poll()
                        peek() */
                        
//     }
// }