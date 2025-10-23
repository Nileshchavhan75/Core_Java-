import java.util.*;;
public class VectorEx3 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("java");
        vector.add("python");
        vector.add("C++");
        vector.add("javascript");
        vector.add("Ruby");
        System.out.println(vector);
        vector.remove(2);
        vector.add(2, "go");
        System.out.println(vector);
        System.out.println(vector.get(3));
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement()+" ");
        }

    }
}

