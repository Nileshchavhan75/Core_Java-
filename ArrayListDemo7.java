import java.util.LinkedList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        nums.addFirst(5);
        nums.addLast(50);

        System.out.println(nums);
        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());

        nums.removeFirst();
        nums.removeLast();

        System.out.println(nums);
    }
}
