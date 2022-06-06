package DSA.maths;

/**
 * GCD
 */
public class GCD {

    public static void main(String[] args) {
        System.out.println(gcd(15, 27));
    }

    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}