package DSA.maths;

/**
 * Mathematics&NumberTheory
 */
public class MathematicsNumberTheory {

    public static void main(String[] args) {
        int n = 4;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}