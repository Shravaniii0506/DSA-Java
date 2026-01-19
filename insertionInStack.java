import java.util.Stack;

// insert an element at a specific index in a stack
public class insertionInStack {

    public static void main(String[] args) {

        // this is the original stack
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        int idx = 2;   // index where element will be inserted (0-based)
        int x = 7;     // element to insert

        // check for invalid index
        if (idx < 0 || idx > st.size()) {
            System.out.println("Invalid index");
            return;
        }

        // temporary stack for hold the elements
        Stack<Integer> temp = new Stack<>();

        // move elements until we reach the index
        while (st.size() > idx) {
            temp.push(st.pop());
        }

        // insert the element
        st.push(x);

        // restore elements back to original stack
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        System.out.println("Updated Stack: " + st);
    }
}
