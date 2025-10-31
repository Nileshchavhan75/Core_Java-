import java.util.*;
class StackEx{
public static void main(String args[]){
Stack s = new Stack();
s.push("A");
s.push("B");
s.push("C");

System.out.println(s);
System.out.println(s.search("C"));
s.pop();
System.out.println(s);
s.remove("B");
System.out.println(s);
System.out.println(s.search("Z"));
}
}







