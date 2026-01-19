import java.util.Stack;

public class reverseStack {

    // this function inserts element at the bottom of stack
    public static void pushAtBottom(Stack<Integer> st, int x) {

        // base case- stack is empty
        if (st.size() == 0) {
            st.push(x);
            return;
        }

        int top = st.pop();    // removes top element

        pushAtBottom(st, x);   // recursive call

        st.push(top);          // push back the removed element
    }

    // this function reverses the stack using recursion
    public static void reverse(Stack<Integer> st) {

        // base case- only one element left
        if (st.size() == 1) return;

        // remove top element
        int top = st.pop();

        // reverse remaining stack
        reverse(st);

        // insert removed element at bottom
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // before reverse
        System.out.println("Original stack: " + st);   // [1, 2, 3, 4, 5]

        // reverse stack using recursion
        reverse(st);

        // after reverse
        System.out.println("Reversed stack: " + st);   // [5, 4, 3, 2, 1]
    }
}
