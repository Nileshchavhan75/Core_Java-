import java.util.*;
public class ListEx2 {
    public static void main(String[] args) {
            ArrayList<Object> R = new ArrayList<>();
            R.add("Nilesh");
            R.add(12);
            R.add("Shivay");
            R.add("07");
            R.add("Aryan");
            R.add(null);
            R.add("Krishu");

            System.out.println(R);

            System.out.println(R.get(4));

            System.out.println(R.size());

            R.set(5, "Shiva");

            ListIterator<Object> l = R.listIterator();
            while (l.hasNext()) {
                Object el = l.next();
                System.out.print(el+" ");
            }
            System.out.println();

            while (l.hasPrevious()) {
                System.out.print(l.previous()+" ");
            }
    }
}
