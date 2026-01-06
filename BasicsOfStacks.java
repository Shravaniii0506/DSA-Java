import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {

        // creating a stack of Integer type
        Stack<Integer> st = new Stack<>();

        // stack is empty initially
        System.out.println("Initial size: " + st.size());  // 0
        System.out.println(st);                             // []

        // push elements into stack (LIFO order)
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);

        // after pushing elements
        System.out.println("Size after push: " + st.size()); 
        System.out.println(st);    // [1, 23, 90, 5, 34]

        // peek()- returns top element without removing it
        System.out.println("Top element (peek): " + st.peek()); // 34

        // pop()- removes the top element
        st.pop();     // removes 34
        st.pop();     // removes 5

        // stack after pop operations
        System.out.println("After pop operations:");
        System.out.println(st);    // [1, 23, 90]

        // current size of stack
        System.out.println("Current size: " + st.size()); // 3

        // remove elements until only 2 elements are left
        while(st.size() > 2){
            st.pop();
        }

        // final stack state
        System.out.println("Final top element: " + st.peek()); // 23
        System.out.println("Final stack: " + st);              // [1, 23]
    }
}
