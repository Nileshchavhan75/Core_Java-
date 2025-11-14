import java.util.*;
public class HashsetEx {
    public static void main(String[] args) {
       HashSet<String> set = new HashSet<>();
       set.add("Red");
       set.add("White");
       set.add("Yellow");
       set.add("Green");
       set.add("Black");
       set.add("Blue");
       set.add("Nevy");
       System.out.println(set);

       boolean s = set.contains("Green");
       System.out.println(s);
       set.remove("Blue");
       System.err.println(set);

       Iterator<String> iterator = set.iterator();
       while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
       }
       }; 
    }

