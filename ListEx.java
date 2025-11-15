import java.util.*;
public class ListEx {
    public static void main(String args[]){
        ArrayList<Object> l = new ArrayList<>();

         l.add("Nilesh");
         l.add(12);
         l.add("Rutuja");
         l.add(14);
         l.add(null);
         l.add(10);
         
         System.out.println(l.get(3));

         l.set(4, "Shivay");
         System.out.println(l);
         l.remove(5);

         System.out.println(l.size());

         Iterator<Object> iterator = l.iterator();
         while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
            
         }
        
    }
}
