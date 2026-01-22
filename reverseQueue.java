
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        // queue is created for adding elements
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);      // [1, 2, 3, 4]

        // stack is used for reverse the queue
        Stack<Integer> st = new Stack<>();
        
        // 1st - remove elements from queue and push it into stack
          // this reverses the order
        while(q.size()>0){
            st.push(q.remove());
        }
        // 2nd - pop elements from stack and add back to queue
          // queue becomes reversed
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);      // [4, 3, 2, 1]
    }
}
