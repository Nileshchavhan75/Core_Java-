import java.util.HashSet;

public class Solution54 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Nilesh");
        names.add("Sakshi");
        names.add("Rahul");
        names.add("Nilesh");
        names.add("Priya");
        names.add("Rahul");

        for(String s : names){
            System.out.println(s);
        }
        System.out.println(names.contains("Sakshi"));
        names.remove("Rahul");
        System.out.println(names);
    }
}
