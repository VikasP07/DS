package DSA.QueueStructure;

/**
 * QueueUsingArray
 */
public class QueueUsingArray {

    static class Queue {
        static int arr[];
        int size;

        static int rear = -1;

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
            return rear == -1;
        }

        /**
         * Enqueue data in array (Adding data )
         * 
         * @param data
         */

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear++;
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

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;
            return front;
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

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}