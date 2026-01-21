public class CircularQueueArray {

    // circular queue using array
    public static class Cqa {

        int front = -1;   // points to the first element of queue
        int rear = -1;    // points to the last element of queue
        int size = 0;     // current number of elements in queue
        int[] arr = new int[8];   // fixed size array for queue

        // add element into circular queue
        public void add(int val) throws Exception {

            // if queue is full then we cannot add more elements
            if (size == arr.length) {
                throw new Exception("Queue is full");
            }

            // if queue is empty and first element is added
            else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            }

            // normal case- rear is not at last index
            else if (rear < arr.length - 1) {
                arr[++rear] = val;
            }

            // circular case- when rear reaches to end then move it to index 0
            else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }

            size++;   // increase size after adding element
        }

        // remove element from circular queue
        public int remove() throws Exception {

            // if queue is empty then no need to remove anything
            if (size == 0) {
                throw new Exception("Queue is empty!");
            }

            // remove element from front
            int val = arr[front];

            // if front is at last index then move it to 0
            if (front == arr.length - 1)
                front = 0;
            else
                front++;

            size--;   // decrease size after removal
            return val;
        }

        // get front element without removing it
        public int peek() throws Exception {

            // if queue is empty then there is no front element
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }

            return arr[front];   // return front element
        }

        // check whether queue is empty
        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

        // display elements of queue in correct order
        public void display() {

            // if queue is empty
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }

            // normal case- if front is before rear
            else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

            // circular case- rear is before front
            else {
                // print from front to end of array
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }

                // then print from start of array to rear
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {

        Cqa q = new Cqa();

        q.display();   // queue is empty

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();   // 1 2 3 4

        q.remove();
        q.display();   // 2 3 4

        q.add(5);
        q.display();   // 2 3 4 5

        q.add(6);
        q.display();   // 2 3 4 5 6 (circular insertion)

        // to see circular arrangement prints the array
        for (int i = 0; i < q.arr.length; i++) {
            System.out.print(q.arr[i] + " ");
        }
    }
}
