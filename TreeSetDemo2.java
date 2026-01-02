import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();

        tree.add("Nilesh");
        tree.add("Rutuja");
        tree.add("Sakshi");
        tree.add("Shivay");
        tree.add("Swati");

        System.out.println(tree);

        Iterator<String> Itr = tree.iterator();

        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }
    }
}
