import java.util.*;
class ArrayListDemo{
	public static void main(String args[]){
	ArrayList<Object> l = new ArrayList<>();
	l.add("A");
   	l.add(10);
	l.add("A");
	l.add(null);
	l.set(1, "nil");
	System.out.println(l);
	l.remove(2);
	System.out.println(l);
	l.add(2,"m");
	l.add("");
	System.out.println(l);
}
}
