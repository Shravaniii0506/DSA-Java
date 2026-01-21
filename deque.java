
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        // add, remove/poll peek/element
        // dq.addLast(1);
        // dq.addLast(2);
        // dq.addLast(3);
        // dq.addLast(4);
        // System.out.println(dq);      // [1, 2, 3, 4]
        // dq.addFirst(5);
        // System.out.println(dq);      // [5, 1, 2, 3, 4]
        // dq.removeLast();
        // System.out.println(dq);      // [5, 1, 2, 3]
        // dq.removeFirst();
        // System.out.println(dq);      // [1, 2, 3]
        // System.out.println(dq.getFirst());     // 1
        // System.out.println(dq.getLast());      // 3

        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.add(5);     // last add
        // dq.remove();     // first remove
        // dq.removeAll(dq); // remove everything
        // System.out.println(dq);   // []
        System.out.println(dq);      // [1, 2, 3, 4, 5]

        // dq.removeLastOccurrence(3);
        // System.out.println(dq);      // [1, 2, 4, 5]

        dq.removeLastOccurrence(2);   // [1, 3, 4, 5]
        System.out.println(dq);
    }
}