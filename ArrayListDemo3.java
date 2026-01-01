import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Shivay");
        l.add("Nilesh");
        l.add("Rutuja");
        l.add("Sakshi");
        l.add("Ganesh");

        Iterator<String> i = l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }


    }
}
