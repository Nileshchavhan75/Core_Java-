import java.util.*;
public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("John");
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        queue.offer("Diana");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        boolean s = queue.contains("Alice");
        System.out.println(s);
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}
