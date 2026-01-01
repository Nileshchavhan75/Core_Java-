import java.util.*;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();

        for (int j = 1; j <= 10; j++) {
            l.add(j);
        }

        Iterator<Integer> i = l.iterator();

        while (i.hasNext()) {
            int num = i.next();

            if (num % 2 == 0) {
                i.remove();
            }
        }

        System.out.println(l); 
    }
}
