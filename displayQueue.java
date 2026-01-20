import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class displayQueue {

    public static void main(String[] args) {

        // creating a queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // printing the queue directly
        System.out.println(q); // [1, 2, 3, 4, 5]

        // helper queue to temporarily store elements
        Queue<Integer> helper = new ArrayDeque<>();

        // loop to display all elements in the queue one by one while maintaining the original order
        while (q.size() > 0) {
            System.out.print(q.peek() + " "); // print front element
            helper.add(q.poll()); // remove from original queue and add to helper
        }

        // from helper queue restore original queue
        while (helper.size() > 0) {
            q.add(helper.poll()); // move elements back
        }

        System.out.println();
    }
}
