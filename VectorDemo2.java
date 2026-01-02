import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(8);
        v.add(12);
        v.add(14);
        v.add(26);
        v.add(44);

        System.out.println(v);
    

    Enumeration<Integer> e = v.elements();
    while (e.hasMoreElements()) {
        System.out.println(e.nextElement());
    }

    System.out.println(v.get(3));

    v.set(1, 5);
    System.out.println(v);

    }
}
