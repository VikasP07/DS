import java.util.ArrayDeque;

/**
 * LearnArrayDeque
 */
public class LearnArrayDeque {

    public static void main(String[] args) {
        
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12);
        adq.offer(14);
        adq.offer(16);
        adq.offerFirst(10);
        adq.offerLast(18);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("Poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("PollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("PollLast() " + adq);
    }
}