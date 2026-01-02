import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamAPI2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,33,4444,576,67,27,48,9,10,141,41652,1654,166,250);
        List<Integer> evenNumbers =list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);

        List<Integer> newlist = evenNumbers.stream().map(x->x/2).distinct().sorted().collect(Collectors.toList());
        System.out.println(newlist);

    }
}
