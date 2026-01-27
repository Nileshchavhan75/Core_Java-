import java.util.*;
public class Stack4 {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(22);
        st.push(30);
        st.push(40);
        st.push(55);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.search(30));
        Enumeration<Integer> enumeration = st.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement()+" ");
        }
        st.clear();
        System.out.println(st.isEmpty());
    }
}

