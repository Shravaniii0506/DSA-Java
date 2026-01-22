import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// queue is created and added elements in it
public class ReOrderQueueusingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);      // [1, 2, 3, 4, 5, 6, 7, 8]

        // stack is used as helper for reordering
        Stack<Integer> st = new Stack<>();

        // 1st step - first half of queue elements are moved into stack
          // queue -> [5 6 7 8]
          // stack -> [1 2 3 4] top is 4
        for(int i=1;i<=q.size()/2;i++){
            st.push(q.remove());
        }
        // 2nd - pops all stack elements and added back into queue
          // this reverses the first half
          // queue -> [5 6 7 8 4 3 2 1]
        while(st.size()>0){
            q.add(st.pop());
        }
        // 3rd - again moves first half of queue into stack
          // stack -> [5 6 7 8] top is 8
          // queue -> [4 3 2 1]
        for(int i=1;i<=q.size()/2;i++){
            st.push(q.remove());
        }
        for(int i=1;i<=q.size()/2;i++){
            // one by one, first is from stack then queue (like alternative)
            q.add(st.pop());   // from stack
            q.add(q.remove()); // from queue
        }
        //   8 4 7 3 6 2 5 1
        // reverse the queue
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        // final reorderd queue
        System.out.println(q);   // 1 5 2 6 3 7 4 8
    }
}
