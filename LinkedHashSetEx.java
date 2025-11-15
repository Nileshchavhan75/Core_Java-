import java.util.*;;
public class LinkedHashSetEx {
    public static void main(String[] args) {
       LinkedHashSet<String> link = new  LinkedHashSet<>();
       link.add("Red");
       link.add("Yellow");
       link.add("White");
       link.add("Green");
       link.add("Blue");
       link.add("Black");
       link.add("Navy");

       System.out.println(link);
       link.remove("Blue");
       System.out.println(link);
       boolean s = link.contains("White");
       System.out.println(s);
       Iterator<String> iterator = link.iterator();
       while (iterator.hasNext()) {
        System.out.print(iterator.next()+" ");
        
       }
       
    }
}
