import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(10);
        tree.add(40);
        tree.add(50);
        tree.add(12);
        tree.add(22);

        System.out.println(tree);

        System.out.println(tree.first());
        System.out.println(tree.last());

        tree.removeFirst();
        tree.removeLast();

        System.out.println(tree);

        System.out.println("is 20 Exist: "+tree.contains(25));
    }
}
