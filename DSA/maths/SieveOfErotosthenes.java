package DSA.maths;

import java.util.Arrays;

/**
 * SieveOfErotosthenes
 */
public class SieveOfErotosthenes {

    public static void main(String[] args) {
        int isPrime = 30;
        int obj = sieveOfErotosthenes(isPrime);
        System.out.println(obj);

    }

    static int sieveOfErotosthenes(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true) {
                System.out.print(i + ", ");
            }
        }
        return n;

    }
}