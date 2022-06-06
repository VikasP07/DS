package DSA.Recursion;

/**
 * WaysOfMatrix
 */
public class WaysOfMatrix {

    public static int NoOf(int n, int m) {

        if (n == 1 || m == 1) {
            return 1;
        }

        return NoOf(n - 1, m) + NoOf(n, m - 1);
    }

    public static void main(String[] args) {

        System.out.println(NoOf(3, 3));
    }
}