package DSA.maths;

/**
 * Factorial
 */
public class Factorial {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println(result);
        System.out.println(fact(5));
    }
}