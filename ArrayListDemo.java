import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> l = new ArrayList<>();

        l.add(8);
        l.add(12);
        l.add(14);
        l.add(26);
        l.add(44);

        l.remove(2);
        l.add(3, 99);

        ListIterator itr = l.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
