import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.Set;
// import java.util.TreeSet;

// import javax.print.attribute.SetOfIntegerSyntax;

/**
 * LearnSet
 */
public class LearnSet {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Vikas", 12));
        studentSet.add(new Student("Vishal", 12));

        System.out.println(studentSet);
        
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> set = new LinkedHashSet<>();
        // Set<Integer> set = new TreeSet<>();
        
        // set.add(10);
        // set.add(12);
        // set.add(14);
        // set.add(16);
        // set.add(18);
        // set.add(20);

        // System.out.println(set);
        
        // set.remove(14);
        // System.out.println(set);
        
        // System.out.println(set.contains(100));

        // set.clear();
        // System.out.println(set);
    }
}