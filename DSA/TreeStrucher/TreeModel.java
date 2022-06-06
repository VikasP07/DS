package DSA.TreeStrucher;

import java.util.LinkedList;
import java.util.Queue;

/**
 * TreeModel
 */
public class TreeModel {

    static class Node {

        int data;
        Node leftNode;
        Node righNode;

        Node(int data) {

            this.data = data;
            this.leftNode = null;
            this.righNode = null;

        }

    }

    static class BinaryTree {
        static int idx = -1;

        public Node BuildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = BuildTree(nodes);
            newNode.righNode = BuildTree(nodes);

            return newNode;
        }

    }

    /**
     * Printing Pre Order Traversal
     * 
     * @param root
     */

    public static void PrintPreOrder(Node root) {
        if (root == null) {
            System.out.print(-1 + ", ");
            return;
        }

        System.out.print(root.data + ", ");
        PrintPreOrder(root.leftNode);
        PrintPreOrder(root.righNode);
    }

    /**
     * Printing In Order Traversal
     * 
     * @param root
     */

    public static void PrintInOrder(Node root) {
        if (root == null) {
            System.out.print(-1 + ", ");
            return;
        }

        PrintInOrder(root.leftNode);
        System.out.print(root.data + ", ");
        PrintInOrder(root.righNode);

    }

    /**
     * Printing Post Order Traversal
     * 
     * @param root
     */

    public static void PrintPostOrder(Node root) {
        if (root == null) {
            System.out.print(-1 + ", ");
            return;
        }

        PrintPostOrder(root.leftNode);
        PrintPostOrder(root.righNode);
        System.out.print(root.data + ", ");

    }

    /**
     * Printing Level Order Traversal
     * 
     * @param root
     */

    public static void LevelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.leftNode != null) {
                    q.add(currNode.leftNode);
                }

                if (currNode.righNode != null) {
                    q.add(currNode.righNode);
                }
            }
        }
    }

    /**
     * Printing All Nodes Count
     * 
     * @param root
     * @return Total Nodes
     */

    public static int CountOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = CountOfNodes(root.leftNode);
        int rightNodes = CountOfNodes(root.righNode);

        return leftNodes + rightNodes + 1;

    }

    /**
     * Printing All Nodes Sum
     * 
     * @param root
     * @return Total Sum
     */

    public static int SumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = SumOfNodes(root.leftNode);
        int rightSum = SumOfNodes(root.righNode);

        return leftSum + rightSum + root.data;
    }

    /**
     * Printing All Tree Height
     * 
     * @param root
     * @return Total Height
     */

    public static int HeightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = HeightOfTree(root.leftNode);
        int rightHeight = HeightOfTree(root.righNode);

        int height = Math.max(leftHeight, rightHeight);

        return height + 1;
    }

    /**
     * Diameter of tree
     * 
     * @param root
     * @return
     */

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.leftNode);
        int diam2 = diameter(root.righNode);
        int diam3 = HeightOfTree(root.leftNode) + HeightOfTree(root.righNode) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);

        PrintPreOrder(root);
        System.out.println(); // For Line Braek

        PrintInOrder(root);
        System.out.println(); // For Line Braak

        PrintPostOrder(root);
        System.out.println(); // For Line Braak

        LevelOrder(root);

        System.out.print("Total Count Of Nodes = " + CountOfNodes(root));
        System.out.println(); // For Line Braak

        System.out.print("Total Sum Of Nodes = " + SumOfNodes(root));
        System.out.println(); // For Line Braak

        System.out.print("Height Of Tree = " + HeightOfTree(root));
        System.out.println(); // For Line Braak

        System.out.println("Diameter Of Tree = " + diameter(root));
    }
}