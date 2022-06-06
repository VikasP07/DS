package DSA.maths;

import java.util.Scanner;

/**
 * Palindrom
 */
public class Palindrom {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // int n = 404;
        // int res = 0;
        // int r;
        // int temp = n;

        // while (n > 0) {
        // r = n % 10;
        // res = (res * 10) + r;
        // n = n / 10;
        // }

        // for (int i = 0; i < n; i++) {
        // r = n % 10;
        // res = (res * 10) + r;
        // n = n / 10;
        // }

        // if (temp == res) {
        // System.out.println("The Number Is Palindrom Number >> ");
        // } else {
        // System.out.println("The Number Is Not Palindrom Number >> ");
        // }

        System.out.print("Enter The Number Or String To Check Entered Sequence Is Palindrom Or Not > ");
        String s = sc.nextLine();

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        if (s.equals(reverse)) {
            System.out.println("The Number Is Palindrom Number >> ");
        } else {
            System.out.println("The Number Is Not Palindrom Number >> ");
        }
    }
}