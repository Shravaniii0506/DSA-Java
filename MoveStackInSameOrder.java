import java.util.Stack;

public class MoveStackInSameOrder {

    public static void main(String[] args) {

        // original stack
        Stack<Integer> st = new Stack<>();

        // pushing elements into stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // prints original stack
        System.out.println("Original stack: " + st);   // [1, 2, 3, 4, 5]

        // 1st reverse the stack
          // gt is a temporary stack
        Stack<Integer> gt = new Stack<>();

        // pop elements from st and push into gt
        // this reverses the order
        while (!st.isEmpty()) {
            gt.push(st.pop());
        }

        // 2nd restore original order
          // rt is the final stack
        Stack<Integer> rt = new Stack<>();

        // pop elements from gt and push into rt
        // this brings back the original order
        while (!gt.isEmpty()) {
            rt.push(gt.pop());
        }

        // printing stack in same order as original
        System.out.println("Same order stack: " + rt); // [1, 2, 3, 4, 5]
    }
}
