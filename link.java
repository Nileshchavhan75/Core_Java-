import java.util.*;
class link{
public static void main(String args[]){
LinkedList l = new LinkedList();
l.add("MCA");
l.add("Mtech");
l.addFirst("Welcome");
System.out.println(l);
l.removeLast();
System.out.println(l);
}
}