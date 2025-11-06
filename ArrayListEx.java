import java.util.*;
class ArrayListEx{
public static void main(String args[]){
	ArrayList a = new ArrayList();
	a.add(10);
	a.add(20);
	a.add("A");
	a.add("a");
	System.out.println(a.size());
	System.out.println(a);
	a.remove(2);
	a.add(2,"s");
	System.out.println(a);
	a.set(0, "Nilesh");
	for(int i = 0; i<3; i++){
	System.out.println(a.get(i));
	}

}
}