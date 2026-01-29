import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(12);
        s.push(14);
        s.push(26);
        s.push(18);
        s.push(22);

        System.out.println(s);

        s.pop();
        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s.isEmpty());

        System.out.println(s.search(14));
        
    }
}
