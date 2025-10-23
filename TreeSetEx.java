import java.util.*;
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(25);
        set.add(10);
        set.add(15);
        set.add(30);
        set.add(5);
        System.out.println(set);
        set.remove(5);
        boolean s = set.contains(15);
        System.out.println(s);
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
