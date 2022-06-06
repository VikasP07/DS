package DSA.StackStructure;

import java.util.ArrayList;

/**
 * StackWithArrayList
 */
public class StackWithArrayList {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        /**
         * 
         * @return true or false
         */

        public boolean isEmpty() {
            return list.size() == 0;
        }

        /**
         * Adding data into Stack using array list
         * 
         * @param data
         */

        public void push(int data) {
            list.add(data);
        }

        /**
         * Removing data int stack from last
         * 
         * @return
         */

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        /**
         * Getting Top element in stack
         * 
         * @return
         */

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}