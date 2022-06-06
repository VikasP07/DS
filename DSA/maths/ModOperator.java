package DSA.maths;

/**
 * ModOperator
 */
public class ModOperator {

    public static void main(String[] args) {
        System.out.println(powOf(3, 4));
    }

    static int powOf(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a;
            }

            a = a * a;
            b = b >> 1;
        }
        return res;
    }
}