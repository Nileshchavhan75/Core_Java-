import java.util.HashSet;

public class Solution53 {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("python");
        languages.add("C++");
        languages.add("Java");
        languages.add("python");

        System.out.println(languages);
        System.out.println(languages.contains("Java"));

        languages.remove("python");
        System.out.println(languages);

        System.out.println(languages.size());

        for(String l : languages){
            System.out.println(l);
        }
    }
    
}