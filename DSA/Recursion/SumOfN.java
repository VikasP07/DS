package DSA.Recursion;

/**
 * SumOfN
 */
public class SumOfN {

    public static int SumOfNNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + SumOfNNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        // int sum = 0;

        // for (int i = 0; i <= n; i++) {
        // sum = sum + i;
        // }

        // System.out.println(sum);

        System.out.println(SumOfNNumbers(n));
    }

}