import java.util.*;
public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Aditya");
        s.push("simran");
        s.push("Nilesh");
        s.push("Rutuja");

        System.out.println("Stack: "+ s);

        System.out.println("Top elemnet of stack: "+ s.peek());

        System.out.println("Popped Element: " + s.pop());

        System.out.println(s);

        System.out.println("Position of 'Nilesh': " + s.search("Aditya"));

        // Check if stack is empty
        System.out.println("Is Stack Empty? " + s.isEmpty());

        System.out.println("________________________________");
        System.out.println("________________________________");

        Enumeration<String> e = s.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
