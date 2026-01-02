import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPICreation {
    public static void main(String[] args) {
        
        String [] array = {"Nilesh","Rutuja","Niru","Shivay","Sakshi"};


        Stream<String> myStream = Arrays.stream(array);
        myStream.forEach(System.out::println);

        Stream<Integer>stream = Stream.of(1,2,3,4,5,6);
        stream.forEach(System.out::println);

        Stream<Integer> limit = Stream.iterate(0,n->n+1).limit(100);
        limit.forEach(System.out::println);

    }
}
