package DSA.Recursion;

/**
 * SuperSet
 */
public class PowerSet {

    public static void PrintPower(String s, int i, String curr) {
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }

        PrintPower(s, i + 1, curr + s.charAt(i));
        PrintPower(s, i + 1, curr);
    }

    public static void main(String[] args) {
        String s = "ABC";
        PrintPower(s, 0, "");
    }
}