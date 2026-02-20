import java.util.*;
public class SetEx {
    public static void main(String[] args) {
       Set<String> set = new HashSet<>();
       set.add("Banana");
       set.add("Apple");
       set.add("Mango");
       set.add("Graphs");
       set.add("Peach");
       set.add("Orage");
       set.add("Appes");

       set.remove("Graphs");
       System.out.println(set);

       Iterator<String> it = set.iterator();
       while (it.hasNext()) {
        System.out.print(it.next()+" ");
        
       }
       set.clear();
       System.out.println(set.isEmpty());
    }


}
