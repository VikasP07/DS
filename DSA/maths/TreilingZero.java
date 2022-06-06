package DSA.maths;

/**
 * TreilingZero
 */
public class TreilingZero {

    public static void main(String[] args) {
        int n = 4;
        int res = 0;

        for (int i = 5; i <= n; i = i * 5) {
             res = res + (n / i);
        }

        System.out.println(res);
    }
}