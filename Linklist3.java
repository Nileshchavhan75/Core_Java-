import java.util.*;;
public class Linklist3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.addFirst(60);
        System.out.println(list);
        boolean s = list.contains(40);
        System.out.println(s);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next()+" ");
        }
       list.clear();
        System.out.println("After clearing: " + list);
    }

    
}
