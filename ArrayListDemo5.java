import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(8);
        i.add(12);
        i.add(14);
        i.add(26);
        i.add(44);
        i.add(55);

        ListIterator<Integer> ltr = i.listIterator();

        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }
        System.out.println("------------------------------");


        while (ltr.hasPrevious()) {
            System.out.println(ltr.previous());
        }
    }
}
