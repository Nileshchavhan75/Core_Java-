import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(10);
        list.add(14);
        list.add(16);
        list.add(44);

        Stream<Integer>stream = list.stream();
        stream.forEach(System.out::println);
        
    }
}
