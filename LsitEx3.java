import java.util.*;
public class LsitEx3 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add("Shivam");
        list.add("ganesh");
        list.add(20);
        list.add(22);
        list.add(30);
        list.add(null);

        //System.out.println(list);

        list.addFirst("Rutu");

        //System.out.println(list);

        list.addLast("Niluu");

        //System.out.println(list.getFirst());
        //System.out.println(list.getLast());

        //System.out.println(list.get(1));

       ListIterator<Object> l = list.listIterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }
       System.out.println("-------------------------------" );
       
       System.out.println("-------------------------------" );

        while (l.hasPrevious()) {
            System.out.println(l.previous());            
        }


    }

}
