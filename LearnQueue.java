import java.util.LinkedList;
import java.util.Queue;

/**
 * LearnQueue
 */
public class LearnQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(12);
        queue.offer(12);

        System.out.println(queue);
    }
}