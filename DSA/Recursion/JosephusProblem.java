package DSA.Recursion;

/**
 * JosephusProblem
 */
public class JosephusProblem {

    public static int Josephus(int n, int k) {
        if (n == 0) {
            return 1;
        }

        return (Josephus(n -1, k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(Josephus(5, 3));
    }
}