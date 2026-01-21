public class ArrayImplementation {

    public static class QueueA {
        int f = -1, r = -1;      // front and rear pointers
        int size = 0;             // number of elements in queue
        private int[] arr = new int[5];   // array to store queue elements

        // add elements to the queue
        public void add(int val) {
            if (r == arr.length - 1) {       // if rear has reached end of array
                System.out.println("Queue is full");
                return;
            }

            if (f == -1) {   // queue is empty, first element being added
                f = r = 0;
            } else {         // normal case, increment rear
                r++;
            }

            arr[r] = val;    // place the element at rear
            size++;          // increase queue size
        }

        // remove element from the queue
        public int remove() {
            if (size == 0) {          // queue empty, cannot remove
                System.out.println("Queue is empty!");
                return -1;
            }

            int val = arr[f];         // get the front element
            f++;                      // move front pointer forward
            size--;                   // decrease queue size

            if (size == 0) {          // if queue becomes empty after removal
                f = r = -1;           // reset front and rear
            }

            return val;               // return removed element
        }

        // without removing it we gets the front element
        public int peek() {
            if (size == 0) {          // empty queue
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[f];            // return element at front
        }

        // checks if queue is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // display all elements of the queue
        public void display() {
            if (size == 0) {                  // nothing to display
                System.out.println("Queue is empty!");
                return;
            }

            for (int i = f; i <= r; i++) {   // iterate from front to rear
                System.out.print(arr[i] + " ");
            }
            System.out.println();             // new line after printing queue
        }
    }

    public static void main(String[] args) {
        QueueA q = new QueueA();    // create queue object

        q.display();                // display empty queue

        // adding elements to queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.display();                // display queue after additions

        q.remove();                 // remove front element
        q.display();                // displays queue after removal

        System.out.println(q.peek());   // show front element
        System.out.println(q.size);     // show current size of queue
    }
}
