import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        
        // Add tasks with priorities (order will be lexicographical for strings)
        priorityQueue.offer("Low");
        priorityQueue.offer("High");
        priorityQueue.offer("Medium");
        priorityQueue.offer("Critical");

        // Display the priority queue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Display the highest priority task (based on natural ordering)
        System.out.println("Highest priority task: " + priorityQueue.peek());

        // Remove and display the highest priority task
        System.out.println("Removed task: " + priorityQueue.poll());

        // Check if "Medium" task is still in the queue
        boolean s = priorityQueue.contains("Medium");
        System.out.println("Is 'Medium' in the queue? " + s);

        // Display all remaining tasks in the queue using an iterator
        System.out.print("Remaining tasks in the queue: ");
        Iterator<String> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
