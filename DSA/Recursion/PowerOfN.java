package DSA.Recursion;

/**
 * PowerOfN
 */
public class PowerOfN {

    public static int SumOf(int a, int b) {

        if (b == 0) {
            return 1;
        }

        return SumOf(a, b - 1) * a;
    }

    public static void main(String[] args) {

        System.out.println(SumOf(3, 4));

        int a = 3;
        int b = 4;
        int result = 1;

        for (; b != 0; --b) {
            result *= a;
        }

        System.out.println(result);

    }
}