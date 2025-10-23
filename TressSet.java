import java.util.*;
public class TressSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");
        set.add("Grapes");
        set.add("Peach");
        set.add("Orage");
        set.add("pineApple");

        System.out.println(set);
        set.remove("Grapes");
        boolean s = set.contains("Mango");
        System.out.println(s);
        
        Iterator<String> st = set.iterator();
        while (st.hasNext()) {
            System.out.print(st.next()+" ");
        }
        set.clear();
        System.out.println(set.isEmpty());
    }
}
