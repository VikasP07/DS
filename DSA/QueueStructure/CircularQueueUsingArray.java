package DSA.QueueStructure;

/**
 * CircularQueueUsingArray
 */
public class CircularQueueUsingArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        /**
         * Getting Size Of Queue
         * 
         * @param size
         */

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        /**
         * To return the 0 or 1 (Queue is empty or not)
         * 
         * @return
         */

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        /**
         * Checking queue is full or not
         * 
         * @return
         */

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        /**
         * Enqueue data in array (Adding data )
         * 
         * @param data
         */

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size; // Circular arr (creating idx)
            arr[rear] = data;
        }

        /**
         * Dequeue the data from queue (remove)
         * 
         * @return
         */

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        /**
         * To getting first element
         * 
         * @return
         */

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove() + " Removed");
        q.add(6);
        System.out.println(q.remove() + " Removed");
        q.add(7);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}