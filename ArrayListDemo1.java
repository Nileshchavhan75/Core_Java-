import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Nagpur");

        System.out.println(cities);
        System.out.println(cities.get(1));

        cities.set(1, "Nashik");
        cities.remove("Mumbai");
        System.out.println(cities);
    }
}
