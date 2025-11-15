import java.util.*;
public class Linked {
    public static void main(String[] args) {
        LinkedList<String> city = new LinkedList<>();
        city.add("Mumbai");
        city.add("Pune");
        city.add("Jalgoan");
        city.add("Sangali");
        city.add("nagpur");
        System.out.println(city);
        city.add(1,"Khujgoan");
        System.out.println(city);
        city.remove(0);
        city.remove(4);
        System.out.println(city);
        boolean s = city.contains("Paris");
        System.out.println(s);

        ListIterator<String> listIterator = city.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
}
}
