import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        for(int i = 0; i<nums.size();i++){
            System.out.println(nums.get(i));
        }
        System.out.println(nums.size());

        boolean b = nums.contains(40);
        System.out.println(b);

        nums.remove(2);
        System.out.println(nums);
    }
}