public class LLImplementationOfQueue {

    public static class Node {
        int val;        // value stored in the node
        Node next;      // next node reference  

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // queue implementation using linked list
    public static class queueLL {

        Node head = null;   // front of the queue
        Node tail = null;   // rear of the queue
        int size = 0;

        // add element at the rear of queue
        public void add(int x) {
            Node temp = new Node(x);   // create new node

            if (size == 0) {
                // if queue is empty then head and tail both point to new node
                head = tail = temp;
            } else {
                // attach new node at the end
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // return front element without removing it
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;   // front element
        }

        // remove element from front of queue
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }

            int x = head.val;   // store front value
            head = head.next;   // move head to next node
            size--;
            return x;
        }

        // display all elements of queue from front to rear
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // check for empty queue
        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        queueLL q1 = new queueLL();

        q1.display();                  // prints nothing because of empty queue
        System.out.println(q1.isEmpty()); // true

        q1.add(1);
        q1.add(2);
        System.out.println(q1.isEmpty()); // false

        q1.add(3);
        q1.add(7);

        q1.display();                  // 1 2 3 7
        System.out.println(q1.peek()); // 1

        q1.remove();                   // removes 1
        q1.display();                  // 2 3 7
    }
}
