public class StackArrayImplementation {

    // Inner Stack class
    public static class Stack {

        // array to store stack elements
        private int[] arr = new int[5];

        // idx represents the current size and top position
        private int idx = 0;

        // push()- inserts element at the top of stack
        void push(int x){

            // Check for stack overflow condition
            if(isFull()){
                System.out.println("Stack Overflow! Cannot push " + x);
                return;
            }

            arr[idx] = x;   // store element at index
            idx++;          // move index to next free position
        }

        // peek()- returns top element without removing it
        int peek(){
            if(idx == 0){   // stack underflow condition
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx - 1]; // return top element
        }

        // pop()- removes and returns top element
        int pop(){
            if(idx == 0){   // stack underflow condition
                System.out.println("Stack Underflow! Stack is Empty");
                return -1;
            }

            int top = arr[idx - 1];  // store top element
            arr[idx - 1] = 0;        // optional- for clear value
            idx--;                   // decrease size
            return top;
        }

        // display()- prints stack elements from bottom to top
        void display(){
            for(int i = 0; i <= idx - 1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // size()- returns current number of elements
        int size(){
            return idx;
        }

        // isEmpty()- checks whether stack is empty
        boolean isEmpty(){
            return idx == 0;
        }

        // capacity()- returns total capacity of stack
        int capacity(){
            return arr.length;
        }

        // isFull()- checks whether stack is full
        boolean isFull(){
            return idx == arr.length;
        }
    }

    public static void main(String[] args) {

        // creates stack object
        Stack st = new Stack();

        // push elements into stack
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();          // 4 5 1

        // pop element
        st.pop();
        st.display();          // 4 5

        // push more elements
        st.push(7);
        st.push(0);
        st.push(100);          // stack becomes full
        st.push(200);          // causes stack overflow
        System.out.println(st.isFull());
        // final state of stack
        st.display();
    }
}
