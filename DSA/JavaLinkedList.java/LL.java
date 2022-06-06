/**
 * LL
 */
public class LL {

    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    /**
     * Creating Node
     */

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    /**
     * Adding Data First in list
     * 
     * @param data
     */

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    /**
     * Adding data to last in list
     * 
     * @param data
     */

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    /**
     * Printing list
     */

    public void PrintList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    /**
     * Deleting starts from First
     */

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        head = head.next;
    }

    /**
     * Deleting starts from Last
     */

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("a");
        list.addFirst("is");
        list.PrintList();

        list.addLast("list");
        list.PrintList();

        list.addFirst("This");
        list.PrintList();

        // list.deleteFirst();
        // list.PrintList();

        // list.deleteLast();
        // list.PrintList();

        System.out.println(list.getSize());
    }

}