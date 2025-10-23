import java.util.*;
public class VectorEx2 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        System.out.println(vector);
        vector.add(1, 22);
        System.out.println(vector);
        vector.remove(4);

        boolean s = vector.contains(90);
        System.out.println(s);
        System.out.println(vector.size());

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement()+" ");
        }



    }
}
