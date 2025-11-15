import java.util.*;
class LinkedKistEx{

	public static void main(String args[]){
	LinkedList<Object> l = new LinkedList<>();
        l.add("Mca");
        l.add(10);
        l.add(null);
        l.add("MCA");
        System.out.println(l);
        l.addFirst("welcome");
        l.removeLast();
        System.out.println(l);
}
}


	