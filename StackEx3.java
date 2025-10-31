import java.util.Enumeration;
import java.util.Stack;

public class StackEx3 {
    public static void main(String[] args) {
        Stack<Integer> stc = new Stack<>();
        stc.push(20);
        stc.push(30);
        stc.push(40);
        stc.push(40);
        stc.push(50);

        System.out.println(stc);

        stc.pop();
        stc.pop();
        System.out.println(stc.peek());

        System.out.println(stc.isEmpty());

        System.out.println(stc.search(30));

        Enumeration<Integer> enumeration = stc.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement()+" ");
            
        }

    }
}
