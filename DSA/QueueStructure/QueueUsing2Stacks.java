package DSA.QueueStructure;

import java.util.Stack;

/**
 * QueueUsingLinkedList
 */
public class QueueUsing2Stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        /**
         * To know the the queu is empty or not
         * 
         * @return
         */

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        /**
         * To adding data in to queue
         * 
         * @param data
         */

        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        /**
         * To remove the data in to queue
         * 
         * @return
         */

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        /**
         * To know first element in the queue
         * 
         * @return
         */

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}