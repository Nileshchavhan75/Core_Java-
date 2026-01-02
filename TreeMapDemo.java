import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tree = new TreeMap<>();

        tree.put(12, "Nilesh");
        tree.put(8, "Rutuja");
        tree.put(5,"Nillu");
        tree.put(17,"Sakshi");

        System.out.println(tree);

        for(Integer key:tree.keySet()){
            System.out.println(key);
        }

        for(String value: tree.values()){
            System.out.println(value);
        }

        System.out.println(tree.firstKey());
        System.out.println(tree.lastKey());

        tree.remove(5);
        System.out.println(tree);
    }
}
