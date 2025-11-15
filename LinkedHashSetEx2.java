import java.util.*;
public class LinkedHashSetEx2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> link = new LinkedHashSet<>();
        link.add(10);
        link.add(20);
        link.add(30);
        link.add(40);
        link.add(50);
        System.out.println(link);
        link.remove(30);
        System.out.println(link);
        boolean s = link.contains(40);
        System.out.println(s);
        System.out.println(link.size());
        Iterator<Integer> iterator = link.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}
