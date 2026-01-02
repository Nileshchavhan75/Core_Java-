import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        Enumeration<Integer> e = v.elements();
        
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
